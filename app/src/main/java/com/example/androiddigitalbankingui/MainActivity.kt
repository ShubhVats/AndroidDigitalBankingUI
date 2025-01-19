package com.example.androiddigitalbankingui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.androiddigitalbankingui.ui.theme.AndroidDigitalBankingUITheme
import com.example.androiddigitalbankingui.views.DashboardPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidDigitalBankingUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DashboardPage(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

