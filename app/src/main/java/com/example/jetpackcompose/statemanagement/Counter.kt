package com.example.jetpackcompose.statemanagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


@Composable
fun Counter(
    count: Int,
    onCountButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {

//    var increment by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onCountButtonClick) {
            Text("increment: $count")
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun StateManagementExampleDemo() {
    JetpackComposeTheme {
        Counter(count = 5691, onCountButtonClick = {})
    }
}