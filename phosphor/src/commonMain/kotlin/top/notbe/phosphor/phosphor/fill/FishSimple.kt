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

public val FillGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(199.54f, 166.77f)
                curveToRelative(-27.06f, 27.0f, -69.42f, 38.35f, -126.32f, 33.95f)
                quadToRelative(2.39f, 17.84f, 6.7f, 37.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.11f, 9.52f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, true, -1.72f, 0.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -6.29f)
                quadToRelative(-4.91f, -22.43f, -7.39f, -42.64f)
                quadToRelative(-20.2f, -2.49f, -42.61f, -7.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.42f, -15.63f)
                quadToRelative(19.71f, 4.3f, 37.54f, 6.7f)
                curveToRelative(-4.39f, -56.89f, 7.0f, -99.24f, 34.0f, -126.29f)
                curveTo(133.0f, 12.58f, 202.43f, 24.9f, 215.9f, 27.82f)
                arcTo(16.07f, 16.07f, 0.0f, false, true, 228.18f, 40.1f)
                curveTo(231.1f, 53.57f, 243.43f, 123.0f, 199.54f, 166.77f)
                close()
                moveTo(212.54f, 43.49f)
                arcToRelative(167.84f, 167.84f, 0.0f, false, false, -49.25f, -2.78f)
                curveToRelative(-20.24f, 2.0f, -37.4f, 7.83f, -51.25f, 17.46f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 197.83f, 144.0f)
                curveToRelative(9.62f, -13.85f, 15.49f, -31.0f, 17.46f, -51.25f)
                arcTo(169.0f, 169.0f, 0.0f, false, false, 212.54f, 43.49f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
