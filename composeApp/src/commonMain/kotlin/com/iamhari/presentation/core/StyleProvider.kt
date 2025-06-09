package com.iamhari.presentation.core

import com.iamhari.data.enums.ScreenSize

interface StyleProvider<T : ScreenStyle> {
    fun getStyle(screenSize: ScreenSize): T
}