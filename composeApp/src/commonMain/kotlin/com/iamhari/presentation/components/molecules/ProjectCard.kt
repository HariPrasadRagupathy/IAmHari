package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.iamhari.data.models.ProjectWorked
import iamhari.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi


@OptIn(ExperimentalLayoutApi::class, ExperimentalResourceApi::class)
@Composable
fun ProjectCard(projectWorked: ProjectWorked) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp).width(400.dp).height(500.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.fillMaxWidth().weight(0.2f).background(
                    Color(0xFF4287F5)
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Named As", style = TextStyle().copy(fontSize = 10.sp, color = Color.White))
                Text(
                    projectWorked.projectName,
                    style = TextStyle().copy(fontSize = 20.sp, color = Color.White)
                )
                // AsyncImage(model = "https://picsum.photos/400/400", contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
            }

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.fillMaxWidth().weight(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Worked For", style = TextStyle().copy(fontSize = 10.sp, color = Color.Gray))
                Text(projectWorked.clientName, style = TextStyle().copy(fontSize = 20.sp))
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    projectWorked.shortDescription,
                    textAlign = TextAlign.Start,
                    style = TextStyle().copy(fontSize = 14.sp),
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.height(20.dp))
                FlowRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally), verticalArrangement = Arrangement.Top) {
                    projectWorked.techStack.forEach {
                        //IconButton(onClick = {}, modifier = Modifier.clip(CircleShape).background(Color.Gray)) { Icon(Icons.Default.Home,"") }
                        AsyncImage(
                            model = Res.getUri("drawable/skills/kotlin.png"),
                            contentDescription = "",
                            modifier = Modifier.size(50.dp).clip(
                                CircleShape
                            ).border(width = 2.dp, color = Color.LightGray, shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Button(
                        onClick = {},
                    ) { Text("Github") }
                    OutlinedButton(
                        onClick = {},
                    ) { Text("LiveDemo") }
                }
            }

        }
    }
    /*Box(
        modifier = Modifier.clip(
            shape = RoundedCornerShape(10.dp),
        ).border(
            width = 1.dp,
            shape = RoundedCornerShape(10.dp),
            color = Color.LightGray
        ).background(Color.White).padding(16.dp).width(400.dp).height(500.dp)
    ) {

    }*/
}