package com.mobile.goal.data.remote.dto



data class CreateTeamDto(
    var title: Any?,
    var email: String?,
    var phone_number: String?,
    var country: String?,
    var kind: Int,
    var description: String?,

)

