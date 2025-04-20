package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContactScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Контакты ЕНУ", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        Text("📍 Адрес: г. Астана, ул. Сатпаева, 2")
        Spacer(modifier = Modifier.height(8.dp))
        Text("🌐 Сайт: www.enu.kz")
        Spacer(modifier = Modifier.height(8.dp))
        Text("📞 Телефон: +7 (7172) 709500")
        Spacer(modifier = Modifier.height(8.dp))
        Text("✉️ Email: enu@enu.kz")
    }
}
