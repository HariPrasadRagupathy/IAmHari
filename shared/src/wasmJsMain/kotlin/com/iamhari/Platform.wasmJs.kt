package com.iamhari

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun getPlatformType(): PlatformType  = PlatformType.Web