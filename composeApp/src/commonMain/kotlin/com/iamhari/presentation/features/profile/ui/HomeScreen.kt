package com.iamhari.presentation.features.profile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.Skill
import com.iamhari.data.providers.local.constants.StaticData
import com.iamhari.presentation.components.molecules.BottomCard
import com.iamhari.presentation.components.templates.AboutCandidate
import com.iamhari.presentation.components.templates.CandidateIntroduction
import com.iamhari.presentation.components.templates.ContactCandidate
import com.iamhari.presentation.components.templates.ExperienceCandidate
import com.iamhari.presentation.components.templates.ProjectsCandidate
import com.iamhari.presentation.components.templates.SkillsCandidate
import com.iamhari.presentation.components.templates.TopMenuSection
import com.iamhari.presentation.features.profile.vm.HomeScreenViewModel
import kotlinx.coroutines.launch
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeScreenViewModel = koinViewModel<HomeScreenViewModel>()) {

    val tabs = listOf("Hari Prasad", "About", "Skills", "Experience", "Projects", "Contact")



    var selectedTab by remember { mutableStateOf(tabs[0]) }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Column(modifier = Modifier.fillMaxWidth()) {
        TopMenuSection(tabs, onSelect = { selected ->
            selectedTab = selected
            coroutineScope.launch {
                listState.animateScrollToItem(index = tabs.indexOf(selected))
            }
        }
        )
        LazyColumn(state = listState) {
            item {
                CandidateIntroduction(onContactClick = {
                    selectedTab = tabs[5]
                    coroutineScope.launch {
                        listState.animateScrollToItem(index = 5)
                    }
                })
            }
            item {
                AboutCandidate()
            }
            item {
                SkillsCandidate()
            }
            item {
                ExperienceCandidate(StaticData.workExperience, StaticData.educationExperience)
            }
            item {
                ProjectsCandidate()
            }
            item {
                ContactCandidate()
            }
            item { BottomCard() }

        }

    }


}