package com.iamhari.presentation.components.templates

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iamhari.data.enums.ScreenSize
import com.iamhari.presentation.components.molecules.FullDialog
import com.iamhari.presentation.core.ResponsiveComponent
import com.iamhari.presentation.core.ScreenStyle
import com.iamhari.theme.AppFonts
import com.iamhari.utiities.openUrl
import io.ktor.http.CacheControl

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TopMenuSection(
    tabs: List<String> = listOf(),
    onSelect: ((String) -> Unit) = {}
) {
    TopMenuSection(tabs = tabs, onSelect = onSelect, onContactClick = {}).Draw()

}


class TopMenuSection(
    val tabs: List<String> = listOf(),
    val onSelect: ((String) -> Unit) = {},
    val onContactClick: () -> Unit = {}
) : ResponsiveComponent<TopMenuSection.Style> {
    data class Style(
        val menuHorizontalPadding: Dp = 100.dp,
        val menuVerticalPadding: Dp = 20.dp,
        val contactSectionVisibility: Boolean = true
    ) : ScreenStyle

    @Composable
    override fun getStyle(screenSize: ScreenSize): Style = when (screenSize) {
        ScreenSize.Compact -> Style(contactSectionVisibility = false, menuHorizontalPadding = 20.dp)
        ScreenSize.Medium -> Style(contactSectionVisibility = false, menuHorizontalPadding = 50.dp)
        ScreenSize.Expanded -> Style(contactSectionVisibility = true)
    }

    @Composable
    override fun Compact(style: Style) {
        Common(tabs, onSelect, style)
    }

    @Composable
    override fun Medium(style: Style) {
        Common(tabs, onSelect, style)
    }

    @Composable
    override fun Expanded(style: Style) {
        Common(tabs, onSelect, style)
    }

    @Composable
    private fun Common(
        tabs: List<String> = listOf(),
        onSelect: ((String) -> Unit) = {},
        style: Style
    ) {
        var selectedTab by remember { mutableStateOf(tabs[0]) }
        var showDialog by remember { mutableStateOf(false) }

        FullDialog(
            showDialogue = showDialog,
            menuItems = tabs,
            onItemClick = {
                onSelect(it)
                selectedTab = it
                showDialog = false
            },
            currentSelectedItem = selectedTab,
            onDismiss = { },
            onDismissRequest = { showDialog = false })

        Surface {
            Row(
                modifier = Modifier.fillMaxWidth().background(Color(0xFF4287F5))
                    .padding(horizontal = style.menuHorizontalPadding, vertical = style.menuVerticalPadding),
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


                Row(
                    modifier = Modifier.height(50.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    AnimatedVisibility(visible = style.contactSectionVisibility) {
                        Row {
                            Row(
                                modifier = Modifier.clickable { openUrl("tel:918861099488") },
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
                                modifier = Modifier.clickable { openUrl("mailto:hariprasadragupathy@gmail.com") },
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
                        }
                    }
                    IconButton(onClick = {
                        showDialog = true
                    }) {
                        Icon(
                            Icons.Default.Menu,
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }


                }


            }

        }
    }


}
