package com.example.test

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun TriangleBlock() {
    var baseText by remember { mutableStateOf("") }
    var heightText by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column {
        Text("Трикутник")
        OutlinedTextField(
            value = baseText,
            onValueChange = { baseText = it },
            label = { Text("Основа") }
        )
        OutlinedTextField(
            value = heightText,
            onValueChange = { heightText = it },
            label = { Text("Висота") }
        )
        Button(onClick = {
            val a = baseText.toDoubleOrNull()
            val h = heightText.toDoubleOrNull()
            result = if (a == null || h == null) "Помилка" else "Площа: " + a * h / 2
        }) {
            Text("Порахувати")
        }
        Text(result)
    }
}
