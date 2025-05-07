package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import org.jetbrains.compose.ui.tooling.preview.Preview



@Preview
@Composable
fun AboutCandidate() {
    Column (
        Modifier.fillMaxWidth().padding(vertical = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Know", style = MaterialTheme.typography.bodyLarge)
        Text("About Me", style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetails()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AboutCandidateDetails() {
    Card(modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp), elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
        FlowRow {
            Text("Senior Mobile Application Developer with 10+ years of experience in mobile application development, contributing to a total of 14+ years in IT programming technologies. Proficient in developing mobile applications using Kotlin, Jetpack Compose, Flutter, and Dart. Experienced in creating and customizing UI components through a Design System, interpreting REST APIs, ensuring security, and integrating local databases for data persistence. Skilled in managing applications with a well-defined layered architecture and proficient in Git and CI/CD tools. Committed to clean code practices and delivering innovative mobile applications.",
                style = TextStyle.Default.copy(fontStyle = FontStyle.Italic, fontSize = 18.sp, lineHeight = 30.sp),
                modifier = Modifier.background(Color.White).padding(40.dp).weight(0.6f).align(Alignment.CenterVertically))
            AsyncImage(model = "https://picsum.photos/id/9/400/400", contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.size(400.dp).padding(20.dp))
        }
    }

}