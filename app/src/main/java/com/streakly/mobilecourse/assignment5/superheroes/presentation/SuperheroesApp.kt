package com.streakly.mobilecourse.assignment5.superheroes.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.streakly.mobilecourse.assignment5.superheroes.data.HeroesRepository

@Composable
fun SuperheroesApp(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        HeroesList(
            heroes = HeroesRepository.heroes,
            modifier = Modifier.statusBarsPadding()
        )
    }
}
