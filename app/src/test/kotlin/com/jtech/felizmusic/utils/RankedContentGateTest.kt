package com.jtech.felizmusic.utils

import com.jtech.felizmusic.utils.RankedContentGate.Flags
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * The shared ranked-row content gate (onlyAcappella + Israeli + kids-only; NEVER the
 * famous/american proxy). Both HomeViewModel and VideoHomeRowsViewModel resolve through this one
 * rule — these tests pin it so the two surfaces cannot drift.
 */
class RankedContentGateTest {

    private val flags = mapOf(
        "UCacappella" to Flags(isAcappella = true, isKids = false),
        "UCkid" to Flags(isAcappella = false, isKids = true),
        "UCok" to Flags(isAcappella = false, isKids = false),
    )
    private fun gate(ids: List<String>, onlyAcappella: Boolean, israeli: Set<String> = emptySet()) =
        RankedContentGate.isBlockedRanked(ids, onlyAcappella, flags::get, isIsraeli = { it in israeli })

    @Test
    fun `onlyAcappella keeps the acappella artist and drops the non-acappella artist`() {
        assertFalse(gate(listOf("UCacappella"), onlyAcappella = true))
        assertTrue(gate(listOf("UCok"), onlyAcappella = true))
    }

    @Test
    fun `absent or false onlyAcappella is unrestricted`() {
        assertFalse(gate(listOf("UCok"), onlyAcappella = false))
        assertFalse(gate(listOf("UCacappella"), onlyAcappella = false))
    }

    @Test
    fun `kids-only artist blocks regardless of onlyAcappella`() {
        assertTrue(gate(listOf("UCkid"), onlyAcappella = true))
        assertTrue(gate(listOf("UCkid"), onlyAcappella = false))
    }

    @Test
    fun `israeli id blocks even with no flags known`() {
        assertTrue(gate(listOf("UCunknown"), onlyAcappella = true, israeli = setOf("UCunknown")))
    }

    @Test
    fun `unknown ids fail open and a clean artist passes`() {
        assertFalse(gate(listOf("UCunknown"), onlyAcappella = false))
        assertFalse(gate(listOf("UCunknown"), onlyAcappella = true))
        assertFalse(gate(listOf("UCok"), onlyAcappella = false))
        assertFalse(gate(emptyList(), onlyAcappella = false))
    }

    @Test
    fun `any non-acappella credit blocks the item under onlyAcappella`() {
        assertTrue(gate(listOf("UCacappella", "UCok"), onlyAcappella = true))
        assertFalse(gate(listOf("UCacappella", "UCok"), onlyAcappella = false))
    }
}
