package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.iamhari.data.models.Skill
import com.iamhari.presentation.components.molecules.SkillCard
import com.iamhari.presentation.features.profile.vm.HomeScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel


@Preview
@Composable
fun SkillsCandidate(viewModel: HomeScreenViewModel = koinViewModel<HomeScreenViewModel>()) {
    val skills by viewModel.skillSet.collectAsState()
    Column (
        Modifier.fillMaxWidth().background(Color(0xFFF5F5F5)).padding(vertical = 50.dp),
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


