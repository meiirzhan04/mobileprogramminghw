package com.streakly.mobilecourse.assignment4.project

import android.view.Surface
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ArtWorkBlock(
    modifier: Modifier = Modifier,
    @DrawableRes imageRes: Int
) {
    Surface(
        modifier = modifier,
        color = Color.White,
        shadowElevation = 8.dp
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = ""
        )
    }
}