package com.iamhari.utiities

import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.DpSize
import com.iamhari.data.enums.ScreenSize

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun currentWindowSizeClass(): WindowSizeClass {
    val containerSize = LocalWindowInfo.current.containerSize
    val size = with(LocalDensity.current) {
        DpSize(containerSize.width.toDp(), containerSize.height.toDp())
    }
    return WindowSizeClass.calculateFromSize(size)
}

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun getScreenSizeCategory(): ScreenSize {
    return when (currentWindowSizeClass().widthSizeClass) {
        WindowWidthSizeClass.Compact -> ScreenSize.Compact
        WindowWidthSizeClass.Medium -> ScreenSize.Medium
        WindowWidthSizeClass.Expanded -> ScreenSize.Expanded
        else -> ScreenSize.Compact
    }
}

expect fun openUrl(url: String)
