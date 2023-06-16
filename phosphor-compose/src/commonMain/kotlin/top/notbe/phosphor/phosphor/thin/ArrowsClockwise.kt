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

public val ThinGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.83f, 189.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                curveToRelative(-1.0f, 1.0f, -25.65f, 25.17f, -66.83f, 25.17f)
                curveToRelative(-23.93f, 0.0f, -47.35f, -10.05f, -67.73f, -29.08f)
                arcToRelative(146.39f, 146.39f, 0.0f, false, true, -16.27f, -18.0f)
                verticalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(47.41f)
                curveToRelative(10.0f, 14.06f, 38.39f, 48.0f, 80.59f, 48.0f)
                curveToRelative(37.75f, 0.0f, 60.95f, -22.6f, 61.18f, -22.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 194.83f, 189.18f)
                close()
                moveTo(216.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(83.07f)
                arcToRelative(146.39f, 146.39f, 0.0f, false, false, -16.27f, -18.0f)
                curveTo(175.35f, 46.05f, 151.93f, 36.0f, 128.0f, 36.0f)
                curveTo(86.82f, 36.0f, 62.2f, 60.14f, 61.17f, 61.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 5.66f)
                curveTo(67.05f, 66.6f, 90.25f, 44.0f, 128.0f, 44.0f)
                curveToRelative(42.2f, 0.0f, 70.63f, 33.94f, 80.59f, 48.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
