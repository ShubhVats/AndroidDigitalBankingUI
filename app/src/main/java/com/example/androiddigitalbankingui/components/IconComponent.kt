package com.example.androiddigitalbankingui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun IconComponent(
    modifier: Modifier = Modifier,
    icon: ImageVector = Icons.Default.Person,
    colorBg: Color = Color.White,
    tint: Color = Color.Black
) {
    Icon(
        imageVector = icon,
        contentDescription = "Icon Component",
        modifier = modifier
            .background(color = colorBg)
            .padding(3.dp),
        tint = tint
    )
}