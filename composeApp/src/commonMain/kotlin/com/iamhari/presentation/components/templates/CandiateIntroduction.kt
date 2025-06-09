package com.iamhari.presentation.components.templates

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.iamhari.data.enums.ScreenSize
import com.iamhari.presentation.components.molecules.TypewriterText
import com.iamhari.presentation.components.templates.CandidateDetailsRoot.CandidateDetailsStyle
import com.iamhari.presentation.components.templates.CandidateImageRoot.CandidateImageStyle
import com.iamhari.presentation.components.templates.CandidateScreen.CandidateStyle
import com.iamhari.presentation.core.ResponsiveComponent
import com.iamhari.presentation.core.ScreenStyle
import com.iamhari.theme.AppFonts
import iamhari.composeapp.generated.resources.Res
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun CandidateIntroduction(
    onContactClick: () -> Unit = {}
) {
    CandidateScreen(onContactClick).Draw()
}

@Preview
@Composable
private fun CandidateDetails(
    onContactClick: () -> Unit = {}
) {
    CandidateDetailsRoot(onContactClick).Draw()
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun CandidateImage() {
    CandidateImageRoot().Draw()
}


class CandidateDetailsRoot(val onContactClick: () -> Unit = {}) : ResponsiveComponent<CandidateDetailsStyle>{

    data class CandidateDetailsStyle(
        val padding: Dp=10.dp,
        val nameTextStyle : TextStyle,
        val horizontalAlignment: Alignment.Horizontal,
        val textAlign: TextAlign = TextAlign.End
    ): ScreenStyle
    
    @Composable
    override fun getStyle(screenSize: ScreenSize): CandidateDetailsStyle = when(screenSize){
        ScreenSize.Compact -> CandidateDetailsStyle(
            nameTextStyle = MaterialTheme.typography.titleMedium.copy(fontFamily = AppFonts.PoppinsFontFamily()),
            horizontalAlignment = Alignment.CenterHorizontally,
            textAlign = TextAlign.Center
        )
        ScreenSize.Medium -> CandidateDetailsStyle(
            nameTextStyle = MaterialTheme.typography.titleLarge.copy(fontFamily = AppFonts.PoppinsFontFamily()),
            horizontalAlignment = Alignment.CenterHorizontally,
            textAlign = TextAlign.Center
        )
        ScreenSize.Expanded -> CandidateDetailsStyle(
            nameTextStyle = MaterialTheme.typography.displayLarge.copy(fontFamily = AppFonts.PoppinsFontFamily()),
            horizontalAlignment = Alignment.End
        )
    }

    @Composable
    override fun Compact(style: CandidateDetailsStyle) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Bottom),
            horizontalAlignment = style.horizontalAlignment
        ) {
            Text(
                "Hello, I am",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            Text(
                "Hari Prasad Ragupathy",
                style = style.nameTextStyle,
                textAlign = style.textAlign
            )
            Text(
                "Senior Application Developer",
                style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily()),
                textAlign = style.textAlign
            )
            Text(
                "Expert In",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily()),
                textAlign = style.textAlign
            )
            TypewriterText(
                listOf(
                    "Jetpack Compose",
                    "Kotlin",
                    "Native Android",
                    "Kotlin MultiPlatform",
                    "Compose MultiPlatform",
                    "Git"
                )
            )
            Column(verticalArrangement = Arrangement.spacedBy(10.dp), horizontalAlignment = Alignment.CenterHorizontally)  {
                OutlinedButton(
                    border = BorderStroke(1.dp, Color.White),
                    onClick = {},
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                ) { Text("Download CV") }
                Button(
                    onClick = { onContactClick() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {

                        Text("Contact Info")
                        Icon(Icons.Default.ArrowDropDown, contentDescription = "", tint = Color.White)
                    }
                }
            }

        }
    }

    @Composable
    override fun Medium(style: CandidateDetailsStyle) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Bottom),
            horizontalAlignment = style.horizontalAlignment
        ) {
            Text(
                "Hello, I am",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            Text(
                "Hari Prasad Ragupathy",
                style = style.nameTextStyle
            )
            Text(
                "Senior Application Developer",
                style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            Text(
                "Expert In",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            TypewriterText(
                listOf(
                    "Jetpack Compose",
                    "Kotlin",
                    "Native Android",
                    "Kotlin MultiPlatform",
                    "Compose MultiPlatform",
                    "Git"
                )
            )
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                OutlinedButton(
                    border = BorderStroke(1.dp, Color.White),
                    onClick = {},
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                ) { Text("Download CV") }
                Button(
                    onClick = { onContactClick() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {

                        Text("Contact Info")
                        Icon(Icons.Default.ArrowDropDown, contentDescription = "", tint = Color.White)
                    }
                }
            }

        }
    }

    @Composable
    override fun Expanded(style: CandidateDetailsStyle) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Bottom),
            horizontalAlignment = style.horizontalAlignment
        ) {
            Text(
                "Hello, I am",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            Text(
                "Hari Prasad Ragupathy",
                style = style.nameTextStyle
            )
            Text(
                "Senior Application Developer",
                style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            Text(
                "Expert In",
                style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
            )
            TypewriterText(
                listOf(
                    "Jetpack Compose",
                    "Kotlin",
                    "Native Android",
                    "Kotlin MultiPlatform",
                    "Compose MultiPlatform",
                    "Git"
                )
            )
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                OutlinedButton(
                    border = BorderStroke(1.dp, Color.White),
                    onClick = {},
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                ) { Text("Download CV") }
                Button(
                    onClick = { onContactClick() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {

                        Text("Contact Info")
                        Icon(Icons.Default.ArrowDropDown, contentDescription = "", tint = Color.White)
                    }
                }
            }

        }
    }
    
}


class CandidateScreen(
    private val onContactClick: () -> Unit
) : ResponsiveComponent<CandidateStyle>
{

    data class CandidateStyle(
        val padding: Dp,
        val spacing: Dp,
        val verticalPadding: Dp = 50.dp,
        val horizontalPadding: Dp = 100.dp,
        val textAlign: TextAlign,
        val backgroundColor: Color = Color(0xFF4287F5)
    ) : ScreenStyle

    @Composable
    override fun getStyle(screenSize: ScreenSize): CandidateStyle = when (screenSize) {
        ScreenSize.Compact -> CandidateStyle(
            padding = 16.dp,
            spacing = 8.dp,
            horizontalPadding = 20.dp,
            verticalPadding = 10.dp,
            textAlign = TextAlign.Center
        )

        ScreenSize.Medium -> CandidateStyle(
            padding = 32.dp,
            spacing = 16.dp,
            textAlign = TextAlign.Center
        )

        ScreenSize.Expanded -> CandidateStyle(
            padding = 100.dp,
            spacing = 50.dp,
            textAlign = TextAlign.End
        )
    }

    @Composable
    override fun Compact(style: CandidateStyle) {
        Column(
            Modifier.fillMaxSize().background(style.backgroundColor)
                .padding(vertical = style.verticalPadding, horizontal = style.horizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CandidateImage()
            Spacer(Modifier.height(style.spacing))
            CandidateDetails(onContactClick)
        }
    }

    @Composable
    override fun Medium(style: CandidateStyle) {
        Column(
            Modifier.fillMaxSize().background(style.backgroundColor)
                .padding(vertical = style.verticalPadding, horizontal = style.horizontalPadding),
        ) {
            CandidateImage()
            Spacer(Modifier.height(style.spacing))
            CandidateDetails(onContactClick)
        }
    }

    @Composable
    override fun Expanded(style: CandidateStyle) {
        Row(
            Modifier.fillMaxSize().background(style.backgroundColor)
                .padding(vertical = style.verticalPadding, horizontal = style.horizontalPadding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CandidateImage()
            Spacer(Modifier.width(style.spacing))
            CandidateDetails(onContactClick)
        }
    }
}


class CandidateImageRoot() : ResponsiveComponent<CandidateImageStyle> {

    data class CandidateImageStyle(
        val imageSize: Dp
    ) : ScreenStyle

    @Composable
    override fun getStyle(screenSize: ScreenSize): CandidateImageStyle = when (screenSize) {
        ScreenSize.Compact -> CandidateImageStyle(
            imageSize = 200.dp
        )

        ScreenSize.Medium -> CandidateImageStyle(
            imageSize = 300.dp
        )

        ScreenSize.Expanded -> CandidateImageStyle(
            imageSize = 400.dp
        )
    }

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun Compact(style: CandidateImageStyle) {
        var isVisible by remember { mutableStateOf(false) }

        // Trigger after 2 seconds
        LaunchedEffect(Unit) {
            delay(200) // Delay in milliseconds
            isVisible = true
        }
        Box(Modifier.size(style.imageSize)) {
            AnimatedVisibility(
                visible = isVisible,
                enter = scaleIn(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = scaleOut()
            ) {
                AsyncImage(
                    model = Res.getUri("drawable/mypic.jpg"),
                    contentDescription = "",
                    modifier = Modifier.size(400.dp).clip(
                        CircleShape
                    ).border(width = 15.dp, color = Color.White, shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun Medium(style: CandidateImageStyle) {
        var isVisible by remember { mutableStateOf(false) }

        // Trigger after 2 seconds
        LaunchedEffect(Unit) {
            delay(200) // Delay in milliseconds
            isVisible = true
        }
        Box(Modifier.size(style.imageSize)) {
            AnimatedVisibility(
                visible = isVisible,
                enter = scaleIn(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = scaleOut()
            ) {
                AsyncImage(
                    model = Res.getUri("drawable/mypic.jpg"),
                    contentDescription = "",
                    modifier = Modifier.size(400.dp).clip(
                        CircleShape
                    ).border(width = 15.dp, color = Color.White, shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun Expanded(style: CandidateImageStyle) {
        var isVisible by remember { mutableStateOf(false) }

        // Trigger after 2 seconds
        LaunchedEffect(Unit) {
            delay(200) // Delay in milliseconds
            isVisible = true
        }
        Box(Modifier.size(style.imageSize)) {
            AnimatedVisibility(
                visible = isVisible,
                enter = scaleIn(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = scaleOut()
            ) {
                AsyncImage(
                    model = Res.getUri("drawable/mypic.jpg"),
                    contentDescription = "",
                    modifier = Modifier.size(400.dp).clip(
                        CircleShape
                    ).border(width = 15.dp, color = Color.White, shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }


}