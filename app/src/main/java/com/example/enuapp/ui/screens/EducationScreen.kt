package com.example.enuapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun EducationScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1F8E9))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Образование в ЕНУ", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("faculties") }) {
            Text("Факультеты")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { navController.navigate("for_applicants") }) {
            Text("Поступающим")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { navController.navigate("for_students") }) {
            Text("Обучающимся")
        }
    }
}
