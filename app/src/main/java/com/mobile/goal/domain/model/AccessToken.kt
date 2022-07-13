package com.mobile.goal.domain.model

data class AccessToken(
    val access_token: String?,
    val expiration_date: Long?,
    val token_type: String?,
    val scope: String?,
    val refresh_token: String?,
)

