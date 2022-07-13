package com.mobile.goal.data.remote.dto

data class GetParticipantDto(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val page: Int?,
    val results: ArrayList<ParticipantDto>
)
