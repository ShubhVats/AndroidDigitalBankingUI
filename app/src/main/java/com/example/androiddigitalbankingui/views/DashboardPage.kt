package com.example.androiddigitalbankingui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddigitalbankingui.R
import com.example.androiddigitalbankingui.components.CircularIconComponent
import com.example.androiddigitalbankingui.components.IconComponent
import com.example.androiddigitalbankingui.ui.theme.spacerColor

@Composable
fun DashboardPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainHeader()
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "$ 2.010,12",
            fontSize = 34.sp,
            fontWeight = FontWeight.W900
        )
        Text(
            modifier = Modifier.padding(top = 5.dp),
            text = "Current Balance",
            fontSize = 15.sp,
            color = Color.DarkGray
        )
        Image(
            painter = painterResource(R.drawable.bankcard),
            contentDescription = "Credit Card",
            modifier = Modifier.size(280.dp)
        )
        Text(
            text = "•••• •••• •••• 7995", fontSize = 16.sp, modifier = Modifier.offset(y = (-25).dp)
        )
        ActionIcons()
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(7.dp)
                .background(color = spacerColor)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(7.dp)
        )
        Transactions()
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color.White)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(color = spacerColor)
        )
        Footer()
    }
}

@Composable
fun MainHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CircularIconComponent(
            modifier = Modifier.border(
                1.dp, color = Color.DarkGray, CircleShape
            )
        )
        Text(
            text = "Home", fontSize = 20.sp, fontWeight = FontWeight.W500
        )
        CircularIconComponent(
            icon = Icons.Outlined.Notifications, tint = Color.Black, colorBg = Color.White
        )
    }
}

@Composable
fun ActionIcons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconWithText(
            icon = Icons.Filled.Add, modifier = Modifier.size(40.dp), text = "Top up"
        )
        IconWithText(
            icon = Icons.Filled.PlayArrow, modifier = Modifier.size(40.dp), text = "Exchange"
        )
        IconWithText(
            icon = Icons.Filled.KeyboardArrowUp, modifier = Modifier.size(40.dp), text = "Transfer"
        )
        IconWithText(
            icon = Icons.Filled.Settings, modifier = Modifier.size(40.dp), text = "Details"
        )
    }
}

@Composable
fun IconWithText(
    text: String = "Send",
    icon: ImageVector = Icons.Filled.Add,
    modifier: Modifier = Modifier,
    check: Boolean = true
) {
    Column(
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (check) {
            CircularIconComponent(icon = icon, modifier = modifier)
            Text(
                text = text,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 5.dp),
                fontWeight = FontWeight.W400
            )
        } else {
            IconComponent(icon = icon, modifier = modifier)
            Text(
                text = text,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 5.dp),
                fontWeight = FontWeight.W700
            )
        }
    }

}

@Composable
fun Transactions() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 35.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Transactions",
                fontWeight = FontWeight.W800,
                fontSize = 20.sp,
                textAlign = TextAlign.Start
            )
            Text(
                text = "View all",
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.W700,
                fontSize = 18.sp,
                textAlign = TextAlign.Start
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 35.dp)
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CircularIconComponent(
                    modifier = Modifier
                        .border(
                            1.dp, color = Color.DarkGray, CircleShape
                        )
                        .size(35.dp)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = "Transactions", fontWeight = FontWeight.W400, fontSize = 18.sp)
                    Text(text = "1 July, 2025", fontWeight = FontWeight.W400, fontSize = 14.sp)
                }
            }
            Text(
                text = "$ 800", fontWeight = FontWeight.W700, fontSize = 17.sp
            )
        }
    }
}

@Composable
fun Footer(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp, top = 25.dp)
            .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconWithText(
            icon = Icons.Filled.Home,
            modifier = Modifier.size(35.dp),
            text = "Top up",
            check = false
        )
        IconWithText(
            icon = Icons.Outlined.Refresh,
            modifier = Modifier.size(35.dp),
            text = "Exchange",
            check = false
        )
        IconWithText(
            icon = Icons.Outlined.MailOutline,
            modifier = Modifier.size(35.dp),
            text = "Transfer",
            check = false
        )
        IconWithText(
            icon = Icons.Outlined.Menu,
            modifier = Modifier.size(35.dp),
            text = "Details",
            check = false
        )
    }
}