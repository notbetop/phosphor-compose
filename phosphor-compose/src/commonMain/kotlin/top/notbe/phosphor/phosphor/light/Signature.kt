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

public val LightGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 170.0f)
                horizontalLineTo(60.6f)
                curveToRelative(3.34f, -6.54f, 6.73f, -13.35f, 10.06f, -20.29f)
                curveToRelative(15.1f, 2.53f, 33.41f, -8.49f, 54.63f, -32.88f)
                curveToRelative(4.1f, 12.34f, 12.37f, 30.12f, 26.63f, 32.82f)
                curveToRelative(10.08f, 1.91f, 20.18f, -3.68f, 30.73f, -17.0f)
                curveTo(188.53f, 140.82f, 201.84f, 150.0f, 232.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                curveToRelative(-40.32f, 0.0f, -41.94f, -17.14f, -42.0f, -18.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.7f, -1.75f)
                curveToRelative(-9.26f, 13.93f, -17.81f, 20.93f, -24.14f, 19.73f)
                curveToRelative(-5.0f, -0.94f, -10.21f, -7.13f, -14.63f, -17.42f)
                arcToRelative(105.06f, 105.06f, 0.0f, false, true, -5.65f, -17.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.22f, -1.52f)
                curveToRelative(-18.41f, 22.9f, -34.79f, 35.72f, -46.48f, 36.65f)
                curveTo(100.0f, 85.84f, 107.23f, 52.7f, 98.23f, 36.78f)
                curveTo(95.46f, 31.88f, 89.71f, 26.0f, 78.0f, 26.0f)
                horizontalLineToRelative(-0.21f)
                curveToRelative(-15.0f, 0.1f, -26.89f, 14.72f, -32.69f, 40.14f)
                curveTo(38.33f, 96.0f, 42.16f, 132.0f, 59.62f, 145.0f)
                curveToRelative(-4.15f, 8.65f, -8.4f, 17.09f, -12.52f, 25.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(40.76f)
                curveTo(28.65f, 204.58f, 19.0f, 220.66f, 18.86f, 220.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.28f, 6.18f)
                curveToRelative(0.16f, -0.26f, 11.56f, -19.27f, 25.21f, -45.09f)
                horizontalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(56.84f, 68.82f)
                curveTo(61.1f, 50.12f, 69.39f, 38.0f, 78.0f, 38.0f)
                curveToRelative(6.36f, 0.0f, 8.59f, 2.51f, 9.82f, 4.69f)
                curveToRelative(4.0f, 7.0f, 6.0f, 28.15f, -22.87f, 91.0f)
                curveTo(54.63f, 123.37f, 50.79f, 95.32f, 56.84f, 68.82f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
