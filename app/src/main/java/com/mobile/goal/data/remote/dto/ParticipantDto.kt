package com.mobile.goal.data.remote.dto

import com.mobile.goal.domain.model.Participant

data class ParticipantDto(
    var id: Int?,
    var first_name: String?,
    var last_name: String?,
    var birthday: String?,
    var gender: String?,
    var email: String?,
    var phone: String?,
    var country: String?,
    var place: String?,
    var height: String?,
    var weight: String?,
    var profile_image: String?,
    var cover_image: String?,
)

fun ParticipantDto.toParticipant(): Participant {
    return Participant(
        id = id,
        first_name = first_name,
        last_name = last_name,
        birthday = birthday,
        gender = gender,
        email = email,
        phone = phone,
        country = country,
        place = place,
        height = height,
        weight = weight,
        profile_image = profile_image,
        cover_image = cover_image
    )
}