package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlin.random.Random


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyListDemo(modifier: Modifier = Modifier) {


    LazyRow(modifier = Modifier.fillMaxSize()) {

        stickyHeader {
            Text("Stick It")
        }

        items(100) { i ->
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color(Random.nextInt()))) {

            }
        }
    }



/*    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {
            Text(
                text = "Start From Here",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)

            )
        }

        items(100) { i ->
            Text("item: $i")
        }

        stickyHeader {
            Text(
                text = "STICKY HEADER!",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
                textAlign = TextAlign.Center
            )
        }

        items(100) { i ->
            Text("item: ${i + 100}")
        }

        item {
            Text(
                text = "reached to the end",
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
            )
        }
    }*/
}

@Preview(showBackground = true)
@Composable
private fun LazyListPreview() {
    JetpackComposeTheme {
        LazyListDemo()
    }
}