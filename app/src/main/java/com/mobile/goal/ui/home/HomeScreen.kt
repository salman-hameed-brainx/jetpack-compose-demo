package com.mobile.goal.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.mobile.goal.R
import com.mobile.goal.common.utils.getCombineStartEndDate
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeModel
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionModel
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.navigation.ChallengeNavRoute
import com.mobile.goal.navigation.CompetitionNavRoute
import com.mobile.goal.navigation.HomeNavRoute
import com.mobile.goal.ui.theme.*

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val bottomNavigationHeight = 56.dp
    val state = viewModel.state.collectAsState()
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
    ) {
        Box(modifier = Modifier.padding(bottom = bottomNavigationHeight)) {
            Image(
                painter = painterResource(id = R.drawable.ic_home_gradient),
                contentDescription = "Splash Logo",
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(state = rememberScrollState()),
            ) {
                Title()
                Dashboard(navController)

                ChallengeEventSection(
                    title = "Challenges",
                    response = state.value.challengeResponse,
                    R.drawable.image_challenge,
                    R.drawable.ic_challenge,
                    challengeGreen,
                    navController
                )
                CompetitionEventSection(
                    title = "Competitions",
                    response = state.value.competitionResponse,
                    R.drawable.image_competition,
                    R.drawable.ic_competition,
                    competitionOrange,
                    navController
                )
            }
        }
    }
}

@Composable
private fun Title() {
    Column(Modifier.padding(start = 16.dp, end = 16.dp, top = 70.dp, bottom = 16.dp)) {
        Text(text = "Hello Michael!", style = MaterialTheme.typography.h3, color = white)
        Text(text = "Keep your body fit", style = MaterialTheme.typography.h1, color = white)
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun Dashboard(navController: NavController) {
    Card(
        shape = Shapes.small,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        onClick = {
            navigateToDailyGoal(navController)
        }
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            DashboardItem(progress = 0.36f, value = "10", type = "km", blue)
            DashboardItem(progress = 0.27f, value = "325", type = "kcal", competitionOrange)
            DashboardItem(progress = 0.54f, value = "54", type = "min", challengeGreen)
        }
    }
}

@Composable
private fun DashboardItem(progress: Float, value: String, type: String, color: Color) {
    Box(contentAlignment = Alignment.Center) {
        CircularProgressIndicator(
            color = lightGray,
            modifier = Modifier
                .height(86.dp)
                .width(86.dp),
            progress = 1f,
            strokeWidth = 9.dp
        )
        CircularProgressIndicator(
            color = color,
            modifier = Modifier
                .height(86.dp)
                .width(86.dp),
            progress = progress,
            strokeWidth = 9.dp
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "${(progress * 100).toInt()}%",
                style = MaterialTheme.typography.h5,
                color = black
            )
            Text(text = "$value $type", style = MaterialTheme.typography.body1, color = gray)
        }
    }
}

@Composable
private fun ChallengeEventSection(
    title: String,
    response: ChallengeResponse?,
    imageId: Int,
    iconId: Int,
    eventColor: Color,
    navController: NavController
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
                text = title,
                style = MaterialTheme.typography.h2
            )
            Icon(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .height(16.dp)
                    .width(8.dp)
                    .clickable {
                        navigateToEvents(navController)
                    },
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = "Event List"
            )
        }
        LazyRow(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            contentPadding = PaddingValues(
                start = 24.dp,
                end = 24.dp,
            ),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            response?.apply {
                challenges.apply {
                    items(this) { model: ChallengeModel ->
                        ChallengeEventItem(
                            navController,
                            model,
                            model.code,
                            R.drawable.ic_challenge,
                            challengeGreen
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun CompetitionEventSection(
    title: String,
    response: CompetitionResponse?,
    imageId: Int,
    iconId: Int,
    eventColor: Color,
    navController: NavController
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp),
                text = title,
                style = MaterialTheme.typography.h2
            )
            Icon(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .height(16.dp)
                    .width(8.dp)
                    .clickable {
                        navigateToCompetitionListing(navController)
                    },
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = "Event List"
            )
        }
        LazyRow(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            contentPadding = PaddingValues(
                start = 24.dp,
                end = 24.dp,
            ),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            response?.apply {
                competitions.apply {
                    items(this) { model: CompetitionModel ->
                        CompetitionEventItem(
                            navController,
                            model,
                            model.code,
                            R.drawable.ic_competition,
                            competitionOrange
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ChallengeEventItem(
    navController: NavController,
    event: ChallengeModel?,
    code: String?,
    iconId: Int,
    eventColor: Color
) {

    Box(
        Modifier
            .height(150.dp)
            .width(310.dp)
            .clip(RoundedCornerShape(5))
            .clickable {
                navigateToDetails(navController, code)
            }

    ) {

        val painter = rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(event?.frontImage)
                .size(Size.ORIGINAL)
                .build()
        )
        val painterState = painter.state

        Image(
            painter = rememberAsyncImagePainter(
                "https://upload.wikimedia.org/wikipedia/commons/2/23/Lake_mapourika_NZ.jpeg"
            ),
            contentDescription = "Event Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(1f)
        )

        if (painterState is AsyncImagePainter.State.Loading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(16.dp)
        ) {
            val (icons, date) = createRefs()
            LazyRow(
                Modifier.constrainAs(icons) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(date.start)
                    width = Dimension.fillToConstraints
                }
            ) {
                items(event?.sports?.map { it.url } ?: emptyList()) { url ->
                    Image(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .height(20.dp)
                            .width(20.dp),
                        painter = rememberAsyncImagePainter(model = url),
                        colorFilter = ColorFilter.tint(challengeGreen),
                        contentDescription = "Event Icon"
                    )
                }
            }

            Text(
                text = getCombineStartEndDate(event?.start, event?.end),
                style = MaterialTheme.typography.body2,
                color = white,
                modifier = Modifier
                    .constrainAs(date) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                    }
            )
        }

        Text(
            text = event?.name?.replace(" ", "\n") ?: "",
            style = MaterialTheme.typography.h4,
            color = white,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomStart),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis

        )

        if (event?.canApply == true) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomEnd)
            ) {
                TextButton(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .width(110.dp)
                        .height(32.dp),
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = eventColor
                    ),
                    onClick = {
                        navigateToDetails(navController, code)
                    }
                ) {
                    Text(text = "Join", color = white, style = MaterialTheme.typography.h6)
                }
            }
        }
    }
}

@Composable
private fun CompetitionEventItem(
    navController: NavController,
    event: CompetitionModel?,
    code: String?,
    iconId: Int,
    eventColor: Color
) {

    Box(
        Modifier
            .height(150.dp)
            .width(310.dp)
            .clip(RoundedCornerShape(5))
            .clickable {
                navigateToCompetitionDetails(navController, code)
            }

    ) {
        val painter = rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(event?.frontImage)
                .size(Size.ORIGINAL)
                .build()
        )
        val painterState = painter.state

        Image(
            painter = rememberAsyncImagePainter(
                "https://upload.wikimedia.org/wikipedia/commons/2/23/Lake_mapourika_NZ.jpeg"
            ),
            contentDescription = "Event Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(1f)
        )
        if (painterState is AsyncImagePainter.State.Loading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }

        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(16.dp)
        ) {
            val (icons, date) = createRefs()
            LazyRow(
                Modifier.constrainAs(icons) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(date.start)
                    width = Dimension.fillToConstraints
                }
            ) {
                items(event?.sports?.map { it.url } ?: emptyList()) { url ->
                    Image(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .height(20.dp)
                            .width(20.dp),
                        painter = rememberAsyncImagePainter(model = url),
                        colorFilter = ColorFilter.tint(competitionOrange),
                        contentDescription = "Event Icon"
                    )
                }
            }
            Text(
                text = getCombineStartEndDate(event?.start, event?.end),
                style = MaterialTheme.typography.body2,
                color = white,
                modifier = Modifier
                    .padding(16.dp)
                    .constrainAs(date) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                    }
            )
        }

        Text(
            text = event?.name?.replace(" ", "\n") ?: "",
            style = MaterialTheme.typography.h4,
            color = white,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomStart),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis

        )

        Row(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd)
        ) {
            if (event?.canApply == true) {
                TextButton(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .width(110.dp)
                        .height(32.dp),
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = eventColor
                    ),
                    onClick = {
                        navigateToCompetitionDetails(navController, code)
                    }
                ) {
                    Text(text = "Join", color = white, style = MaterialTheme.typography.h6)
                }
            }
        }
    }
}

@Preview
@Composable
fun BoxDemo(){
    Box(Modifier.fillMaxSize()) {
        Text(text = "Name")
        TextButton(onClick = { /*callYouFunction*/ }) {
            Text(text = "Age")
        }
        Image(
            painter = painterResource(id = R.drawable.img_login),
            contentDescription = "Login Photo",
            contentScale = ContentScale.FillBounds
        )
    }
}

private fun navigateToDailyGoal(navController: NavController) {
    navController.navigate(HomeNavRoute.DailyGoals.route)
}

private fun navigateToEvents(navController: NavController) {
    navController.navigate(HomeNavRoute.Events.route)
}

private fun navigateToCompetitionListing(navController: NavController) {
    navController.navigate(HomeNavRoute.CompetitionEvents.route)
}

private fun navigateToDetails(navController: NavController, code: String?) {
    navController.navigate("${ChallengeNavRoute.ChallengeDetail.route}/$code")
}

private fun navigateToCompetitionDetails(navController: NavController, code: String?) {
    navController.navigate("${CompetitionNavRoute.CompetitionDetail.route}/$code")
}


