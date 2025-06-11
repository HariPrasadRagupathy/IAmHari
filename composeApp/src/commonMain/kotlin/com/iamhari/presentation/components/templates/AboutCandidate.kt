package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.iamhari.data.enums.ScreenSize
import com.iamhari.presentation.components.molecules.YearsOfExperience
import com.iamhari.presentation.core.ResponsiveComponent
import com.iamhari.presentation.core.ScreenStyle
import com.iamhari.presentation.features.profile.vm.HomeScreenViewModel
import com.iamhari.theme.AppFonts
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel


@Preview
@Composable
fun AboutCandidate(viewModel: HomeScreenViewModel = koinViewModel<HomeScreenViewModel>()) {
    val aboutMe by viewModel.aboutMe.collectAsState()
    Column(
        Modifier.fillMaxWidth().padding(vertical = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Know", style = MaterialTheme.typography.bodyLarge)
        Text(
            "About Me",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(10.dp))
        AboutCandidateDetailsResponsive(aboutMe).Draw()
    }
}

class AboutCandidateDetailsResponsive(val aboutMe: String = "") :
    ResponsiveComponent<AboutCandidateDetailsResponsive.Style> {
    @Composable
    override fun getStyle(screenSize: ScreenSize): Style = when (screenSize) {
        ScreenSize.Compact -> Style(
            horizontalPadding = 20.dp,
            textPadding = 10.dp,
            fontSize = 16.sp,
            lineHeight = 30.sp
        )

        ScreenSize.Medium -> Style(
            horizontalPadding = 20.dp,
            textPadding = 10.dp,
            fontSize = 16.sp,
            lineHeight = 30.sp
        )

        ScreenSize.Expanded -> Style()
    }

    @Composable
    override fun Compact(style: Style) {
        PortraitCommon(style)
    }

    @Composable
    override fun Medium(style: Style) {
        PortraitCommon(style)
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    override fun Expanded(style: Style) {
        FlowRow(modifier = Modifier.fillMaxWidth().padding(horizontal = style.horizontalPadding)) {
            Text(
                aboutMe,
                style = TextStyle.Default.copy(
                    fontSize = style.fontSize,
                    lineHeight = style.lineHeight,
                    fontFamily = AppFonts.PoppinsFontFamily()
                ),
                modifier = Modifier.background(Color.White).padding(style.textPadding).weight(0.7f)
                    .align(Alignment.CenterVertically)
            )
            //AsyncImage(model = "https://picsum.photos/id/9/400/400", contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.size(400.dp).padding(20.dp))
            YearsOfExperience(
                modifier = Modifier.weight(0.3f),
                yearsText = "15",
                bottomText = "Years Of Experience"
            )
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    private fun PortraitCommon(style: Style) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = style.horizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            YearsOfExperience(
                modifier = Modifier,
                yearsText = "15",
                bottomText = "Years Of Experience"
            )
            Text(
                textAlign = TextAlign.Justify,
                text=aboutMe,
                style = TextStyle.Default.copy(
                    fontSize = style.fontSize,
                    lineHeight = style.lineHeight,
                    fontFamily = AppFonts.PoppinsFontFamily()
                ),
                modifier = Modifier.background(Color.White).padding(style.textPadding)
                    .align(Alignment.CenterHorizontally)
            )
            //AsyncImage(model = "https://picsum.photos/id/9/400/400", contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.size(400.dp).padding(20.dp))
        }
    }

    data class Style(
        val horizontalPadding: Dp = 50.dp,
        val textPadding: Dp = 40.dp,
        val fontSize: TextUnit = 18.sp,
        val lineHeight: TextUnit = 40.sp
    ) : ScreenStyle
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AboutCandidateDetails(aboutMe: String = "") {

    FlowRow(modifier = Modifier.fillMaxWidth().padding(horizontal = 50.dp)) {
        Text(
            aboutMe,
            style = TextStyle.Default.copy(
                fontSize = 18.sp,
                lineHeight = 40.sp,
                fontFamily = AppFonts.PoppinsFontFamily()
            ),
            modifier = Modifier.background(Color.White).padding(40.dp).weight(0.7f)
                .align(Alignment.CenterVertically)
        )
        //AsyncImage(model = "https://picsum.photos/id/9/400/400", contentDescription = "", contentScale = ContentScale.Crop, modifier = Modifier.size(400.dp).padding(20.dp))
        YearsOfExperience(
            modifier = Modifier.weight(0.3f),
            yearsText = "15",
            bottomText = "Years Of Experience"
        )
    }


}