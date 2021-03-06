package com.mobile.goal.ui.onboarding.register

import android.app.DatePickerDialog
import android.util.Log
import android.widget.DatePicker
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobile.goal.ui.core.OnboardingInputField
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest
import java.text.DecimalFormat
import java.util.*

@Composable
fun RegisterScreen(
    navController: NavController,
    viewModel: RegisterEmailViewModel = hiltViewModel()
) {

    val firstNameState = viewModel.firstNameState.value
    val lastNameState = viewModel.lastNameState.value
    val emailState = viewModel.emailState.value
    val passwordState = viewModel.passwordState.value
    val confirmPasswordState = viewModel.confirmPasswordState.value
    val genderState = viewModel.genderState.value
    val dobState = viewModel.dobState.value
    val state = viewModel.state.value

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is RegisterEmailUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState
                    .showSnackbar(message = event.message)
                is RegisterEmailUiEvent.NavigateToHome -> navigateToHome(navController)
            }
        }
    }

    Scaffold(
        topBar = { TopBar(navController = navController) },
        scaffoldState = scaffoldState,
        backgroundColor = lightGray
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
                    text = "Register",
                    style = MaterialTheme.typography.h2,
                    color = black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Join competitions and challenges to compete with friends!",
                    style = MaterialTheme.typography.subtitle2,
                    color = darkGray
                )

                Spacer(modifier = Modifier.height(24.dp))

                OnboardingInputField(
                    label = "First Name",
                    text = firstNameState,
                    onValueChange = {
                        viewModel.onEvent(RegisterEmailEvent.EnteredFirstName(it))
                    },
                    keyboardType = KeyboardType.Text,
                    errorMessage = state.firstNameError
                )

                OnboardingInputField(
                    label = "Last Name",
                    text = lastNameState,
                    onValueChange = {
                        viewModel.onEvent(RegisterEmailEvent.EnteredLastName(it))
                    },
                    keyboardType = KeyboardType.Text,
                    errorMessage = state.lastNameError
                )

                OnboardingInputField(
                    label = "Email",
                    text = emailState,
                    onValueChange = {
                        viewModel.onEvent(RegisterEmailEvent.EnteredEmail(it))
                    },
                    keyboardType = KeyboardType.Email,
                    errorMessage = state.emailError
                )

                OnboardingInputField(
                    label = "Password",
                    text = passwordState,
                    onValueChange = {
                        viewModel.onEvent(RegisterEmailEvent.EnteredPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.passwordError
                )

                OnboardingInputField(
                    label = "Confirm Password",
                    text = confirmPasswordState,
                    onValueChange = {
                        viewModel.onEvent(RegisterEmailEvent.EnteredConfirmPassword(it))
                    },
                    keyboardType = KeyboardType.Password,
                    errorMessage = state.confirmPasswordError
                )

                var expanded by remember { mutableStateOf(false) }
                val items = listOf("Male", "Female")

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Gender",
                    style = MaterialTheme.typography.subtitle2,
                    color = blue
                )

                Spacer(modifier = Modifier.height(4.dp))

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.TopStart)
                ) {
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(onClick = { expanded = true })
                            .background(
                                lightGray
                            ),
                        value = genderState,
                        singleLine = true,
                        onValueChange = {},
                        textStyle = TextStyle(
                            color = black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W400,
                        ),
                        enabled = false,
                        isError = state.genderError.isNotEmpty()
                    )

                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(white),
                    ) {
                        items.forEachIndexed { index, s ->
                            DropdownMenuItem(
                                onClick = {
                                    Log.d("RegisterScreen", "OnValueChanged: ${items[index]}")
                                    viewModel.onEvent(RegisterEmailEvent.SelectedGender(items[index]))
                                    expanded = false

                                }) {
                                Text(text = s)
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                if (state.genderError.isNotEmpty()) {
                    Text(
                        text = state.genderError,
                        style = TextStyle(
                            fontFamily = appFonts,
                            fontWeight = FontWeight(400),
                            fontSize = 12.sp,
                        ),
                        color = errorRed,
                    )
                }

                val context = LocalContext.current

                val year: Int
                val month: Int
                val day: Int

                val calendar = Calendar.getInstance()
                year = calendar.get(Calendar.YEAR)
                month = calendar.get(Calendar.MONTH)
                day = calendar.get(Calendar.DAY_OF_MONTH)
                calendar.time = Date()

                val datePickerDialog = DatePickerDialog(
                    context,
                    { _: DatePicker, y: Int, m: Int, d: Int ->
                        val dFormat = DecimalFormat("00")
                        viewModel.onEvent(
                            RegisterEmailEvent.SelectedDob(
                                "$y-${dFormat.format(m.inc())}-${
                                    dFormat.format(
                                        d
                                    )
                                }"
                            )
                        )
                    }, year, month, day
                )
                
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "Birthdate",
                    style = MaterialTheme.typography.subtitle2,
                    color = blue
                )

                Spacer(modifier = Modifier.height(4.dp))

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.TopStart)
                ) {
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(onClick = { datePickerDialog.show() })
                            .background(
                                lightGray
                            ),
                        value = dobState,
                        singleLine = true,
                        onValueChange = {},
                        textStyle = TextStyle(
                            color = black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W400,
                        ),
                        enabled = false,
                        isError = state.dobError.isNotEmpty()

                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                if (state.dobError.isNotEmpty()) {
                    Text(
                        text = state.dobError,
                        style = TextStyle(
                            fontFamily = appFonts,
                            fontWeight = FontWeight(400),
                            fontSize = 12.sp,
                        ),
                        color = errorRed,
                    )
                }

                Spacer(modifier = Modifier.height(48.dp))

                TextButton(modifier = Modifier
                    .height(56.dp)
                    .fillMaxWidth(),
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = blue
                    ),
                    shape = Shapes.small,
                    onClick = {
                        viewModel.register()
                    }) {
                    Text(
                        text = "Create Account",
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

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}

