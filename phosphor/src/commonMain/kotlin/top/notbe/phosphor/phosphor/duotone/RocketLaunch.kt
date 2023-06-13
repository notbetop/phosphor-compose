package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 160.0f)
                lineToRelative(24.0f, 24.0f)
                reflectiveCurveToRelative(-8.0f, 32.0f, -56.0f, 32.0f)
                curveTo(40.0f, 168.0f, 72.0f, 160.0f, 72.0f, 160.0f)
                close()
                moveTo(136.0f, 72.0f)
                lineTo(74.35f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.65f, 2.34f)
                lineTo(34.35f, 108.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, 13.57f)
                lineTo(80.0f, 128.0f)
                close()
                moveTo(128.0f, 176.0f)
                lineTo(133.74f, 217.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.57f, 4.53f)
                lineToRelative(34.35f, -34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, -5.65f)
                lineTo(184.0f, 120.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.77f, 185.94f)
                curveTo(103.38f, 187.49f, 93.63f, 224.0f, 40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -53.63f, 36.51f, -63.38f, 38.06f, -63.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.53f)
                curveToRelative(-0.9f, 0.25f, -22.42f, 6.54f, -25.56f, 39.86f)
                curveTo(81.7f, 204.48f, 88.0f, 183.0f, 88.26f, 182.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.51f, 4.0f)
                close()
                moveTo(196.77f, 118.54f)
                lineTo(192.0f, 123.31f)
                verticalLineToRelative(58.33f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 187.32f, 193.0f)
                lineTo(153.0f, 227.3f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 141.7f, 232.0f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, true, -5.1f, -0.83f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, true, -10.78f, -12.92f)
                lineToRelative(-5.37f, -38.49f)
                lineTo(76.24f, 135.55f)
                lineToRelative(-38.47f, -5.37f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 28.7f, 103.0f)
                lineTo(63.0f, 68.68f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 74.36f, 64.0f)
                horizontalLineToRelative(58.33f)
                lineToRelative(4.77f, -4.77f)
                curveToRelative(26.68f, -26.67f, 58.83f, -27.82f, 71.41f, -27.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.0f, 15.0f)
                curveTo(224.6f, 59.71f, 223.45f, 91.86f, 196.78f, 118.54f)
                close()
                moveTo(40.0f, 114.34f)
                lineToRelative(37.15f, 5.18f)
                lineTo(116.69f, 80.0f)
                lineTo(74.36f, 80.0f)
                close()
                moveTo(91.32f, 128.0f)
                lineTo(128.0f, 164.68f)
                lineToRelative(57.45f, -57.45f)
                arcToRelative(76.46f, 76.46f, 0.0f, false, false, 22.42f, -59.16f)
                arcToRelative(76.64f, 76.64f, 0.0f, false, false, -59.11f, 22.47f)
                close()
                moveTo(176.0f, 139.31f)
                lineToRelative(-39.53f, 39.53f)
                lineTo(141.67f, 216.0f)
                lineTo(176.0f, 181.64f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
