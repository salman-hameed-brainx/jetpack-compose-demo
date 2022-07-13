package com.mobile.goal.ui.onboarding.welcome

import com.google.android.gms.auth.api.signin.GoogleSignInAccount

sealed class WelcomeEvent{
    data class GoogleSignInSuccess(val googleSignInAccount: GoogleSignInAccount): WelcomeEvent()
    data class GoogleSignInFailed(val errorMessage: String? = ""): WelcomeEvent()
}