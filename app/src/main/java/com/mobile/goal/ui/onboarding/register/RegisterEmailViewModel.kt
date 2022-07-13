package com.mobile.goal.ui.onboarding.register

import android.util.Patterns
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Constants
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.LoginEmailDto
import com.mobile.goal.data.remote.dto.RequestTokenDto
import com.mobile.goal.data.remote.dto.UpdateProfileDto
import com.mobile.goal.domain.use_case.RegisterEmailUseCase
import com.mobile.goal.domain.use_case.RequestTokenUseCase
import com.mobile.goal.domain.use_case.UpdateProfileUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

data class RegisterEmailState(
    val isLoading: Boolean = false,
    val firstNameError: String = "",
    val lastNameError: String = "",
    val emailError: String = "",
    val passwordError: String = "",
    val confirmPasswordError: String = "",
    val genderError: String = "",
    val dobError: String = "",
    val selectGender: Boolean = false
)

sealed class RegisterEmailUiEvent {
    data class ShowSnackBar(val message: String) : RegisterEmailUiEvent()
    object NavigateToHome : RegisterEmailUiEvent()
}

@HiltViewModel
class RegisterEmailViewModel @Inject constructor(
    private val registerEmailUseCase: RegisterEmailUseCase,
    private val updateProfileUseCase: UpdateProfileUseCase,
    private val requestTokenUseCase: RequestTokenUseCase,
    private val sessionDataStore: SessionDataStore
) : ViewModel() {

    private val _firstNameState = mutableStateOf("")
    val firstNameState: State<String> = _firstNameState

    private val _lastNameState = mutableStateOf("")
    val lastNameState: State<String> = _lastNameState

    private val _emailState = mutableStateOf("")
    val emailState: State<String> = _emailState

    private val _passwordState = mutableStateOf("")
    val passwordState: State<String> = _passwordState

    private val _confirmPasswordState = mutableStateOf("")
    val confirmPasswordState: State<String> = _confirmPasswordState

    private val _genderState = mutableStateOf("")
    val genderState: State<String> = _genderState

    private val _dobState = mutableStateOf("")
    val dobState: State<String> = _dobState

    private val _state = mutableStateOf(RegisterEmailState())
    val state: State<RegisterEmailState> = _state

    private val _eventFlow = MutableSharedFlow<RegisterEmailUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: RegisterEmailEvent) {
        when (event) {
            is RegisterEmailEvent.EnteredFirstName -> _firstNameState.value = event.value
            is RegisterEmailEvent.EnteredLastName -> _lastNameState.value = event.value
            is RegisterEmailEvent.EnteredEmail -> _emailState.value = event.value
            is RegisterEmailEvent.EnteredPassword -> _passwordState.value = event.value
            is RegisterEmailEvent.EnteredConfirmPassword -> _confirmPasswordState.value = event.value
            is RegisterEmailEvent.SelectedGender -> _genderState.value = event.value
            is RegisterEmailEvent.SelectedDob -> _dobState.value = event.value
        }
    }

    fun register() {
        val firstName = firstNameState.value
        val lastName = lastNameState.value
        val email = emailState.value
        val password = passwordState.value
        val confirmPassword = confirmPasswordState.value
        val gender = genderState.value
        val dob = dobState.value

        if (firstName.isEmpty()) {
            _state.value = RegisterEmailState(firstNameError = "First name is required")
            return
        }

        if (lastName.isEmpty()) {
            _state.value = RegisterEmailState(lastNameError = "Last name is required")
            return
        }

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _state.value = RegisterEmailState(emailError = "Email format is invalid")
            return
        }

        if (password.isEmpty() || !password.matches(Constants.PASSWORD_PATTERN.toRegex())) {
            _state.value =
                RegisterEmailState(passwordError = "Password must contain 8-30 characters including a number, a symbol, a lower and an upper case letter.")
            return
        }

        if (confirmPassword.isEmpty() || confirmPassword != password) {
            _state.value = RegisterEmailState(confirmPasswordError = "Passwords do not match")
            return
        }

        if (gender.isEmpty()) {
            _state.value = RegisterEmailState(genderError = "Gender is required")
            return
        }

        if (dob.isEmpty()) {
            _state.value = RegisterEmailState(dobError = "Birthdate is required")
            return
        }

        registerEmailUseCase(
            LoginEmailDto(
                email = emailState.value,
                password = passwordState.value,
                client_id = Constants.CLIENT_ID,
                code_challenge = "DmJu_0Inyxdrzp202M1G0IePZ3QcjEBKTmoKMNGl78Y",
                code_challenge_method = Constants.CODE_CHALLENGE_METHOD
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val response = result.data
                    response?.let { requestToken(it.code) }
                }
                is Resource.Error -> {
                    _state.value = RegisterEmailState(isLoading = false)

                    _eventFlow.emit(
                        RegisterEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = RegisterEmailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun requestToken(code: String) {
        requestTokenUseCase(
            RequestTokenDto(
                code = code,
                code_verifier = Constants.CODE_VERIFIER,
                grant_type = Constants.GRANT_TYPE,
                client_id = Constants.CLIENT_ID,
                )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    updateProfile()
                }
                is Resource.Error -> {
                    _state.value = RegisterEmailState(isLoading = false)

                    _eventFlow.emit(
                        RegisterEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = RegisterEmailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun updateProfile() {
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
                    sessionDataStore.updateIsProfileCompleted(true)
                    _eventFlow.emit(RegisterEmailUiEvent.NavigateToHome)
                }
                is Resource.Error -> {
                    _state.value = RegisterEmailState(isLoading = false)

                    _eventFlow.emit(
                        RegisterEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = RegisterEmailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    fun selectGender(){
        _state.value = RegisterEmailState(selectGender = true)
    }
}

