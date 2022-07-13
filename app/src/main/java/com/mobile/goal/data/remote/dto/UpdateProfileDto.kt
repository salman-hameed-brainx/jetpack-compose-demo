package com.mobile.goal.data.remote.dto

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

data class UpdateProfileDto(
    val first_name: String?,
    val last_name: String?,
    val gender: String?,
    val dob: String?,
)

fun UpdateProfileDto.toRequestBody(): RequestBody {
    val participant = JSONObject()
    val values = JSONObject()

    values.put("first_name", first_name)
    values.put("last_name", last_name)
    values.put("gender", if (gender == "Male") "M" else "F")
    values.put("birthday", dob)

    participant.put("participant", values)


    val jsonObjectString = participant.toString()

    return jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())
}