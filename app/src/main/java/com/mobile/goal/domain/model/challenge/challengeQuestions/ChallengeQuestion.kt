package com.mobile.goal.domain.model.challenge.challengeQuestions

data class ChallengeQuestion(
        val choices: List<Choice>?= listOf(),
        val kind: String?=null,
        val label: String?=null,
        val name: String?=null,
        val required: Boolean?=false,

        var checkBoxValue:Boolean = false,
        var selectionDropdown:String?=null,
        var textEntered:String = "",
        var textError:String="",
)