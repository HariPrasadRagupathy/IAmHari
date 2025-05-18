package com.iamhari.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.iamhari.data.models.ProjectWorked
import com.iamhari.presentation.components.molecules.ProjectCard


/*@Preview
@Composable
fun PreviewComponents(){
    Surface { Column(modifier = Modifier.background(MaterialTheme.colorScheme.onSurface)) {
        ProjectCard(it)
        CandidateIntroduction()
        SkillCard()
    } }
}

@Preview
@Composable
fun SkillComponents(){
    Surface { Column(modifier = Modifier.background(MaterialTheme.colorScheme.onSurface)) {
        SkillCard()
    } }
}*/




@Composable
fun JobComponent() {
    //Text("String")

    ProjectCard(
        ProjectWorked(
            projectName = "Design System for Applications",
            clientName = "Jio",
            shortDescription = "App / Component Development",
            techStack = listOf("Kotlin", "Jetpack Compose", "Git")
        )
    )

}

/*@Preview
@Composable
fun Contact() {
    Surface {
        Column(modifier = Modifier.background(MaterialTheme.colorScheme.onSurface)) {
            ContactCard()

        }
    }
}*/

/*@Preview
@Composable
fun YearsOfExperiencePreview() {
    Surface {
    YearsOfExperience(modifier = Modifier, yearsText = "15", bottomText = "Years Of Experience")
    }
}*/

@Preview
@Composable
fun GeneralPreview() {
    Surface {
        Column {
            JobComponent()
        }
    }
}


/*@Preview
@Composable
fun TimeLineItemPreview() {
    Surface {
        Column {
            TimeLineItem(
                year = "2023-2025",
                title = "Senior Application Developer",
                companyOrSchool = "Teksoft",
                description = """The data is the 
                    |data
                    |ff
                    |df""".trimMargin(),
                icon = Icons.Default.MailOutline,

                )
            repeat(5) {
                TimeLineItem(
                    year = "2023-2025",
                    title = "Senior Application Developer",
                    companyOrSchool = "Teksoft",
                    description = "The data is the data",
                    icon = Icons.Default.MailOutline,

                    )
            }
        }
    }
}*/

