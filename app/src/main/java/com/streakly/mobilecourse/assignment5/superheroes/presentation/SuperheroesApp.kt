package com.streakly.mobilecourse.assignment5.superheroes.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.streakly.mobilecourse.R
import com.streakly.mobilecourse.assignment5.superheroes.data.HeroesRepository
import com.streakly.mobilecourse.assignment5.superheroes.ui.theme.SuperheroesTheme

@Composable
fun SuperheroesApp(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            SuperheroesTopAppBar()
        }
    ) { innerPadding ->
        HeroesList(
            heroes = HeroesRepository.heroes,
            contentPadding = innerPadding
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperheroesTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.superheroes_title),
                style = MaterialTheme.typography.displayLarge
            )
        }
    )
}
