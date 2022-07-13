package com.mobile.goal.ui.workout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.mobile.goal.R
import com.mobile.goal.domain.model.WorkoutType
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest
import java.util.*

@Composable
fun WorkoutListingScreen(
    navController: NavController,
    viewModel: WorkoutViewModel = hiltViewModel()
) {

    val dataState by viewModel.dataState.collectAsState()
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is WorkoutScreeUiEvent.ShowSnackBar -> {
                    scaffoldState.snackbarHostState.showSnackbar(message = event.message)
                }
            }
        }
    }

    Scaffold(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp),
        backgroundColor = lightGray,
    ) {
        Column {
            Text(
                modifier = Modifier.padding(24.dp),
                text = "Choose workout",
                style = Typography.h2
            )

            LazyColumn {
                if (dataState.isEmpty()) {
                    item {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .fillMaxSize()
                                .wrapContentSize(align = Alignment.Center)
                        )
                    }
                }

                items(dataState) { type: WorkoutType ->
                    WorkoutTypeItem(workoutType = type)
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun WorkoutTypeItem(workoutType: WorkoutType) {

    Box(modifier = Modifier.padding(start = 24.dp, top = 18.dp, end = 24.dp)) {
        Card(
            shape = Shapes.medium,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            onClick = {}
        ) {
            Column {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(workoutType.image),
                        colorFilter = ColorFilter.tint(blue),
                        contentDescription = "workout icon",
                        modifier = Modifier.size(width = 24.dp, height = 24.dp)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Text(
                        text = workoutType.name.capitalize(Locale.ROOT),
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
        }
    }
}