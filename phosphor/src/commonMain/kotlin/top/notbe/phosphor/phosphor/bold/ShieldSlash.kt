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

public val BoldGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 114.8f)
                arcToRelative(138.72f, 138.72f, 0.0f, false, true, -7.77f, 46.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.6f, -8.08f)
                arcTo(114.62f, 114.62f, 0.0f, false, false, 204.0f, 114.8f)
                lineTo(204.0f, 60.0f)
                lineTo(109.33f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                lineTo(208.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(216.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.15f)
                lineToRelative(-11.74f, -12.92f)
                arcTo(151.78f, 151.78f, 0.0f, false, true, 134.24f, 243.0f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, true, -12.49f, 0.0f)
                curveTo(106.1f, 237.78f, 28.0f, 207.16f, 28.0f, 114.8f)
                lineTo(28.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 8.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.87f, -8.1f)
                close()
                moveTo(171.24f, 193.41f)
                lineTo(52.0f, 62.24f)
                lineTo(52.0f, 114.8f)
                curveToRelative(0.0f, 73.56f, 60.53f, 99.53f, 76.0f, 105.0f)
                arcTo(126.88f, 126.88f, 0.0f, false, false, 171.24f, 193.41f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
