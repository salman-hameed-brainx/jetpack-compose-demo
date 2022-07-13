package com.mobile.goal.ui.profile.settings.change_password

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.ChangePasswordDto
import com.mobile.goal.domain.use_case.ChangePasswordUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

data class ChangePasswordState(
    val isLoading: Boolean = false,
    val oldPasswordError: String = "",
    val passwordError: String = "",
    val password2Error: String = "",
)

sealed class ChangePasswordUiEvent {
    data class ShowSnackBar(val message: String) : ChangePasswordUiEvent()
    object NavigateToHome : ChangePasswordUiEvent()
}

@HiltViewModel
class ChangePasswordViewModel @Inject constructor(
    private val changePasswordUseCase: ChangePasswordUseCase
) : ViewModel() {
    private val _oldPasswordState = mutableStateOf("")
    val oldPasswordState: State<String> = _oldPasswordState

    private val _newPasswordState = mutableStateOf("")
    val newPasswordState: State<String> = _newPasswordState

    private val _confirmNewPasswordState = mutableStateOf("")
    val confirmNewPasswordState: State<String> = _confirmNewPasswordState

    private val _state = mutableStateOf(ChangePasswordState())
    val state: State<ChangePasswordState> = _state

    private val _eventFlow = MutableSharedFlow<ChangePasswordUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: ChangePasswordEvent) {
        when (event) {
            is ChangePasswordEvent.EnteredOldPassword -> _oldPasswordState.value = event.value
            is ChangePasswordEvent.EnteredNewPassword -> _newPasswordState.value = event.value
            is ChangePasswordEvent.EnteredConfirmNewPassword -> _confirmNewPasswordState.value =
                event.value
        }
    }

    fun changePassword() {
        val oldPassword = oldPasswordState.value
        val newPassword = newPasswordState.value
        val confirmNewPassword = confirmNewPasswordState.value

        if (oldPassword.isEmpty()) {
            _state.value = ChangePasswordState(oldPasswordError = "Old Password is required")
            return
        }
        if (newPassword.isEmpty()) {
            _state.value = ChangePasswordState(passwordError = "New Password is required")
            return
        }
        if (confirmNewPassword.isEmpty()) {
            _state.value =
                ChangePasswordState(password2Error = "Confirm New Password is required")
            return
        }
        if (newPassword != confirmNewPassword) {
            _state.value = ChangePasswordState(password2Error = "Password Mismatched")
            return
        }

        changePasswordUseCase(
            ChangePasswordDto(
                oldPassword = oldPasswordState.value,
                newPassword = newPasswordState.value,
                confirmNewPassword = confirmNewPasswordState.value
            )
        ).onEach { result ->
            when (result) {

                is Resource.Success -> {
                    _state.value = ChangePasswordState(isLoading = false)

                }
                is Resource.Error -> {
                    _state.value= ChangePasswordState(isLoading = false)
                    _eventFlow.emit(
                        ChangePasswordUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = ChangePasswordState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}