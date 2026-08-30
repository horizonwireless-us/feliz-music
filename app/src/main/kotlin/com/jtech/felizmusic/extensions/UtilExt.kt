package com.jtech.felizmusic.extensions

fun <T> tryOrNull(block: () -> T): T? =
    try {
        block()
    } catch (_: Exception) {
        null
    }
