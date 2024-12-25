package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


@Composable
fun WindowClassDemo(modifier: Modifier = Modifier.fillMaxSize()) {

    val windowClass = currentWindowAdaptiveInfo().windowSizeClass

    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (windowClass.windowWidthSizeClass) {

                WindowWidthSizeClass.COMPACT -> {
                    Text("Compat")
                }

                WindowWidthSizeClass.MEDIUM -> {
                    Text("Medium")
                }

                WindowWidthSizeClass.EXPANDED -> {
                    Text("Expanded")
                }
            }
        }

    }

 /*   when (windowClass.windowHeightSizeClass) {
        WindowHeightSizeClass.COMPACT -> {
            Text("Compat Height")
        }

        WindowHeightSizeClass.MEDIUM -> {
            Text("Medium Height")
        }

        WindowHeightSizeClass.EXPANDED -> {
            Text("Expanded Height")
        }
    }*/

}

@PreviewScreenSizes
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun WindowClassPreview() {
    JetpackComposeTheme {
        WindowClassDemo()
    }
}