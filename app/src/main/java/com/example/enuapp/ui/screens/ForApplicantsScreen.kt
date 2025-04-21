package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

@Composable
fun ForApplicantsScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        contentAlignment = Alignment.Center,


    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .alpha(0.9f),
            color = Color.White,
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("Преимущества обучения в ЕНУ", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(
                    text = "ЕНУ — это ведущий университет Казахстана с высоким уровнем академической подготовки, современными лабораториями, международными программами и комфортной инфраструктурой.",
                    color = Color.DarkGray
                )
                Text(
                    text = "Преподавание ведут доктора наук и профессора с мировым опытом. Дополнительную информацию можно найти на официальном сайте: www.enu.kz",
                    color = Color.DarkGray
                )
            }
        }
    }
}
