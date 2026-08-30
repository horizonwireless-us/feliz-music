package com.jtech.felizmusic.offline

/**
 * Acappella flag derivation for the offline subset. The Feliz contract filters music by the owning
 * artist's explicit `isAcappella`; featured-credit gender inference and curator-ownership rules were
 * removed. These shims keep the threaded matcher signatures intact.
 */

/** Compatibility placeholder for the removed female-credit matcher. */
class FemaleMatcher private constructor() {
    companion object {
        val EMPTY = FemaleMatcher()
    }
}

fun buildFemaleMatcher(artists: List<SubArtist>): FemaleMatcher = FemaleMatcher.EMPTY

/**
 * Acappella video ids = tracks whose owning artist has isAcappella=true. No credit inference.
 */
fun collectFemaleVideoIds(corpus: SubsetCorpus, matcher: FemaleMatcher): Set<String> =
    corpus.tracks
        .filter { corpus.artistsById[it.artistId]?.isAcappella == true }
        .map { it.videoId }
        .toSet()

/** No featured-credit gender logic in the Feliz contract. */
fun isFemaleInvolved(title: String, artistName: String, primaryIsFemale: Boolean, matcher: FemaleMatcher): Boolean =
    primaryIsFemale

/** No curator-ownership rule in the Feliz contract. */
fun isCommunityFemaleOwned(author: String?, matcher: FemaleMatcher): Boolean = false
