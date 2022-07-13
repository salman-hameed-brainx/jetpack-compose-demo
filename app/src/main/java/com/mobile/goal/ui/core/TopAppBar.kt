package com.mobile.goal.ui.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mobile.goal.R
import com.mobile.goal.ui.theme.appFonts
import com.mobile.goal.ui.theme.black


@Composable
fun TopBar(
    navController: NavController,
    showBack: Boolean = true,
    title: String = "",
    textAlignCenter: Boolean = false,
    customBackCallback:(()->Unit)?=null
) {
    TopAppBar(
            modifier = Modifier.padding(top = 24.dp),
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            title = {
                if (textAlignCenter) {
                Text(
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 40.dp),
                        text = title,
                        style = TextStyle(
                                fontFamily = appFonts,
                                fontWeight = FontWeight(600),
                                fontSize = 22.sp,
                        )
                )
            }else {
                Text(
            text = title,
                    style = TextStyle(
                        fontFamily = appFonts,
                        fontWeight = FontWeight(600),
                        fontSize = 22.sp,
                    )
            )
            }
        },
        navigationIcon =
        if (navController.previousBackStackEntry != null && showBack) {
                {
                    IconButton(onClick = {
                        if (customBackCallback!=null){
                            customBackCallback.invoke()
                        }else{
                            navController.navigateUp()
                        }
                    }) {
                        Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_left),
                                tint = black,
                                contentDescription = "Back"
                        )
                    }
                }
            } else {
                null
            }
    )
}