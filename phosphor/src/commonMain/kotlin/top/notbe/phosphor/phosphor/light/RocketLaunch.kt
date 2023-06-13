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

public val LightGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(101.83f, 185.45f)
                curveTo(101.45f, 187.0f, 92.09f, 222.0f, 40.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                curveToRelative(0.0f, -52.09f, 35.06f, -61.45f, 36.55f, -61.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.91f, 11.64f)
                curveToRelative(-1.0f, 0.27f, -24.84f, 7.08f, -27.26f, 44.0f)
                curveToRelative(37.34f, -2.47f, 43.92f, -27.0f, 44.0f, -27.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.65f, 2.91f)
                close()
                moveTo(195.36f, 117.13f)
                horizontalLineToRelative(0.0f)
                lineTo(190.0f, 122.48f)
                verticalLineToRelative(59.17f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, true, -4.1f, 9.89f)
                lineToRelative(-34.35f, 34.35f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 127.8f, 218.0f)
                lineToRelative(-5.46f, -39.15f)
                lineTo(77.18f, 133.66f)
                lineTo(38.05f, 128.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -7.94f, -23.76f)
                lineTo(64.46f, 70.09f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 74.35f, 66.0f)
                horizontalLineToRelative(59.17f)
                lineToRelative(5.35f, -5.35f)
                curveToRelative(26.11f, -26.11f, 57.57f, -27.23f, 69.88f, -26.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 13.11f, 13.1f)
                curveTo(222.59f, 59.56f, 221.46f, 91.0f, 195.36f, 117.13f)
                close()
                moveTo(39.73f, 116.32f)
                lineTo(77.87f, 121.64f)
                lineTo(121.52f, 78.0f)
                lineTo(74.35f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.41f, 0.59f)
                lineTo(38.6f, 112.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.49f, 2.0f)
                arcTo(1.93f, 1.93f, 0.0f, false, false, 39.73f, 116.32f)
                close()
                moveTo(178.0f, 134.48f)
                lineToRelative(-43.65f, 43.65f)
                lineToRelative(5.32f, 38.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.4f, 1.11f)
                lineToRelative(34.34f, -34.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.59f, -1.41f)
                close()
                moveTo(209.88f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.83f, -1.83f)
                arcToRelative(78.47f, 78.47f, 0.0f, false, false, -60.69f, 23.0f)
                lineTo(88.49f, 128.0f)
                lineTo(128.0f, 167.51f)
                lineToRelative(51.76f, -51.75f)
                horizontalLineToRelative(0.0f)
                lineToRelative(7.11f, -7.11f)
                horizontalLineToRelative(0.0f)
                arcTo(78.47f, 78.47f, 0.0f, false, false, 209.88f, 48.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
