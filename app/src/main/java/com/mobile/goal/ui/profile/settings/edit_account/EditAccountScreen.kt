package com.mobile.goal.ui.profile.settings.edit_account

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.permissions.rememberPermissionState
import com.mobile.goal.R
import com.mobile.goal.ui.core.OnboardingInputField
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Composable
fun EditAccountScreen(
    navController: NavController,
    viewModel: EditAccountViewModel = hiltViewModel()
) {

    val firstNameState = viewModel.firstNameState.value
    val lastNameState = viewModel.lastNameState.value
    val emailState = viewModel.emailState.value
    val locationState = viewModel.locationState.value
    val phoneNumberState = viewModel.phoneNumberState.value
    val profileImageState = viewModel.profileImageState.value
    val state = viewModel.state.value


    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is EditAccountUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                    message = event.message
                )
                is EditAccountUiEvent.NavigateToPrevious -> navigateToPreviousScreen(navController)
            }
        }
    }
    LaunchedEffect(key1 = true) {
        viewModel.populateParticipantInfo()
    }


    Scaffold(
        topBar = {
            TopBar(
                navController = navController,
                showBack = true,
            )
        },
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
                Text(
                    text = "Edit Account",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp, 0.dp, 24.dp, 0.dp),
                    style = Typography.h2,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(12.dp))
                SelectProfilePicture(viewModel)
                Spacer(modifier = Modifier.height(8.dp))
                OnboardingInputField(
                    label = "First Name",
                    text = firstNameState,
                    onValueChange = {
                        viewModel.onEvent(EditAccountEvent.EnteredFName(it))
                    },
                    keyboardType = KeyboardType.Text,
                    errorMessage = state.firstNameError
                )
                Spacer(modifier = Modifier.height(8.dp))
                OnboardingInputField(
                    label = "Last Name",
                    text = lastNameState,
                    onValueChange = {
                        viewModel.onEvent(EditAccountEvent.EnteredLName(it))
                    },
                    keyboardType = KeyboardType.Text,
                    errorMessage = state.lastNameError
                )
                OnboardingInputField(
                    label = "Email",
                    text = emailState,
                    onValueChange = {
                        viewModel.onEvent(EditAccountEvent.EnteredEmail(it))
                    },
                    keyboardType = KeyboardType.Email,
                    errorMessage = state.emailError
                )
                OnboardingInputField(
                    label = "Location",
                    text = locationState,
                    onValueChange = {
                        viewModel.onEvent(EditAccountEvent.EnteredLocation(it))
                    },
                    keyboardType = KeyboardType.Text,
                    errorMessage = state.locationError
                )
                OnboardingInputField(
                    label = "Phone Number",
                    text = phoneNumberState,
                    onValueChange = {
                        viewModel.onEvent(EditAccountEvent.EnteredPhoneNumber(it))
                    },
                    keyboardType = KeyboardType.Phone,
                    errorMessage = state.phoneNumberError
                )
                Spacer(modifier = Modifier.height(48.dp))
                SaveChangesButton(viewModel)
                Spacer(modifier = Modifier.height(24.dp))

            }
            if (state.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }

    }
}


@Composable
private fun PublicProfile() {
    val (isChecked, setChecked) = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Public profile",
                style = MaterialTheme.typography.button,
                color = black,
            )
            Switch(
                checked = isChecked,
                onCheckedChange = { setChecked(!isChecked) },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = blue,
                    checkedTrackColor = blue,
                )
            )
        }
    }
}

@Composable
private fun SaveChangesButton(viewModel: EditAccountViewModel) {
    val scope = rememberCoroutineScope()
    TextButton(modifier = Modifier
        .fillMaxWidth()
        .height(56.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = blue
        ),
        shape = Shapes.medium,
        onClick = {
            scope.launch {
                viewModel.editAccount()
            }
        }) {
        Text(
            text = stringResource(id = R.string.save_changes),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.button,
            color = white
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@OptIn(
    ExperimentalMaterialApi::class,
    com.google.accompanist.permissions.ExperimentalPermissionsApi::class
)
@Composable
private fun SelectProfilePicture(viewModel: EditAccountViewModel) {
    val permissionState =
        rememberPermissionState(permission = android.Manifest.permission.READ_EXTERNAL_STORAGE)
    var imageUri by remember { mutableStateOf<String?>(viewModel.profileImageState.value) }
    val context = LocalContext.current
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        imageUri = uri.toString()
        uri?.let {
            viewModel.getPath(context, uri)?.let {
                viewModel.onEvent(EditAccountEvent.SelectProfileImage(it, true))
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier.size(width = 120.dp, height = 120.dp),
        ) {
            Row(
                modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)
                    .align(Alignment.Center),

                ) {
                Card(
                    shape = RoundedCornerShape(120.dp),
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(imageUri),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .clickable {
                                if (permissionState.hasPermission) {
                                    launcher.launch("image/*")
                                } else {
                                    permissionState.launchPermissionRequest()
                                }
                            },
                    )
                }
            }
            Row(
                modifier = Modifier.align(Alignment.BottomEnd)
            ) {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    backgroundColor = blue
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_camera),
                        contentDescription = "avatar",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(8.dp, 3.dp, 8.dp, 5.dp)
                            .clip(CircleShape)
                    )
                }
            }
        }
    }
}

private fun navigateToHome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate("route/home")
}

private fun navigateToPreviousScreen(navController: NavController) {
    navController.popBackStack()
}