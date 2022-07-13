package com.mobile.goal.data.remote.dto

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

data class ChangePasswordDto(
    val oldPassword: String?,
    val newPassword: String?,
    val confirmNewPassword: String?,
)

fun ChangePasswordDto.toRequestBody(): RequestBody {
    val changePassword = JSONObject()

    changePassword.put("old_password", oldPassword)
    changePassword.put("password", newPassword)
    changePassword.put("password2", confirmNewPassword)

    val jsonObjectString = changePassword.toString()
    return jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())

}
