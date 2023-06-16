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

public val ThinGroup.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) {
            return _globeSimple!!
        }
        _globeSimple = Builder(name = "GlobeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.91f, 124.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-0.83f, -32.93f, -11.88f, -64.09f, -30.79f, -87.06f)
                arcTo(92.16f, 92.16f, 0.0f, false, true, 219.91f, 124.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.78f, -1.23f)
                curveTo(104.91f, 196.9f, 93.0f, 165.46f, 92.06f, 132.0f)
                horizontalLineToRelative(71.88f)
                curveToRelative(-0.89f, 33.46f, -12.85f, 64.9f, -33.16f, 86.77f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(92.06f, 124.0f)
                curveToRelative(0.89f, -33.46f, 12.85f, -64.9f, 33.16f, -86.77f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 5.56f, 0.0f)
                curveTo(151.09f, 59.1f, 163.05f, 90.54f, 163.94f, 124.0f)
                close()
                moveTo(114.85f, 36.94f)
                curveToRelative(-18.91f, 23.0f, -30.0f, 54.13f, -30.79f, 87.06f)
                horizontalLineToRelative(-48.0f)
                arcTo(92.16f, 92.16f, 0.0f, false, true, 114.85f, 36.94f)
                close()
                moveTo(36.09f, 132.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(0.83f, 32.93f, 11.88f, 64.09f, 30.79f, 87.06f)
                arcTo(92.16f, 92.16f, 0.0f, false, true, 36.09f, 132.0f)
                close()
                moveTo(141.15f, 219.06f)
                curveToRelative(18.91f, -23.0f, 30.0f, -54.13f, 30.79f, -87.06f)
                horizontalLineToRelative(48.0f)
                arcTo(92.16f, 92.16f, 0.0f, false, true, 141.15f, 219.06f)
                close()
            }
        }
        .build()
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
