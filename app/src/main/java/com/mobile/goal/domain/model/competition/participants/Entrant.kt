package com.mobile.goal.domain.model.competition.participants


import com.google.gson.annotations.Expose

data class Entrant(
    @Expose
    val birthday: String?,
    @Expose
    val calc_value: Any?,
    @Expose
    val competition: String?,
    @Expose
    val distance: Distance?,
    @Expose
    val first_name: String?,
    @Expose
    val gender: String?,
    @Expose
    val group: String?,
    @Expose
    val id: Int?,
    @Expose
    val is_anonymous: Boolean?,
    @Expose
    val last_name: String?,
    @Expose
    val number: Any?,
    @Expose
    val params: Params?,
    @Expose
    val participant: Int?,
    @Expose
    val passage: Any?,
    @Expose
    val status: Int?,
    @Expose
    val team: Any?,
    @Expose
    val team_status: Int?
)