package com.iamhari.presentation.components.templates

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import iamhari.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun CandidateIntroduction(
    onContactClick : () -> Unit = {}
) {
    FlowRow(
        Modifier.fillMaxSize().padding(vertical = 50.dp),
        horizontalArrangement = Arrangement.spacedBy(100.dp, Alignment.CenterHorizontally),
        verticalArrangement = Arrangement.Center
    ) {
        CandidateImage()
        CandidateDetails(onContactClick = {onContactClick()})
    }
}

@Preview
@Composable
private fun CandidateDetails(
    onContactClick : () -> Unit = {}
) {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp,Alignment.CenterVertically), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Hello, I am", style = MaterialTheme.typography.headlineSmall)
        Text("Hari Prasad", style = MaterialTheme.typography.displayLarge)
        Text("Senior Application Developer", style = MaterialTheme.typography.bodyLarge)
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            OutlinedButton(onClick = {}) { Text("Download CV") }
            Button(onClick = {onContactClick()}) { Text("Contact Info") }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(Icons.Default.Email, contentDescription = "")
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun CandidateImage() {
    AsyncImage(model = Res.getUri("drawable/mypic.jpg"), contentDescription = "", modifier = Modifier.size(400.dp).clip(
        CircleShape
    ).border(width = 5.dp, color = Color.LightGray, shape = CircleShape), contentScale = ContentScale.Crop)
}
