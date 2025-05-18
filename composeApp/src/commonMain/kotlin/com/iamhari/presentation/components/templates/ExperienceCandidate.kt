package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
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
import com.iamhari.theme.AppFonts
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ExperienceCandidate(
    workExperienceList: List<WorkExperience> = listOf(),
    educationList: List<WorkExperience> = listOf()
) {
    Column(
        Modifier.fillMaxWidth().padding(vertical = 30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("See My", style = MaterialTheme.typography.bodyLarge)
        Text(
            "Experience",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(30.dp))
        AboutCandidateDetails(workExperienceList, educationList)
    }
}

@Composable
private fun AboutCandidateDetails(
    workExperienceList: List<WorkExperience> = listOf(),
    educationList: List<WorkExperience> = listOf()
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 100.dp, vertical = 50.dp)
            .border(width = 1.dp, color = Color(0xFFF5F5F5), shape = RoundedCornerShape(10.dp))
    ) {
        workExperienceList.forEach {
            Row(
                modifier = Modifier.fillMaxWidth().height(100.dp).padding(horizontal = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    it.year,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontFamily = AppFonts.PoppinsFontFamily()
                    )
                )
                Text(
                    it.title,
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        fontFamily = AppFonts.PoppinsFontFamily()
                    )
                )
                Text(
                    it.ventureName,
                    style = MaterialTheme.typography.bodyMedium.copy(fontFamily = AppFonts.PoppinsFontFamily())
                )
            }
            HorizontalDivider()
        }
    }
}
