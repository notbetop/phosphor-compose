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

public val LightGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.24f, 187.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                curveTo(195.19f, 197.29f, 170.0f, 222.0f, 128.0f, 222.0f)
                curveToRelative(-39.66f, 0.0f, -67.59f, -25.75f, -82.0f, -43.26f)
                verticalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(51.35f)
                curveToRelative(11.41f, 15.11f, 38.23f, 44.0f, 76.65f, 44.0f)
                curveToRelative(37.09f, 0.0f, 59.54f, -22.0f, 59.76f, -22.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 196.24f, 187.76f)
                close()
                moveTo(216.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(77.26f)
                curveTo(195.59f, 59.75f, 167.66f, 34.0f, 128.0f, 34.0f)
                curveTo(86.0f, 34.0f, 60.81f, 58.71f, 59.76f, 59.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.48f)
                curveTo(68.46f, 68.0f, 90.91f, 46.0f, 128.0f, 46.0f)
                curveToRelative(38.42f, 0.0f, 65.24f, 28.89f, 76.65f, 44.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
