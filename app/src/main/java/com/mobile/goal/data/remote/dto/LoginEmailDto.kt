package com.mobile.goal.data.remote.dto

data class LoginEmailDto(
    val email: String,
    val password: String,
    val client_id: String,
    val code_challenge: String,
    val code_challenge_method: String,
)

fun LoginEmailDto.toMap(): Map<String, String> {
    return mapOf(
        "email" to email,
        "password" to password,
        "client_id" to client_id,
        "code_challenge" to code_challenge,
        "code_challenge_method" to code_challenge_method,
    )
}