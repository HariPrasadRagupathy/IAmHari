package com.iamhari.presentation.components.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ModalDrawer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iamhari.data.enums.ScreenSize
import com.iamhari.presentation.components.molecules.BottomCard
import com.iamhari.presentation.components.molecules.ContactCard
import com.iamhari.presentation.core.ResponsiveComponent
import com.iamhari.presentation.core.ScreenStyle
import com.iamhari.utiities.openUrl
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ContactCandidate() {
    Column(
        Modifier.fillMaxWidth().background(Color(0xFF4287F5))
            .padding(vertical = 30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Find My", style = MaterialTheme.typography.bodyLarge)
        Text(
            "Contact",
            style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold)

        )

        ContactCandidateResponsive().Draw()


    }
}


class ContactCandidateResponsive() : ResponsiveComponent<ContactCandidateResponsive.Style> {

    data class Style(
        val menuHorizontalPadding: Dp = 100.dp,
        val menuVerticalPadding: Dp = 20.dp,
        val contactSectionVisibility: Boolean = true
    ) : ScreenStyle

    @Composable
    override fun getStyle(screenSize: ScreenSize): Style = when (screenSize) {
        ScreenSize.Compact -> Style(contactSectionVisibility = false, menuHorizontalPadding = 20.dp)
        ScreenSize.Medium -> Style(contactSectionVisibility = false, menuHorizontalPadding = 50.dp, menuVerticalPadding = 100.dp)
        ScreenSize.Expanded -> Style(contactSectionVisibility = true, menuVerticalPadding = 100.dp)
    }

    @Composable
    override fun Compact(style: Style) {
        Column(modifier = Modifier.padding(horizontal = style.menuHorizontalPadding, vertical = style.menuVerticalPadding)) {
            ContactText()
            AboutCandidateDetails()
        }
    }

    @Composable
    override fun Medium(style: Style) {
        Column(modifier = Modifier.padding(vertical = style.menuVerticalPadding)) {
            Column(modifier = Modifier.weight(0.5f)) { ContactText() }
            Column(modifier = Modifier.weight(0.5f)) { AboutCandidateDetails() }
        }
    }

    @Composable
    override fun Expanded(style: Style) {
        Row(modifier = Modifier.padding(vertical = style.menuVerticalPadding)) {
            Column(modifier = Modifier.weight(0.5f)) { ContactText() }
            Column(modifier = Modifier.weight(0.5f)) { AboutCandidateDetails() }
        }
    }


}

@Composable
private fun ContactText() {
    Column(modifier = Modifier.padding(horizontal = 30.dp)) {
        Text(
            "Let Us Connect",
            style = MaterialTheme.typography.displayMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            "\"I'm always open to working on new projects and design challenges. Feel free to share as many details as you can so we can start off strong. Kindly reach out if you're interested in collaborating!\"\n" +
                    "\n",
            style = MaterialTheme.typography.headlineSmall.copy(
            )
        )

    }
}

@Composable
private fun AboutCandidateDetails() {

    Column(
        Modifier.padding(10.dp).fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ContactCard(
            modifier = Modifier,
            iconUri = "drawable/whatsapp.png",
            contentHeading = "WhatsApp",
            content = "(+91) 88610-99488",
            onClick = { openUrl("https://wa.me/918861099488") }
        )
        ContactCard(
            modifier = Modifier,
            iconUri = "drawable/call.png",
            contentHeading = "Phone",
            content = "(+91) 88610-99488",
            onClick = { openUrl("tel:8861099488") }
        )
        ContactCard(
            modifier = Modifier,
            iconUri = "drawable/gmail.png",
            contentHeading = "Gmail",
            content = "hariprasadragupathy@gmail.com",
            onClick = { openUrl("mailto:hariprasadragupathy@gmail.com") }
        )
        ContactCard(
            modifier = Modifier,
            iconUri = "drawable/linkedIn.png",
            contentHeading = "LinkedIn",
            content = "www.linkedin.com/in/hariprasadragupathy",
            onClick = { openUrl("https://www.linkedin.com/in/hariprasadragupathy/") }
        )

    }
}