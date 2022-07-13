package com.mobile.goal.ui.profile

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.mobile.goal.R
import com.mobile.goal.common.AppUtils
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.navigation.ProfileNavRoute
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent
import com.mobile.goal.ui.daily_goal.DailyGoalsViewModel
import com.mobile.goal.ui.dialogue.CustomDialogType
import com.mobile.goal.ui.dialogue.customDialog
import com.mobile.goal.ui.profile.settings.SettingsUiEvent
import com.mobile.goal.ui.profile.settings.SettingsViewModel
import com.mobile.goal.ui.theme.appFonts
import com.mobile.goal.ui.theme.blue
import com.mobile.goal.ui.theme.lightGray
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Composable
fun ProfileSettingsScreen(
    navController: NavController,
    viewModel: SettingsViewModel = hiltViewModel(),
    goalViewModel: DailyGoalsViewModel = hiltViewModel()
) {

    val state = viewModel.state.value
    val scaffoldState = rememberScaffoldState()
    var currentUser: Participant? by remember { mutableStateOf(Participant()) }
    var showUserInfoCard by remember { mutableStateOf(false) }

    LaunchedEffect(key1 = true) {

        viewModel.getCurrentUserProfile()

        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is SettingsUiEvent.NavigateToWelcome -> navigateToWelcome(navController)
                is SettingsUiEvent.NavigateToSettings -> Unit
                is SettingsUiEvent.GetUserDetail -> {
                    currentUser = event.participant
                    showUserInfoCard = true
                }
                is SettingsUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                    message = event.message
                )
            }
        }
    }

    LaunchedEffect(key1 = true) {
        goalViewModel.eventFlow.collectLatest { event ->
            when (event) {
                is DailyGoalsUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                    message = event.message
                )
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
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {

                if (showUserInfoCard && currentUser != null)
                    ProfileDataCard(currentUser)

                Spacer(modifier = Modifier.height(20.dp))

                customButton(stringResource(R.string.edit_account)) {
                    navigateToEditAccount(navController)
                }
                customButton(stringResource(R.string.change_password)) {
                    navigateToChangePassword(
                        navController
                    )
                }
                customButton(stringResource(R.string.connect_with_partner_apps)) {
                    navigateToConnectWithApps(
                        navController
                    )
                }
                Spacer(modifier = Modifier.height(150.dp))

                logButton(
                    modifier = Modifier
                        .padding(24.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Composable
private fun ProfileDataCard(participant: Participant?) {

    Spacer(modifier = Modifier.height(46.dp))

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.CenterVertically),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = rememberAsyncImagePainter(
                            participant?.profile_image,
                            placeholder = painterResource(id = R.drawable.ic_profile_placeholder)
                        ),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(2.dp, Color.Gray, CircleShape),
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(3f)
                        .fillMaxHeight()
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = AppUtils.getUserName(participant),
                        color = colorResource(id = R.color.black_text_color),
                        style = TextStyle(
                            fontFamily = appFonts,
                            fontWeight = FontWeight(700),
                            fontSize = 22.sp
                        ),
                        overflow = TextOverflow.Ellipsis
                    )

                    participant?.email?.let {
                        Text(
                            text = it,
                            color = colorResource(id = R.color.black_text_color),
                            style = TextStyle(
                                fontFamily = appFonts,
                                fontWeight = FontWeight(400),
                                fontSize = 14.sp,
                            ),
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }

            getLocationWithCode(participant)?.apply {
                showUserContactInfo(
                    id = R.drawable.ic_location,
                    content = this
                )
            }

            participant?.phone?.apply {
                showUserContactInfo(id = R.drawable.ic_phone, content = this)
            }
        }
    }
}

@Composable
private fun showUserContactInfo(id: Int, content: String) {

    Spacer(modifier = Modifier.height(24.dp))

    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.height(20.dp))
        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = content,
            color = Color.Black,
            style = TextStyle(
                fontFamily = appFonts,
                fontWeight = FontWeight(500),
                fontSize = 18.sp,
            ),
            overflow = TextOverflow.Ellipsis,
            maxLines = 2
        )
    }
}

@Composable
private fun customButton(
    btnText: String,
    btnColor: Int = R.color.white,
    action: () -> Unit
) {

    Spacer(modifier = Modifier.height(16.dp))
    TextButton(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(colorResource(id = btnColor), shape = RoundedCornerShape(16.dp)),
        onClick = action
    ) {
        Text(
            text = btnText,
            style = TextStyle(
                fontFamily = appFonts,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
            ),
            color = if (btnColor == R.color.white) blue else Color.White
        )
    }
}

@Composable
private fun logButton(modifier: Modifier, viewModel: SettingsViewModel = hiltViewModel()) {

    val corScope = rememberCoroutineScope()
    val showDialog = remember { mutableStateOf(false) }

    TextButton(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(blue, shape = RoundedCornerShape(16.dp)),
        onClick = { showDialog.value = true }
    ) {
        Text(
            text = stringResource(id = R.string.log_out),
            style = TextStyle(
                fontFamily = appFonts,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
            ),
            color = Color.White
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (showDialog.value) {
            customDialog(
                type = CustomDialogType.SUCCESS,
                title = "Are you sure you?",
                desc = "Your saved activities wil not be affected.",
                positiveBtnText = stringResource(id = R.string.log_out),
                negativeBtnText = stringResource(id = android.R.string.cancel),
                onOkay = {
                    showDialog.value = false
                    corScope.launch { viewModel.logout() }

                },
                onDismiss = {
                    showDialog.value = false
                }
            )
        }
    }
}

private fun getLocationWithCode(participant: Participant?): String? {

    var location: String? = ""

    participant?.apply {
        place?.let {
            location += "$it "
        }
        country?.let {
            location += it
        }
    }
    return location
}

private fun navigateToEditAccount(navController: NavController) {
    navController.navigate(ProfileNavRoute.EditAccount.route)
}

private fun navigateToChangePassword(navController: NavController) {
    navController.navigate(ProfileNavRoute.ChangePassword.route)
}

private fun navigateToConnectWithApps(navController: NavController) {
    navController.navigate(ProfileNavRoute.ChangePassword.route)
}

private fun navigateToWelcome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.WelcomeSocial.route)
}