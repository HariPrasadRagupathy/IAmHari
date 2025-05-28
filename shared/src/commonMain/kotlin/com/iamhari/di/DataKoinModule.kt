package com.iamhari.di

import com.iamhari.data.providers.local.LocalDataSource
import com.iamhari.data.providers.local.LocalDataSourceImpl
import com.iamhari.data.providers.remote.RemoteDataSource
import com.iamhari.data.providers.remote.RemoteDataSourceImpl
import com.iamhari.repository.AppRepository
import com.iamhari.repository.AppRepositoryImpl
import com.iamhari.repository.ProfileRepository
import com.iamhari.repository.ProfileRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataKoinModule = module {
    single<LocalDataSource> { LocalDataSourceImpl() }
    single<RemoteDataSource> { RemoteDataSourceImpl() }
    single<ProfileRepository> { ProfileRepositoryImpl(get(), get()) }
    single<AppRepository> { AppRepositoryImpl(get()) }


    //singleOf(::RemoteDataSourceImpl)
    //singleOf(::ProfileRepositoryImpl)

}

val presentationKoinModule = module {

}