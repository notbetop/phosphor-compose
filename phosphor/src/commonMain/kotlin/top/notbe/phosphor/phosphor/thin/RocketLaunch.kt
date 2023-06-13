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

public val ThinGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.88f, 185.0f)
                curveToRelative(-0.35f, 1.43f, -9.33f, 35.0f, -59.88f, 35.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                curveToRelative(0.0f, -50.54f, 33.6f, -59.53f, 35.0f, -59.88f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 73.0f, 163.88f)
                curveToRelative(-1.12f, 0.29f, -27.23f, 7.59f, -28.89f, 48.0f)
                curveToRelative(40.45f, -1.66f, 47.75f, -27.76f, 48.05f, -28.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.75f, 2.0f)
                close()
                moveTo(194.0f, 115.71f)
                lineTo(188.0f, 121.65f)
                verticalLineToRelative(60.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.52f, 8.48f)
                lineToRelative(-34.34f, 34.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.37f, -6.79f)
                lineToRelative(-5.55f, -39.81f)
                lineTo(78.12f, 131.77f)
                lineToRelative(-39.79f, -5.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.81f, -20.37f)
                lineTo(65.87f, 71.51f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 74.35f, 68.0f)
                horizontalLineToRelative(60.0f)
                lineToRelative(5.94f, -5.94f)
                curveToRelative(25.53f, -25.53f, 56.3f, -26.62f, 68.35f, -25.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.22f, 11.22f)
                curveTo(220.57f, 59.41f, 219.48f, 90.18f, 194.0f, 115.71f)
                close()
                moveTo(39.44f, 118.3f)
                lineToRelative(39.14f, 5.46f)
                lineTo(126.35f, 76.0f)
                horizontalLineToRelative(-52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.82f, 1.18f)
                lineTo(37.18f, 111.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.26f, 6.79f)
                close()
                moveTo(180.0f, 129.65f)
                lineToRelative(-47.77f, 47.77f)
                lineToRelative(5.46f, 39.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.79f, 2.25f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, -2.83f)
                close()
                moveTo(188.28f, 110.06f)
                curveToRelative(23.23f, -23.24f, 24.23f, -51.26f, 23.58f, -62.22f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.71f, -3.71f)
                curveToRelative(-11.0f, -0.65f, -39.0f, 0.34f, -62.22f, 23.58f)
                lineToRelative(-7.11f, 7.11f)
                horizontalLineToRelative(0.0f)
                lineTo(85.66f, 128.0f)
                lineTo(128.0f, 170.34f)
                lineToRelative(53.18f, -53.17f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
