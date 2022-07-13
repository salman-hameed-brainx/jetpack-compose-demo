package com.mobile.goal.ui.profile

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.navigation.ProfileNavRoute
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent
import com.mobile.goal.ui.daily_goal.DailyGoalsViewModel
import com.mobile.goal.ui.profile.settings.SettingsUiEvent
import com.mobile.goal.ui.profile.settings.SettingsViewModel
import com.mobile.goal.ui.theme.appFonts
import com.mobile.goal.ui.theme.blue
import com.mobile.goal.ui.theme.lightGray
import kotlinx.coroutines.flow.collectLatest

@Composable
fun ProfileScreen(
    navController: NavController,
    viewModel: SettingsViewModel = hiltViewModel(),
    goalsViewModel: DailyGoalsViewModel = hiltViewModel()
) {

    val scaffoldState = rememberScaffoldState()
    var showDailyInfo by remember { mutableStateOf(false) }

    var time by remember { mutableStateOf("") }
    var distance by remember { mutableStateOf("") }
    var calories by remember { mutableStateOf("") }

    LaunchedEffect(key1 = true) {
        goalsViewModel.getGoalValues()

        goalsViewModel.apply {
            eventFlow.collectLatest { event ->
                when (event) {
                    is DailyGoalsUiEvent.ShowGoalData -> {
                        calories = event.calories
                        distance = event.distance
                        time = event.time

                        showDailyInfo = true
                    }
                    is DailyGoalsUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message
                    )
                }
            }
        }
    }

    LaunchedEffect(key1 = true) {

        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is SettingsUiEvent.NavigateToWelcome -> navigateToWelcome(navController)
                is SettingsUiEvent.NavigateToSettings -> navigateToSettings(navController)
                is SettingsUiEvent.ShowSnackBar -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message
                    )
                }
            }
        }
    }

    Scaffold(
        topBar = {
            TopBar(
                navController = navController,
                showBack = false,
                title = "Profile"
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
                Spacer(modifier = Modifier.height(46.dp))

                if (showDailyInfo)
                    DailyGoalsCard(navController, calories, distance, time)

                Spacer(modifier = Modifier.height(20.dp))

                customButton(
                    R.drawable.ic_previous_activity,
                    "Previous Activities"
                ) { navigateToPreviousActivities(navController) }
                customButton(
                    R.drawable.ic_settings,
                    "Settings"
                ) { navigateToSettings(navController) }
                customButton(R.drawable.ic_team, "Teams") { navigateToTeams(navController) }

                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun DailyGoalsCard(
    navController: NavController,
    calories: String,
    distance: String,
    time: String
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.CenterVertically),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White,

        onClick = {
            navigateToDailyGoals(navController)
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Daily Goals",
                    color = Color.Black,
                    style = TextStyle(
                        fontFamily = appFonts,
                        fontWeight = FontWeight(700),
                        fontSize = 24.sp,
                    ),
                )
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    modifier = Modifier.size(12.dp),
                    painter = painterResource(id = R.drawable.ic_arrow_right),
                    contentDescription = ""
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {

                    titleTextView(text = stringResource(R.string.calories))
                    valuesTextView(
                        text = "$calories kcal",
                        blue
                    )

                    titleTextView(text = "Distance")
                    valuesTextView(
                        text = "$distance km",
                        colorResource(id = R.color.secondary)
                    )

                    titleTextView(text = "Time")
                    valuesTextView(
                        text = "$time min",
                        colorResource(id = R.color.tertiary)
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        singleCircularProgressbar(
                            color = blue,
                            value = calories.toFloat(),
                            radius = 80.dp
                        )
                        singleCircularProgressbar(
                            color = colorResource(id = R.color.secondary),
                            value = distance.toFloat(),
                            radius = 100.dp
                        )
                        singleCircularProgressbar(
                            color = colorResource(id = R.color.tertiary),
                            value = time.toFloat(),
                            radius = 120.dp
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun customButton(
    btnIcon: Int,
    btnText: String,
    action: () -> Unit
) {

    Spacer(modifier = Modifier.height(16.dp))
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        onClick = { action() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        shape = RoundedCornerShape(12)
    ) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = btnIcon), contentDescription = ""
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = btnText,
            color = Color.Black,
            style = TextStyle(
                fontFamily = appFonts,
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
            ),
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(12.dp),
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = ""
        )
    }
}

@Composable
private fun titleTextView(text: String) {
    Text(
        text = text,
        color = Color.Black,
        fontSize = 16.sp,
        style = TextStyle(
            fontFamily = appFonts,
            fontWeight = FontWeight(400),
            fontSize = 14.sp,
        ),
    )
}

@Composable
private fun valuesTextView(text: String, textColor: Color) {
    Text(
        text = text,
        color = textColor,
        style = TextStyle(
            fontFamily = appFonts,
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
        ),
    )

    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun singleCircularProgressbar(color: Color, value: Float, radius: Dp) {
    val stroke = with(LocalDensity.current) {
        Stroke(width = 24f, cap = StrokeCap.Round)
    }
    Canvas(modifier = Modifier.size(radius)) {
        val diameterOffset = stroke.width / 2
        drawCircle(
            radius = size.minDimension / 2.0f - diameterOffset,
            color = LightGray,
            style = stroke
        )
    }
    CircularProgressIndicator(
        progress = value,
        color = color,
        modifier = Modifier.then(
            Modifier.size(radius)
        ),
        strokeWidth = 6.dp,
    )

}

private fun navigateToDailyGoals(navController: NavController) {
    navController.navigate(ProfileNavRoute.DailyGoals.route)
}

private fun navigateToPreviousActivities(navController: NavController) {
    navController.navigate(ProfileNavRoute.PreviousActivities.route)
}

private fun navigateToSettings(navController: NavController) =
    navController.navigate(ProfileNavRoute.Settings.route)


private fun navigateToTeams(navController: NavController) =
    navController.navigate(ProfileNavRoute.Teams.route)


private fun navigateToWelcome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.WelcomeSocial.route)
}