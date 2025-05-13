package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun FullDialog(
    showDialogue: Boolean = true,
    onDismiss: () -> Unit,
    menuItems: List<String> = listOf(),
    onItemClick: (String) -> Unit = {},
    currentSelectedItem: String = "",
    onDismissRequest: () -> Unit,
) {
    if (showDialogue)
        Dialog(onDismissRequest = onDismissRequest) {
            Box(
                modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.8f))
                    .clickable { onDismiss() }, contentAlignment = Alignment.Center
            ) {

                Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                    menuItems.forEach { item ->
                        Text(
                            text = item,
                            modifier = Modifier.clickable {
                                onItemClick(item)
                            }.padding(8.dp),
                            color = Color.White,
                            fontSize = if (currentSelectedItem == item) 24.sp else 20.sp,
                            fontWeight = if (currentSelectedItem == item) FontWeight.Bold else FontWeight.Normal
                        )
                    }
                }

            }
        }
}