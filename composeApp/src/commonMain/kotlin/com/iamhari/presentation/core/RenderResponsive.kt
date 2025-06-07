package com.iamhari.presentation.core

import androidx.compose.runtime.Composable
import com.iamhari.data.enums.ScreenSize
import com.iamhari.utiities.getScreenSizeCategory

@Composable
fun <T : ScreenStyle> RenderResponsive(
    component: ResponsiveComponent<T>
) {
    val screenSize = getScreenSizeCategory()
    val style = component.getStyle(screenSize)
    when (screenSize) {
        ScreenSize.Compact -> component.Compact(style)
        ScreenSize.Medium -> component.Medium(style)
        ScreenSize.Expanded -> component.Expanded(style)
    }
}
