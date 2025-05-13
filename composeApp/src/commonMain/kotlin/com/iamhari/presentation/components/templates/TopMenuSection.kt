package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.iamhari.theme.AppFonts

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TopMenuSection(
    tabs: List<String> = listOf(),
    onSelect: ((String) -> Unit) = {}
) {
    var selectedTab by remember { mutableStateOf(tabs[0]) }

    Surface {
        Row(
            modifier = Modifier.fillMaxWidth().background(Color(0xFF4287F5))
                .padding(horizontal = 100.dp, vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                tabs[0],
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {
                    selectedTab = tabs[0]
                    onSelect.invoke(tabs[0])
                })

            FlowRow(
                modifier = Modifier.height(50.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.Phone, contentDescription = "")
                    Text(
                        "(+91)88610-99488",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontFamily = AppFonts.PoppinsFontFamily(),
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.Email, contentDescription = "")
                    Text(
                        "hariprasadragupathy@gmail.com",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontFamily = AppFonts.PoppinsFontFamily(),
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                }

            }


        }

    }

    /* Row(
         modifier = Modifier.fillMaxWidth().background(Color(0xFF4287F5)).padding(horizontal = 50.dp),
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.SpaceBetween
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
                         *//* style = MaterialTheme.typography.copy(
                             fontSize = 18.sp,
                             fontWeight = if (selectedTab == tab) FontWeight.Bold else FontWeight.Normal,
                             color = if (selectedTab == tab) Color.Gray else Color.Black
                         )*//*
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
    }*/

}
