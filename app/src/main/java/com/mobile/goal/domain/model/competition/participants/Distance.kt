package com.mobile.goal.domain.model.competition.participants


import com.google.gson.annotations.Expose

data class Distance(
    @Expose
    val can_have_teams: Boolean?,
    @Expose
    val description: String?,
    @Expose
    val distance: Int?,
    @Expose
    val have_results: Boolean?,
    @Expose
    val id: Int?,
    @Expose
    val name: String?
)