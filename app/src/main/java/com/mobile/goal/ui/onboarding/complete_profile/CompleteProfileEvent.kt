package com.mobile.goal.ui.onboarding.complete_profile

sealed class CompleteProfileEvent{
    data class EnteredFirstName(val value: String): CompleteProfileEvent()
    data class EnteredLastName(val value: String): CompleteProfileEvent()
    data class SelectedGender(val value: String): CompleteProfileEvent()
    data class SelectedDob(val value: String): CompleteProfileEvent()
}