package com.mobile.goal.domain.model.competition.distance

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DistanceModel(
    @SerializedName("id") @Expose val id:Int?=null,
    @SerializedName("name") @Expose val name:String?=null,
    @SerializedName("description") @Expose val description:String?=null,
    @SerializedName("can_have_teams") @Expose val can_have_teams:Boolean=false,
    @SerializedName("have_results") @Expose val have_results:Boolean=false,
    @SerializedName("distance") @Expose val distance:Int=0,
)
