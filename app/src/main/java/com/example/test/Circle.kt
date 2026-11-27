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
fun CircleBlock() {
    var radius by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column {
        Text("Коло")
        OutlinedTextField(
            value = radius,
            onValueChange = { radius = it },
            label = { Text("Радіус") }
        )
        Button(onClick = {
            val r = radius.toDoubleOrNull()
            result = if (r == null) "Помилка" else "Площа: " + Math.PI * r * r
        }) {
            Text("Порахувати")
        }
        Text(result)
    }
}
