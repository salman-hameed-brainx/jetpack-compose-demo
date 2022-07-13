package com.mobile.goal.domain.model.challenge.participants


import com.google.gson.annotations.Expose

data class Participant(
    @Expose
    val birthday: String?,
    @Expose
    val country: String?,
    @Expose
    val cover_image: Any?,
    @Expose
    val first_name: String?,
    @Expose
    val gender: String?,
    @Expose
    val last_name: String?,
    @Expose
    val place: String?,
    @Expose
    val profile_image: String?
)