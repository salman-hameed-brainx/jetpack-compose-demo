package com.mobile.goal.ui.onboarding.forgot_password

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.goal.ui.core.OnboardingInputField
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*

@Composable
fun ForgotPasswordScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopBar(navController = navController) },
        backgroundColor = lightGray,
        ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(56.dp))

            Text(
                text = "Forgot your password?",
                style = MaterialTheme.typography.h2,
                color = black
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Please enter email address you are using for your account bellow and we will send you a password reset link",
                style = MaterialTheme.typography.subtitle2,
                color = darkGray
            )

            Spacer(modifier = Modifier.height(24.dp))

            OnboardingInputField(
                label = "Email",
                text = "",
                onValueChange = {},
                keyboardType = KeyboardType.Email
            )

            Spacer(modifier = Modifier.height(80.dp))

            TextButton(modifier = Modifier
                .height(56.dp)
                .fillMaxWidth(),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = blue
                ),
                shape = Shapes.small,
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Request reset",
                    textAlign = TextAlign.Center,
                    color = white,
                    style = MaterialTheme.typography.button
                )
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

