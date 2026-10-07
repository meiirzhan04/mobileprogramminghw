package com.streakly.mobilecourse

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_android),
                contentDescription = "",
                modifier = Modifier.size(100.dp),
                tint = Color(0xFF006D3B)
            )
            Text(
                text = "Meiirzhan Amirzhan",
                fontSize = 24.sp
            )
            Text(
                text = "Android Developer",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            RowIconWithText(text = "+7 776 786 10 73", icon = R.drawable.ic_phone)
            RowIconWithText(text = "@meiirzhan", icon = R.drawable.ic_share)
            RowIconWithText(text = "amirzhameirzhan@gmail.com", icon = R.drawable.ic_letter)
        }
    }
}

@Composable
private fun RowIconWithText(
    text: String,
    icon: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = "",
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = text,
            fontSize = 14.sp
        )
    }
}