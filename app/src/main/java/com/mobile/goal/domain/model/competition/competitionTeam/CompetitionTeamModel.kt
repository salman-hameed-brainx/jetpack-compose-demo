package com.mobile.goal.domain.model.competition.competitionTeam

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompetitionTeamModel(
    @SerializedName("id") @Expose val id:Int?=null,
    @SerializedName("title") @Expose val title:String?=null,
    @SerializedName("email") @Expose val email:String?=null,
    @SerializedName("phone_number") @Expose val phoneNumber:String?=null,
    @SerializedName("img") @Expose val img:String?=null,
    @SerializedName("shirt_image") @Expose val shirt_image:String?=null,
    @SerializedName("country") @Expose val country:String?=null,
    @SerializedName("kind") @Expose val kind:Int?=null,
    @SerializedName("status") @Expose val status:Int?=null,
)
