package com.mobile.goal.domain.model.competition.participants


import com.google.gson.annotations.Expose

data class FormApply(
    @Expose
    val age_check: Boolean?,
    @Expose
    val distance: String?,
    @Expose
    val gdpr: Boolean?
)