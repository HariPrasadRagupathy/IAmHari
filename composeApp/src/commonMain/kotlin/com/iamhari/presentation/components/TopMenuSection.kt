package com.iamhari.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TopMenuSection(
    tabs: List<String> = listOf(),
    onSelect: ((String) -> Unit) = {}
) {
    var selectedTab by remember { mutableStateOf(tabs[0]) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(tabs[0], style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold), modifier = Modifier.clickable {
            selectedTab = tabs[0]
            onSelect.invoke(tabs[0])
        })

        Row(
            modifier = Modifier
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEachIndexed { index, tab ->
                if (index == 0) return@forEachIndexed
                Column(
                    modifier = Modifier.padding(horizontal = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ClickableText(
                        text = AnnotatedString(tab),
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                        onClick = {
                            selectedTab = tab
                            onSelect.invoke(tab)
                        },
                        /* style = MaterialTheme.typography.copy(
                             fontSize = 18.sp,
                             fontWeight = if (selectedTab == tab) FontWeight.Bold else FontWeight.Normal,
                             color = if (selectedTab == tab) Color.Gray else Color.Black
                         )*/
                    )
                    if (selectedTab == tab) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(50.dp)
                                .height(2.dp)
                                .background(Color.Gray)
                        )
                    }
                }
            }
        }
    }

}
