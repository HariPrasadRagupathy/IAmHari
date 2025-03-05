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
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import iamhari.composeapp.generated.resources.Res
import iamhari.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SplashScreen(navController: NavHostController) {

    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFFB4D0F3), Color(0xFF88c4ec))
    )
    Box(
        modifier = Modifier.fillMaxSize().background(brush = gradient),
        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.fillMaxSize().padding(50.dp)) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(painterResource(Res.drawable.compose_multiplatform), null)

                }
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("I am", style = MaterialTheme.typography.h2)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Hari Prasad", style = MaterialTheme.typography.h1)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        "Senior Application Developer",
                        style = MaterialTheme.typography.h3.copy(color = Color(0xFF88c4ec))
                    )
                }
            }

        }


    }
}