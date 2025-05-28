package com.iamhari.presentation.features.profile.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.Skill
import com.iamhari.repository.AppRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class HomeScreenViewModel(val appRepository: AppRepository) : ViewModel() {

    private val _projectWorked = MutableStateFlow<List<ProjectWorked>>(emptyList<ProjectWorked>())
    val projectWorked: StateFlow<List<ProjectWorked>> = _projectWorked

    private val _skillsSet = MutableStateFlow<List<Skill>>(emptyList<Skill>())
    val skillSet: StateFlow<List<Skill>> = _skillsSet

    init {
        viewModelScope.launch {
            appRepository.getProjectWorked().collect { it ->
                _projectWorked.value = it
            }
            appRepository.getSkills().collect {
                _skillsSet.value = it
            }
        }
    }


}