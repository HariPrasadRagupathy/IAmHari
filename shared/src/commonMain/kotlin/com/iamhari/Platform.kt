package com.iamhari


enum class PlatformType {
    Android, iOS, Desktop, Web, Native
}

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun getPlatformType() : PlatformType

