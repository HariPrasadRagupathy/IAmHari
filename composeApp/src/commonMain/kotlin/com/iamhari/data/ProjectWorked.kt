package com.iamhari.data



data class ProjectWorked(
    val projectName: String = "",
    val clientName: String = "",
    val shortDescription : String = "",
    val techStack: List<String> = listOf<String>()
)
