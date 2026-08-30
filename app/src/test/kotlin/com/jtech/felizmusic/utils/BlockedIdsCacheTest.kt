package com.jtech.felizmusic.utils

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Pure coverage of the global-only id-override cache. It is a process-global singleton, so each test
 * resets it afterward.
 */
class BlockedIdsCacheTest {

    private val filtersOn = ContentFilterConfig(filtersEnabled = true, acappellaOnly = false)
    private val acappellaOnly = ContentFilterConfig(filtersEnabled = true, acappellaOnly = true)
    private val filtersOff = ContentFilterConfig(filtersEnabled = false, acappellaOnly = false)

    @After
    fun reset() = BlockedIdsCache.updateAll(emptyMap())

    @Test
    fun `any recorded id hides whenever filtering is on, regardless of acappella`() {
        BlockedIdsCache.updateAll(mapOf("blockedSong" to "global"))

        assertTrue(BlockedIdsCache.isBlocked("blockedSong", filtersOn))
        assertTrue(BlockedIdsCache.isBlocked("blockedSong", acappellaOnly))
        assertFalse(BlockedIdsCache.isBlocked("blockedSong", filtersOff)) // master switch off => inert
    }

    @Test
    fun `unknown reason defaults to global, ids are trimmed, blanks and null are never blocked`() {
        BlockedIdsCache.updateAll(mapOf("x" to "weird", "  y  " to "global", "" to "global"))

        assertTrue(BlockedIdsCache.isBlocked("x", acappellaOnly)) // unknown reason -> global
        assertTrue(BlockedIdsCache.isBlocked("y", acappellaOnly)) // id trimmed on the way in
        assertFalse(BlockedIdsCache.isBlocked("other", filtersOn))
        assertFalse(BlockedIdsCache.isBlocked(null, filtersOn))
        assertFalse(BlockedIdsCache.isBlocked("", filtersOn))
    }

    @Test
    fun `serialize then parse round-trips id and reason`() {
        val entries = mapOf("a" to "global", "b" to "global")
        assertEquals(entries, BlockedIdsCache.parse(BlockedIdsCache.serialize(entries)))
    }

    @Test
    fun `parse defaults a reasonless line to global and skips blank lines`() {
        val parsed = BlockedIdsCache.parse("onlyid\n\n  \nwithreason\tglobal")
        assertEquals(mapOf("onlyid" to "global", "withreason" to "global"), parsed)
    }
}
