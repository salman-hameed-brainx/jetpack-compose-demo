package com.mobile.goal.ui.onboarding.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.mobile.goal.R
import com.mobile.goal.navigation.OnboardingNavRoute
import com.mobile.goal.ui.theme.*
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun IntroScreen(navController: NavController) {
    val pagerState = rememberPagerState(initialPage = 0)
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(count = 3, state = pagerState) { page ->
            when (page) {
                0 -> {
                    IntroContent(
                        imageId = com.mobile.goal.R.drawable.img_intro_1,
                        title = "Join challenges",
                        message = "Share events with your contacts all around the world.",
                        pagerState = pagerState,
                        navController = navController,
                        isLast = false
                    )
                }
                1 -> {
                    IntroContent(
                        imageId = com.mobile.goal.R.drawable.img_intro_2,
                        title = "Track Workouts",
                        message = "Track your stats over and stay informed about your body health.",
                        pagerState = pagerState,
                        navController = navController,
                        isLast = false
                    )
                }
                2 -> {
                    IntroContent(
                        imageId = R.drawable.img_intro_3,
                        title = "Live healthier life",
                        message = "Share events with your contacts all around the world.",
                        pagerState = pagerState,
                        navController = navController,
                        isLast = true,
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun IntroContent(
    imageId: Int,
    title: String,
    message: String,
    pagerState: PagerState,
    navController: NavController,
    isLast: Boolean,
    viewModel: IntroViewModel = hiltViewModel(),
) {
    val scope = rememberCoroutineScope()

    LaunchedEffect(key1 = true) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is IntroUiEvent.CompleteIntro -> navigateToWelcome(navController)
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(390.dp),
            painter = painterResource(imageId),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = title,
            color = black,
            fontSize = 30.sp,
            fontFamily = appFonts,
            fontWeight = FontWeight(600)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            modifier = Modifier.padding(horizontal = 49.dp),
            text = message,
            textAlign = TextAlign.Center,
            color = darkGray,
            fontSize = 18.sp,
            fontFamily = appFonts,
            fontWeight = FontWeight(400)
        )
        Spacer(modifier = Modifier.height(10.dp))
        DotsIndicator(
            totalDots = 3,
            selectedIndex = pagerState.currentPage,
            selectedColor = blue,
            unSelectedColor = gray
        )
        Spacer(modifier = Modifier.height(26.dp))

        if (!isLast) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextButton(onClick = {
                    scope.launch { viewModel.completeIntro() }
                }) {
                    Text(text = "SKIP")
                }
                TextButton(onClick = {
                    if (!isLast) {
                        scope.launch {
                            pagerState.scrollToPage(pagerState.currentPage + 1)
                        }
                    }
                }) {
                    Text(text = "NEXT")
                }
            }
        } else {
            Button(modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .height(60.dp),
                shape = Shapes.small,
                onClick = {
                    scope.launch { viewModel.completeIntro() }
                }) {
                Text(text = "Get Started")
            }
        }

    }
}

@Composable
private fun DotsIndicator(
    totalDots: Int,
    selectedIndex: Int,
    selectedColor: Color,
    unSelectedColor: Color,
) {
    LazyRow(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        items(totalDots) { index ->
            if (index == selectedIndex) {
                Box(
                    modifier = Modifier
                        .size(5.dp)
                        .clip(CircleShape)
                        .background(selectedColor)
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(5.dp)
                        .clip(CircleShape)
                        .background(unSelectedColor)
                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            }
        }
    }
}

private fun navigateToWelcome(navController: NavController) {
    navController.backQueue.clear()
    navController.navigate(OnboardingNavRoute.WelcomeSocial.route)
}


