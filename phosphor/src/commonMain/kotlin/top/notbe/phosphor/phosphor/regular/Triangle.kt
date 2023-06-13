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

public val RegularGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.8f, 188.09f)
                lineTo(149.35f, 36.22f)
                arcToRelative(24.76f, 24.76f, 0.0f, false, false, -42.7f, 0.0f)
                lineTo(19.2f, 188.09f)
                arcToRelative(23.51f, 23.51f, 0.0f, false, false, 0.0f, 23.72f)
                arcTo(24.34f, 24.34f, 0.0f, false, false, 40.55f, 224.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(24.34f, 24.34f, 0.0f, false, false, 21.33f, -12.19f)
                arcTo(23.51f, 23.51f, 0.0f, false, false, 236.8f, 188.09f)
                close()
                moveTo(222.93f, 203.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, 4.2f)
                horizontalLineTo(40.55f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, -4.2f)
                arcToRelative(7.59f, 7.59f, 0.0f, false, true, 0.0f, -7.72f)
                lineTo(120.52f, 44.21f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, true, 15.0f, 0.0f)
                lineToRelative(87.45f, 151.87f)
                arcTo(7.59f, 7.59f, 0.0f, false, true, 222.93f, 203.8f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
