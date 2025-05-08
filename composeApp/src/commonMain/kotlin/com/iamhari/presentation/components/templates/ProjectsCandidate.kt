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
import com.iamhari.data.ProjectWorked
import com.iamhari.presentation.components.molecules.ProjectCard
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ProjectsCandidate(projectWorked: List<ProjectWorked>) {
    Column(
        Modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Explore My", style = MaterialTheme.typography.bodyLarge)
        Text(
            "Projects",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(10.dp))
        ProjectDetails(projectWorked)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ProjectDetails(projectWorked: List<ProjectWorked>) {
    FlowRow(horizontalArrangement = Arrangement.spacedBy(30.dp), verticalArrangement = Arrangement.spacedBy(30.dp), maxItemsInEachRow = 3) {
        projectWorked.forEach {
            ProjectCard(it)
        }

    }
}