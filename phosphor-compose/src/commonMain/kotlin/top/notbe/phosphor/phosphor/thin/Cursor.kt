package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.81f, 137.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.24f, -6.5f)
                lineToRelative(44.76f, -19.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.05f, -22.33f)
                lineTo(51.67f, 36.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.6f, 51.67f)
                lineTo(88.87f, 211.76f)
                arcTo(11.86f, 11.86f, 0.0f, false, false, 99.67f, 220.0f)
                horizontalLineToRelative(0.58f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, 11.0f, -7.19f)
                lineToRelative(19.46f, -44.76f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 2.92f, -2.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 1.1f)
                lineToRelative(49.67f, 49.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(210.81f, 198.16f)
                lineTo(198.12f, 210.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-49.67f, -49.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, -3.52f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, false, -2.24f, 0.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.77f, 7.0f)
                lineToRelative(-19.46f, 44.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.39f, -0.35f)
                lineTo(44.2f, 49.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -5.0f)
                lineTo(209.27f, 96.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.35f, 7.39f)
                lineToRelative(-44.76f, 19.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.7f, 19.49f)
                lineToRelative(49.67f, 49.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.83f, 198.14f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
