package com.mobile.goal.ui.onboarding.welcome

import android.os.Bundle
import androidx.activity.result.ActivityResultRegistryOwner
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.mobile.goal.common.Constants
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.*
import com.mobile.goal.domain.use_case.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.json.JSONException
import javax.inject.Inject


data class WelcomeState(
    val isLoading: Boolean = false,
)

sealed class WelcomeUiEvent {
    data class ShowSnackBar(val message: String) : WelcomeUiEvent()
    object NavigateToHome : WelcomeUiEvent()
    object NavigateToCompleteProfile : WelcomeUiEvent()
}

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val signInGoogleUseCase: SignInGoogleUseCase,
    private val getFBSessionTokenUseCase: GetFBSessionTokenUseCase,
    private val signInFacebookUseCase: SignInFacebookUseCase,
    private val requestTokenUseCase: RequestTokenUseCase,
    private val getAboutMeUseCase: GetAboutMeUseCase,
    private val sessionDataStore: SessionDataStore
) : ViewModel() {
    private val _state = mutableStateOf(WelcomeState())
    val state: State<WelcomeState> = _state

    private val _eventFlow = MutableSharedFlow<WelcomeUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: WelcomeEvent) {
        when (event) {
            is WelcomeEvent.GoogleSignInSuccess -> googleSignIn(event.googleSignInAccount)
            is WelcomeEvent.GoogleSignInFailed -> showErrorSnack(event.errorMessage)
        }
    }

    fun initFBSignIn(
        facebookAppId: String,
        activityResultRegistryOwner: ActivityResultRegistryOwner
    ) {
        val loginManager = LoginManager.getInstance()
        val callbackManager = CallbackManager.Factory.create()

        loginManager.logIn(
            activityResultRegistryOwner,
            callbackManager,
            listOf(
                "public_profile",
                "email"
            )
        )

        loginManager.registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
            override fun onSuccess(result: LoginResult) {
                getFBSessionInfo(
                    facebookAppId = facebookAppId,
                    accessToken = result.accessToken,
                )
            }

            override fun onError(error: FacebookException) {
                WelcomeUiEvent.ShowSnackBar(
                    message = error.localizedMessage ?: "An unexpected error occurred"
                )
            }

            override fun onCancel() {
                WelcomeUiEvent.ShowSnackBar(
                    message = "An unexpected error occurred"
                )
            }
        })
    }

    private fun googleSignIn(googleSignInAccount: GoogleSignInAccount) {
        if (googleSignInAccount.idToken != null) {
            signInGoogleUseCase(
                SignInGoogleDto(
                    client_id = Constants.CLIENT_ID,
                    code_challenge = "DmJu_0Inyxdrzp202M1G0IePZ3QcjEBKTmoKMNGl78Y",
                    code_challenge_method = Constants.CODE_CHALLENGE_METHOD,
                    id_token = googleSignInAccount.idToken.toString()
                )
            ).onEach { result ->
                when (result) {
                    is Resource.Success -> {
                        val response = result.data
                        response?.let {
                            requestToken(it.code)
                        }
                    }
                    is Resource.Error -> {
                        _state.value = WelcomeState(isLoading = false)

                        _eventFlow.emit(
                            WelcomeUiEvent.ShowSnackBar(
                                message = result.message ?: "An unexpected error occurred"
                            )
                        )
                    }
                    is Resource.Loading -> {
                        _state.value = WelcomeState(isLoading = true)
                    }
                }
            }.launchIn(viewModelScope)
        }
    }

    private fun getFBSessionInfo(
        facebookAppId: String,
        accessToken: AccessToken
    ) {
        getFBSessionTokenUseCase(
            FBSessionTokenDto(
                grant_type = Constants.FB_SESSION_GRANT_TYPE,
                client_id = facebookAppId,
                fb_exchange_token = accessToken.token
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    result.data?.access_token?.let { fbSessionToken ->
                        val request =
                            GraphRequest.newMeRequest(accessToken = accessToken) { obj, _ ->
                                try {
                                    val email = obj?.getString("email")
                                    val fullName = obj?.getString("name")

                                    email?.let { fbEmail ->
                                        facebookSignIn(
                                            fbSessionToken = fbSessionToken,
                                            email = fbEmail,
                                            fullName = fullName ?: ""
                                        )
                                    }

                                } catch (e: JSONException) {
                                    WelcomeUiEvent.ShowSnackBar(
                                        message = "An unexpected error occurred"
                                    )
                                }
                            }

                        val parameters = Bundle()
                        parameters.putString("fields", "id,name,email")
                        request.parameters = parameters
                        request.executeAsync()

                    }
                }
                is Resource.Error -> {
                    _state.value = WelcomeState(isLoading = false)

                    _eventFlow.emit(
                        WelcomeUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = WelcomeState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun facebookSignIn(fbSessionToken: String, email: String, fullName: String) {
        signInFacebookUseCase(
            SignInFacebookDto(
                client_id = Constants.CLIENT_ID,
                code_challenge = "DmJu_0Inyxdrzp202M1G0IePZ3QcjEBKTmoKMNGl78Y",
                code_challenge_method = Constants.CODE_CHALLENGE_METHOD,
                fb_session_token = fbSessionToken,
                fb_profile_data = FbProfileData(
                    email = email,
                    first_name = fullName.split(" ")[0],
                    last_name = fullName.split(" ")[1]
                ).toJsonObject()
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val response = result.data
                    response?.let {
                        requestToken(it.code)
                    }
                }
                is Resource.Error -> {
                    _state.value = WelcomeState(isLoading = false)

                    _eventFlow.emit(
                        WelcomeUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = WelcomeState(isLoading = true)
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
                    _state.value = WelcomeState(isLoading = false)

                    _eventFlow.emit(
                        WelcomeUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = WelcomeState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun getAboutMe() {
        getAboutMeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = WelcomeState(isLoading = false)

                    if (result.data?.participant != null) {
                        sessionDataStore.updateProfile(result.data.participant)
                        sessionDataStore.updateIsProfileCompleted(true)
                        _eventFlow.emit(WelcomeUiEvent.NavigateToHome)
                    } else {
                        _eventFlow.emit(WelcomeUiEvent.NavigateToCompleteProfile)
                    }
                }
                is Resource.Error -> {
                    _state.value = WelcomeState(isLoading = false)

                    _eventFlow.emit(
                        WelcomeUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.value = WelcomeState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun showErrorSnack(errorMessage: String?) {
        viewModelScope.launch {
            _eventFlow.emit(
                WelcomeUiEvent.ShowSnackBar(
                    message = errorMessage ?: "An unexpected error occurred"
                )
            )
        }
    }
}

