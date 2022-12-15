package com.example.vicuesoft.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MainScreen() {
    Column {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(208f)
                .padding(start = 8.dp, end = 9.dp, top = 107.dp)
        ) {

        }

        Button(onClick = {

        }) {
            Text(text = "TEXT")
        }

        Row(modifier = Modifier.background(color = Color.LightGray)
            .fillMaxHeight(),
        verticalAlignment = Alignment.Bottom) {

        }
    }
}