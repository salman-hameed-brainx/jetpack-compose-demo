package com.mobile.goal.domain.model.challenge.challengeDetail

import com.google.gson.annotations.SerializedName
import com.mobile.goal.domain.model.competition.competitionDetail.Sport

class ChallengeDetailResponse {
    @SerializedName("absolute_url")
    val absolute_url: String? = null

    @SerializedName("access")
    val access: Int? = null

    @SerializedName("can_apply")
    val can_apply: Boolean? = null

    @SerializedName("can_apply_for_fee")
    val can_apply_for_fee: Boolean? = null

    @SerializedName("code")
    val code: String? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("end")
    val end: String? = null

    @SerializedName("entrant_edit_till")
    val entrant_edit_till: String? = null

    @SerializedName("front_image")
    val front_image: String? = null

    @SerializedName("front_image_thumb")
    val front_image_thumb: String? = null

    @SerializedName("have_teams")
    val have_teams: Boolean? = null

    @SerializedName("kind")
    val kind: Int? = null

    @SerializedName("login_to_apply")
    val login_to_apply: Boolean? = null

    @SerializedName("logo")
    val logo: String? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("only_private_teams")
    val only_private_teams: Boolean? = null

    @SerializedName("only_teams")
    val only_teams: Boolean? = null

    @SerializedName("org")
    val org: String? = null

    @SerializedName("place_coordinate")
    val place_coordinate: Any? = null

    @SerializedName("place_name")
    val place_name: String? = null

    @SerializedName("slug")
    val slug: String? = null

    @SerializedName("sports")
    val sports: List<Sport>? = null

    @SerializedName("start")
    val start: String? = null

    @SerializedName("goal")
    val goal: String? = "250"

    @SerializedName("location")
    val location: String? = "Pakistan"

    @SerializedName("status")
    val status: Int? = null

    @SerializedName("required_amount")
    val requiredAmount: Int? = null

    @SerializedName("result_unit")
    val resultUnit: String? = null
}

data class Sport(
    val icon: String,
    val sport: Int,
    val url: String
)