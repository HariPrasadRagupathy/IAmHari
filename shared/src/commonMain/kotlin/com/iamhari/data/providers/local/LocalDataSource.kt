package com.iamhari.data.providers.local

import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.Skill
import com.iamhari.data.providers.local.constants.StaticData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface LocalDataSource {
    fun getProjectWorked(): Flow<List<ProjectWorked>>
    fun getSkills(): Flow<List<Skill>>
}

internal class LocalDataSourceImpl() : LocalDataSource{
    override fun getProjectWorked(): Flow<List<ProjectWorked>> {
        return flow {
            emit(StaticData.projectWorked)
        }
    }

    override fun getSkills(): Flow<List<Skill>> {
        return flow { emit(StaticData.skills) }
    }

}