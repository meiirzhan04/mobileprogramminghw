package com.streakly.mobilecourse.assignment4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.streakly.mobilecourse.R
import java.text.NumberFormat

@Composable
fun TipTime() {
    var value by remember { mutableStateOf("") }
    val amount = value.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount)
    LazyColumn(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = stringResource(R.string.calculate_tip),
                modifier = Modifier.fillMaxWidth().padding(top = 40.dp, start = 24.dp),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(12.dp))
            TextField(
                value = value,
                onValueChange = { value = it },
                label = { Text(stringResource(R.string.bill_amount)) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Spacer(Modifier.height(20.dp))
            Text(
                text = stringResource(R.string.tip_amount, tip),
                fontSize = 24.sp
            )
        }
    }
}