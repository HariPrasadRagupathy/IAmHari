package com.iamhari.presentation.components.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.iamhari.data.models.Skill
import com.iamhari.theme.AppFonts
import iamhari.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi


@OptIn(ExperimentalResourceApi::class)
@Composable
fun SkillCard(skill: Skill) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp).width(200.dp).height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.fillMaxWidth().weight(0.7f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (skill.url.contains("drawable"))
                    AsyncImage(
                        model = Res.getUri(skill.url),
                        contentDescription = "",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.fillMaxSize()
                    )
                else
                    AsyncImage(
                        model = skill.url,
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(skill.skillName, fontFamily = AppFonts.PoppinsFontFamily(), fontWeight = FontWeight.Bold)


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