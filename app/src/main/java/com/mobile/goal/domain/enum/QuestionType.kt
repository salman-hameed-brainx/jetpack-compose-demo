package com.mobile.goal.domain.enum

enum class QuestionType(val kind: String) {
    CHECKBOX_TYPE(kind = "BooleanField"),
    TEXT_TYPE(kind = "CharField"),
    DROPDOWN_TYPE(kind = "ChoiceField"),
}
