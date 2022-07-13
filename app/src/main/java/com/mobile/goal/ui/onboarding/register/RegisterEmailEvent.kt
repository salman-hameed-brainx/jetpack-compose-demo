package com.mobile.goal.ui.onboarding.register

sealed class RegisterEmailEvent{
    data class EnteredFirstName(val value: String): RegisterEmailEvent()
    data class EnteredLastName(val value: String): RegisterEmailEvent()
    data class EnteredEmail(val value: String): RegisterEmailEvent()
    data class EnteredPassword(val value: String): RegisterEmailEvent()
    data class EnteredConfirmPassword(val value: String): RegisterEmailEvent()
    data class SelectedGender(val value: String): RegisterEmailEvent()
    data class SelectedDob(val value: String): RegisterEmailEvent()
}