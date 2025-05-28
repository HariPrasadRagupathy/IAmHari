package com.iamhari.repository

interface AppRepository : ProfileRepository

class AppRepositoryImpl(
    private val profileRepository: ProfileRepository
) : AppRepository, ProfileRepository by profileRepository