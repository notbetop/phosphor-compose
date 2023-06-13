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

public val BoldGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.85f, 131.88f)
                lineToRelative(34.62f, -13.13f)
                lineToRelative(0.53f, -0.21f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.76f, -37.27f)
                lineTo(54.16f, 29.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 29.0f, 54.16f)
                lineTo(81.27f, 214.24f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, false, 18.0f, 13.74f)
                lineToRelative(1.0f, 0.0f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, false, 18.27f, -12.0f)
                lineToRelative(0.21f, -0.53f)
                lineToRelative(13.13f, -34.62f)
                lineToRelative(41.29f, 41.29f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(20.68f, -20.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f)
                close()
                moveTo(187.31f, 202.34f)
                lineTo(144.47f, 159.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -14.13f, -5.86f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, -3.74f, 0.35f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 112.0f, 165.67f)
                curveToRelative(-0.08f, 0.17f, -0.15f, 0.35f, -0.22f, 0.53f)
                lineToRelative(-11.25f, 29.67f)
                lineTo(54.28f, 54.28f)
                lineToRelative(141.59f, 46.24f)
                lineTo(166.2f, 111.77f)
                lineToRelative(-0.53f, 0.22f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.17f, 32.48f)
                lineToRelative(42.84f, 42.84f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
