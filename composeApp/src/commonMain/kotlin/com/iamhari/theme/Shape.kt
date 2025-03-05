package com.iamhari.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.material3.Shapes as Material3Shapes
import androidx.compose.ui.unit.dp

object AppShapes {
    val small = RoundedCornerShape(4.dp)
    val medium = RoundedCornerShape(8.dp)
    val large = RoundedCornerShape(16.dp)


    fun toMaterialShapes() = Shapes(
        small = small,
        medium = medium,
        large = large
    )

    fun toMaterial3Shapes() = Material3Shapes(
        small = small,
        medium = medium,
        large = large
    )
}