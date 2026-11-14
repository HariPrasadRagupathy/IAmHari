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
            imageUrl = "files/projects/projectShowcase1.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App Development",
            clientName = "Clearone",
            shortDescription = "Remote Controller for Video App",
            imageUrl = "files/projects/projectShowcase2.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App Development",
            clientName = "Geodexia",
            shortDescription = "Share Resource Contact App",
            imageUrl = "files/projects/projectShowcase3.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),
        ProjectWorked(
            projectName = "App/Web Development",
            clientName = "Self",
            shortDescription = "Portfolio Application for Individual",
            imageUrl = "files/projects/projectShowcase4.jpg",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        ),

    )

    val skills = listOf(
        Skill("Kotlin", "files/skills/kotlin.png"),
        Skill("Jetpack Compose", "files/skills/jetpack_compose.png"),
        Skill("Kotlin Multiplatform", "files/skills/kmp.png"),
        Skill("Compose Multiplatform", "files/skills/cmp.png"),
        Skill("Native Android", "files/skills/android.png"),
        Skill("Ktor", "files/skills/ktor.png"),
        Skill("Flutter", "files/skills/flutter.png"),
        Skill("Dart", "files/skills/dart.jpeg"),
        Skill("Git", "files/skills/git.png"),
        Skill("GitHub", "files/skills/github.jpeg"),

        )

    val aboutMe = """Senior Mobile Application Developer with 10+ years of experience in mobile application development, contributing to a total of 15+ years in IT programming technologies. Proficient in developing mobile applications using Kotlin, Jetpack Compose, Flutter, and Dart. Experienced in creating and customizing UI components through a Design System, interpreting REST APIs, ensuring security, and integrating local databases for data persistence. Skilled in managing applications with a well-defined layered architecture and proficient in Git and CI/CD tools. Committed to clean code practices and delivering innovative mobile applications."""

}