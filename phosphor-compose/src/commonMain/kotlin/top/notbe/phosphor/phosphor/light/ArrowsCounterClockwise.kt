package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 102.0f)
                lineTo(40.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(34.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(46.0f, 77.26f)
                curveTo(60.41f, 59.75f, 88.34f, 34.0f, 128.0f, 34.0f)
                curveToRelative(42.0f, 0.0f, 67.19f, 24.71f, 68.24f, 25.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.47f, 8.49f)
                curveTo(187.54f, 68.0f, 164.85f, 46.0f, 128.0f, 46.0f)
                curveTo(89.59f, 46.0f, 62.76f, 74.88f, 51.35f, 90.0f)
                lineTo(88.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 154.0f)
                lineTo(168.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(36.65f)
                curveToRelative(-11.41f, 15.12f, -38.24f, 44.0f, -76.65f, 44.0f)
                curveToRelative(-36.85f, 0.0f, -59.54f, -22.0f, -59.77f, -22.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.47f, 8.49f)
                curveTo(60.81f, 197.29f, 86.0f, 222.0f, 128.0f, 222.0f)
                curveToRelative(39.66f, 0.0f, 67.59f, -25.75f, 82.0f, -43.26f)
                lineTo(210.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(222.0f, 160.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 154.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
