package com.iamhari.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iamhari.presentation.components.molecules.TimeLineItem
import com.iamhari.presentation.components.molecules.YearsOfExperience


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



/*@Preview
@Composable
fun JobComponent() {
    Surface {
        Column(modifier = Modifier.background(MaterialTheme.colorScheme.onSurface)) {
            ProjectCard(
                ProjectWorked(
                    "Jio Design System",
                    "Jio",
                    """The JDS Design System employs Atomic Design principles,
categorizing elements into atoms, molecules, organisms, and templates for modular UI components development. Ensures consistency and efficiency with clear documentation for rapid prototyping and iteration.""",
                    listOf("Kotlin", "Jetpack Compose", "Git")
                )
            )

        }
    }
}*/

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
}

