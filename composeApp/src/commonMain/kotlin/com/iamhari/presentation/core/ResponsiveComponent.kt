package com.iamhari.presentation.core

import androidx.compose.runtime.Composable
import com.iamhari.data.enums.ScreenSize
import com.iamhari.utiities.getScreenSizeCategory

interface ResponsiveComponent<T : ScreenStyle> {
    fun getStyle(screenSize: ScreenSize): T

    @Composable
    fun Compact(style: T)

    @Composable
    fun Medium(style: T)

    @Composable
    fun Expanded(style: T)

    @Composable
    fun Draw() {
        val screenSize = getScreenSizeCategory()
        val style = getStyle(screenSize)
        when (screenSize) {
            ScreenSize.Compact -> Compact(style)
            ScreenSize.Medium -> Medium(style)
            ScreenSize.Expanded -> Expanded(style)
        }
    }
}
