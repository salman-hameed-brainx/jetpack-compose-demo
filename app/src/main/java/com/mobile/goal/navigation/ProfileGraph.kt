package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.google.accompanist.navigation.animation.composable

sealed class ProfileNavRoute(var title: String, var route: String) {
    object ChangePassword : ProfileNavRoute("Change Password", "change-password")
    object EditAccount : ProfileNavRoute("Edit Account", "edit-account")
    object DailyGoals : ProfileNavRoute("Daily Goals", "daily-goals")
    object PreviousActivities : ProfileNavRoute("Previous Activities", "previous-activities")
    object Settings : ProfileNavRoute("Settings", "settings")
    object Teams : ProfileNavRoute("Teams", "teams")
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.profileGraph(navController: NavController) {
    navigation(
        startDestination = "/", route = "route/profile",
    ) {
        composable(
            ProfileNavRoute.PreviousActivities.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {}
        composable(
            ProfileNavRoute.PreviousActivities.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {}
        composable(
            route = ProfileNavRoute.Settings.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) {}
    }
    composable(
        ProfileNavRoute.Teams.route,
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
        popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
        popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
    ) {}
    composable(
        ProfileNavRoute.EditAccount.route,
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
        popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
        popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
    ) {}

    composable(
        ProfileNavRoute.ChangePassword.route,
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
        popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
        popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
    ) {}
}

