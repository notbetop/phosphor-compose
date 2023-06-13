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

public val ThinGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.0f)
                close()
                moveTo(196.71f, 164.0f)
                curveToRelative(-27.0f, 26.91f, -69.93f, 37.74f, -128.08f, 32.37f)
                quadToRelative(2.43f, 20.2f, 7.37f, 42.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 4.77f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, -0.86f, 0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -3.15f)
                arcToRelative(453.52f, 453.52f, 0.0f, false, true, -7.7f, -45.37f)
                arcToRelative(456.0f, 456.0f, 0.0f, false, true, -45.34f, -7.71f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 16.86f, 180.0f)
                quadToRelative(22.59f, 4.95f, 42.78f, 7.38f)
                curveTo(54.3f, 129.21f, 65.13f, 86.26f, 92.0f, 59.3f)
                curveToRelative(42.31f, -42.41f, 109.88f, -30.4f, 123.0f, -27.56f)
                arcTo(12.09f, 12.09f, 0.0f, false, true, 224.26f, 41.0f)
                curveTo(227.1f, 54.08f, 239.11f, 121.64f, 196.71f, 164.0f)
                close()
                moveTo(191.06f, 158.34f)
                curveToRelative(0.81f, -0.82f, 1.6f, -1.66f, 2.38f, -2.5f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, -93.23f, -93.24f)
                curveToRelative(-0.85f, 0.79f, -1.69f, 1.58f, -2.51f, 2.4f)
                curveTo(72.27f, 90.43f, 62.25f, 131.78f, 67.75f, 188.22f)
                curveTo(124.2f, 193.73f, 165.56f, 183.72f, 191.06f, 158.29f)
                close()
                moveTo(216.44f, 42.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.09f, -3.09f)
                arcToRelative(173.25f, 173.25f, 0.0f, false, false, -50.46f, -2.82f)
                curveTo(141.1f, 38.86f, 122.7f, 45.38f, 108.0f, 56.14f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 199.86f, 148.0f)
                curveToRelative(10.76f, -14.7f, 17.28f, -33.1f, 19.4f, -54.9f)
                arcTo(173.21f, 173.21f, 0.0f, false, false, 216.44f, 42.65f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
