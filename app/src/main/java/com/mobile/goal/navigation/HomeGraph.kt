package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.google.accompanist.navigation.animation.composable
import com.mobile.goal.R
import com.mobile.goal.ui.daily_goal.DailyGoalsScreen
import com.mobile.goal.ui.home.HomeScreen
import com.mobile.goal.ui.notifications.NotificationsScreen
import com.mobile.goal.ui.profile.ProfileScreen
import com.mobile.goal.ui.workout.WorkoutListingScreen

sealed class HomeNavRoute(var title: String, var icon: Int = 0, var route: String) {
    // Bottom Nav routes
    object Home : HomeNavRoute("Home", R.drawable.ic_home, "home")
    object Search : HomeNavRoute("Search", R.drawable.ic_search, "search")
    object Workout : HomeNavRoute("Workout", R.drawable.ic_workout, "workout")
    object Notifications :
        HomeNavRoute("Notifications", R.drawable.ic_notifications, "notifications")

    object Profile : HomeNavRoute("Profile", R.drawable.ic_profile, "profile")

    // Other routes
    object DailyGoals : HomeNavRoute(title = "Daily Goals", route = "daily-goals")
    object Events : HomeNavRoute(title = "Events", route = "events")
    object CompetitionEvents :
        HomeNavRoute(title = "Competition Events", route = "competition-events")
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalAnimationApi::class)
fun NavGraphBuilder.homeGraph(navController: NavController) {
    navigation(startDestination = HomeNavRoute.Home.route, route = "route/home") {
        // Bottom Nav
        composable(HomeNavRoute.Home.route) { HomeScreen(navController) }
        composable(HomeNavRoute.Search.route) { }
        composable(HomeNavRoute.Workout.route) { WorkoutListingScreen(navController) }
        composable(HomeNavRoute.Notifications.route) { NotificationsScreen() }
        composable(HomeNavRoute.Profile.route) { ProfileScreen(navController) }

        // Other
        composable(HomeNavRoute.DailyGoals.route) { DailyGoalsScreen(navController) }
        composable(HomeNavRoute.Events.route) { }
        composable(HomeNavRoute.CompetitionEvents.route) { }
    }
}