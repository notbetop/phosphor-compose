package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.64f, 134.33f)
                lineToRelative(44.77f, -19.46f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 213.0f, 85.07f)
                lineTo(52.92f, 32.8f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 32.8f, 52.92f)
                lineTo(85.07f, 213.0f)
                arcToRelative(15.82f, 15.82f, 0.0f, false, false, 14.41f, 11.0f)
                lineToRelative(0.78f, 0.0f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, false, 14.61f, -9.59f)
                horizontalLineToRelative(0.0f)
                lineToRelative(19.46f, -44.77f)
                lineTo(184.0f, 219.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(12.68f, -12.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(100.16f, 208.09f)
                lineTo(100.22f, 208.04f)
                close()
                moveTo(195.31f, 208.0f)
                lineTo(145.64f, 158.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -26.0f, 4.93f)
                lineToRelative(-19.41f, 44.66f)
                lineTo(48.0f, 48.0f)
                lineToRelative(159.87f, 52.2f)
                lineToRelative(-44.65f, 19.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.93f, 26.0f)
                lineTo(208.0f, 195.31f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
