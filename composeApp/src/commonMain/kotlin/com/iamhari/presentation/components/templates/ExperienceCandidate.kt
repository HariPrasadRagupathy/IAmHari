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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.iamhari.data.models.WorkExperience
import com.iamhari.presentation.components.molecules.TimeLineItem
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ExperienceCandidate(
    workExperienceList: List<WorkExperience> = listOf(),
    educationList: List<WorkExperience> = listOf()
) {
    Column(
        Modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("See My", style = MaterialTheme.typography.bodyLarge)
        Text(
            "Experience & Education",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetails(workExperienceList, educationList)
    }
}

@Composable
private fun AboutCandidateDetails(
    workExperienceList: List<WorkExperience> = listOf(),
    educationList: List<WorkExperience> = listOf()
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.padding(horizontal = 100.dp, vertical = 50.dp)
    ) {
        Column(modifier = Modifier.weight(0.5f), horizontalAlignment = Alignment.Start) {

            workExperienceList.forEach {
                TimeLineItem(
                    year = it.year,
                    title = it.title,
                    companyOrSchool = it.ventureName,
                    description = it.description,
                    icon = Icons.Default.MailOutline
                )
            }
        }

        Column(modifier = Modifier.weight(0.5f)) {
            educationList.forEachIndexed { index, it ->
                TimeLineItem(
                    year = it.year,
                    title = it.title,
                    companyOrSchool = it.ventureName,
                    description = it.description,
                    icon = Icons.Default.MailOutline,
                    showLineBelow = index == educationList.size - 1

                )
            }

        }
    }
}
