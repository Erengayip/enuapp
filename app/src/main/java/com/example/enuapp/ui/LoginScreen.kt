package com.example.enuapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.enuapp.data.AppDatabase
import com.example.enuapp.data.AuthRepository
import com.example.enuapp.data.UserPreferences
import kotlinx.coroutines.launch
import com.example.enuapp.ui.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var errorMsg by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Вход", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))

        Button(
            onClick = {
                scope.launch {
                    val repo = AuthRepository(
                        AppDatabase.getDatabase(context).userDao()
                    )
                    val success = repo.login(email, password)
                    if (success) {
                        // сохраняем username для автологина
                        UserPreferences(context).saveUsername(email)
                        // идём на Home и удаляем Login из бэкстека
                        navController.navigate(Screen.Home.route) {
                            popUpTo(Screen.Login.route) { inclusive = true }
                        }
                    } else {
                        errorMsg = "Неверный логин или пароль"
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Войти")
        }

        if (errorMsg.isNotEmpty()) {
            Spacer(Modifier.height(8.dp))
            Text(errorMsg, color = MaterialTheme.colorScheme.error)
        }

        Spacer(Modifier.height(16.dp))
        TextButton(onClick = {
            navController.navigate(Screen.Register.route)
        }) {
            Text("Нет аккаунта? Зарегистрироваться")
        }
    }
}
