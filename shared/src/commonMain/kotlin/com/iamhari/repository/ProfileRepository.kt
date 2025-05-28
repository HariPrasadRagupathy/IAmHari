package com.iamhari.repository

import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.providers.local.LocalDataSource
import com.iamhari.data.providers.local.LocalDataSourceImpl
import com.iamhari.data.providers.remote.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

interface ProfileRepository {
    suspend fun getProjectWorked(): Flow<List<ProjectWorked>>

}

class ProfileRepositoryImpl(
    val localDataSource: LocalDataSource,
    val remoteDataSource: RemoteDataSource
) : ProfileRepository {
    override suspend fun getProjectWorked(): Flow<List<ProjectWorked>> {
        return localDataSource.getProjectWorked()
    }
}