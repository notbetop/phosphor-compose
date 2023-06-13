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

public val RegularGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 32.0f)
                arcToRelative(61.6f, 61.6f, 0.0f, false, false, -43.84f, 18.16f)
                lineTo(128.0f, 56.32f)
                lineToRelative(-6.16f, -6.16f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 16.0f, 94.0f)
                curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f)
                curveTo(136.21f, 220.67f, 240.0f, 164.0f, 240.0f, 94.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 32.0f)
                close()
                moveTo(128.0f, 206.8f)
                curveTo(109.74f, 196.16f, 32.0f, 147.69f, 32.0f, 94.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 78.53f, -32.53f)
                lineToRelative(6.16f, 6.16f)
                lineTo(106.34f, 78.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineToRelative(24.53f, 24.53f)
                lineToRelative(-16.53f, 16.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(22.18f, -22.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f)
                lineTo(123.31f, 83.63f)
                lineToRelative(22.16f, -22.16f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 224.0f, 94.0f)
                curveTo(224.0f, 147.61f, 146.24f, 196.15f, 128.0f, 206.8f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
