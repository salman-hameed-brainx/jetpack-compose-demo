package com.mobile.goal.data.remote.dto

import com.mobile.goal.domain.model.AboutMe


data class AboutMeDto(
    val email: String?,
    val timezone: String?,
    val date_joined: String?,
    val participant: ParticipantDto?,
)

fun AboutMeDto.toAboutMe(): AboutMe {
    return AboutMe(
        email = email,
        timezone = timezone,
        date_joined = date_joined,
        participant = participant?.toParticipant()
    )
}