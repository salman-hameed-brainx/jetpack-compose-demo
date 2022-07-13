package com.mobile.goal.ui.notifications

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.mobile.goal.domain.model.Notification
import com.mobile.goal.ui.theme.Shapes
import com.mobile.goal.ui.theme.Typography
import com.mobile.goal.ui.theme.lightGray
import java.util.*

@Preview
@Composable
fun NotificationsScreen() {
    Scaffold(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 64.dp),
        backgroundColor = lightGray,
    ) {
        Column {
            Text(
                modifier = Modifier.padding(24.dp),
                text = "Notifications",
                style = Typography.h2
            )

            LazyColumn(
                state = rememberLazyListState(),
            ) {

                items(
                    listOf<Notification>(
                        Notification(
                            "https://cdn.pixabay.com/photo/2016/11/14/03/06/woman-1822459_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2021/05/14/08/44/running-6252827_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2016/11/14/03/06/woman-1822459_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2016/11/14/03/06/woman-1822459_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2021/05/14/08/44/running-6252827_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2021/05/14/08/44/running-6252827_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2016/11/14/03/06/woman-1822459_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2021/05/14/08/44/running-6252827_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        ),
                        Notification(
                            "https://cdn.pixabay.com/photo/2016/11/14/03/06/woman-1822459_960_720.jpg",
                            "Michael Bell",
                            "is inviting you to join his challenge!",
                            Date(System.currentTimeMillis())
                        )
                    )
                ) { item -> NotificationItem(item) }
            }
        }

    }
}

@Composable
private fun NotificationItem(notification: Notification) {
    Spacer(modifier = Modifier.height(23.dp))

    Card(
        shape = Shapes.large,
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
    ) {
        Column {
            Spacer(modifier = Modifier.height(23.dp))

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Log.v("photo==",notification.photoUrl!!)
                Image(
                    painter = rememberAsyncImagePainter(notification.photoUrl),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(52.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = "${notification.username} ${notification.description}",
                    style = MaterialTheme.typography.body2
                )
                Text(text = "12:45", style = MaterialTheme.typography.subtitle2)
            }

            Spacer(modifier = Modifier.height(23.dp))
        }

    }
}