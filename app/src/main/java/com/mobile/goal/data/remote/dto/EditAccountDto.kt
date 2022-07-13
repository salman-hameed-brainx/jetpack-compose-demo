package com.mobile.goal.data.remote.dto

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.MultipartBody.Part.Companion.createFormData
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File


data class EditAccountDto(
    val id: Int?,
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val place: String?,
    val phone: String?,
    val profile_image: String?
)

fun EditAccountDto.toMap(): Map<String, RequestBody?> {

    val requestFirstName = firstName?.toRequestBody("application/json".toMediaTypeOrNull())
    val requestLastName = lastName?.toRequestBody("application/json".toMediaTypeOrNull())
    val requestEmail = email?.toRequestBody("application/json".toMediaTypeOrNull())
    val requestPhone = phone?.toRequestBody("application/json".toMediaTypeOrNull())
    val requestPlace = place?.toRequestBody("application/json".toMediaTypeOrNull())
    return mapOf(
        "first_name" to requestFirstName,
        "last_name" to requestLastName,
        "phone" to requestPhone,
        "place" to requestPlace,
    )
}

fun EditAccountDto.toMultipartBody(): MultipartBody.Part? {
    profile_image ?: return null

    val file = File(profile_image)
    val requestFile: RequestBody = file.asRequestBody("multipart/form-data".toMediaTypeOrNull())
    return createFormData("profile_image", file.name, requestFile)
}
