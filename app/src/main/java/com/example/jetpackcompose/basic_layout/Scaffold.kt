package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemo(modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Action Bar") },
                navigationIcon = {
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Color.LightGray,
                elevation = FloatingActionButtonDefaults.elevation(20.dp),
                contentColor = Color.Black,
                shape = ShapeDefaults.Medium
            ) {
                Icon(imageVector = Icons.Default.Call, contentDescription = null)
//
            }
        },
        containerColor = Color.Cyan,
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true, onClick = {},
                    icon = {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null)
                    },
                )
                NavigationBarItem(
                    selected = false, onClick = {},
                    icon = {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                    },
                )
                NavigationBarItem(
                    selected = false, onClick = {},
                    icon = {
                        Icon(imageVector = Icons.Default.AccountBox, contentDescription = null)
                    },
                )

            }


        }

    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text("Inside the scaffold", fontSize = 20.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ScaffoldPreview() {
    JetpackComposeTheme {
        ScaffoldDemo()
    }
}