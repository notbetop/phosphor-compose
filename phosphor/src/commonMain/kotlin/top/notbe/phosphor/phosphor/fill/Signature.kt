package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 168.0f)
                lineTo(63.86f, 168.0f)
                curveToRelative(2.66f, -5.24f, 5.33f, -10.63f, 8.0f, -16.11f)
                curveToRelative(14.94f, 1.65f, 32.62f, -8.8f, 52.74f, -31.22f)
                curveToRelative(0.6f, 1.66f, 1.27f, 3.37f, 2.0f, 5.1f)
                curveToRelative(6.51f, 15.25f, 14.91f, 23.94f, 25.0f, 25.85f)
                curveToRelative(10.34f, 2.0f, 20.58f, -3.23f, 31.08f, -15.82f)
                curveTo(189.5f, 143.87f, 203.5f, 152.0f, 232.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                curveToRelative(-30.63f, 0.0f, -39.55f, -10.59f, -40.0f, -16.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.51f, -2.54f)
                curveToRelative(-12.17f, 18.25f, -19.38f, 19.14f, -22.0f, 18.66f)
                curveToRelative(-8.33f, -1.57f, -16.08f, -20.93f, -18.69f, -33.51f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 121.0f, 100.16f)
                curveToRelative(-19.8f, 24.62f, -33.08f, 33.0f, -41.41f, 35.14f)
                curveToRelative(8.49f, -18.88f, 14.83f, -35.45f, 18.89f, -49.4f)
                curveToRelative(6.82f, -23.44f, 7.32f, -39.83f, 1.51f, -50.1f)
                curveToRelative(-3.0f, -5.36f, -9.29f, -11.75f, -21.91f, -11.8f)
                horizontalLineToRelative(-0.25f)
                curveToRelative(-16.0f, 0.11f, -28.6f, 15.3f, -34.62f, 41.7f)
                curveToRelative(-3.59f, 15.71f, -4.18f, 33.19f, -1.63f, 48.0f)
                reflectiveCurveToRelative(7.86f, 25.51f, 15.55f, 31.89f)
                curveToRelative(-3.72f, 7.73f, -7.53f, 15.28f, -11.23f, 22.43f)
                lineTo(24.0f, 168.02f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(37.41f, 184.02f)
                curveToRelative(-11.32f, 21.0f, -20.12f, 35.64f, -20.26f, 35.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.71f, 8.24f)
                curveToRelative(0.15f, -0.26f, 11.27f, -18.79f, 24.7f, -44.12f)
                lineTo(232.0f, 184.02f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(192.0f, 120.0f)
                verticalLineToRelative(-0.21f)
                arcTo(1.11f, 1.11f, 0.0f, false, true, 192.0f, 120.0f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
