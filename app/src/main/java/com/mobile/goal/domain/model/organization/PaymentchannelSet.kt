package com.mobile.goal.domain.model.organization


import com.google.gson.annotations.Expose

data class PaymentchannelSet(
    @Expose
    val code: String?,
    @Expose
    val image_slug: String?,
    @Expose
    val kind: Int?,
    @Expose
    val org: String?,
    @Expose
    val title: String?
)