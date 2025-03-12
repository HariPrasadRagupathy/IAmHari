package com.iamhari.presentation.features.profile.ui

//import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iamhari.data.enums.ScreenSize
import com.iamhari.theme.LocalSpacing
import com.iamhari.utiities.getScreenSizeCategory
import iamhari.composeapp.generated.resources.Res
import iamhari.composeapp.generated.resources.compose_multiplatform
import iamhari.composeapp.generated.resources.dev_productivity
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview



@Preview
@Composable
fun SplashScreen(navController: NavHostController) {




    Text("Data ${getScreenSizeCategory()}")
    when (getScreenSizeCategory()) {
        ScreenSize.Compact -> CompactSplashScreen()
        ScreenSize.Medium -> MediumSplashScreen()
        ScreenSize.Expanded -> ExpandedSplashScreen()
    }
    //Text("Data1")
}

@Composable
private fun CompactSplashScreen() {
    val spacing = LocalSpacing.current
    // Small screen UI
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFFB4D0F3), Color(0xFF88c4ec))
    )
    Box(
        modifier = Modifier.fillMaxSize().background(brush = gradient),
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.fillMaxSize().padding(spacing.XXL)) {

            Column(
                modifier = Modifier.fillMaxSize().padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painterResource(Res.drawable.dev_productivity), null,modifier = Modifier.padding(20.dp))
                Spacer(modifier = Modifier.height(10.dp))
                Text("I am", style = MaterialTheme.typography.h4)
                Spacer(modifier = Modifier.height(10.dp))
                Text("Hari Prasad", style = MaterialTheme.typography.h3, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Senior Application Developer",
                    style = MaterialTheme.typography.h5.copy(color = Color(0xFFc7c5c1)),
                    textAlign = TextAlign.Center
                )
            }

        }


    }
}

@Composable
private fun MediumSplashScreen() {
    // Tablet UI
    val spacing = LocalSpacing.current
    // Small screen UI
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFFB4D0F3), Color(0xFF88c4ec))
    )
    Box(
        modifier = Modifier.fillMaxSize().background(brush = gradient),
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.fillMaxSize().padding(spacing.XXL)) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize().padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(painterResource(Res.drawable.dev_productivity), null)

                }
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize().padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("I am", style = MaterialTheme.typography.h2)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Hari Prasad", style = MaterialTheme.typography.h1, textAlign = TextAlign.Center)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Senior Application Developer",
                        style = MaterialTheme.typography.h3.copy(color = Color(0xFFc7c5c1)),
                        textAlign = TextAlign.Center
                    )
                }
            }

        }


    }
}

@Composable
private fun ExpandedSplashScreen() {
    val spacing = LocalSpacing.current
    // Desktop/Wide UI
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFFB4D0F3), Color(0xFF88c4ec))
    )
    Box(
        modifier = Modifier.fillMaxSize().background(brush = gradient),
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.fillMaxSize().padding(spacing.XXL)) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize().padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(painterResource(Res.drawable.dev_productivity), null)

                }
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize().padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("I am", style = MaterialTheme.typography.h2)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Hari Prasad", style = MaterialTheme.typography.h1, textAlign = TextAlign.Center)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Senior Application Developer",
                        style = MaterialTheme.typography.h3.copy(color = Color(0xFFc7c5c1)),
                        textAlign = TextAlign.Center
                    )
                }
            }

        }


    }
}