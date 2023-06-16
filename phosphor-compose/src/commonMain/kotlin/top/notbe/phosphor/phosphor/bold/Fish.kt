package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 76.0f)
                close()
                moveTo(235.64f, 89.45f)
                curveToRelative(-1.79f, 28.0f, -10.08f, 51.53f, -24.64f, 70.0f)
                curveToRelative(-21.14f, 26.86f, -54.44f, 41.69f, -99.06f, 44.16f)
                lineTo(91.0f, 249.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.89f, 7.0f)
                quadToRelative(-0.41f, 0.0f, -0.81f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.66f, -8.44f)
                lineToRelative(-14.16f, -46.0f)
                lineToRelative(-46.0f, -14.19f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 7.0f, 165.0f)
                lineToRelative(45.4f, -20.92f)
                curveTo(54.85f, 99.44f, 69.7f, 66.14f, 96.56f, 45.0f)
                curveToRelative(18.49f, -14.56f, 42.0f, -22.84f, 70.0f, -24.64f)
                arcTo(189.64f, 189.64f, 0.0f, false, true, 216.69f, 24.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 232.0f, 39.31f)
                arcTo(189.6f, 189.6f, 0.0f, false, true, 235.64f, 89.45f)
                close()
                moveTo(151.53f, 172.25f)
                arcToRelative(57.12f, 57.12f, 0.0f, false, true, -11.13f, -8.65f)
                arcToRelative(55.81f, 55.81f, 0.0f, false, true, -15.9f, -32.1f)
                arcToRelative(55.81f, 55.81f, 0.0f, false, true, -32.1f, -15.9f)
                arcToRelative(56.93f, 56.93f, 0.0f, false, true, -8.63f, -11.13f)
                quadToRelative(-7.0f, 20.48f, -7.7f, 47.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.0f, 10.61f)
                lineTo(45.51f, 173.64f)
                lineToRelative(22.1f, 6.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.93f, 7.94f)
                lineToRelative(6.8f, 22.09f)
                lineTo(93.23f, 186.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.61f, -7.0f)
                quadTo(131.0f, 179.29f, 151.53f, 172.25f)
                close()
                moveTo(209.07f, 46.93f)
                curveToRelative(-14.71f, -2.84f, -63.85f, -9.68f, -97.67f, 16.93f)
                arcTo(77.0f, 77.0f, 0.0f, false, false, 100.0f, 74.9f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 35.0f, 32.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.09f, 13.09f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 33.0f, 35.0f)
                arcToRelative(76.69f, 76.69f, 0.0f, false, false, 11.0f, -11.35f)
                curveTo(218.76f, 110.81f, 211.91f, 61.65f, 209.07f, 46.93f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
