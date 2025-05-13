package com.iamhari.presentation.components.molecules

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.iamhari.theme.AppFonts
import kotlinx.coroutines.delay

@Composable
fun TypewriterText(
    texts: List<String>,
    typingSpeed: Long = 100L,
    deletingSpeed: Long = 80L,
    pauseTime: Long = 1000L
) {
    var currentTextIndex by remember { mutableStateOf(0) }
    var visibleText by remember { mutableStateOf("") }
    var isDeleting by remember { mutableStateOf(false) }
    var isVisible by remember { mutableStateOf(true) }

    // Cursor blink state
    var showCursor by remember { mutableStateOf(true) }

    // Cursor blinking effect
    LaunchedEffect(Unit) {
        while (true) {
            showCursor = !showCursor
            delay(300)
        }
    }

    LaunchedEffect(currentTextIndex, visibleText, isDeleting) {
        val fullText = texts[currentTextIndex]

        if (isDeleting) {
            if (visibleText.isNotEmpty()) {
                delay(deletingSpeed)
                visibleText = visibleText.dropLast(1)
            } else {
                isVisible = false
                delay(300) // Wait for fade out
                currentTextIndex = (currentTextIndex + 1) % texts.size
                isDeleting = false
            }
        } else {
            if (visibleText.length < fullText.length) {
                if (visibleText.isEmpty()) isVisible = true // Trigger fade in
                delay(typingSpeed)
                visibleText = fullText.substring(0, visibleText.length + 1)
            } else {
                delay(pauseTime)
                isDeleting = true
            }
        }
    }

    AnimatedVisibility(
        visible = isVisible,
        enter = fadeIn(animationSpec = tween(500)),
        exit = fadeOut(animationSpec = tween(300))
    ) {
        Text(
            text = visibleText + if (showCursor) "|" else " ",
            style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily()),
        )
    }
}
