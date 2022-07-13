package com.mobile.goal.ui.onboarding.welcome

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResultRegistryOwner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.android.gms.common.api.ApiException
import com.mobile.goal.R
import com.mobile.goal.common.AuthResultContract
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.ui.theme.Shapes
import com.mobile.goal.ui.theme.lightBlack
import com.mobile.goal.ui.theme.lightGray
import com.mobile.goal.ui.theme.white
import kotlinx.coroutines.flow.collectLatest


@Composable
fun WelcomeSocialScreen(
    navController: NavController,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is WelcomeUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(message = event.message)
                is WelcomeUiEvent.NavigateToHome -> navigateToHome(navController)
                is WelcomeUiEvent.NavigateToCompleteProfile -> navigateToCompleteProfile(navController)
            }
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        backgroundColor = lightGray
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

            SignInOptions(
                modifier = Modifier
                    .padding(24.dp)
                    .align(Alignment.BottomCenter),
                navController = navController
            )

            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
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
private fun SignInOptions(
    modifier: Modifier,
    navController: NavController,
    viewModel: WelcomeViewModel = hiltViewModel(),
) {
    val activityResultRegistryOwner = LocalContext.current as ActivityResultRegistryOwner
    val facebookAppId = stringResource(id = R.string.facebook_app_id)
    val googleSignInRequestCode = 1
    val googleAuthResultLauncher = rememberLauncherForActivityResult(contract = AuthResultContract()) { task ->
        try {
            val account = task?.getResult(ApiException::class.java)
            if (account == null) {
                viewModel.onEvent(WelcomeEvent.GoogleSignInFailed())
            } else {
                viewModel.onEvent(WelcomeEvent.GoogleSignInSuccess(account))
            }
        } catch (e: ApiException) {
            viewModel.onEvent(WelcomeEvent.GoogleSignInFailed(e.localizedMessage))
        }
    }

    Column(modifier = modifier) {
        TextButton(modifier = Modifier.height(56.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = white
            ),
            shape = Shapes.small,
            onClick = {
                googleAuthResultLauncher.launch(googleSignInRequestCode)
            }) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(20.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterStart),
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Sign in with Google",
                )
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Sign in with Google",
                    textAlign = TextAlign.Center,
                    color = lightBlack,
                    style = MaterialTheme.typography.button
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(Modifier.fillMaxWidth()) {
            TextButton(
                modifier = Modifier
                    .height(56.dp)
                    .weight(1f),
                shape = Shapes.small,
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = white
                ),
                onClick = {
                    viewModel.initFBSignIn(facebookAppId, activityResultRegistryOwner)
                }) {
                Image(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "Sign in Facebook",
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            TextButton(
                modifier = Modifier
                    .height(56.dp)
                    .weight(1f),
                shape = Shapes.small,
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = white
                ),
                onClick = {
                    navigateToWelcomeEmail(navController)
                }) {
                Image(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = "Sign in Email",
                )
            }
        }
    }
}

private fun navigateToWelcomeEmail(navController: NavController) {
    navController.navigate(OnboardingNavRoute.WelcomeEmail.route)
}

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}

private fun navigateToCompleteProfile(navController: NavController) {
    navController.navigate(OnboardingNavRoute.CompleteProfile.route)
}


