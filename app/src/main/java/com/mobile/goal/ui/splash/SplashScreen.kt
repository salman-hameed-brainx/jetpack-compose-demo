package com.mobile.goal.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.navigation.OnboardingNavRoute
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: SplashViewModel = hiltViewModel()
) {

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is SplashUiEvent.NavigateToHome -> navigateToHome(navController)
                is SplashUiEvent.NavigateToOnboarding -> navigateToOnboarding(navController)
                is SplashUiEvent.NavigateToWelcome -> navigateToWelcome(navController)
                is SplashUiEvent.NavigateToCompleteProfile -> navigateToCompleteProfile(
                    navController
                )
            }
        }
    }

    LaunchedEffect(key1 = true) {
        delay(2000)
        viewModel.navigateHome()
    }
    SplashContent()
}

@Composable
fun SplashContent() {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .height(60.dp)
                    .width(172.dp),
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "Splash Logo",
            )
        }
    }
}

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}

private fun navigateToWelcome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.WelcomeSocial.route)
}

private fun navigateToOnboarding(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/onboarding")
}

private fun navigateToCompleteProfile(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.CompleteProfile.route)
}