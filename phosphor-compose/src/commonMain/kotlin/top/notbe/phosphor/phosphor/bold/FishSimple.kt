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

public val BoldGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 76.0f)
                close()
                moveTo(202.37f, 169.61f)
                curveTo(175.27f, 196.65f, 133.52f, 208.5f, 77.86f, 205.0f)
                quadToRelative(2.27f, 15.48f, 6.0f, 32.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.45f, 5.13f)
                quadToRelative(-4.56f, -20.9f, -7.05f, -39.92f)
                quadToRelative(-19.0f, -2.49f, -39.89f, -7.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.13f, -23.45f)
                quadToRelative(16.89f, 3.7f, 32.36f, 6.0f)
                curveToRelative(-3.44f, -55.64f, 8.41f, -97.37f, 35.46f, -124.48f)
                curveTo(131.65f, 8.26f, 202.93f, 20.9f, 216.76f, 23.89f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 15.35f, 15.35f)
                curveTo(235.1f, 53.07f, 247.74f, 124.35f, 202.38f, 169.6f)
                close()
                moveTo(175.28f, 161.18f)
                arcToRelative(107.09f, 107.09f, 0.0f, false, true, -51.65f, -28.81f)
                arcTo(107.23f, 107.23f, 0.0f, false, true, 94.82f, 80.71f)
                curveToRelative(-16.49f, 23.0f, -23.08f, 56.51f, -19.7f, 100.14f)
                curveTo(118.75f, 184.24f, 152.27f, 177.66f, 175.29f, 161.17f)
                close()
                moveTo(209.16f, 46.84f)
                arcToRelative(165.65f, 165.65f, 0.0f, false, false, -45.47f, -2.16f)
                curveToRelative(-18.67f, 1.81f, -34.58f, 7.0f, -47.55f, 15.54f)
                arcToRelative(83.92f, 83.92f, 0.0f, false, false, 79.64f, 79.64f)
                curveToRelative(8.51f, -13.0f, 13.73f, -28.88f, 15.54f, -47.55f)
                arcTo(165.65f, 165.65f, 0.0f, false, false, 209.16f, 46.84f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
