package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForApplicantsScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Преимущества обучения в ЕНУ", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(12.dp))
        Text("ЕНУ — это ведущий университет Казахстана с высоким уровнем академической подготовки, современными лабораториями, международными программами и комфортной инфраструктурой. Преподавание ведут доктора наук и профессора с мировым опытом.")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Дополнительную информацию можно найти на официальном сайте: www.enu.kz")
    }
}
