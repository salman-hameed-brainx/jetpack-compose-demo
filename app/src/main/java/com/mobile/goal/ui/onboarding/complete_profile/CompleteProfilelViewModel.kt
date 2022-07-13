package com.mobile.goal.ui.onboarding.complete_profile

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.UpdateProfileDto
import com.mobile.goal.domain.use_case.UpdateProfileUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


data class CompleteProfileState(
    val isLoading: Boolean = false,
    val firstNameError: String = "",
    val lastNameError: String = "",
    val genderError: String = "",
    val dobError: String = ""
)

sealed class CompleteProfileUiEvent {
    data class ShowSnackBar(val message: String) : CompleteProfileUiEvent()
    object NavigateToHome : CompleteProfileUiEvent()
}

@HiltViewModel
class CompleteProfilelViewModel @Inject constructor(
    private val updateProfileUseCase: UpdateProfileUseCase,
    private val sessionDataStore: SessionDataStore
) : ViewModel() {

    private val _firstNameState = mutableStateOf("")
    val firstNameState: State<String> = _firstNameState

    private val _lastNameState = mutableStateOf("")
    val lastNameState: State<String> = _lastNameState

    private val _genderState = mutableStateOf("")
    val genderState: State<String> = _genderState

    private val _dobState = mutableStateOf("")
    val dobState: State<String> = _dobState

    private val _state = mutableStateOf(CompleteProfileState())
    val state: State<CompleteProfileState> = _state

    private val _eventFlow = MutableSharedFlow<CompleteProfileUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: CompleteProfileEvent) {
        when (event) {
            is CompleteProfileEvent.EnteredFirstName -> _firstNameState.value = event.value
            is CompleteProfileEvent.EnteredLastName -> _lastNameState.value = event.value
            is CompleteProfileEvent.SelectedGender -> _genderState.value = event.value
            is CompleteProfileEvent.SelectedDob -> _dobState.value = event.value
        }
    }

    fun updateProfile() {
        val firstName = firstNameState.value
        val lastName = lastNameState.value
        val gender = genderState.value
        val dob = dobState.value

        if (firstName.isEmpty()) {
            _state.value = CompleteProfileState(firstNameError = "First name is required")
            return
        }

        if (lastName.isEmpty()) {
            _state.value = CompleteProfileState(lastNameError = "Last name is required")
            return
        }

        if (gender.isEmpty()) {
            _state.value = CompleteProfileState(genderError = "Gender is required")
            return
        }

        if (dob.isEmpty()) {
            _state.value = CompleteProfileState(dobError = "Birthdate is required")
            return
        }

        updateProfileUseCase(
            UpdateProfileDto(
                first_name = firstNameState.value,
                last_name = lastNameState.value,
                gender = genderState.value,
                dob = dobState.value
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val response = result.data
                    sessionDataStore.updateIsProfileCompleted(true)
                    response?.let { _eventFlow.emit(CompleteProfileUiEvent.NavigateToHome) }
                }
                is Resource.Error -> {
                    _state.value = CompleteProfileState(isLoading = false)

                    _eventFlow.emit(
                        CompleteProfileUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = CompleteProfileState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}

