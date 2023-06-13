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

public val LightGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.19f, 112.86f)
                lineTo(228.0f, 117.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.89f, -9.0f)
                lineToRelative(5.24f, -4.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.59f, -2.19f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, -1.7f, -1.38f)
                lineToRelative(-8.7f, -0.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.0f, -12.0f)
                lineToRelative(8.7f, 0.76f)
                arcToRelative(13.78f, 13.78f, 0.0f, false, true, 12.08f, 9.6f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 233.19f, 112.86f)
                close()
                moveTo(175.75f, 156.93f)
                lineTo(178.61f, 169.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.84f, 4.65f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 1.36f, -0.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.49f, -7.19f)
                lineToRelative(-2.86f, -12.41f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 0.64f, -2.0f)
                lineToRelative(7.87f, -6.86f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.89f, -9.0f)
                lineToRelative(-7.87f, 6.86f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 175.75f, 156.93f)
                close()
                moveTo(175.49f, 96.0f)
                lineToRelative(-10.77f, -0.93f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 153.0f, 86.58f)
                lineTo(134.0f, 41.2f)
                lineTo(134.0f, 186.0f)
                curveToRelative(0.42f, 0.2f, 0.83f, 0.41f, 1.23f, 0.65f)
                lineToRelative(11.89f, 7.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.23f, 10.26f)
                lineTo(129.0f, 196.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-51.11f, 31.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 55.0f, 212.76f)
                lineToRelative(13.52f, -58.53f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, false, -0.64f, -2.0f)
                lineTo(22.81f, 112.86f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -4.11f, -15.0f)
                arcToRelative(13.78f, 13.78f, 0.0f, false, true, 12.08f, -9.6f)
                lineToRelative(59.46f, -5.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.65f, -1.22f)
                lineToRelative(23.23f, -55.36f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 25.76f, 0.0f)
                lineToRelative(23.23f, 55.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.65f, 1.22f)
                lineToRelative(10.76f, 0.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -1.0f, 12.0f)
                close()
                moveTo(120.77f, 186.6f)
                curveToRelative(0.4f, -0.24f, 0.81f, -0.45f, 1.23f, -0.65f)
                lineTo(122.0f, 41.2f)
                lineTo(103.0f, 86.58f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -11.68f, 8.53f)
                lineToRelative(-59.47f, 5.14f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, -1.7f, 1.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.59f, 2.19f)
                lineToRelative(45.11f, 39.35f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.44f, 13.76f)
                lineTo(66.74f, 215.46f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 0.78f, 2.13f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, false, 2.14f, 0.09f)
                close()
                moveTo(197.69f, 198.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.69f, 2.7f)
                lineToRelative(3.27f, 14.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.79f, 2.13f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, -2.14f, 0.09f)
                lineToRelative(-11.23f, -6.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.23f, 10.25f)
                lineToRelative(11.23f, 6.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 201.0f, 212.76f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
