package com.iamhari.presentation.features.profile.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iamhari.data.ProjectWorked
import com.iamhari.data.Skill
import com.iamhari.presentation.components.templates.AboutCandidate
import com.iamhari.presentation.components.templates.CandidateIntroduction
import com.iamhari.presentation.components.templates.ContactCandidate
import com.iamhari.presentation.components.templates.ExperienceCandidate
import com.iamhari.presentation.components.templates.ProjectsCandidate
import com.iamhari.presentation.components.templates.SkillsCandidate
import com.iamhari.presentation.components.templates.TopMenuSection
import kotlinx.coroutines.launch


@Composable
fun HomeScreen(navController: NavHostController) {

    val tabs = listOf("Hari Prasad", "About", "Skills", "Experience", "Projects", "Contact")
    val skills = listOf(
        Skill("Kotlin", "drawable/skills/kotlin.png"),
        Skill("Jetpack Compose", "drawable/skills/jetpack_compose.png"),
        Skill("Flutter", "drawable/skills/flutter.png"),
        Skill("Dart", "drawable/skills/dart.png"),
        Skill("Git", "drawable/skills/git.png"),
        Skill("Kotlin Multiplatform", "drawable/skills/kmp.png"),
        Skill("Native Android", "https://picsum.photos/400/400")
    )
    val projectWorked = listOf(
        ProjectWorked("Jio Design System", "Jio", "",listOf("Kotlin", "Jetpack Compose", "Git")),
        ProjectWorked("Jio Design System", "Jio", "A resource-sharing app based on skills and locations,\n" +
                "recommended\n" +
                " by trusted networks. Allows sharing and finding contact\n" +
                "details of known\n" +
                " resources like electricians and plumbers.",listOf("Kotlin", "Jetpack Compose", "Git"))
    )

    var selectedTab by remember { mutableStateOf(tabs[0]) }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 50.dp)) {
        TopMenuSection(tabs, onSelect = { selected ->
            selectedTab = selected
            coroutineScope.launch {
                listState.animateScrollToItem(index = tabs.indexOf(selected))
            }
        }
        )
        LazyColumn(state = listState, verticalArrangement = Arrangement.spacedBy(30.dp)) {
            item {
                CandidateIntroduction(onContactClick = {
                    selectedTab = tabs[4]
                    coroutineScope.launch {
                        listState.animateScrollToItem(index = 4)
                    }
                })
            }
            item {
                AboutCandidate()
            }
            item {
                SkillsCandidate(skills)
            }
            item {
                ExperienceCandidate()
            }
            item {
                ProjectsCandidate(projectWorked)
            }
            item {
                ContactCandidate()
            }
        }
    }


}