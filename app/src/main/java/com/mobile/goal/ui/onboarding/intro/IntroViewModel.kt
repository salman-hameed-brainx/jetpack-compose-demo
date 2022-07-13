package com.mobile.goal.ui.onboarding.intro

import androidx.lifecycle.ViewModel
import com.mobile.goal.data.local.data_store.SettingsDataStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject


sealed class IntroUiEvent {
    object CompleteIntro : IntroUiEvent()
}

@HiltViewModel
class IntroViewModel @Inject constructor(
    private val settingsDataStore: SettingsDataStore,
) : ViewModel() {

    private val _eventFlow = MutableSharedFlow<IntroUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    suspend fun completeIntro() {
        settingsDataStore.updateIsIntroCompleted(true)
        _eventFlow.emit(
            IntroUiEvent.CompleteIntro
        )
    }
}

