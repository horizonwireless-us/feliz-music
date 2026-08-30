package com.jtech.felizmusic.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.jtech.felizmusic.viewmodels.OnboardingViewModel
import com.jtech.felizmusic.ui.screens.onboarding.OnboardingSearchBackupScreen
import com.jtech.felizmusic.constants.EnableContentFiltersKey
import com.jtech.felizmusic.constants.AllowFemaleSingersKey
import com.jtech.felizmusic.constants.BlockVideosKey
import com.jtech.felizmusic.ui.screens.onboarding.WelcomeScreen
import com.jtech.felizmusic.ui.screens.onboarding.DensityScreen
import com.jtech.felizmusic.ui.screens.onboarding.ContentFiltersScreen
import com.jtech.felizmusic.ui.screens.onboarding.PermissionsScreen
import com.jtech.felizmusic.ui.screens.onboarding.BottomNavSetupScreen
import com.jtech.felizmusic.ui.screens.onboarding.OnboardingNavigation
import com.jtech.felizmusic.ui.screens.onboarding.OnboardingStep

@Composable
fun OnboardingFlow(
    onFinished: () -> Unit,
) {
    val context = LocalContext.current
    val viewModel: OnboardingViewModel = hiltViewModel()
    val uiState by viewModel.uiState.collectAsState()

    val densityAlreadySet = remember {
        val prefs = context.getSharedPreferences("metrolist_settings", Context.MODE_PRIVATE)
        prefs.getFloat("density_scale_factor", 1.0f) != 1.0f
    }

    // Simple check if filters are already set
    val contentFiltersAlreadySet = remember {
        context.getSharedPreferences("metrolist_settings", Context.MODE_PRIVATE).let { prefs ->
            prefs.contains(EnableContentFiltersKey.name) &&
            prefs.contains(AllowFemaleSingersKey.name) &&
            prefs.contains(BlockVideosKey.name)
        }
    }

    var step by rememberSaveable { mutableStateOf(OnboardingStep.Welcome) }

    when (step) {
        OnboardingStep.Welcome -> WelcomeScreen(
            onContinue = {
                step = OnboardingNavigation.afterWelcome(densityAlreadySet, contentFiltersAlreadySet)
            }
        )

        OnboardingStep.Density -> DensityScreen(
            onSkip = { step = OnboardingNavigation.afterDensity(contentFiltersAlreadySet) },
            onBack = { step = OnboardingStep.Welcome }
        )

        OnboardingStep.ContentFilters -> ContentFiltersScreen(
            onSkip = { step = OnboardingStep.Permissions },
            onBack = { step = OnboardingNavigation.backFromContentFilters(densityAlreadySet) },
            viewModel = viewModel,
            contentFiltersAlreadySet = contentFiltersAlreadySet
        )

        OnboardingStep.Permissions -> PermissionsScreen(
            onBack = { step = OnboardingNavigation.backFromPermissions(densityAlreadySet, contentFiltersAlreadySet) },
            onComplete = { step = OnboardingStep.BottomNavSetup }
        )

        OnboardingStep.BottomNavSetup -> BottomNavSetupScreen(
            onBack = { step = OnboardingStep.Permissions },
            onComplete = { step = OnboardingStep.SearchBackup }
        )

        OnboardingStep.SearchBackup -> OnboardingSearchBackupScreen(
            onBack = { step = OnboardingStep.BottomNavSetup },
            onComplete = { step = OnboardingStep.Loading }
        )

        OnboardingStep.Loading -> LoadingScreen(
            onFinished = onFinished
        )
    }
}

