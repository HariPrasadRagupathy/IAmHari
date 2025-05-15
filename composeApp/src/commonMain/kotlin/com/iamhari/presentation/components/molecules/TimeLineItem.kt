package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TimeLineItem(
    year: String,
    title: String,
    companyOrSchool: String,
    description: String,
    icon: ImageVector,
    iconBackground: Color = Color(0xFFFFC107), // Yellow
    showLineAbove: Boolean = false,
    showLineBelow: Boolean = true
) {

    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.Top) {
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(100.dp).drawBehind {
                    val centerX = size.width / 2
                    val iconRadius = 20.dp.toPx() / 2

                    if (showLineAbove) {
                        drawLine(
                            color = Color(0xFFFFC107),
                            start = Offset(centerX, 0f),
                            end = Offset(centerX, -size.height / 2),
                            strokeWidth = 4f
                        )
                    }

                    if (showLineBelow) {
                        drawLine(
                            color = Color(0xFFFFC107),
                            start = Offset(centerX, 0f + iconRadius),
                            end = Offset(centerX, size.height),
                            strokeWidth = 4f
                        )
                    }
                })
        {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(iconBackground, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, null, tint = Color.White)
            }
        }
        Column(modifier = Modifier.padding(horizontal = 20.dp), verticalArrangement = Arrangement.Top) {
            Text(year, color = Color.LightGray, fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text(title, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Text(companyOrSchool, color = Color.Gray, fontWeight = FontWeight.Medium)
            Text(
                description,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 4.dp)
            )


        }
    }
}