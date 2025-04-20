package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PhdScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Докторантура", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(12.dp))
        Text("Докторантура — это высшая ступень подготовки научных кадров. Программа рассчитана на 3 года, включает проведение самостоятельных исследований и защиту диссертации, что позволяет получить степень PhD.")
    }
}
