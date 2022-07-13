package com.mobile.goal.domain.model.competition.competitionlisting

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompetitionResponse(
    @SerializedName("next")
    @Expose val nextPageUrl: String? = null,
    @SerializedName("results")
    @Expose val competitions: List<CompetitionModel>,
)

data class CompetitionModel(
    @SerializedName("code")
    @Expose val code: String? = null,
    @SerializedName("slug")
    @Expose val slug: String? = null,
    @SerializedName("name")
    @Expose val name: String? = null,
    @SerializedName("front_image")
    @Expose val frontImage: String? = null,
    @SerializedName("absolute_url")
    @Expose val absoluteUrl: String? = null,
    @SerializedName("front_image_thumb")
    @Expose val frontImageThumb: String? = null,
    @SerializedName("logo")
    @Expose val logo: String? = null,
    @SerializedName("start")
    @Expose val start: String? = null,
    @SerializedName("end")
    @Expose val end: String? = null,
    @SerializedName("place_name")
    @Expose val placeName: String? = null,
    @SerializedName("status")
    @Expose val status: Int? = null,
    @SerializedName("org")
    @Expose val org: String? = null,
    @SerializedName("can_apply")
    @Expose val canApply: Boolean = false,
    @SerializedName("sports")
    @Expose val sports: List<SportsModel> = emptyList(),
)

data class SportsModel(
    @SerializedName("sport")
    @Expose val sport: Double,
    @SerializedName("icon")
    @Expose val icon: String,
    @SerializedName("url")
    @Expose val url: String,
)