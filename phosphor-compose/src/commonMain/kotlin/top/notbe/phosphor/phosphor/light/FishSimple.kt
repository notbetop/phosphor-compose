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

public val LightGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f)
                close()
                moveTo(198.13f, 165.36f)
                curveToRelative(-27.0f, 27.0f, -69.69f, 38.0f, -127.22f, 33.17f)
                quadToRelative(2.41f, 19.0f, 7.0f, 40.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.58f, 7.14f)
                arcToRelative(6.29f, 6.29f, 0.0f, false, true, -1.29f, 0.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.85f, -4.72f)
                quadToRelative(-5.08f, -23.21f, -7.55f, -44.0f)
                quadToRelative(-20.79f, -2.49f, -44.0f, -7.55f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.28f, 178.0f)
                quadToRelative(21.15f, 4.63f, 40.16f, 7.05f)
                curveTo(52.57f, 127.54f, 63.67f, 84.89f, 90.63f, 57.88f)
                curveToRelative(43.05f, -43.15f, 111.54f, -31.0f, 124.84f, -28.1f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 10.75f, 10.75f)
                curveTo(229.1f, 53.82f, 241.27f, 122.32f, 198.13f, 165.36f)
                close()
                moveTo(189.07f, 157.43f)
                arcToRelative(102.05f, 102.05f, 0.0f, false, true, -90.5f, -90.5f)
                curveToRelative(-24.34f, 24.85f, -34.0f, 64.91f, -29.0f, 119.46f)
                curveTo(124.15f, 191.45f, 164.21f, 181.77f, 189.07f, 157.43f)
                close()
                moveTo(214.49f, 43.07f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.56f, -1.56f)
                arcToRelative(171.0f, 171.0f, 0.0f, false, false, -49.84f, -2.78f)
                curveToRelative(-21.0f, 2.0f, -38.8f, 8.24f, -53.08f, 18.43f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 198.84f, 146.0f)
                curveToRelative(10.19f, -14.28f, 16.39f, -32.06f, 18.43f, -53.08f)
                arcTo(171.0f, 171.0f, 0.0f, false, false, 214.49f, 43.07f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
