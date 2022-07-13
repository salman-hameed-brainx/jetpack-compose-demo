package com.mobile.goal.ui.onboarding.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.ui.theme.Shapes
import com.mobile.goal.ui.theme.blue
import com.mobile.goal.ui.theme.white


@Composable
fun WelcomeEmailScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_login),
            contentDescription = "Login Photo",
            contentScale = ContentScale.FillBounds
        )
        Title(Modifier.align(Alignment.CenterStart))

        SignInEmailOptions(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.BottomCenter),
            navController = navController
        )

    }
}

@Composable
private fun Title(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(24.dp)
    ) {
        Text(
            text = "Welcome!",
            style = MaterialTheme.typography.h1,
            color = white
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Join competitions and challenges to compete with friends",
            style = MaterialTheme.typography.subtitle1,
            color = white
        )
    }
}

@Composable
private fun SignInEmailOptions(
    modifier: Modifier,
    navController: NavController,
) {

    Column(modifier = modifier) {
        TextButton(modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = blue
            ),
            shape = Shapes.small,
            onClick = {
                navigateToLoginEmail(navController)
            }) {
            Text(
                text = "Login with Email",
                textAlign = TextAlign.Center,
                color = white,
                style = MaterialTheme.typography.button
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextButton(modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = white
            ),
            shape = Shapes.small,
            onClick = {
                navigateToRegisterEmail(navController)
            }) {
            Text(
                text = "Register with Email",
                textAlign = TextAlign.Center,
                color = blue,
                style = MaterialTheme.typography.button
            )
        }
    }
}


private fun navigateToRegisterEmail(navController: NavController) {
    navController.navigate(OnboardingNavRoute.Register.route)
}

private fun navigateToLoginEmail(navController: NavController) {
    navController.navigate(OnboardingNavRoute.LoginEmail.route)
}