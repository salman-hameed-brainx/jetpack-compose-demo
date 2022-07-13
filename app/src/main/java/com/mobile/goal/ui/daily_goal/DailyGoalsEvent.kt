package com.mobile.goal.ui.daily_goal

import com.mobile.goal.domain.enum.DailyGoalType

sealed class DailyGoalsEvent {
    data class EnableDistance(val value: Boolean) : DailyGoalsEvent()
    data class EnteredDistance(val value: String) : DailyGoalsEvent()
    data class AddDistance(val value: String) : DailyGoalsEvent()
    data class SubtractDistance(val value: String) : DailyGoalsEvent()

    data class EnableCalories(val value: Boolean) : DailyGoalsEvent()
    data class EnteredCalories(val value: String) : DailyGoalsEvent()
    data class AddCalories(val value: String) : DailyGoalsEvent()
    data class SubtractCalories(val value: String) : DailyGoalsEvent()

    data class EnableTime(val value: Boolean) : DailyGoalsEvent()
    data class EnteredTime(val value: String) : DailyGoalsEvent()
    data class AddTime(val value: String) : DailyGoalsEvent()
    data class SubtractTime(val value: String) : DailyGoalsEvent()

    data class GetGoalValues(val type: DailyGoalType? = null) : DailyGoalsEvent()


}