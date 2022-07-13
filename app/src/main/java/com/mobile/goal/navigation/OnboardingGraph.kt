package com.mobile.goal.navigation

import CompleteProfileScreen
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.mobile.goal.ui.onboarding.forgot_password.ForgotPasswordScreen
import com.mobile.goal.ui.onboarding.intro.IntroScreen
import com.mobile.goal.ui.onboarding.welcome.WelcomeSocialScreen
import com.mobile.goal.ui.onboarding.login_email.LoginEmailScreen
import com.mobile.goal.ui.onboarding.register.RegisterScreen
import com.mobile.goal.ui.onboarding.welcome.WelcomeEmailScreen
import com.google.accompanist.navigation.animation.composable

sealed class OnboardingNavRoute(var title: String, var route: String) {
    object Intro : OnboardingNavRoute("Intro", "intro")
    object WelcomeSocial : OnboardingNavRoute("Welcome", "welcome-social")
    object WelcomeEmail : OnboardingNavRoute("Welcome", "welcome-email")
    object LoginEmail : OnboardingNavRoute("Login with Email", "login-email")
    object Register : OnboardingNavRoute("Register", "register")
    object CompleteProfile : OnboardingNavRoute("Complete Profile", "complete-profile")
    object ForgotPassword : OnboardingNavRoute("Forgot Password", "forgot-password")
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.onboardingGraph(navController: NavController) {
    navigation(startDestination = OnboardingNavRoute.Intro.route, route = "route/onboarding") {
        composable(
            OnboardingNavRoute.Intro.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { IntroScreen(navController) }
        composable(
            OnboardingNavRoute.WelcomeSocial.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { WelcomeSocialScreen(navController) }
        composable(
            OnboardingNavRoute.WelcomeEmail.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { WelcomeEmailScreen(navController) }
        composable(
            OnboardingNavRoute.LoginEmail.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { LoginEmailScreen(navController) }
        composable(
            OnboardingNavRoute.Register.route, enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { RegisterScreen(navController) }
        composable(
            OnboardingNavRoute.CompleteProfile.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { CompleteProfileScreen(navController) }
        composable(
            OnboardingNavRoute.ForgotPassword.route,
            enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) },
            exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) },
            popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }) },
            popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }) },
        ) { ForgotPasswordScreen(navController) }
    }
}

