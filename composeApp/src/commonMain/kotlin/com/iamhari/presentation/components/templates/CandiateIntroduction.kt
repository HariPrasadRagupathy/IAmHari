package com.iamhari.presentation.components.templates

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.outlinedButtonBorder
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
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.iamhari.theme.AppFonts
import iamhari.composeapp.generated.resources.Res
import io.ktor.http.CacheControl
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun CandidateIntroduction(
    onContactClick: () -> Unit = {}
) {
    FlowRow(
        Modifier.fillMaxSize().background(Color(0xFF4287F5))
            .padding(vertical = 50.dp, horizontal = 100.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.Center
    ) {
        CandidateImage()
        CandidateDetails(onContactClick = { onContactClick() })
    }
}

@Preview
@Composable
private fun CandidateDetails(
    onContactClick: () -> Unit = {}
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Bottom),
        horizontalAlignment = Alignment.End
    ) {
        Text(
            "Hello, I am",
            style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
        )
        Text(
            "Hari Prasad Ragupathy",
            style = MaterialTheme.typography.displayLarge.copy(fontFamily = AppFonts.PoppinsFontFamily())
        )
        Text(
            "Senior Application Developer",
            style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
        )
        Text(
            "Expert In",
            style = MaterialTheme.typography.headlineSmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
        )
        Text(
            "Jetpack Compose",
            style = MaterialTheme.typography.displaySmall.copy(fontFamily = AppFonts.PoppinsFontFamily())
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
            ) { Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {

                Text("Contact Info")
                Icon(Icons.Default.ArrowDropDown, contentDescription = "",tint = Color.White)
            } }
        }

    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun CandidateImage() {
    var isVisible by remember { mutableStateOf(false) }

    // Trigger after 2 seconds
    LaunchedEffect(Unit) {
        delay(200) // Delay in milliseconds
        isVisible = true
    }
    Box(Modifier.size(400.dp)) {
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
