package com.streakly.mobilecourse.assignment4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.streakly.mobilecourse.R
import java.text.NumberFormat

@Composable
fun TipTime() {
    var amountInput by remember { mutableStateOf("") }
    var tipInput by remember { mutableStateOf("") }
    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0
    var isChecked by remember { mutableStateOf(false) }
    val tip = calculateTip(amount, tipPercent, isChecked)

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 24.dp),
            textAlign = TextAlign.Start
        )
        Spacer(modifier = Modifier.height(12.dp))
        EditNumberTextField(
            value = amountInput,
            onValueChange = { amountInput = it },
            label = R.string.bill_amount,
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
            imeAction = ImeAction.Next,
            leadingIcon = R.drawable.ic_money
        )
        EditNumberTextField(
            value = tipInput,
            onValueChange = { tipInput = it },
            label = R.string.how_was_the_service,
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
            imeAction = ImeAction.Done,
            leadingIcon = R.drawable.ic_percent
        )
        RowTextWithSwitch(
            isChecked = isChecked,
            onCheckedChange = { isChecked = it }
        )
        Spacer(Modifier.height(20.dp))
        Text(
            text = stringResource(R.string.tip_amount, tip),
            fontSize = 24.sp
        )
    }
}

fun calculateTip(amount: Double, tipPercent: Double, roundUp: Boolean = false): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}