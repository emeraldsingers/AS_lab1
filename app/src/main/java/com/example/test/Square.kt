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
fun SquareBlock() {
    var side by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column {
        Text("Квадрат")
        OutlinedTextField(
            value = side,
            onValueChange = { side = it },
            label = { Text("Сторона") }
        )
        Button(onClick = {
            val a = side.toDoubleOrNull()
            result = if (a == null) "Помилка" else "Площа: " + a * a
        }) {
            Text("Порахувати")
        }
        Text(result)
    }
}
