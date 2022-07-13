package com.mobile.goal.domain.model

import com.mobile.goal.common.AppUtils

data class Participant(
    var id: Int? = null,
    var first_name: String? = null,
    var last_name: String? = null,
    var birthday: String? = null,
    var gender: String? = null,
    var email: String? = null,
    var phone: String? = null,
    var country: String? = null,
    var place: String? = null,
    var height: String? = null,
    var weight: String? = null,
    var profile_image: String? = null,
    var cover_image: String? = null,
)

fun Participant.getToJsonObject(): String {
    return AppUtils.getJson(this)
}