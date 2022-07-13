package com.mobile.goal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mobile.goal.R

val appFonts = FontFamily(
    Font(R.font.gilroy_bold, weight = FontWeight.Bold),
    Font(R.font.gilroy_light, weight = FontWeight.Light),
    Font(R.font.gilroy_medium, weight = FontWeight.Medium),
    Font(R.font.gilroy_regular),
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(700),
        fontSize = 36.sp
    ),
    h2 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(700),
        fontSize = 28.sp
    ),
    h3 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(500),
        fontSize = 24.sp
    ),
    h4 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(700),
        fontSize = 22.sp
    ),
    h5 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(700),
        fontSize = 18.sp
    ),
    h6 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(700),
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(500),
        fontSize = 12.sp
    ),
    body2 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(400),
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(600),
        fontSize = 18.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(400),
        fontSize = 18.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = appFonts,
        fontWeight = FontWeight(400),
        fontSize = 16.sp,
    ),
)