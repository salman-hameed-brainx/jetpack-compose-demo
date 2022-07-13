package com.mobile.goal.domain.model.competition.competitionQuestions

import com.mobile.goal.domain.model.challenge.challengeQuestions.Choice

data class CompetitionQuestion(
    val id: Int? = null,
    val input_field: String? = null,
    val question: String? = null,
    val is_required: Boolean? = false,
    val name: String? = null,
    val choices: List<Choice>? = listOf(),
    val params: Params? = null,

    var checkBoxValue: Boolean = false,
    var selectionDropdown: String? = null,
    var textEntered: String = "",
    var textError: String = "",
)

data class Params(val choices: List<List<String>>? = null)