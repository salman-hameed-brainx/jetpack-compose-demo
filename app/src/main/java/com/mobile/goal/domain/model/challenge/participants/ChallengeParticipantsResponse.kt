package com.mobile.goal.domain.model.challenge.participants


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ChallengeParticipantsResponse(
    @Expose
    val count: Int?=null,
    @Expose
    val next: Any?=null,
    @Expose
    val previous: Any?=null,
    @SerializedName("results") @Expose
    val participants: List<EntrantsModel> = emptyList()
)