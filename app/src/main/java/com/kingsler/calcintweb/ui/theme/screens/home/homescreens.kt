package com.kingsler.calcintweb.ui.theme.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Home Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace
            )
        }
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace
            )
        }
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace
            )

        }
    }
}

@Preview
@Composable
private fun Home_pre() {
    Home_Screen()
}
