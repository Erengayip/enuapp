package com.example.enuapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.enuapp.R

@Composable
fun ContactScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Фоновое изображение (res/drawable/contact_bg.png)
        Image(
            painter = painterResource(id = R.drawable.university_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // Лёгкий оверлей
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.2f))
        )
        // Белый «баннер» для текста
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
                .align(Alignment.Center)
                .alpha(0.9f),
            color = Color.White,
            shape = RoundedCornerShape(12.dp),
            tonalElevation = 4.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("Контакты ЕНУ", fontSize = 24.sp, color = Color.Black)
                Text("📍 Адрес: 010008, Республика Казахстан, г. Астана, ул. Сатпаева, 2", fontSize = 16.sp, color = Color.DarkGray)
                Text("🌐 Сайт: www.enu.kz", fontSize = 16.sp, color = Color.DarkGray)
                Text("📞 Телефон: +7 (7172) 709500", fontSize = 16.sp, color = Color.DarkGray)
                Text("✉️ Email: enu@enu.kz", fontSize = 16.sp, color = Color.DarkGray)
            }
        }
    }
}
