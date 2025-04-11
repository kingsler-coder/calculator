package com.kingsler.calcintweb.ui.theme.screens.web

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun Web_Screen(navController: NavHostController) {
    var url by remember { mutableStateOf("") }
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)){
        Text(text = "Web Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Cyan
        )
        OutlinedButton(onClick = {
            url = "https://www.google.com/"
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(
                text = "Google",
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
        if (url.isEmpty()){
            AndroidView(factory = {context ->
            WebView(context).apply {
                webViewClient= WebViewClient()
                settings.javaScriptEnabled=true
                loadUrl(url)
            }})
        }
    }

}

@Preview
@Composable
private fun webprev() {
    Web_Screen(rememberNavController())
    
}