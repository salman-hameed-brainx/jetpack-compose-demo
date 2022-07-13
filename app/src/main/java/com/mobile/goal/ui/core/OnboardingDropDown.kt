package com.mobile.goal.ui.core

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.goal.ui.theme.*

@Composable
fun OnboardingDropDown(
    title: String,
    selectedValue: String,
    items: List<String>,
    onValueChange: (String) -> Unit,
    errorMessage: String = ""
) {

    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(selectedValue) }

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = title,
        style = MaterialTheme.typography.subtitle2,
        color = blue
    )

    Spacer(modifier = Modifier.height(4.dp))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { expanded = true })
                .background(
                    lightGray
                ),
            value = selectedValue,
            singleLine = true,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = black,
                fontSize = 16.sp,
                fontWeight = FontWeight.W400,
            ),
            enabled = false
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(white),
        ) {
            items.forEachIndexed { index, s ->
                DropdownMenuItem(
                    onClick = {
                        selectedItem = items[index]
                        expanded = false

                    }) {
                    Text(text = s)
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(4.dp))

    if (errorMessage.isNotEmpty()) {
        Text(
            text = errorMessage,
            style = TextStyle(
                fontFamily = appFonts,
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
            ),
            color = errorRed,
        )
    }
}