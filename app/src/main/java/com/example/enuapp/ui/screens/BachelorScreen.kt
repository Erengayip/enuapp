package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.clickable

@Composable
fun BachelorScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Бакалавриат", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(12.dp))
        Text("Бакалавриат — это первая ступень высшего образования, дающая фундаментальные знания по выбранной специальности. Программа длится 4 года и включает лекции, практическую работу и научные исследования.")
    }
}
