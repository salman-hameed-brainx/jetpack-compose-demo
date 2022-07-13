package com.mobile.goal.data.remote.dto

import com.mobile.goal.domain.model.Code

data class CodeDto(
    val code: String,
)

fun CodeDto.toCode(): Code {
    return Code(
        code = code,
    )
}