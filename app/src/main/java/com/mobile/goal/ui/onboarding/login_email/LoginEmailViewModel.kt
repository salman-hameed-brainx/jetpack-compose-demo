package com.mobile.goal.ui.onboarding.login_email

import android.util.Patterns
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.BuildConfig
import com.mobile.goal.common.Constants
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.LoginEmailDto
import com.mobile.goal.data.remote.dto.RequestTokenDto
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.domain.use_case.GetAboutMeUseCase
import com.mobile.goal.domain.use_case.LoginEmailUseCase
import com.mobile.goal.domain.use_case.RequestTokenUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

val EMAIL = "android@mailinator.com"
val PASSWORD = "1234@Five"

data class LoginEmailState(
    val isLoading: Boolean = false,
    val emailError: String = "",
    val passwordError: String = ""
)

sealed class LoginEmailUiEvent {
    data class ShowSnackBar(val message: String) : LoginEmailUiEvent()
    object NavigateToHome : LoginEmailUiEvent()
    object NavigateToCompleteProfile : LoginEmailUiEvent()
}

@HiltViewModel
class LoginEmailViewModel @Inject constructor(
    private val loginEmailUseCase: LoginEmailUseCase,
    private val requestTokenUseCase: RequestTokenUseCase,
    private val getAboutMeUseCase: GetAboutMeUseCase,
    private val sessionDataStore: SessionDataStore
) : ViewModel() {

    private val _emailState = if (BuildConfig.DEBUG) mutableStateOf(EMAIL) else mutableStateOf("")
    val emailState: State<String> = _emailState

    private val _passwordState =
        if (BuildConfig.DEBUG) mutableStateOf(PASSWORD) else mutableStateOf("")
    val passwordState: State<String> = _passwordState


    private val _state = mutableStateOf(LoginEmailState())
    val state: State<LoginEmailState> = _state

    private val _eventFlow = MutableSharedFlow<LoginEmailUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: LoginEmailEvent) {
        when (event) {
            is LoginEmailEvent.EnteredEmail -> {
                _emailState.value = event.value
            }
            is LoginEmailEvent.EnteredPassword -> {
                _passwordState.value = event.value
            }
        }
    }

    fun login() {
        val email = emailState.value
        val password = passwordState.value

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _state.value = LoginEmailState(emailError = "Email format is invalid")
            return
        }

        if (password.isEmpty() || !password.matches(Constants.PASSWORD_PATTERN.toRegex())) {
            _state.value =
                LoginEmailState(passwordError = "Password must contain 8-30 characters including a number, a symbol, a lower and an upper case letter.")
            return
        }

        loginEmailUseCase(
            LoginEmailDto(
                email = email,
                password = password,
                client_id = Constants.CLIENT_ID,
                code_challenge = Constants.CHALLENGE_CODE,
                code_challenge_method = Constants.CODE_CHALLENGE_METHOD
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val response = result.data
                    response?.let { requestToken(it.code) }
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _eventFlow.emit(
                        LoginEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(true))
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
                client_id = Constants.CLIENT_ID
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    getAboutMe()
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    _eventFlow.emit(
                        LoginEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(true))
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun getAboutMe() {
        getAboutMeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    if (result.data?.participant != null) {
                        result.data.participant.email = emailState.value
                        sessionDataStore.updateProfile(result.data.participant)
                        sessionDataStore.updateIsProfileCompleted(true)
                        _eventFlow.emit(LoginEmailUiEvent.NavigateToHome)
                    } else {
                        _eventFlow.emit(LoginEmailUiEvent.NavigateToCompleteProfile)
                    }
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    _eventFlow.emit(
                        LoginEmailUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(true))
                }
            }
        }.launchIn(viewModelScope)
    }
}

