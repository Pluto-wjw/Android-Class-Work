package com.example.middleexam

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun index(navController: NavController){
    Button(onClick = {
        navController.navigate("Home")
    }) {
        Text(text = "home")
    }
}