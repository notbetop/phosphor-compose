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

public val RegularGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(48.0f, 71.85f)
                curveTo(63.47f, 54.4f, 90.61f, 32.0f, 128.0f, 32.0f)
                curveToRelative(42.82f, 0.0f, 68.58f, 25.27f, 69.66f, 26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 11.34f)
                curveTo(186.09f, 69.41f, 163.92f, 48.0f, 128.0f, 48.0f)
                curveTo(93.0f, 48.0f, 67.77f, 72.65f, 55.44f, 88.0f)
                lineTo(88.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 152.0f)
                lineTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.56f)
                curveTo(188.23f, 183.35f, 163.0f, 208.0f, 128.0f, 208.0f)
                curveToRelative(-35.92f, 0.0f, -58.09f, -21.41f, -58.36f, -21.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.34f)
                curveTo(59.42f, 198.73f, 85.18f, 224.0f, 128.0f, 224.0f)
                curveToRelative(37.39f, 0.0f, 64.53f, -22.4f, 80.0f, -39.85f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(224.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
