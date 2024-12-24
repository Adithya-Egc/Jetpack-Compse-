package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun RowColum(modifier: Modifier = Modifier) {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        horizontalArrangement = Arrangement.spacedBy(
            space = 20.dp,
            alignment = Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue)
                .weight(1f)
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Black)
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun RowColumnDemo() {
    JetpackComposeTheme {
        RowColum()
    }
}