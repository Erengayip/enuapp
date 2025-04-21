package com.example.enuapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.enuapp.ui.navigation.Screen

@Composable
fun EducationScreen(navController: NavHostController) {
    ScreenBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Surface(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .alpha(0.9f),
                shape = RoundedCornerShape(12.dp),
                tonalElevation = 4.dp
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Образование в ЕНУ", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Button(onClick = { navController.navigate(Screen.Faculties.route) }) {
                        Text("Факультеты")
                    }
                    Button(onClick = { navController.navigate(Screen.ForApplicants.route) }) {
                        Text("Поступающим")
                    }
                    Button(onClick = { navController.navigate(Screen.ForStudents.route) }) {
                        Text("Обучающимся")
                    }
                }
            }
        }
    }
}
