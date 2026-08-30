package com.jtech.felizmusic.utils

/**
 * The client-side content gate for TELEMETRY-RANKED rows: onlyAcappella + Israeli + kids-only
 * — deliberately NOT the famous/american quality proxy (applying it cut the ranked rows to near-empty;
 * see AGENTS §home tab). These exclusions have no wire flag, so EVERY ranked surface must apply them
 * client-side. One definition, shared by [com.jtech.felizmusic.viewmodels.HomeViewModel] (whitelist-doc
 * profiles) and [com.jtech.felizmusic.viewmodels.VideoHomeRowsViewModel] ([WhitelistCache] entries) via the
 * injected [flagsOf] lookup — the rule itself can't drift between them. Pure and JVM-tested.
 */
object RankedContentGate {

    data class Flags(val isAcappella: Boolean, val isKids: Boolean)

    /**
     * Whether an item credited to [ids] is excluded from a ranked row. Unknown ids contribute no
     * flags (fail-open on the acappella/kids checks — matching the pre-extraction behavior when a
     * profile was missing); the Israeli check needs only the id.
     */
    fun isBlockedRanked(
        ids: List<String>,
        acappellaOnly: Boolean,
        flagsOf: (String) -> Flags?,
        isIsraeli: (String) -> Boolean = IsraeliArtistRegistry::isIsraeli,
    ): Boolean {
        if (ids.any(isIsraeli)) return true
        val flags = ids.mapNotNull(flagsOf)
        if (acappellaOnly && flags.any { !it.isAcappella }) return true
        if (flags.any { it.isKids }) return true
        return false
    }
}
