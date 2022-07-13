package com.mobile.goal.ui.profile.settings.change_password

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
import com.mobile.goal.ui.core.OnboardingInputField
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest

@Composable
fun ChangePasswordScreen(
    navController: NavController,
    viewModel: ChangePasswordViewModel = hiltViewModel()
) {

    val oldPasswordState = viewModel.oldPasswordState.value
    val newPasswordState = viewModel.newPasswordState.value
    val confirmNewPasswordState = viewModel.confirmNewPasswordState.value
    val state = viewModel.state.value

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is ChangePasswordUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                    message = event.message
                )
                is ChangePasswordUiEvent.NavigateToHome -> navigateToHome(navController)
            }
        }
    }


    Scaffold(
        topBar = {
            TopBar(
                navController = navController,
                showBack = true,
                title = "Back"
            )
        },
        backgroundColor = lightGray,
    ) {
        Box(Modifier.fillMaxSize()) {
            Column(
                modifier =
                Modifier
                    .padding(24.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    modifier = Modifier.padding(0.dp, 10.dp, 24.dp, 24.dp),
                    text = "Change Password",
                    style = Typography.h2
                )

                Spacer(modifier = Modifier.height(12.dp))
                OnboardingInputField(
                    label = "Old Password",
                    text = oldPasswordState,
                    onValueChange = {
                        viewModel.onEvent(ChangePasswordEvent.EnteredOldPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.oldPasswordError
                )
                OnboardingInputField(
                    label = "New Password",
                    text = newPasswordState,
                    onValueChange = {
                        viewModel.onEvent(ChangePasswordEvent.EnteredNewPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.passwordError
                )
                OnboardingInputField(
                    label = "Confirm New Password",
                    text = confirmNewPasswordState,
                    onValueChange = {
                        viewModel.onEvent(ChangePasswordEvent.EnteredConfirmNewPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.password2Error
                )

                Spacer(modifier = Modifier.height(100.dp))
                ConfirmButton(viewModel)
                Spacer(modifier = Modifier.height(4.dp))

            }
            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }


}

@Composable
private fun ConfirmButton(viewModel: ChangePasswordViewModel) {
    TextButton(modifier = Modifier
        .fillMaxWidth()
        .height(56.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = blue
        ), shape = Shapes.medium,
        onClick = {
            viewModel.changePassword()
        }) {
        Text(
            text = stringResource(id = R.string.confirm),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.button,
            color = white
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}