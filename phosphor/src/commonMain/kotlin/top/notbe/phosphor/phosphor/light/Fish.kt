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

public val LightGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.05f, 75.94f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.05f, 75.94f)
                close()
                moveTo(206.35f, 155.73f)
                curveToRelative(-20.57f, 26.13f, -53.59f, 40.27f, -98.18f, 42.05f)
                lineTo(85.64f, 250.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 80.12f, 254.0f)
                horizontalLineToRelative(-0.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.39f, -4.34f)
                lineTo(59.24f, 196.76f)
                lineTo(6.35f, 181.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.71f, -11.29f)
                lineToRelative(52.58f, -22.49f)
                curveTo(60.0f, 103.23f, 74.16f, 70.22f, 100.3f, 49.65f)
                curveTo(142.8f, 16.2f, 203.71f, 27.23f, 215.48f, 29.79f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 10.73f, 10.72f)
                curveTo(228.76f, 52.3f, 239.8f, 113.23f, 206.35f, 155.73f)
                close()
                moveTo(167.0f, 172.27f)
                arcToRelative(50.09f, 50.09f, 0.0f, false, true, -36.95f, -46.35f)
                arcTo(50.12f, 50.12f, 0.0f, false, true, 83.73f, 89.0f)
                curveToRelative(-8.46f, 16.94f, -13.0f, 38.0f, -13.64f, 63.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.63f, 5.38f)
                lineTo(25.88f, 174.72f)
                lineToRelative(39.87f, 11.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.12f, 4.12f)
                lineToRelative(11.38f, 39.86f)
                lineToRelative(17.39f, -40.58f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 104.0f, 185.9f)
                curveTo(129.0f, 185.31f, 150.08f, 180.74f, 167.0f, 172.27f)
                close()
                moveTo(214.48f, 43.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.54f, -1.53f)
                curveTo(202.09f, 39.17f, 146.0f, 29.0f, 107.72f, 59.08f)
                arcTo(83.55f, 83.55f, 0.0f, false, false, 94.19f, 72.53f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 41.48f, 41.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.55f, 6.55f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 183.5f, 161.8f)
                arcToRelative(83.18f, 83.18f, 0.0f, false, false, 13.42f, -13.5f)
                curveTo(227.0f, 110.0f, 216.83f, 53.92f, 214.48f, 43.05f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
