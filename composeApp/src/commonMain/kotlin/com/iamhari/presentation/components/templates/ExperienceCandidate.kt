package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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
fun ExperienceCandidate() {
    Column (
        Modifier.fillMaxWidth().height(1000.dp).padding(vertical = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("See My", style = MaterialTheme.typography.bodyLarge)
        Text("Experience", style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetails()
    }
}

@Composable
private fun AboutCandidateDetails() {
    YearTimeline(
        years = listOf("November 2010 - April 2014", "October 2014 - April 2017", "June 2017 - October 2018", "October 2018 - February 2020", "February 2020 - August 2022", "August 2022 - Present")
    )
}

@Composable
fun YearTimeline(years: List<String>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        itemsIndexed(years) { index, year ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                // Left: Year and Dot
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    Text(year, fontWeight = FontWeight.Bold)
                    Box(
                        modifier = Modifier
                            .size(12.dp)
                            .background(Color.Black, shape = CircleShape)
                    )
                    if (index != years.lastIndex) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Box(
                            modifier = Modifier
                                .width(2.dp)
                                .height(60.dp)
                                .background(Color.Gray)
                        )
                    }
                }

                // Right: Card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Text(
                        text = "Details for $year",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
