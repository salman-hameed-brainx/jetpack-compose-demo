package com.mobile.goal.ui.core

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.goal.ui.theme.appFonts
import com.mobile.goal.ui.theme.black
import com.mobile.goal.ui.theme.blue
import com.mobile.goal.ui.theme.errorRed

@Composable
fun CreateTeamInputField(
    label: String,
    text: String,
    onValueChange: (String) -> Unit,
    keyboardType: KeyboardType,
    errorMessage: String = "",
    modifier : Modifier
) {
    Spacer(modifier = Modifier.height(24.dp))

    Text(
        text = label,
        style = MaterialTheme.typography.subtitle2,
        color = blue
    )

    Spacer(modifier = Modifier.height(4.dp))

    OutlinedTextField(
        modifier = modifier,
        value = text,
        singleLine = true,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(
            autoCorrect = false,
            capitalization = if (keyboardType == KeyboardType.Password) KeyboardCapitalization.None else KeyboardCapitalization.Sentences,
            keyboardType = keyboardType,
            imeAction = ImeAction.Done
        ),
        textStyle = TextStyle(
            color = black,
            fontSize = 16.sp,
            fontWeight = FontWeight.W500,
        ),
        visualTransformation = if (keyboardType == KeyboardType.Password) PasswordVisualTransformation() else VisualTransformation.None,
        isError = errorMessage.isNotEmpty(),
    )

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