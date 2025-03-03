package com.iamhari.theme





import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

object AppTypography {
    val titleLarge = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold)
    val titleMedium = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium)
    val bodyMedium = TextStyle(fontSize = 16.sp)
    val bodySmall = TextStyle(fontSize = 14.sp, color = TextSecondaryColor)
}


/*
val AppTypography = Typography(
    titleLarge = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
    titleMedium = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium),
    bodyMedium = TextStyle(fontSize = 16.sp),
    bodySmall = TextStyle(fontSize = 14.sp, color = TextSecondaryColor)
)*/
