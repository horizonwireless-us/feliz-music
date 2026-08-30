package com.jtech.felizmusic.models

import androidx.annotation.StringRes
import android.view.KeyEvent
import androidx.datastore.preferences.core.Preferences
import com.jtech.felizmusic.R
import com.jtech.felizmusic.constants.ButtonDpadCenterKey
import com.jtech.felizmusic.constants.ButtonDpadDownKey
import com.jtech.felizmusic.constants.ButtonDpadLeftKey
import com.jtech.felizmusic.constants.ButtonDpadRightKey
import com.jtech.felizmusic.constants.ButtonDpadUpKey

enum class DpadDirection(
    @StringRes val labelRes: Int,
    val prefKey: Preferences.Key<Int>,
    val keyCode: Int
) {
    RIGHT(R.string.dpad_direction_right, ButtonDpadRightKey, KeyEvent.KEYCODE_DPAD_RIGHT),
    LEFT(R.string.dpad_direction_left, ButtonDpadLeftKey, KeyEvent.KEYCODE_DPAD_LEFT),
    UP(R.string.dpad_direction_up, ButtonDpadUpKey, KeyEvent.KEYCODE_DPAD_UP),
    DOWN(R.string.dpad_direction_down, ButtonDpadDownKey, KeyEvent.KEYCODE_DPAD_DOWN),
    CENTER(R.string.dpad_direction_center, ButtonDpadCenterKey, KeyEvent.KEYCODE_DPAD_CENTER);

    companion object {
        val wizardOrder = listOf(RIGHT, LEFT, UP, DOWN, CENTER)
    }
}
