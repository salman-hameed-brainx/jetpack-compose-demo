package com.mobile.goal.ui.profile.settings.change_password


sealed class ChangePasswordEvent {
    data class EnteredOldPassword(val value: String) : ChangePasswordEvent()
    data class EnteredNewPassword(val value: String) : ChangePasswordEvent()
    data class EnteredConfirmNewPassword(val value: String) : ChangePasswordEvent()
}