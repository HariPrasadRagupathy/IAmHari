package com.iamhari.theme





import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.material3.Typography as Material3Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import org.jetbrains.compose.resources.Font
import iamhari.composeapp.generated.resources.poppins
import iamhari.composeapp.generated.resources.Res
import iamhari.composeapp.generated.resources.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

object AppFonts{

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun PoppinsFontFamily() = FontFamily(

        Font(Res.font.Poppins_Thin, weight = FontWeight.Light),
        Font(Res.font.Poppins_Regular, weight = FontWeight.Normal),
        Font(Res.font.Poppins_Medium, weight = FontWeight.Medium),
       // Font(Res.font.Poppins_Bold, weight = FontWeight.SemiBold),
        Font(Res.font.Poppins_Bold, weight = FontWeight.Bold),
        Font(Res.font.Poppins_Thin, weight = FontWeight.Thin))

}

object AppTypography {
    val titleLarge = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold)
    val titleMedium = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium)
    val bodyMedium = TextStyle(fontSize = 16.sp)
    val bodySmall = TextStyle(fontSize = 14.sp, color = TextSecondaryColor)

    fun toMaterialTypography() = Typography(
        h5 = titleLarge,
        h6 = titleMedium,
        body1 = bodyMedium,
        body2 = bodySmall
    )

    fun toMaterial3Typography() = Material3Typography(
        titleLarge = titleLarge,
        titleMedium = titleMedium,
        bodyMedium = bodyMedium,
        bodySmall = bodySmall
    )

}


/*
val AppTypography = Typography(
    titleLarge = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
    titleMedium = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Medium),
    bodyMedium = TextStyle(fontSize = 16.sp),
    bodySmall = TextStyle(fontSize = 14.sp, color = TextSecondaryColor)
)*/

interface FontSize {
    val XXS: TextUnit
    val XS: TextUnit
    val S: TextUnit
    val M: TextUnit
    val L: TextUnit
    val XL: TextUnit
    val XXL: TextUnit
}

object CompactFontSize : FontSize {
    override val XXS = 6.sp
    override val XS = 8.sp
    override val S = 10.sp
    override val M = 12.sp
    override val L = 14.sp
    override val XL = 16.sp
    override val XXL = 18.sp
}

object MediumFontSize : FontSize {
    override val XXS = 8.sp
    override val XS = 10.sp
    override val S = 12.sp
    override val M = 14.sp
    override val L = 16.sp
    override val XL = 18.sp
    override val XXL = 20.sp
}

object ExpandedFontSize : FontSize {
    override val XXS = 10.sp
    override val XS = 12.sp
    override val S = 14.sp
    override val M = 16.sp
    override val L = 18.sp
    override val XL = 20.sp
    override val XXL = 22.sp
}

/*interface AppTypography{

}*/


