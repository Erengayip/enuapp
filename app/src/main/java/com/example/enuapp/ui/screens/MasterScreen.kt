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
fun MasterScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Магистратура", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(12.dp))
        Text("Магистратура — это вторая ступень высшего образования, позволяющая углубленно изучить специальность и проводить научные исследования. Программа длится 1–2 года и готовит специалистов высокого уровня.")
    }
}
