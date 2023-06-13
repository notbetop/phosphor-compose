package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.86f, 109.25f)
                lineTo(169.18f, 86.82f)
                lineTo(146.75f, 25.14f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, -37.5f, 0.0f)
                lineTo(86.82f, 86.82f)
                lineTo(25.14f, 109.25f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, 37.5f)
                lineToRelative(61.68f, 22.43f)
                lineToRelative(22.43f, 61.68f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 37.5f, 0.0f)
                lineToRelative(22.43f, -61.68f)
                lineToRelative(61.68f, -22.43f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, -37.5f)
                close()
                moveTo(159.21f, 147.25f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, -11.94f, 11.94f)
                lineToRelative(-19.27f, 53.0f)
                lineToRelative(-19.27f, -53.0f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, -11.94f, -11.94f)
                lineTo(43.79f, 128.0f)
                lineToRelative(53.0f, -19.27f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 11.94f, -11.94f)
                lineToRelative(19.27f, -53.0f)
                lineToRelative(19.27f, 53.0f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 11.94f, 11.94f)
                lineToRelative(53.0f, 19.27f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
