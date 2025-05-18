package com.iamhari.data.models

data class ProjectWorked(
    val projectName: String = "",
    val clientName: String = "",
    val shortDescription : String = "",
    val imageUrl: String = "",
    val techStack: List<String> = listOf<String>()
)