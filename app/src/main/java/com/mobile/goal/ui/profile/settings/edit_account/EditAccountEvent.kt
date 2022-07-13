package com.mobile.goal.ui.profile.settings.edit_account

sealed class EditAccountEvent {
    data class EnteredFName(val value: String) : EditAccountEvent()
    data class EnteredLName(val value: String) : EditAccountEvent()
    data class EnteredEmail(val value: String) : EditAccountEvent()
    data class EnteredLocation(val value: String) : EditAccountEvent()
    data class EnteredPhoneNumber(val value: String) : EditAccountEvent()
    data class SelectProfileImage(val value: String, val newImageSelected: Boolean = false) :
        EditAccountEvent()

    data class CheckProfilePublic(val value: Boolean) : EditAccountEvent()
}
