package com.mobile.goal.data.remote.dto

data class FBSessionTokenDto(
    val grant_type: String,
    val client_id: String,
    val fb_exchange_token: String,
)