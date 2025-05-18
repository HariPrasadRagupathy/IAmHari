package com.iamhari.data.providers.local.constants

import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.WorkExperience

object StaticData {

    val workExperience = listOf<WorkExperience>(
        WorkExperience(
            year = "2022-Present",
            title = "Senior Mobile Application Developer",
            ventureName = "Teksoft Labs Pvt Ltd",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        ),
        WorkExperience(
            year = "2020-2022",
            title = "Senior Mobile Application Developer",
            ventureName = "Clearone Innovations India Pvt Ltd",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        ),
        WorkExperience(
            year = "2018-2020",
            title = "Senior Mobile Application Developer",
            ventureName = "Geodexia Technologies India Pvt Ltd",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        ),
        WorkExperience(
            year = "2017-2018",
            title = "Senior Mobile Application Developer",
            ventureName = "Wynot Technologies Pvt Ltd",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        ),
        WorkExperience(
            year = "2014-2017",
            title = "Application Developer",
            ventureName = "MMAD Apps India Pvt Ltd",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        ),
        WorkExperience(
            year = "2010-2014",
            title = "Application Developer and Trainer",
            ventureName = "Daze Technologies",
            description = "Working as a Software Developer, contributing to the design, development, and maintenance of scalable applications."
        )
    )

    val educationExperience = listOf<WorkExperience>(
        WorkExperience(
            year = "2005-2010",
            title = "Masters Software Engineering",
            ventureName = "Sri Krishna College of Engineering and Technology",
            description = "Studied integerated course with Bsc and Msc in Software Engineering"
        )
    )

    val projectWorked = listOf(
        ProjectWorked(
            projectName = "App / Component Development",
            clientName = "Jio",
            shortDescription = "Design System for Applications",
            imageUrl = "drawable/projects/projectShowcase1.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App Development",
            clientName = "Clearone",
            shortDescription = "Remote Controller for Video App",
            imageUrl = "drawable/projects/projectShowcase2.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App Development",
            clientName = "Geodexia",
            shortDescription = "Share Resource Contact App",
            imageUrl = "drawable/projects/projectShowcase3.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App/Web Development",
            clientName = "Self",
            shortDescription = "Portfolio Application for Individual",
            imageUrl = "drawable/projects/projectShowcase4.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),

    )

}