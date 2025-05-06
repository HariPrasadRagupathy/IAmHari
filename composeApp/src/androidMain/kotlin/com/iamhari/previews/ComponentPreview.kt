package com.iamhari.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iamhari.App
import com.iamhari.presentation.components.molecules.ProjectCard



@Preview
@Composable
fun PreviewComponents(){
    Surface { Column(modifier = Modifier.background(MaterialTheme.colorScheme.onSurface)) {
        ProjectCard()
    } }
}

