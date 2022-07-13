package com.mobile.goal.ui.daily_goal

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.domain.enum.DailyGoalType
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DailyGoalsScreen(
    navController: NavController,
    viewModel: DailyGoalsViewModel = hiltViewModel(),
) {

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is DailyGoalsUiEvent.ShowSnackBar -> scaffoldState.snackbarHostState.showSnackbar(message = event.message)
            }
        }
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                navController = navController,
            )
        },
        backgroundColor = lightGray,
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            ExpandableCard("Distance", R.drawable.ic_daily_goal_distance, DailyGoalType.DISTANCE)
            ExpandableCard("Calories", R.drawable.ic_daily_goal_calories, DailyGoalType.CALORIES)
            ExpandableCard("Time", R.drawable.ic_daily_goal_time, DailyGoalType.TIME)
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun ExpandableCard(
    title: String,
    icon: Int,
    dailyGoalType: DailyGoalType,
    viewModel: DailyGoalsViewModel = hiltViewModel(),
) {
    var expandedState by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            )
            .padding(vertical = 16.dp),
        shape = Shapes.small,
        onClick = {
            expandedState = !expandedState
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(white)
                    .padding(horizontal = 16.dp)
            ) {
                Row {
                    Image(
                        modifier = Modifier.size(22.dp),
                        painter = painterResource(icon),
                        contentDescription = title,
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = title,
                        style = MaterialTheme.typography.button,
                        color = black,
                    )
                }

                Switch(
                    checked = when (dailyGoalType) {
                        DailyGoalType.DISTANCE -> viewModel.distanceEnabledState.value
                        DailyGoalType.CALORIES -> viewModel.caloriesEnabledState.value
                        DailyGoalType.TIME -> viewModel.timeEnabledState.value
                    },
                    onCheckedChange = {
                        when (dailyGoalType) {
                            DailyGoalType.DISTANCE -> viewModel.onEvent(DailyGoalsEvent.EnableDistance(it))
                            DailyGoalType.CALORIES -> viewModel.onEvent(DailyGoalsEvent.EnableCalories(it))
                            DailyGoalType.TIME -> viewModel.onEvent(DailyGoalsEvent.EnableTime(it))
                        }
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = blue,
                        checkedTrackColor = blue,
                    )
                )
            }
            if (expandedState) {
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    IconButton(
                        modifier = Modifier.then(Modifier.size(32.dp)),
                        onClick = {
                            when (dailyGoalType) {
                                DailyGoalType.DISTANCE -> viewModel.onEvent(DailyGoalsEvent.SubtractDistance(viewModel.distanceValueState.value))
                                DailyGoalType.CALORIES -> viewModel.onEvent(DailyGoalsEvent.SubtractCalories(viewModel.caloriesValueState.value))
                                DailyGoalType.TIME -> viewModel.onEvent(DailyGoalsEvent.SubtractTime(viewModel.timeValueState.value))
                            }
                        }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_daily_goal_minus),
                            contentDescription = "Minus",
                            tint = blue
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))
                    OutlinedTextField(
                        modifier = Modifier
                            .width(185.dp)
                            .height(50.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                        textStyle = TextStyle(
                            fontFamily = appFonts,
                            fontWeight = FontWeight(400),
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        ),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = lightGray,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        singleLine = true,
                        value = when (dailyGoalType) {
                            DailyGoalType.DISTANCE -> viewModel.distanceValueState.value
                            DailyGoalType.CALORIES -> viewModel.caloriesValueState.value
                            DailyGoalType.TIME -> viewModel.timeValueState.value
                        },
                        onValueChange = {
                            when (dailyGoalType) {
                                DailyGoalType.DISTANCE -> viewModel.onEvent(DailyGoalsEvent.EnteredDistance(it))
                                DailyGoalType.CALORIES -> viewModel.onEvent(DailyGoalsEvent.EnteredCalories(it))
                                DailyGoalType.TIME -> viewModel.onEvent(DailyGoalsEvent.EnteredTime(it))
                            }
                        },
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    IconButton(modifier = Modifier.then(Modifier.size(32.dp)),
                        onClick = {
                            when (dailyGoalType) {
                                DailyGoalType.DISTANCE -> viewModel.onEvent(DailyGoalsEvent.AddDistance(viewModel.distanceValueState.value))
                                DailyGoalType.CALORIES -> viewModel.onEvent(DailyGoalsEvent.AddCalories(viewModel.caloriesValueState.value))
                                DailyGoalType.TIME -> viewModel.onEvent(DailyGoalsEvent.AddTime(viewModel.timeValueState.value))
                            }
                        }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_daily_goal_plus),
                            contentDescription = "Plus",
                            tint = blue
                        )
                    }
                }
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
    }
}
