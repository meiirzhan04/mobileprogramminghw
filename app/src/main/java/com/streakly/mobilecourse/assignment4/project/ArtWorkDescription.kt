package com.streakly.mobilecourse.assignment4.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.streakly.mobilecourse.R


@Composable
fun ArtWorkDescription(
    modifier: Modifier = Modifier,
    title: String,
    place: String,
    year: Int,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )
        Text(
            text = stringResource(R.string.place_year, place, year),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}