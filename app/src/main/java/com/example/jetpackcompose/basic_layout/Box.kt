package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


//on top of each other
//alignment on main axis
@Composable
fun BoxComposable(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.size(200.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(R.drawable.ic_android),
            contentDescription = ""
        )
        Text(
            "I'm android", fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}


@Preview(
    showBackground = true,
)
@Composable
private fun BoxComposablePreview() {
    JetpackComposeTheme {
        BoxComposable()
    }
}