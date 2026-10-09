package com.streakly.mobilecourse.assignment4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.streakly.mobilecourse.R

@Composable
fun TipTime(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            textAlign = TextAlign.Start,
        )
        Spacer(modifier = Modifier.height(12.dp))
        TextField(
            value = value,
            onValueChange = { value = it },
            label = { Text(stringResource(R.string.bill_amount)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}