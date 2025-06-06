package com.iamhari.data.providers.local.constants

import com.iamhari.data.models.ProjectWorked
import com.iamhari.data.models.Skill
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

    val skills = listOf(
        Skill("Kotlin", "drawable/skills/kotlin.png"),
        Skill("Jetpack Compose", "drawable/skills/jetpack_compose.png"),
        Skill("Kotlin Multiplatform", "drawable/skills/kmp.png"),
        Skill("Compose Multiplatform", "drawable/skills/cmp.png"),
        Skill("Native Android", "drawable/skills/android.png"),
        Skill("Ktor", "drawable/skills/ktor.png"),
        Skill("Flutter", "drawable/skills/flutter.png"),
        Skill("Dart", "drawable/skills/dart.jpeg"),
        Skill("Git", "drawable/skills/git.png"),
        Skill("GitHub", "drawable/skills/github.jpeg"),

        )

    val aboutMe = """Senior Mobile Application Developer with 10+ years of experience in mobile application development, contributing to a total of 15+ years in IT programming technologies. Proficient in developing mobile applications using Kotlin, Jetpack Compose, Flutter, and Dart. Experienced in creating and customizing UI components through a Design System, interpreting REST APIs, ensuring security, and integrating local databases for data persistence. Skilled in managing applications with a well-defined layered architecture and proficient in Git and CI/CD tools. Committed to clean code practices and delivering innovative mobile applications."""

}