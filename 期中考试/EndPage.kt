package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun EndPage(navController: NavController) {
    Column {
        Text(text = "考试结束")
        Button(onClick = {
            navController.navigate("Home")
        }) {
            Text(text = "Exam Over")
        }
    }
}