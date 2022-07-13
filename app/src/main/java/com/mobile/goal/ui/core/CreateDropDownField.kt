package com.mobile.goal.ui.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobile.goal.ui.theme.appFonts


@Composable
fun CreateDropDownField(
    text: String,
    modifier: Modifier,
    expanded: Boolean

) {
    Spacer(modifier = Modifier.height(4.dp))

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(7.dp),
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {

            Text(
                style = TextStyle(
                    fontFamily = appFonts,
                    fontWeight = FontWeight(400),
                    fontSize = 18.sp,
                ),
                color = Color.Black,
                text = text.ifEmpty { "Select" },
            )


            if (expanded) {
                Image(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = "",
                )
            } else {
                Image(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = "",
                )
            }
        }
    }


}

@Preview
@Composable
fun previewFunction() {
    CreateDropDownField(
        "Private",
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { var expanded = true }),
        true
    )
}