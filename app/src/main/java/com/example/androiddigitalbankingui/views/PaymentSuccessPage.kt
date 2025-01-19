package com.example.androiddigitalbankingui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaymentSuccessPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(vertical = 50.dp),
            text = "PAYZAP",
            fontSize = 32.sp,
            fontWeight = FontWeight.Light
        )
        Icon(
            modifier = Modifier
                .padding(vertical = 50.dp)
                .size(70.dp),
            imageVector = Icons.Default.Check,
            contentDescription = "Logo"
        )
        Text(
            modifier = Modifier.padding(top = 50.dp),
            text = "Transfer Success!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp),
            text = "Your transfer of $900 to John Doe.\nFind the details in the transaction page.",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            colors = ButtonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
                disabledContainerColor = Color.Black,
                disabledContentColor = Color.White
            )
        ) {
            Text(text = "Continue", fontSize = 16.sp, modifier = Modifier.padding(vertical = 10.dp))
        }
    }
}
