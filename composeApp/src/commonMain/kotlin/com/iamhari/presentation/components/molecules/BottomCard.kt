package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomCard() {
    Box(modifier = Modifier.fillMaxWidth().height(75.dp).background(Color.White), contentAlignment = Alignment.Center){
        Text("This page is developed using Kotlin-MultiPlatform Wasm", style = MaterialTheme.typography.bodyLarge)
    }

}