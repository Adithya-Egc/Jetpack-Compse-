package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlin.random.Random
import kotlin.random.nextInt


@Composable
fun LazyGridDemo(modifier: Modifier = Modifier) {
    /*
        LazyVerticalGrid(modifier = Modifier.fillMaxSize(), columns = GridCells.Fixed(5)) {

            items(1000) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color(Random.nextInt()))
                )
            }
        }*/

    /*LazyHorizontalGrid(modifier = Modifier.fillMaxSize(), rows = GridCells.Fixed(5)) {

        items(1000) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(Random.nextInt()))
            )
        }
    }*/

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(6),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 20.dp,

    ) {
        items(100) {
            Box(
                modifier = Modifier
                    .height(
                        height = Random.nextInt(
                            1..200
                        ).dp
                    )
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(Random.nextInt()))
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun LazyGridPreview() {
    JetpackComposeTheme {
        LazyGridDemo()
    }
}