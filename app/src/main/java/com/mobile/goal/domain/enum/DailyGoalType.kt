package com.mobile.goal.domain.enum

enum class DailyGoalType(val id: Int, val kind: Int) {
    DISTANCE(id = 1, kind = 0),
    CALORIES(id = 2, kind = 10),
    TIME(id = 3, kind = 5)
}
