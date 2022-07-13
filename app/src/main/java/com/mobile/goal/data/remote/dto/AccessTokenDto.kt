package com.mobile.goal.data.remote.dto

import com.mobile.goal.domain.model.AccessToken


data class AccessTokenDto(
    val access_token: String,
    val expires_in: Long,
    val token_type: String,
    val scope: String,
    val refresh_token: String,
)

fun AccessTokenDto.toAccessToken(): AccessToken {
    return AccessToken(
        access_token = access_token,
        expiration_date = System.currentTimeMillis() + (expires_in * 1000),
        token_type = token_type,
        scope = scope,
        refresh_token = refresh_token
    )
}