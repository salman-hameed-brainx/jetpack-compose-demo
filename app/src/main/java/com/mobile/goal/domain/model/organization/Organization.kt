package com.mobile.goal.domain.model.organization


import com.google.gson.annotations.Expose

data class Organization(
    @Expose
    val account_code: String?=null,
    @Expose
    val account_name: String?=null,
    @Expose
    val account_number: String?=null,
    @Expose
    val code: String?=null,
    @Expose
    val company_address: String?=null,
    @Expose
    val company_name: String?=null,
    @Expose
    val company_number: String?=null,
    @Expose
    val company_vat: String?=null,
    @Expose
    val country: String?=null,
    @Expose
    val domain_alias: String?=null,
    @Expose
    val email: String?=null,
    @Expose
    val logo: String?=null,
    @Expose
    val name: String?=null,
    @Expose
    val paymentchannel_set: List<PaymentchannelSet>? = emptyList(),
    @Expose
    val short_name: String?=null,
    @Expose
    val vat_amount: Int?=null,
    @Expose
    val website: String?=null
)