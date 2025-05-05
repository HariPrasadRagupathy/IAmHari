package com.iamhari.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CandidateIntroduction() {
    Row(
        Modifier.fillMaxWidth().height(400.dp),
        horizontalArrangement = Arrangement.spacedBy(100.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CandidateImage()
        CandidateDetails()
    }
}

@Preview
@Composable
private fun CandidateDetails() {
    Column(verticalArrangement = Arrangement.spacedBy(10.dp,Alignment.CenterVertically), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Hello, I am", style = MaterialTheme.typography.headlineSmall)
        Text("Hari Prasad", style = MaterialTheme.typography.displayLarge)
        Text("Senior Application Developer", style = MaterialTheme.typography.bodyLarge)
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            OutlinedButton(onClick = {}) { Text("Download CV") }
            Button(onClick = {}) { Text("Contact Info") }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(Icons.Default.Email, contentDescription = "")
        }
    }
}

@Composable
private fun CandidateImage() {
    Text("Image")
}
