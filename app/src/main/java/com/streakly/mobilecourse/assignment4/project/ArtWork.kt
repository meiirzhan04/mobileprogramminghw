package com.streakly.mobilecourse.assignment4.project

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.streakly.mobilecourse.R

data class ArtWork(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val placeRes: Int,
    val year: Int
)

val artWorks = listOf(
    ArtWork(
        imageRes = R.drawable.manhattan_bridge,
        titleRes = R.string.manhattan_bridge_title,
        placeRes = R.string.manhattan_bridge_place,
        year = 1909
    ),
    ArtWork(
        imageRes = R.drawable.haarlem,
        titleRes = R.string.haarlem_title,
        placeRes = R.string.haarlem_place,
        year = 1779
    ),
    ArtWork(
        imageRes = R.drawable.sprinkenhof,
        titleRes = R.string.sprinkenhof_title,
        placeRes = R.string.sprinkenhof_place,
        year = 1927
    )
)