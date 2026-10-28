package com.streakly.mobilecourse.assignment5.superheroes.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.streakly.mobilecourse.R
import com.streakly.mobilecourse.assignment5.superheroes.domain.model.Hero

@Composable
fun HeroesList(
    heroes: List<Hero>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        modifier = modifier
    ) {
        items(heroes) { hero ->
            HeroItem(
                hero = hero,
                modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}
