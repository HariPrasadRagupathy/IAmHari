package com.iamhari.presentation.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ResponsiveRow(
    modifier: Modifier = Modifier,
    horizontalSpacing: Dp = 0.dp,
    verticalSpacing: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    val hSpacePx = with(LocalDensity.current) { horizontalSpacing.toPx() }
    val vSpacePx = with(LocalDensity.current) { verticalSpacing.toPx() }

    Layout(
        content = content,
        modifier = modifier
    ) { measurables, constraints ->

        val placeables = mutableListOf<Placeable>()
        val rows = mutableListOf<List<Placeable>>()

        var rowWidth = 0
        var rowHeight = 0
        var currentRow = mutableListOf<Placeable>()

        var maxWidth = constraints.maxWidth
        var totalHeight = 0

        for (measurable in measurables) {
            val placeable = measurable.measure(constraints)

            if (rowWidth + placeable.width > maxWidth && currentRow.isNotEmpty()) {
                rows.add(currentRow)
                totalHeight += rowHeight + vSpacePx.toInt()
                currentRow = mutableListOf()
                rowWidth = 0
                rowHeight = 0
            }

            currentRow.add(placeable)
            rowWidth += placeable.width + hSpacePx.toInt()
            rowHeight = maxOf(rowHeight, placeable.height)
        }

        if (currentRow.isNotEmpty()) {
            rows.add(currentRow)
            totalHeight += rowHeight
        }

        layout(maxWidth, totalHeight) {
            var yPosition = 0

            for (row in rows) {
                var xPosition = 0
                val rowMaxHeight = row.maxOfOrNull { it.height } ?: 0

                for (placeable in row) {
                    placeable.placeRelative(x = xPosition, y = yPosition)
                    xPosition += placeable.width + hSpacePx.toInt()
                }

                yPosition += rowMaxHeight + vSpacePx.toInt()
            }
        }
    }
}
