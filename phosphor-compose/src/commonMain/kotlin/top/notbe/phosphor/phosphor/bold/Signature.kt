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

public val BoldGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 164.0f)
                lineTo(70.35f, 164.0f)
                curveToRelative(2.2f, -4.42f, 4.41f, -8.94f, 6.59f, -13.53f)
                curveToRelative(0.24f, -0.49f, 0.47f, -1.0f, 0.7f, -1.46f)
                curveToRelative(13.56f, -1.6f, 28.78f, -11.26f, 45.52f, -28.9f)
                curveToRelative(5.33f, 12.06f, 14.07f, 24.87f, 27.65f, 27.44f)
                curveToRelative(5.25f, 1.0f, 13.49f, 0.79f, 22.9f, -5.81f)
                arcToRelative(57.35f, 57.35f, 0.0f, false, false, 9.08f, -8.06f)
                curveTo(191.12f, 141.3f, 205.87f, 148.0f, 232.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                curveToRelative(-32.66f, 0.0f, -35.81f, -11.61f, -36.0f, -12.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.06f, -4.0f)
                curveToRelative(-9.37f, 13.93f, -15.6f, 17.0f, -17.66f, 16.6f)
                curveToRelative(-4.91f, -0.93f, -12.45f, -15.7f, -15.52f, -30.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.09f, -3.68f)
                curveToRelative(-10.0f, 12.38f, -18.56f, 20.93f, -25.68f, 26.5f)
                curveToRelative(21.31f, -53.19f, 17.15f, -72.52f, 11.47f, -82.57f)
                curveToRelative(-5.0f, -8.87f, -14.0f, -13.78f, -25.36f, -13.83f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-18.0f, 0.13f, -32.43f, 16.66f, -38.73f, 44.27f)
                curveToRelative(-3.45f, 15.13f, -4.0f, 31.88f, -1.46f, 45.94f)
                curveToRelative(2.64f, 14.69f, 8.33f, 25.67f, 16.61f, 32.22f)
                curveTo(50.63f, 149.84f, 47.0f, 157.09f, 43.45f, 164.0f)
                lineTo(24.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(6.68f)
                curveToRelative(-9.68f, 17.67f, -16.84f, 29.6f, -17.0f, 29.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.1f, 16.47f)
                arcTo(11.85f, 11.85f, 0.0f, false, false, 24.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.29f, -5.81f)
                curveTo(34.91f, 229.14f, 45.22f, 212.0f, 58.0f, 188.0f)
                lineTo(232.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(196.0f, 112.0f)
                curveToRelative(0.0f, -0.18f, 0.0f, -0.36f, 0.0f, -0.54f)
                arcTo(3.19f, 3.19f, 0.0f, false, true, 196.0f, 112.0f)
                close()
                moveTo(62.44f, 69.61f)
                curveTo(65.77f, 55.0f, 72.44f, 44.0f, 78.0f, 44.0f)
                curveToRelative(3.67f, 0.0f, 4.25f, 1.0f, 4.6f, 1.64f)
                curveToRelative(1.43f, 2.54f, 6.55f, 17.09f, -17.42f, 72.8f)
                arcTo(44.79f, 44.79f, 0.0f, false, true, 61.2f, 106.0f)
                arcTo(94.89f, 94.89f, 0.0f, false, true, 62.44f, 69.61f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
