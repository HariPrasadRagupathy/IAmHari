package com.iamhari

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform