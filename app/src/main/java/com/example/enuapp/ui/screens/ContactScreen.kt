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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ContactScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .alpha(0.9f),
            color = Color.White,
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Контакты ЕНУ", fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text("Адрес: 010008 Республика Казахстан, г. Астана, ул. Сатпаева, 2", color = Color.DarkGray)
                Text("ЕНУ им. Л.Н. Гумилева", color = Color.DarkGray)
                Text("Веб-сайт: www.enu.kz", color = Color.DarkGray)
                Text("Телефон: +7 (7172) 709500", color = Color.DarkGray)
                Text("E-mail: enu@enu.kz", color = Color.DarkGray)
            }
        }
    }
}

