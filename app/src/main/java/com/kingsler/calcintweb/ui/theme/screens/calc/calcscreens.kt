package com.kingsler.calcintweb.ui.theme.screens.calc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navController: NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var Secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var Answer by remember { mutableStateOf("") }


    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)){
        Text(text = Answer,
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(value = firstnum ,
            onValueChange = {firstnum=it},
            label = {Text(text = "Enter First No. ",
                fontSize = 30.sp,
                color = Color.Green,
                fontFamily = FontFamily.Monospace)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        OutlinedTextField(value = Secondnum ,
            onValueChange = {Secondnum=it},
            label = {Text(text = "Enter Second No. ",
                fontSize = 30.sp,
                color = Color.Green,
                fontFamily = FontFamily.Monospace)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        OutlinedButton(onClick = {
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=Secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                Answer="Please fill in all detail"
            }else{
                val my_Answer=myfirstnum.toDouble()+ mysecondnum.toDouble()
                Answer=my_Answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(
                text = "+",
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif
            )
        }

            OutlinedButton(onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecondnum=Secondnum.text.trim()
                if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                    Answer="Please fill in all detail"
                }else{
                    val my_Answer=myfirstnum.toDouble()- mysecondnum.toDouble()
                    Answer=my_Answer.toString()
                }
            },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.width(300.dp)) {
                Text(
                    text = "-",
                    fontSize = 35.sp,
                    fontFamily = FontFamily.SansSerif
                )
            }

                OutlinedButton(onClick = {
                    val myfirstnum=firstnum.text.trim()
                    val mysecondnum=Secondnum.text.trim()
                    if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                        Answer="Please fill in all detail"
                    }else{
                        val my_Answer=myfirstnum.toDouble()* mysecondnum.toDouble()
                        Answer=my_Answer.toString()
                    }
                },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    modifier = Modifier.width(300.dp)) {
                    Text(
                        text = "*",
                        fontSize = 35.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }

                    OutlinedButton(onClick = {
                        val myfirstnum=firstnum.text.trim()
                        val mysecondnum=Secondnum.text.trim()
                        if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                            Answer="Please fill in all detail"
                        }else{
                            val my_Answer=myfirstnum.toDouble()/ mysecondnum.toDouble()
                            Answer=my_Answer.toString()
                        }
                    },
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        modifier = Modifier.width(300.dp)
                    ) {
                        Text(
                            text = "/",
                            fontSize = 35.sp,
                            fontFamily = FontFamily.SansSerif
                        )

                    }

    }
    
}

@Preview
@Composable
private fun Calc_prev() {
    Calc_Screen(rememberNavController())
    
}