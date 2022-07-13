package com.mobile.goal.ui.onboarding.login_email

sealed class LoginEmailEvent{
    data class EnteredEmail(val value: String): LoginEmailEvent()
    data class EnteredPassword(val value: String): LoginEmailEvent()
}