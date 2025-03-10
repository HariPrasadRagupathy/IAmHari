package com.iamhari.utiities
import androidx.compose.runtime.Composable
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.iamhari.data.enums.ScreenSize


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun getScreenSizeCategory(): ScreenSize {
    val windowSizeClass = calculateWindowSizeClass()

    return when(windowSizeClass.widthSizeClass){
        androidx.compose.material3.windowsizeclass.WindowWidthSizeClass.Compact -> ScreenSize.Compact
        androidx.compose.material3.windowsizeclass.WindowWidthSizeClass.Medium -> ScreenSize.Medium
        androidx.compose.material3.windowsizeclass.WindowWidthSizeClass.Expanded -> ScreenSize.Expanded
        else -> ScreenSize.Compact
    }

}
