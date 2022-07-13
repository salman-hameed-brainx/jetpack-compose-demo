package com.mobile.goal.domain.model.organization


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OrganizationResponse(
    @Expose
    val count: Int?=null,
    @Expose
    val next: Any?=null,
    @Expose
    val previous: Any?=null,
    @SerializedName("results") @Expose
    val results: List<Organization> = emptyList()
)