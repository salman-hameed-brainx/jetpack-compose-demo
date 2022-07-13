package com.mobile.goal.data.remote.dto


data class RequestTokenDto(
    val code: String,
    val code_verifier: String,
    val grant_type: String,
    val client_id: String,
)

fun RequestTokenDto.toMap(): Map<String, String> {
    return mapOf(
        "code" to code,
        "code_verifier" to code_verifier,
        "grant_type" to grant_type,
        "client_id" to client_id,
    )
}
