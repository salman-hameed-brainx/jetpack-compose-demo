package com.mobile.goal.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
@Composable
fun AppNavGraph(navController: NavHostController) {
    AnimatedNavHost(
        navController,
        startDestination = "route/splash",
    ) {
        // level 1
        splashGraph(navController)
        onboardingGraph(navController)
        homeGraph(navController)
        profileGraph(navController)

        // level 2
        challenge(navController)
        competition(navController)
    }
}