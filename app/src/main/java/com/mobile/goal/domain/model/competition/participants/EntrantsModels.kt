package com.mobile.goal.domain.model.competition.participants


import com.google.gson.annotations.Expose

data class EntrantsModels(
    @Expose
    val avg_speed: Double?=null,
    @Expose
    val chip_time: Any?=null,
    @Expose
    val competition: String?=null,
    @Expose
    val entrant: Entrant?=null,
    @Expose
    val id: Int?=null,
    @Expose
    val points_distance: Int?=null,
    @Expose
    val points_group: Int?=null,
    @Expose
    val result_distance: Int?=null,
    @Expose
    val result_group: Int?=null,
    @Expose
    val status: String?=null,
    @Expose
    val time: String?=null,
    @Expose
    val zero_time: Any?=null
)