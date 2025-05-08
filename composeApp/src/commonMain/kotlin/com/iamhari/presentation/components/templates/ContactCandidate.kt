package com.iamhari.presentation.components.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ContactCandidate() {
    Column(
        Modifier.fillMaxWidth().height(400.dp).padding(vertical = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Find My", style = MaterialTheme.typography.bodyLarge)
        Text(
            "Contact",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetails()
    }
}

@Composable
private fun AboutCandidateDetails() {
    OutlinedCard(
        modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
        colors = CardDefaults.cardColors().copy(containerColor = Color.White)
    ) {
        Column(
            Modifier.padding(10.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedButton(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.Phone, contentDescription = "")
                    Text("+91 8861099488")
                }
            }


            OutlinedButton(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.Email, contentDescription = "")
                    Text("hariprasadragupathy@gmail.com")
                }
            }
            OutlinedButton(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.Home, contentDescription = "")
                    Text("WhatsApp")
                }
            }
            OutlinedButton(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(Icons.Default.ThumbUp, contentDescription = "")
                    Text("www.linkedin.com/in/hariprasadragupathy")
                }
            }
        }
    }
}