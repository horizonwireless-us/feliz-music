package com.jtech.felizmusic.lyrics.model

/**
 * Thrown when a provider reached the server but the track has no lyrics/transcript available.
 */
@Suppress("unused")
object LyricsUnavailableException : IllegalStateException("Lyrics not available for this track") {
    private fun readResolve(): Any = LyricsUnavailableException
}
