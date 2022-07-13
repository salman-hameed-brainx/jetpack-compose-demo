package com.mobile.goal.ui.profile.teams

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mobile.goal.ui.core.TopBar
import com.mobile.goal.ui.theme.*

@Composable
fun TeamsScreen(
    navController: NavController,
) {
    Scaffold(
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
            Text(text = "Teams", style = Typography.h2)
        }
    }
}
