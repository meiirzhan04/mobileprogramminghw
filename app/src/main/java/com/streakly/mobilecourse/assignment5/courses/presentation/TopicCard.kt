package com.streakly.mobilecourse.assignment5.courses.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.streakly.mobilecourse.R
import com.streakly.mobilecourse.assignment5.courses.domain.model.Topic

@Composable
fun TopicCard(
    modifier: Modifier = Modifier,
    topic: Topic
) {
    Card(

    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(topic.imageRes),
                contentDescription = ""
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = stringResource(topic.name),
                    style = MaterialTheme.typography.bodyMedium,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = ""
                    )
                    Text(
                        text = stringResource(topic.availableCourses),
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
        }
    }
}