package com.example.jetpackcompose.statemanagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


@Composable
fun StateHoistingDemo(
    counter: Int,
    onButtonCountIncrement: () -> Unit,
    onButtonCountReset: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Counter(
            counter,
            onButtonCountIncrement
        )
        Button(
            onClick = onButtonCountReset
        ) {
            Text(
                "Reset Counters"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StateHoistingDemoPreview() {
    JetpackComposeTheme {
        StateHoistingDemo(
            counter = 5304,
            onButtonCountIncrement = {},
            onButtonCountReset = {},
        )
    }
}