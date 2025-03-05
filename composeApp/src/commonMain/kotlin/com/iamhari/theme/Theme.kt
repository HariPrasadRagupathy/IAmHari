package com.iamhari.theme

import androidx.compose.foundation.isSystemInDarkTheme


import androidx.compose.material.MaterialTheme
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.runtime.Composable
import com.iamhari.PlatformType
import com.iamhari.getPlatformType


@Composable
fun PortfolioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

  /*  val systemUiController = rememberSystemUiController()


    SideEffect {
        systemUiController.setSystemBarsColor(
            color = colorScheme.primary
        )
    }*/

    if (getPlatformType()==PlatformType.Web) {
        MaterialTheme(
            colors = if (darkTheme) DarkColors else LightColors,
            typography = AppTypography.toMaterialTypography(),
            shapes = AppShapes.toMaterialShapes(),
            content = content
        )
    } else {
        Material3Theme(
            colorScheme = colorScheme,
            typography = AppTypography.toMaterial3Typography(),
            shapes = AppShapes.toMaterial3Shapes(),
            content = content
        )
    }
}


