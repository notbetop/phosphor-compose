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

public val ThinGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 172.0f)
                horizontalLineTo(57.32f)
                curveToRelative(4.0f, -7.83f, 8.18f, -16.11f, 12.21f, -24.56f)
                curveToRelative(15.17f, 3.56f, 34.17f, -8.08f, 56.62f, -34.68f)
                arcToRelative(109.73f, 109.73f, 0.0f, false, false, 4.11f, 11.44f)
                curveToRelative(6.0f, 13.94f, 13.37f, 21.85f, 22.0f, 23.49f)
                curveToRelative(9.8f, 1.85f, 19.83f, -4.22f, 30.49f, -18.54f)
                curveTo(187.38f, 137.33f, 199.59f, 148.0f, 232.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                curveToRelative(-42.88f, 0.0f, -44.0f, -19.24f, -44.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.87f, -1.0f)
                curveToRelative(-9.93f, 15.0f, -19.0f, 22.23f, -26.34f, 20.84f)
                curveToRelative(-12.21f, -2.31f, -19.93f, -27.23f, -21.87f, -36.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.56f, -0.85f)
                curveToRelative(-20.74f, 25.85f, -38.67f, 38.9f, -51.29f, 37.56f)
                curveTo(97.31f, 87.5f, 105.19f, 53.16f, 96.49f, 37.77f)
                curveTo(94.0f, 33.33f, 88.74f, 28.0f, 78.0f, 28.0f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-13.78f, 0.1f, -25.27f, 14.51f, -30.76f, 38.59f)
                curveTo(43.62f, 81.8f, 43.0f, 98.72f, 45.5f, 113.0f)
                curveToRelative(2.64f, 15.26f, 8.37f, 26.0f, 16.65f, 31.32f)
                curveToRelative(-4.57f, 9.59f, -9.29f, 19.0f, -13.84f, 27.68f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(44.1f)
                curveToRelative(-12.87f, 24.17f, -23.37f, 41.68f, -23.53f, 41.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.37f, 5.49f)
                arcTo(3.93f, 3.93f, 0.0f, false, false, 24.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.43f, -1.94f)
                curveToRelative(0.16f, -0.27f, 11.85f, -19.75f, 25.72f, -46.06f)
                horizontalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(53.39f, 111.64f)
                arcToRelative(114.51f, 114.51f, 0.0f, false, true, 1.5f, -43.27f)
                curveTo(58.45f, 52.74f, 66.39f, 36.0f, 78.0f, 36.0f)
                curveToRelative(7.48f, 0.0f, 10.18f, 3.26f, 11.56f, 5.7f)
                curveTo(99.0f, 58.4f, 79.92f, 106.0f, 65.6f, 137.0f)
                curveTo(59.78f, 132.68f, 55.49f, 123.83f, 53.39f, 111.64f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
