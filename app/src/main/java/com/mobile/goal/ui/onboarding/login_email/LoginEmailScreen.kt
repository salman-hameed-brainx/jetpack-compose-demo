package com.mobile.goal.ui.onboarding.login_email

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.ui.core.OnboardingInputField
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest

@Composable
fun LoginEmailScreen(
    navController: NavController,
    viewModel: LoginEmailViewModel = hiltViewModel()
) {

    val emailState = viewModel.emailState.value
    val passwordState = viewModel.passwordState.value
    val state = viewModel.state.value

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is LoginEmailUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                    message = event.message
                )
                is LoginEmailUiEvent.NavigateToHome -> navigateToHome(navController)
                is LoginEmailUiEvent.NavigateToCompleteProfile -> navigateToCompleteProfile(
                    navController
                )
            }
        }
    }



    Scaffold(
        topBar = { TopBar(navController = navController) },
        scaffoldState = scaffoldState,
        backgroundColor = lightGray,
    ) {
        Box(Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(56.dp))

                Text(
                    text = "Login",
                    style = MaterialTheme.typography.h2,
                    color = black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = stringResource(R.string.login_info),
                    style = MaterialTheme.typography.subtitle2,
                    color = darkGray
                )

                Spacer(modifier = Modifier.height(24.dp))

                OnboardingInputField(
                    label = stringResource(R.string.email),
                    text = emailState,
                    onValueChange = {
                        viewModel.onEvent(LoginEmailEvent.EnteredEmail(it))
                    },
                    keyboardType = KeyboardType.Email,
                    errorMessage = state.emailError
                )

                OnboardingInputField(
                    label = stringResource(R.string.password),
                    text = passwordState,
                    onValueChange = {
                        viewModel.onEvent(LoginEmailEvent.EnteredPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.passwordError
                )

                Spacer(modifier = Modifier.height(22.dp))

                TextButton(
                    modifier = Modifier.align(Alignment.End),
                    onClick = { navigateToForgotPassword(navController) }
                ) {
                    Text(
                        text = stringResource(R.string.forgot_password),
                        style = MaterialTheme.typography.subtitle2,
                        color = blue
                    )
                }

                Spacer(modifier = Modifier.height(80.dp))

                TextButton(modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth(),
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = blue
                    ),
                    shape = Shapes.small,
                    onClick = {
                        viewModel.login()
                    }) {
                    Text(
                        text = stringResource(R.string.login_in),
                        textAlign = TextAlign.Center,
                        color = white,
                        style = MaterialTheme.typography.button
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))
            }

            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}

private fun navigateToForgotPassword(navController: NavController) {
    navController.navigate(OnboardingNavRoute.ForgotPassword.route)
}

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}

private fun navigateToCompleteProfile(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.CompleteProfile.route)
}



