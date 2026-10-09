package com.streakly.mobilecourse.assignment4.project

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@Composable
fun ArtSpace(modifier: Modifier = Modifier) {
    var currentIndex by remember { mutableIntStateOf(0) }
    val artWork = artWorks[currentIndex]

    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtWorkBlock(
            imageRes = artWork.imageRes,
            modifier = Modifier.padding(vertical = 24.dp)
        )
        Spacer(Modifier.height(32.dp))
        ArtWorkDescription(
            title = stringResource(artWork.titleRes),
            place = stringResource(artWork.placeRes),
            year = artWork.year
        )
        Spacer(Modifier.weight(1f))
        DisplayController(
            onPreviousClick = { currentIndex = previousIndex(currentIndex, artWorks.size)},
            onNextClick = { currentIndex = nextIndex(currentIndex, artWorks.size)}
        )
        Spacer(Modifier.height(24.dp))
    }
}

