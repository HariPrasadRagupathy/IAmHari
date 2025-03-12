package com.iamhari.theme



import androidx.compose.material.Shapes
import androidx.compose.ui.unit.Dp
import androidx.compose.material3.Shapes as Material3Shapes
import androidx.compose.ui.unit.dp

object AppSpacing {
    val small = 4.dp
    val medium = 8.dp
    val large = 16.dp

}

interface Spacing {
    val XXS: Dp
    val XS: Dp
    val S: Dp
    val M: Dp
    val L: Dp
    val XL: Dp
    val XXL: Dp
}



object CompactSpacing : Spacing {
    override val XXS = 2.dp
    override val XS = 4.dp
    override val S = 8.dp
    override val M = 12.dp
    override val L = 16.dp
    override val XL = 24.dp
    override val XXL = 32.dp
}

object MediumSpacing : Spacing {
    override val XXS = 4.dp
    override val XS = 8.dp
    override val S = 12.dp
    override val M = 16.dp
    override val L = 24.dp
    override val XL = 32.dp
    override val XXL = 40.dp
}

object ExpandedSpacing : Spacing {
    override val XXS = 6.dp
    override val XS = 12.dp
    override val S = 16.dp
    override val M = 24.dp
    override val L = 32.dp
    override val XL = 40.dp
    override val XXL = 48.dp
}

