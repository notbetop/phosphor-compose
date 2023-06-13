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

public val RegularGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.06f, 75.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.06f, 75.94f)
                close()
                moveTo(207.93f, 156.94f)
                curveToRelative(-20.76f, 26.37f, -53.85f, 40.74f, -98.41f, 42.77f)
                lineToRelative(-22.0f, 51.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.13f, 256.0f)
                lineToRelative(-0.51f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, -5.78f)
                lineTo(57.62f, 198.37f)
                lineTo(5.8f, 183.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, -15.05f)
                lineToRelative(51.43f, -22.0f)
                curveToRelative(2.0f, -44.57f, 16.41f, -77.66f, 42.79f, -98.41f)
                curveToRelative(43.21f, -34.0f, 104.91f, -22.83f, 116.84f, -20.25f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.26f, 12.26f)
                curveTo(230.76f, 52.0f, 241.94f, 113.76f, 207.93f, 157.0f)
                close()
                moveTo(161.6f, 172.61f)
                arcToRelative(52.12f, 52.12f, 0.0f, false, true, -33.42f, -44.79f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 83.4f, 94.41f)
                curveToRelative(-7.0f, 15.86f, -10.76f, 35.11f, -11.3f, 57.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.85f, 7.16f)
                lineTo(31.84f, 174.34f)
                lineToRelative(34.46f, 9.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.49f, 5.49f)
                lineToRelative(9.84f, 34.46f)
                lineToRelative(15.18f, -35.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 183.9f)
                curveTo(126.48f, 183.37f, 145.73f, 179.59f, 161.6f, 172.61f)
                close()
                moveTo(212.53f, 43.47f)
                curveToRelative(-10.7f, -2.32f, -66.0f, -12.39f, -103.57f, 17.18f)
                arcTo(80.9f, 80.9f, 0.0f, false, false, 96.13f, 73.32f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 39.36f, 38.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.72f, 8.72f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 38.49f, 39.36f)
                arcToRelative(80.64f, 80.64f, 0.0f, false, false, 12.65f, -12.81f)
                curveTo(224.92f, 109.49f, 214.85f, 54.18f, 212.53f, 43.47f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
