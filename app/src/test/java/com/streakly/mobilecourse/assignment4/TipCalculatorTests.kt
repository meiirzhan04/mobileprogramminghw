package com.streakly.mobilecourse.assignment4

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


class TipCalculatorTests {
    @Test
    fun calculateTipTwentyPercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, roundUp = false)

        assertEquals(expectedTip, actualTip)
    }
}
