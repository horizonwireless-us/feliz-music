package com.jtech.felizmusic.utils

import com.jtech.felizmusic.db.entities.PodcastWhitelistEntity
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * The channel-keyed podcast whitelist gate. Membership is pure and podcasts ignore onlyAcappella;
 * isFemale was removed from the podcast contract.
 */
class PodcastWhitelistCacheTest {

    @After
    fun reset() = PodcastWhitelistCache.updateAll(emptyList())

    private fun entry(id: String, isKidZone: Boolean = false) =
        PodcastWhitelistEntity(channelId = id, name = id, isKidZone = isKidZone)

    @Test
    fun `membership is the single podcast gate`() {
        PodcastWhitelistCache.updateAll(listOf(entry("UCone"), entry("UCtwo", isKidZone = true)))
        assertTrue(PodcastWhitelistCache.isChannelWhitelisted("UCone"))
        assertTrue(PodcastWhitelistCache.isChannelWhitelisted("UCtwo"))
        assertFalse(PodcastWhitelistCache.isChannelWhitelisted("UCother"))
    }

    @Test
    fun `channelPasses equals membership and never filters on acappella`() {
        PodcastWhitelistCache.updateAll(listOf(entry("UCone")))
        assertTrue(PodcastWhitelistCache.channelPasses("UCone"))
        assertFalse(PodcastWhitelistCache.channelPasses("UCunknown"))
    }
}
