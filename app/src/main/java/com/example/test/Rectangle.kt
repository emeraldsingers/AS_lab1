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
fun RectangleBlock() {
    var width by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column {
        Text("Прямокутник")
        OutlinedTextField(
            value = width,
            onValueChange = { width = it },
            label = { Text("Ширина") }
        )
        OutlinedTextField(
            value = height,
            onValueChange = { height = it },
            label = { Text("Висота") }
        )
        Button(onClick = {
            val a = width.toDoubleOrNull()
            val b = height.toDoubleOrNull()
            result = if (a == null || b == null) "Помилка" else "Площа: " + a * b
        }) {
            Text("Порахувати")
        }
        Text(result)
    }
}
