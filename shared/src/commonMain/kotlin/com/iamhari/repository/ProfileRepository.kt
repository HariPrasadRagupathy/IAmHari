package com.iamhari.repository

import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.Skill
import com.iamhari.data.providers.local.LocalDataSource
import com.iamhari.data.providers.local.LocalDataSourceImpl
import com.iamhari.data.providers.remote.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

interface ProfileRepository {
    suspend fun getProjectWorked(): Flow<List<ProjectWorked>>
    suspend fun getSkills(): Flow<List<Skill>>
    suspend fun getAboutMe() : Flow<String>

}

class ProfileRepositoryImpl(
    val localDataSource: LocalDataSource,
    val remoteDataSource: RemoteDataSource
) : ProfileRepository {
    override suspend fun getProjectWorked(): Flow<List<ProjectWorked>> {
        return localDataSource.getProjectWorked()
    }

    override suspend fun getSkills(): Flow<List<Skill>> {
        return localDataSource.getSkills()
    }

    override suspend fun getAboutMe(): Flow<String> {
        return localDataSource.getAboutMe()
    }
}