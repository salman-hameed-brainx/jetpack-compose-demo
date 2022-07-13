package com.mobile.goal.data.remote.dto

data class SignInGoogleDto(
    val client_id: String,
    val code_challenge: String,
    val code_challenge_method: String,
    val id_token: String
)

fun SignInGoogleDto.toMap(): Map<String, String> {
    return mapOf(
        "client_id" to client_id,
        "code_challenge" to code_challenge,
        "code_challenge_method" to code_challenge_method,
        "id_token" to id_token
    )
}