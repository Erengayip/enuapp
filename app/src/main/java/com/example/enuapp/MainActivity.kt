package com.example.enuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.enuapp.ui.navigation.AppNavigation
import com.example.enuapp.ui.theme.ENUAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ENUAppTheme {
                // Точка входа в приложение через Navigation-компонент
                AppNavigation()
            }
        }
    }
}
