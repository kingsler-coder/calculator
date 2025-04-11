package com.kingsler.calcintweb.ui.theme.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kingsler.calcintweb.navigation.ROUTE_CALC

@Composable
fun Home_Screen(navController: NavHostController) {
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
            onClick = {navController.navigate(ROUTE_CALC)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace
            )
        }
        Button(
            onClick = {navController.navigate("web")},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace
            )
        }
        Button(
            onClick = {navController.navigate("Intent")},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
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
    Home_Screen(rememberNavController())
}
