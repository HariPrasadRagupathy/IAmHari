package com.iamhari.presentation.components.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.iamhari.data.Skill
import com.iamhari.presentation.components.molecules.SkillCard
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun SkillsCandidate(skills: List<Skill>) {
    Column (
        Modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("See My", style = MaterialTheme.typography.bodyLarge)
        Text("Skills", style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetails(skills)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AboutCandidateDetails(skills: List<Skill>) {
    FlowRow(horizontalArrangement = Arrangement.spacedBy(30.dp), verticalArrangement = Arrangement.spacedBy(30.dp)) {
        skills.forEach {
            SkillCard(it)
        }
    }
}


