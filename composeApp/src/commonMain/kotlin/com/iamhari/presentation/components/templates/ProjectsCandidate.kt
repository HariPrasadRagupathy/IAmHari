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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.iamhari.data.models.ProjectWorked
import com.iamhari.presentation.components.molecules.ProjectCard
import com.iamhari.presentation.features.profile.vm.HomeScreenViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel


@Preview
@Composable
fun ProjectsCandidate(viewModel: HomeScreenViewModel = koinViewModel<HomeScreenViewModel>()) {
    val projectWorked by viewModel.projectWorked.collectAsState()
    Column(
        Modifier.fillMaxWidth().background(color =  Color(0xFFF5F5F5)).padding(vertical = 30.dp),
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