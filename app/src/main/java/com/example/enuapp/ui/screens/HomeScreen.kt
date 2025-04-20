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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.clickable

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD)), // светлый фон
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Евразийский национальный университет им. Л. Н. Гумилева", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { navController.navigate("about") }) { Text("Об университете") }
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = { navController.navigate("education") }) { Text("Образование") }
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = { navController.navigate("contact") }) { Text("Контакты") }
        }
    }
}
