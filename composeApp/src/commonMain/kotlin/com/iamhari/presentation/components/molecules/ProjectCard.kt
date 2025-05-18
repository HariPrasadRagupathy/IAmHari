package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.iamhari.data.models.ProjectWorked
import com.iamhari.theme.AppFonts
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
                modifier = Modifier.fillMaxWidth().weight(1f).background(
                    Color(0xFF4287F5)
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
               // Text("Named As", style = TextStyle().copy(fontSize = 10.sp, color = Color.White))

                 AsyncImage(model = Res.getUri(projectWorked.imageUrl), contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
            }

            Row(
                modifier = Modifier.padding(vertical = 5.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(3.dp, alignment = Alignment.CenterVertically)) {

                    Text(projectWorked.projectName, style = TextStyle().copy(fontSize = 16.sp, color = Color.Gray, fontFamily = AppFonts.PoppinsFontFamily()))
                    Text(
                        projectWorked.shortDescription,
                        style = TextStyle().copy(fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = AppFonts.PoppinsFontFamily())
                    )
                }
                IconButton(onClick = {}) {
                    Icon(Icons.Default.PlayArrow, contentDescription = "")
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