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

public val LightGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.74f, 76.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.45f)
                curveTo(36.48f, 67.0f, 53.9f, 50.0f, 88.0f, 50.0f)
                curveToRelative(17.81f, 0.0f, 30.79f, 8.65f, 43.33f, 17.0f)
                curveToRelative(11.56f, 7.71f, 22.49f, 15.0f, 36.67f, 15.0f)
                curveToRelative(15.08f, 0.0f, 26.17f, -3.87f, 32.82f, -7.12f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, false, 11.0f, -7.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.46f, 8.51f)
                curveTo(219.52f, 77.0f, 202.1f, 94.0f, 168.0f, 94.0f)
                curveToRelative(-17.82f, 0.0f, -30.79f, -8.65f, -43.33f, -17.0f)
                curveTo(113.11f, 69.28f, 102.18f, 62.0f, 88.0f, 62.0f)
                curveToRelative(-15.08f, 0.0f, -26.17f, 3.87f, -32.82f, 7.12f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, false, -11.0f, 7.15f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 35.74f, 76.21f)
                close()
                moveTo(211.74f, 123.73f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, true, -11.0f, 7.15f)
                curveTo(194.17f, 134.13f, 183.08f, 138.0f, 168.0f, 138.0f)
                curveToRelative(-14.18f, 0.0f, -25.11f, -7.28f, -36.67f, -15.0f)
                curveToRelative(-12.54f, -8.36f, -25.52f, -17.0f, -43.33f, -17.0f)
                curveToRelative(-34.1f, 0.0f, -51.52f, 17.0f, -52.25f, 17.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.46f, 8.51f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, true, 11.0f, -7.15f)
                curveTo(61.83f, 121.87f, 72.92f, 118.0f, 88.0f, 118.0f)
                curveToRelative(14.18f, 0.0f, 25.11f, 7.28f, 36.67f, 15.0f)
                curveToRelative(12.54f, 8.36f, 25.51f, 17.0f, 43.33f, 17.0f)
                curveToRelative(34.1f, 0.0f, 51.52f, -17.0f, 52.25f, -17.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, -8.51f)
                close()
                moveTo(211.74f, 179.73f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, true, -11.0f, 7.15f)
                curveTo(194.17f, 190.13f, 183.08f, 194.0f, 168.0f, 194.0f)
                curveToRelative(-14.18f, 0.0f, -25.11f, -7.28f, -36.67f, -15.0f)
                curveToRelative(-12.54f, -8.36f, -25.52f, -17.0f, -43.33f, -17.0f)
                curveToRelative(-34.1f, 0.0f, -51.52f, 17.0f, -52.25f, 17.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.46f, 8.51f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, true, 11.0f, -7.15f)
                curveTo(61.83f, 177.87f, 72.92f, 174.0f, 88.0f, 174.0f)
                curveToRelative(14.18f, 0.0f, 25.11f, 7.28f, 36.67f, 15.0f)
                curveToRelative(12.54f, 8.36f, 25.51f, 17.0f, 43.33f, 17.0f)
                curveToRelative(34.1f, 0.0f, 51.52f, -17.0f, 52.25f, -17.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, -8.51f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
