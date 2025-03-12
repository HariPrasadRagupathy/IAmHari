package com.iamhari.theme

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.isSystemInDarkTheme


import androidx.compose.material.MaterialTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import com.iamhari.PlatformType
import com.iamhari.data.enums.ScreenSize
import com.iamhari.getPlatformType

val LocalSpacing = compositionLocalOf<Spacing> { MediumSpacing } // Default value


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun PortfolioTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    windowSizeClass: WindowSizeClass = calculateWindowSizeClass(),
    content: @Composable () -> Unit
) {
    val dimensionVariant = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> ScreenSize.Compact
        WindowWidthSizeClass.Medium -> ScreenSize.Medium
        WindowWidthSizeClass.Expanded -> ScreenSize.Expanded
        else -> ScreenSize.Compact
    }

    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme



    /*  val systemUiController = rememberSystemUiController()


      SideEffect {
          systemUiController.setSystemBarsColor(
              color = colorScheme.primary
          )
      }*/

    val spacing: Spacing = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> CompactSpacing
        WindowWidthSizeClass.Medium -> MediumSpacing
        WindowWidthSizeClass.Expanded -> ExpandedSpacing
        else -> MediumSpacing
    }




    CompositionLocalProvider(
        LocalSpacing provides spacing
    ) {
        if (getPlatformType() == PlatformType.Web) {
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
}


