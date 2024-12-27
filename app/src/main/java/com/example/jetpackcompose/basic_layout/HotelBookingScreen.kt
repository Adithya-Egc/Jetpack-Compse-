package com.example.jetpackcompose.basic_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


val hotelBookingChips = listOf(
    "All",
    "Luxury",
    "Budget",
    "Family Friendly",
    "Pet Friendly",
    "Beachfront",
    "City Center",
    "Romantic",
)

private val offers = mapOf(
    R.drawable.bed to "2 Bed",
    R.drawable.breakfast to "Breakfast",
    R.drawable.cutlery to "Cutlery",
    R.drawable.pawprint to "Pet Friendly",
    R.drawable.serving_dish to "Dinner",
    R.drawable.snowflake to "Air Conditioning",
    R.drawable.television to "TV",
    R.drawable.wi_fi_icon to "Wifi",
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HotelBookingScreen(modifier: Modifier = Modifier) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box {
                Image(
                    painter = painterResource(R.drawable.living_room),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 300.dp),
                    contentScale = ContentScale.Crop
                )
                HotelBanner(
                    modifier = Modifier
                        .fillParentMaxWidth()
                        .align(Alignment.BottomEnd)
                )
            }
        }
        item {
            HorizontalDivider(modifier = Modifier.padding(8.dp))
            FlowRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                for (chip in hotelBookingChips) {
                    AssistChip(onClick = {}, label = {
                        Text(chip)
                    })
                }
            }
            HorizontalDivider(modifier = Modifier.padding(top = 8.dp))
        }

        item {
            Text(
                """
                Oh-My-Bash is an open source, community-driven framework for managing your BASH configuration. It comes bundled with a ton of helpful functions, helpers, plugins, themes, and a few things that make you shout...
            """.trimIndent(),
                modifier = Modifier.padding(16.dp),
                fontSize = 14.sp,
                textAlign = TextAlign.Justify
            )

            Text(
                "What we offer",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp
            )
        }

        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                items(offers.entries.toList()) { (drawableId, label) ->
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .background(Color.Gray.copy(alpha = 0.3f))
                            .padding(horizontal = 8.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(drawableId),
                            contentDescription = label,
                            modifier = Modifier.size(28.dp)
                        )
                        Text(
                            text = label,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
        item {

            Button(
                onClick = {},
                modifier = Modifier.widthIn(min = 300.dp, max = 400.dp).fillMaxWidth()
            ) {
                Text("Book Now")
            }

        }
    }
}

@Composable
fun HotelBanner(modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .background(Color.White.copy(alpha = 0.8f))
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom

    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Hotel New Grand",
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            IconText("Los Angles, California", icon = {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.DarkGray
                )
            })

            IconText("4.9 (14k reviews)", icon = {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color.Yellow
                )
            })
        }
        Text(text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            ) {
                append("$380/")
            }
            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp
                )
            ) {
                append("night")
            }
        })
    }
}

@Composable
fun IconText(
    text: String,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon()
        Text(
            text = text,
            fontSize = 14.sp
        )
    }
}


@Preview
@Composable
private fun HotelBookingScreenPreview() {
    JetpackComposeTheme {
        HotelBookingScreen()
    }
}

@Preview(device = Devices.NEXUS_10)
@Composable
private fun HotelBookingDesktopScreenPreview() {
    JetpackComposeTheme {
        HotelBookingScreen()
    }
}
