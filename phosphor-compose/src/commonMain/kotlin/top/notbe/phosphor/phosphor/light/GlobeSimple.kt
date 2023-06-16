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

public val LightGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(173.88f, 122.0f)
                curveToRelative(-1.15f, -30.72f, -11.09f, -59.83f, -27.94f, -82.2f)
                arcTo(90.18f, 90.18f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.32f, -0.59f)
                curveToRelative(-19.56f, -21.07f, -31.26f, -51.2f, -32.56f, -83.41f)
                horizontalLineToRelative(67.75f)
                curveToRelative(-1.29f, 32.21f, -13.0f, 62.34f, -32.55f, 83.41f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(94.12f, 122.0f)
                curveToRelative(1.3f, -32.21f, 13.0f, -62.34f, 32.56f, -83.41f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 2.64f, 0.0f)
                curveToRelative(19.56f, 21.07f, 31.26f, 51.2f, 32.55f, 83.41f)
                close()
                moveTo(110.06f, 39.8f)
                curveTo(93.21f, 62.17f, 83.27f, 91.28f, 82.12f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(90.18f, 90.18f, 0.0f, false, true, 110.06f, 39.8f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(82.12f, 134.0f)
                curveToRelative(1.15f, 30.72f, 11.09f, 59.83f, 27.94f, 82.2f)
                arcTo(90.18f, 90.18f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(145.94f, 216.2f)
                curveToRelative(16.85f, -22.37f, 26.79f, -51.48f, 27.94f, -82.2f)
                lineTo(217.8f, 134.0f)
                arcTo(90.18f, 90.18f, 0.0f, false, true, 145.94f, 216.2f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
