package com.example.enuapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.clickable

@Composable
fun FacultyInfoScreen(title: String, departments: List<Pair<String, String>>, navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(title, fontSize = 22.sp)
        androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(16.dp))
        departments.forEach { (deptName, route) ->
            Button(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                onClick = { navController.navigate(route) }
            ) {
                Text(deptName)
            }
        }
    }
}
