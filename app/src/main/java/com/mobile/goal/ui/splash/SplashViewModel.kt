package com.mobile.goal.ui.splash

import androidx.lifecycle.ViewModel
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.local.data_store.SettingsDataStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject


sealed class SplashUiEvent {
    object NavigateToHome : SplashUiEvent()
    object NavigateToWelcome : SplashUiEvent()
    object NavigateToOnboarding : SplashUiEvent()
    object NavigateToCompleteProfile : SplashUiEvent()
}

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val sessionDataStore: SessionDataStore,
    private val settingsDataStore: SettingsDataStore
) : ViewModel() {

    private val _eventFlow = MutableSharedFlow<SplashUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    suspend fun navigateHome() {
        if (!sessionDataStore.getAccessToken().isNullOrEmpty()) {
            if (sessionDataStore.isProfileCompleted() == true) {
                _eventFlow.emit(SplashUiEvent.NavigateToHome)
            } else {
                sessionDataStore.clearSession()
                _eventFlow.emit(SplashUiEvent.NavigateToWelcome)
            }
        } else {
            navigateToOnboarding()
        }
    }



    private suspend fun navigateToOnboarding() {
        when (settingsDataStore.isIntroCompleted()) {
            true -> _eventFlow.emit(SplashUiEvent.NavigateToWelcome)
            else -> _eventFlow.emit(SplashUiEvent.NavigateToOnboarding)
        }
    }
}

