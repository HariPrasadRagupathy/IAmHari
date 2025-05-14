package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamhari.theme.AppFonts


@Composable
fun YearsOfExperience(
    modifier: Modifier,
    yearsText: String,
    bottomText: String,
    numberColor: Color = Color(0xFF000000),
    circleColor: Color = Color(0xFF4287F5)
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.wrapContentSize().padding(16.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Box(modifier = modifier.clip(CircleShape).background(circleColor).size(100.dp)) {

            }
            Text(
                yearsText,
                style = MaterialTheme.typography.displayLarge.copy(
                    fontSize = 150.sp,
                    fontFamily = AppFonts.PoppinsFontFamily()
                ),
                color = numberColor
            )
        }
        Text(buildAnnotatedString {

            withStyle(style = SpanStyle( fontSize = 25.sp)) {
                append("Years Of ")
            }
            append(" ")
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 25.sp,
                fontFamily = AppFonts.PoppinsFontFamily())) { append("Experience") }
        })

    }


}