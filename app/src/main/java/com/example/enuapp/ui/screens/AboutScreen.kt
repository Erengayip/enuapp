package com.example.enuapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.enuapp.R

@Composable
fun AboutScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Фон с изображением (например, университета)
        Image(
            painter = painterResource(id = R.drawable.university_bg),
            contentDescription = "Фон университета",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("О ЕНУ имени Л.Н. Гумилева", fontSize = 22.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Евразийский национальный университет — один из ведущих вузов Казахстана. " +
                        "Основан в 1996 году, носит имя выдающегося ученого Льва Гумилева."
            )
        }
    }
}
