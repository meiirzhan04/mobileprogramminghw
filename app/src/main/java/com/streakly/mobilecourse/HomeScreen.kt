package com.streakly.mobilecourse

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class State {
    LemonTree,
    Lemon,
    Lemonade,
    Empty
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    var currentState by remember { mutableStateOf(State.LemonTree) }
    var squeezeCount by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Lemonade",
                        fontSize = 18.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFFBE38E))
            )
        },
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            when (currentState) {
                State.LemonTree -> {
                    StateItems(
                        image = R.drawable.lemon_tree,
                        text = R.string.lemon_tree,
                        onImageClick = {
                            squeezeCount = (2..4).random()
                            currentState = State.Lemon
                        }
                    )
                }

                State.Lemon -> {
                    StateItems(
                        image = R.drawable.lemon_squeeze,
                        text = R.string.lemon,
                        onImageClick = {
                            squeezeCount--
                            if (squeezeCount == 0) {
                                currentState = State.Lemonade
                            }
                        }
                    )
                }

                State.Lemonade -> {
                    StateItems(
                        image = R.drawable.lemon_drink,
                        text = R.string.glass_of_lemonade,
                        onImageClick = {
                            currentState = State.Empty
                        }
                    )
                }

                State.Empty -> {
                    StateItems(
                        image = R.drawable.lemon_restart,
                        text = R.string.empty_glass,
                        onImageClick = {
                            currentState = State.LemonTree
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun StateItems(
    image: Int,
    text: Int,
    onImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            onClick = onImageClick,
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFC3ECD2)
            )
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = "",
                modifier = Modifier.padding(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(text),
            fontSize = 18.sp
        )
    }
}