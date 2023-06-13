package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.9f, 73.82f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, true, 0.0f, -23.65f)
                lineToRelative(29.27f, -29.28f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, true, 23.66f, 0.0f)
                lineTo(169.1f, 50.17f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, true, 0.0f, 23.65f)
                lineTo(139.83f, 103.1f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, true, -23.66f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(235.11f, 116.17f)
                lineTo(205.83f, 86.89f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -23.65f, 0.0f)
                lineTo(152.9f, 116.17f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 0.0f, 23.66f)
                lineToRelative(29.28f, 29.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, 23.65f, 0.0f)
                lineToRelative(29.28f, -29.28f)
                arcTo(16.75f, 16.75f, 0.0f, false, false, 235.11f, 116.17f)
                close()
                moveTo(103.11f, 116.17f)
                lineTo(73.82f, 86.89f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -23.65f, 0.0f)
                lineTo(20.89f, 116.17f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 0.0f, 23.66f)
                lineToRelative(29.28f, 29.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, 23.65f, 0.0f)
                lineToRelative(29.28f, -29.28f)
                arcTo(16.75f, 16.75f, 0.0f, false, false, 103.1f, 116.17f)
                close()
                moveTo(139.84f, 152.9f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, -23.66f, 0.0f)
                lineTo(86.9f, 182.18f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, 23.65f)
                lineToRelative(29.27f, 29.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.75f, 16.75f, 0.0f, false, false, 23.66f, 0.0f)
                lineToRelative(29.27f, -29.28f)
                arcToRelative(16.72f, 16.72f, 0.0f, false, false, 0.0f, -23.65f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
