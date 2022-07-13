package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.google.accompanist.navigation.animation.composable
import com.mobile.goal.ui.splash.SplashScreen

sealed class SplashNavRoute(val route: String) {
    object Splash : SplashNavRoute("splash")
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.splashGraph(navController: NavController) {
    navigation(startDestination = SplashNavRoute.Splash.route, route = "route/splash") {
        composable(SplashNavRoute.Splash.route) {
            SplashScreen(navController)
        }
    }
}