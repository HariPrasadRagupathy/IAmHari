package com.iamhari.di

import com.iamhari.presentation.features.profile.vm.HomeScreenViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appKoinModule = module {
    viewModelOf(::HomeScreenViewModel)
}