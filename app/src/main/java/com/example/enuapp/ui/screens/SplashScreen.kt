package com.example.enuapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.enuapp.R

@Composable
fun SplashScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFBBDEFB)) // голубой фон
            .pointerInput(Unit) {
                detectHorizontalDragGestures { change: PointerInputChange, dragAmount: Float ->
                    if (dragAmount > 100f) {
                        navController.navigate("home") {
                            popUpTo("splash") { inclusive = true }
                        }
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        // Логотип ЕНУ (положите logo.png в res/drawable)
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "ENU Logo",
            modifier = Modifier.fillMaxSize(0.4f),
            contentScale = ContentScale.Fit
        )
    }
}
