package com.jtech.felizmusic.offline

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Assembly-rule parity for the offline PODCAST reads ([offlinePodcast] / [offlinePodcastChannel] /
 * [offlinePodcastsNewEpisodes]) and the search folding (server reply 4). Asserted over a tiny hand-built
 * [SubsetCorpus] — no Android runtime/network. Covers: channel-inherited KidZone gate, per-show
 * global `blocked`-shard exceptions, newest-first episode ordering, the `k`/one-page caps, and 404s.
 * Podcasts ignore onlyAcappella.
 */
class SubsetPodcastReadTest {

    // channels (id, name, thumbnail, isAcappella, isKidZone, isVerified, showCount, episodeCount)
    private val chNorm = SubPodcastChannel("UCn", "Normal Cast", "tn", isAcappella = false, isKidZone = false, isVerified = true, showCount = 2, episodeCount = 3)
    private val chFem = SubPodcastChannel("UCw", "Women Cast", "tw", isAcappella = true, isKidZone = false, isVerified = false, showCount = 1, episodeCount = 1)

    // shows (id, name, author, channelId, thumbnail, episodeCountText, genres)
    private val s1 = SubPodcastShow("MPS1", "Alpha Show", "Host A", "UCn", "ts1", "2 episodes", genres = listOf("gemara", "history"))
    private val s2 = SubPodcastShow("MPS2", "Beta Show", "Host B", "UCn", "ts2", null, genres = listOf("gemara")) // globally blocked per item
    private val sf = SubPodcastShow("MPSF", "Ladies Show", "Host F", "UCw", "tsf", null, genres = listOf("gemara"))

    // episodes (videoId, showId, title, thumbnail, durationSec, publishedAt)
    private val e1 = SubPodcastEpisode("ve1", "MPS1", "Ep One", "te1", 100, "2026-05-01")
    private val e2 = SubPodcastEpisode("ve2", "MPS1", "Ep Two", "te2", 120, "2026-06-01") // newer than e1
    private val e3 = SubPodcastEpisode("ve3", "MPS2", "Ep Three", "te3", 90, null) // null date → sorts last
    private val ef = SubPodcastEpisode("vef", "MPSF", "Ladies Ep", "tef", 80, "2026-04-01")

    private val corpus = SubsetCorpus(
        artists = emptyList(),
        tracks = emptyList(),
        albums = emptyList(),
        albumTracks = emptyList(),
        artistPlaylists = emptyList(),
        community = emptyList(),
        communityTracks = emptyList(),
        homeRank = emptyList(),
        zemerPlaylists = emptyList(),
        zemerItems = emptyList(),
        // MPS2 is a globally blocked show on a mixed channel → rides the `blocked` shard.
        blocked = SubBlocked(global = setOf("MPS2")),
        podcastChannels = listOf(chNorm, chFem),
        podcasts = listOf(s1, s2, sf),
        podcastEpisodes = listOf(e1, e2, e3, ef),
    )

    private val matcher = buildFemaleMatcher(corpus.artists)

    @Test
    fun `channel returns gated shows and newest-first episodes`() {
        val r = offlinePodcastChannel(corpus, "UCn", onlyAcappella = true, blockVideos = false, kidZone = false)!!
        assertEquals("Normal Cast", r.channel!!.name)
        assertEquals(listOf("MPS1"), r.shows.map { it.id }) // MPS2 is globally blocked
        // newest-first: ve2 (2026-06) → ve1 (2026-05); ve3 belongs to the blocked show
        assertEquals(listOf("ve2", "ve1"), r.episodes.map { it.videoId })
        assertEquals("Alpha Show", r.episodes.first().podcastName)
    }

    @Test
    fun `podcast channels ignore onlyAcappella and always serve`() {
        val restricted = offlinePodcastChannel(corpus, "UCw", onlyAcappella = true, blockVideos = false, kidZone = false)
        val unrestricted = offlinePodcastChannel(corpus, "UCw", onlyAcappella = false, blockVideos = false, kidZone = false)
        assertNotNull(restricted)
        assertNotNull(unrestricted)
        assertEquals(listOf("MPSF"), restricted!!.shows.map { it.id })
        assertEquals(listOf("MPSF"), unrestricted!!.shows.map { it.id })
    }

    @Test
    fun `unknown channel is a 404`() {
        assertNull(offlinePodcastChannel(corpus, "UCzzz", onlyAcappella = true, blockVideos = false, kidZone = false))
    }

    @Test
    fun `a globally blocked show is a 404 for every flag combination`() {
        assertNull(offlinePodcast(corpus, "MPS2", 0, onlyAcappella = false, blockVideos = false, kidZone = false))
        assertNull(offlinePodcast(corpus, "MPS2", 0, onlyAcappella = true, blockVideos = false, kidZone = false))
    }

    @Test
    fun `show returns its whole episode list newest-first in one page`() {
        val r = offlinePodcast(corpus, "MPS1", 0, onlyAcappella = false, blockVideos = false, kidZone = false)!!
        assertEquals("Alpha Show", r.podcast!!.name)
        assertEquals(listOf("ve2", "ve1"), r.episodes.map { it.videoId })
        assertNull(r.nextOffset)
        // a paged follow-up call returns nothing more (offline serves everything at offset 0)
        assertTrue(offlinePodcast(corpus, "MPS1", 2, onlyAcappella = false, blockVideos = false, kidZone = false)!!.episodes.isEmpty())
    }

    @Test
    fun `new episodes are newest-first, k-capped and gated (podcasts ignore onlyAcappella)`() {
        val open = offlinePodcastsNewEpisodes(corpus, k = 2, onlyAcappella = true, blockVideos = false, kidZone = false)
        assertEquals(listOf("ve2", "ve1"), open.episodes.map { it.videoId })
        // MPS2 is globally blocked; MPSF is served regardless of onlyAcappella.
        val blocked = offlinePodcastsNewEpisodes(corpus, k = 10, onlyAcappella = false, blockVideos = false, kidZone = false)
        assertEquals(listOf("ve2", "ve1", "vef"), blocked.episodes.map { it.videoId })
    }

    @Test
    fun `search folds podcast shows and episodes with the channel gate and ignores onlyAcappella`() {
        val shows = offlineSearch(corpus, matcher, "Alpha", 10, onlyAcappella = false, blockVideos = false, kidZone = false)
        assertTrue(shows.categories.podcasts.any { it.id == "MPS1" })

        val ladiesBlocked = offlineSearch(corpus, matcher, "Ladies", 10, onlyAcappella = true, blockVideos = false, kidZone = false)
        assertTrue(ladiesBlocked.categories.episodes.any { it.videoId == "vef" })
        val ladiesUnrestricted = offlineSearch(corpus, matcher, "Ladies", 10, onlyAcappella = false, blockVideos = false, kidZone = false)
        assertTrue(ladiesUnrestricted.categories.episodes.any { it.videoId == "vef" })
    }

    @Test
    fun `search drops a globally blocked show's episodes by show id, not just videoId`() {
        // MPS2 rides blocked.global: its episode ve3 must vanish from offline search even though ve3's
        // own videoId is not in the shard.
        val blocked = offlineSearch(corpus, matcher, "Three", 10, onlyAcappella = false, blockVideos = false, kidZone = false)
        assertTrue(blocked.categories.episodes.none { it.videoId == "ve3" })
        val unrestricted = offlineSearch(corpus, matcher, "Three", 10, onlyAcappella = true, blockVideos = false, kidZone = false)
        assertTrue(unrestricted.categories.episodes.none { it.videoId == "ve3" })
    }

    @Test
    fun `live podcast whitelist overlay drops de-approved channels with their shows and episodes`() {
        val overlaid = corpus.withLivePodcastWhitelist(setOf("UCn"))
        assertEquals(listOf("UCn"), overlaid.podcastChannels.map { it.id })
        assertEquals(listOf("MPS1", "MPS2"), overlaid.podcasts.map { it.id })
        assertTrue(overlaid.podcastEpisodes.none { it.videoId == "vef" })
        // empty live set = not synced yet -> no-op, never wipes the snapshot
        assertTrue(corpus === corpus.withLivePodcastWhitelist(emptySet()))
        // a null-channelId show is grandfathered
        val orphan = SubPodcastShow("MPSO", "Orphan Show", null, null, null, null)
        val withOrphan = corpus.copy(podcasts = corpus.podcasts + orphan)
        assertTrue(withOrphan.withLivePodcastWhitelist(setOf("UCn")).podcasts.any { it.id == "MPSO" })
    }

    @Test
    fun `genre catalog counts are post-filter, most-populated first, titles capitalized`() {
        // MPS2 is globally blocked: gemara = s1 + sf (2); only s1 carries history (1).
        val restricted = offlinePodcastGenres(corpus, onlyAcappella = true, blockVideos = false, kidZone = false)
        assertEquals(listOf("gemara", "history"), restricted.genres.map { it.id }) // count desc → gemara first
        assertEquals(2, restricted.genres.first { it.id == "gemara" }.showCount)
        assertEquals("Gemara", restricted.genres.first { it.id == "gemara" }.title) // slug capitalized offline
        assertEquals(1, restricted.genres.first { it.id == "history" }.showCount)

        val unrestricted = offlinePodcastGenres(corpus, onlyAcappella = false, blockVideos = false, kidZone = false)
        assertEquals(2, unrestricted.genres.first { it.id == "gemara" }.showCount) // podcasts ignore onlyAcappella
    }

    @Test
    fun `genre detail lists gated member shows, 404 when none`() {
        val open = offlinePodcastGenre(corpus, "gemara", onlyAcappella = true, blockVideos = false, kidZone = false)!!
        assertEquals("Gemara", open.genre.title)
        assertEquals(listOf("MPS1", "MPSF"), open.shows.map { it.id }) // MPS2 globally blocked

        val unrestricted = offlinePodcastGenre(corpus, "gemara", onlyAcappella = false, blockVideos = false, kidZone = false)!!
        assertEquals(listOf("MPS1", "MPSF"), unrestricted.shows.map { it.id })

        // history has only s1; an unknown slug is a 404.
        assertEquals(listOf("MPS1"), offlinePodcastGenre(corpus, "history", onlyAcappella = true, blockVideos = false, kidZone = false)!!.shows.map { it.id })
        assertNull(offlinePodcastGenre(corpus, "nonexistent", onlyAcappella = true, blockVideos = false, kidZone = false))
    }
}
