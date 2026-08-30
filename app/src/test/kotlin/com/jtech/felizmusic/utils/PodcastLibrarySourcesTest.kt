package com.jtech.felizmusic.utils

import com.jtech.felizmusic.db.entities.PodcastWhitelistEntity
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Regression tests for the podcast library gate:
 *  - the channel-vs-show keying bug: the podcast whitelist is keyed by the host CHANNEL id (`UC…`), but
 *    subscribed rows were being filtered by the SHOW id (`MPSP…`) against it, which never matches — so
 *    once the whitelist populated, the subscribed list and New Episodes went permanently empty.
 *  - podcasts ignore onlyAcappella: display surfaces apply pure channel membership (isFemale was
 *    removed from the podcast contract).
 * [PodcastLibrarySources.subscribedPodcastAllowed]/[podcastChannelAllowed] key off the channel id.
 */
class PodcastLibrarySourcesTest {

    private fun seed(vararg entries: PodcastWhitelistEntity) {
        PodcastWhitelistCache.updateAll(entries.toList())
    }

    private fun channel(id: String, isKidZone: Boolean = false) =
        PodcastWhitelistEntity(channelId = id, name = id, isKidZone = isKidZone)

    private val filtersOn = ContentFilterConfig(filtersEnabled = true, acappellaOnly = true)

    @Test
    fun `an approved host channel passes`() {
        seed(channel("UCapproved"))
        assertTrue(PodcastLibrarySources.subscribedPodcastAllowed("UCapproved", filtersOn))
    }

    @Test
    fun `a non-approved channel is dropped`() {
        seed(channel("UCapproved"))
        assertFalse(PodcastLibrarySources.subscribedPodcastAllowed("UCother", filtersOn))
    }

    @Test
    fun `a SHOW id never matches the channel-keyed whitelist (the bug)`() {
        // MPSP… is a show id; the cache holds only channel ids, so passing a show id must be false —
        // which is exactly why the filter has to use channelId, not the PodcastEntity's own id.
        seed(channel("UCapproved"))
        assertFalse(PodcastLibrarySources.subscribedPodcastAllowed("MPSPshow123", filtersOn))
    }

    @Test
    fun `a null channelId is kept (grandfathered or not-yet-synced subscription)`() {
        seed(channel("UCapproved"))
        assertTrue(PodcastLibrarySources.subscribedPodcastAllowed(null, filtersOn))
    }

    @Test
    fun `podcasts ignore onlyAcappella - kids and plain channels both pass`() {
        seed(channel("UCkids", isKidZone = true), channel("UCplain"))
        assertTrue(PodcastLibrarySources.subscribedPodcastAllowed("UCkids", filtersOn))
        assertTrue(PodcastLibrarySources.podcastChannelAllowed("UCkids", filtersOn))
        assertTrue(PodcastLibrarySources.subscribedPodcastAllowed("UCplain", filtersOn))
    }

    @Test
    fun `a non-member channel never passes the display gate`() {
        seed(channel("UCapproved"))
        assertFalse(PodcastLibrarySources.podcastChannelAllowed("UCother", filtersOn))
    }
}
