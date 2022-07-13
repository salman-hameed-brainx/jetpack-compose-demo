package com.mobile.goal.data.remote.dto

import org.json.JSONObject

data class SignInFacebookDto(
    val client_id: String,
    val code_challenge: String,
    val code_challenge_method: String,
    val fb_session_token: String,
    val fb_profile_data: String
)

fun SignInFacebookDto.toMap(): Map<String, String> {
    return mapOf(
        "client_id" to client_id,
        "code_challenge" to code_challenge,
        "code_challenge_method" to code_challenge_method,
        "fb_session_token" to fb_session_token,
        "fb_profile_data" to fb_profile_data
    )
}

data class FbProfileData(
    val email: String,
    val first_name: String,
    val last_name: String,
)

fun FbProfileData.toJsonObject(): String {
    val fbProfileData = JSONObject()

    fbProfileData.put("email", email)
    fbProfileData.put("first_name", first_name)
    fbProfileData.put("last_name", last_name)

    return fbProfileData.toString()

}