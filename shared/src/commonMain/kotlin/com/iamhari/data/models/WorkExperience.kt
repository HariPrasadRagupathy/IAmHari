package com.iamhari.data.models


typealias ImageUrl = String

data class WorkExperience(
    val year : String,
    val title : String,
    val ventureName : String,
    val description : String,
    val icon : ImageUrl = ""
)
