package com.mobile.goal.common.enum

enum class Language(name: String) {
    English("en"),
    Latvian("lv");

    companion object {
        fun getByValue(value: Int) = values().firstOrNull { it.ordinal == value }
    }
}