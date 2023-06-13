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

public val ThinGroup.Plant: ImageVector
    get() {
        if (_plant != null) {
            return _plant!!
        }
        _plant = Builder(name = "Plant", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.63f, 40.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, -3.75f)
                curveToRelative(-50.25f, -3.0f, -90.44f, 12.1f, -107.52f, 40.29f)
                curveToRelative(-11.64f, 19.22f, -11.17f, 41.92f, 1.24f, 64.21f)
                arcToRelative(67.33f, 67.33f, 0.0f, false, false, -16.65f, 34.41f)
                lineTo(93.45f, 151.79f)
                curveToRelative(8.63f, -16.0f, 8.81f, -32.33f, 0.42f, -46.19f)
                curveTo(81.45f, 85.09f, 52.35f, 74.13f, 16.0f, 76.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.26f, 80.0f)
                curveToRelative(-2.13f, 36.33f, 8.83f, 65.43f, 29.34f, 77.85f)
                arcToRelative(41.82f, 41.82f, 0.0f, false, false, 21.88f, 6.18f)
                arcToRelative(51.29f, 51.29f, 0.0f, false, false, 24.31f, -6.6f)
                lineTo(116.0f, 185.67f)
                curveToRelative(0.0f, 0.28f, 0.0f, 0.56f, 0.0f, 0.84f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(186.51f)
                arcToRelative(59.57f, 59.57f, 0.0f, false, true, 15.29f, -40.0f)
                curveToRelative(11.49f, 6.36f, 23.07f, 9.56f, 34.24f, 9.56f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 29.81f, -8.41f)
                curveTo(231.52f, 130.57f, 246.59f, 90.38f, 243.63f, 40.12f)
                close()
                moveTo(45.74f, 151.0f)
                curveTo(28.47f, 140.56f, 19.0f, 115.69f, 20.08f, 84.08f)
                curveTo(51.69f, 83.0f, 76.56f, 92.47f, 87.0f, 109.74f)
                curveToRelative(6.48f, 10.71f, 6.59f, 23.37f, 0.46f, 36.09f)
                lineTo(58.82f, 117.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.65f)
                lineToRelative(28.67f, 28.67f)
                curveTo(69.11f, 157.62f, 56.45f, 157.51f, 45.74f, 151.0f)
                close()
                moveTo(199.19f, 140.8f)
                curveToRelative(-16.05f, 9.72f, -35.09f, 9.59f, -54.08f, -0.25f)
                lineToRelative(57.72f, -57.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.66f)
                lineToRelative(-57.73f, 57.73f)
                curveToRelative(-9.84f, -19.0f, -10.0f, -38.0f, -0.25f, -54.08f)
                curveToRelative(15.11f, -25.0f, 51.08f, -38.53f, 96.63f, -36.64f)
                curveTo(237.73f, 89.72f, 224.15f, 125.69f, 199.19f, 140.8f)
                close()
            }
        }
        .build()
        return _plant!!
    }

private var _plant: ImageVector? = null
