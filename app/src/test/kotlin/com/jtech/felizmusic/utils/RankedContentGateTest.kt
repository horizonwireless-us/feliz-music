package com.jtech.felizmusic.utils

import com.jtech.felizmusic.utils.RankedContentGate.Flags
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * The shared ranked-row content gate (female-when-blocked + Israeli + kids-only; NEVER the
 * famous/american proxy). Both HomeViewModel and VideoHomeRowsViewModel resolve through this one
 * rule — these tests pin it so the two surfaces cannot drift.
 */
class RankedContentGateTest {

    private val flags = mapOf(
        "UCfem" to Flags(isAcappella = true, isKids = false),
        "UCkid" to Flags(isAcappella = false, isKids = true),
        "UCok" to Flags(isAcappella = false, isKids = false),
    )
    private fun gate(ids: List<String>, onlyAcappella: Boolean, israeli: Set<String> = emptySet()) =
        RankedContentGate.isBlockedRanked(ids, onlyAcappella, flags::get, isIsraeli = { it in israeli })

    @Test
    fun `female artist blocks only when female is blocked`() {
        assertTrue(gate(listOf("UCfem"), onlyAcappella = false))
        assertFalse(gate(listOf("UCfem"), onlyAcappella = true))
    }

    @Test
    fun `kids-only artist blocks regardless of the female flag`() {
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
        assertFalse(gate(listOf("UCok"), onlyAcappella = false))
        assertFalse(gate(emptyList(), onlyAcappella = false))
    }

    @Test
    fun `any blocked credit blocks the item`() {
        assertTrue(gate(listOf("UCok", "UCfem"), onlyAcappella = false))
        assertFalse(gate(listOf("UCok", "UCfem"), onlyAcappella = true))
    }
}
