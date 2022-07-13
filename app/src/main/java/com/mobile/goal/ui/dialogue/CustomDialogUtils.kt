package com.mobile.goal.ui.dialogue

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun customDialog(
    type: CustomDialogType,
    title: String,
    desc: String,
    positiveBtnText: String,
    negativeBtnText: String,
    onOkay: () -> Unit,
    onDismiss: () -> Unit
) {
    MaterialTheme {
        when (type) {
            CustomDialogType.SUCCESS -> {
                SuccessDialog(
                    title = title,
                    desc = desc,
                    onPositive = onOkay,
                    onNegative = onDismiss,
                    positiveBtntext = positiveBtnText,
                    negativeBtntext = negativeBtnText
                )
            }
            CustomDialogType.ERROR -> {
                ErrorDialog(
                    title = title,
                    desc = desc,
                    onDismiss = onDismiss
                )
            }
            CustomDialogType.INFO -> {
                InfoDialog(
                    title = title,
                    desc = desc,
                    onDismiss = onDismiss
                )
            }
        }
    }
}

enum class CustomDialogType {
    SUCCESS, ERROR, INFO
}
