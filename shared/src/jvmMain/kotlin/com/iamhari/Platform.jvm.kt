package com.iamhari

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()
actual fun getPlatformType(): PlatformType {
    TODO("Not yet implemented")
}