package com.mobile.goal.domain.model.competition.participants


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompetitionParticipantsResponse(
    @Expose
    val count: Int?=null,
    @Expose
    val next: Any?=null,
    @Expose
    val previous: Any?=null,
    @SerializedName("results") @Expose
    val participantsList: List<EntrantsModels> = emptyList()
)