package com.mobile.goal.domain.model.challenge.participants


import com.google.gson.annotations.Expose

data class EntrantsModel(
    @Expose
    val calories_done: Int?=null,
    @Expose
    val challenge: String?=null,
    @Expose
    val distance_done: Double?=null,
    @Expose
    val done: Double?=null,
    @Expose
    val done_percentage: Int?=null,
    @Expose
    val id: Int?=null,
    @Expose
    val participant: Participant?=null,
    @Expose
    val steps_done: Int?=null,
    @Expose
    val total_time: String?=null
)