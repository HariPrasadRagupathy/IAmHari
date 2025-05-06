package com.iamhari.presentation.features.profile.ui

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
import com.iamhari.presentation.components.templates.AboutCandidate
import com.iamhari.presentation.components.templates.CandidateIntroduction
import com.iamhari.presentation.components.templates.ContactCandidate
import com.iamhari.presentation.components.templates.ExperienceCandidate
import com.iamhari.presentation.components.templates.ProjectsCandidate
import com.iamhari.presentation.components.templates.TopMenuSection
import kotlinx.coroutines.launch


@Composable
fun HomeScreen(navController: NavHostController) {

    val tabs = listOf("Hari Prasad","About", "Experience", "Projects", "Contact")
    var selectedTab by remember { mutableStateOf(tabs[0]) }
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 20.dp)) {
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
                ExperienceCandidate()
            }
            item {
                ProjectsCandidate()
            }
            item {
                ContactCandidate()
            }
        }
    }


}