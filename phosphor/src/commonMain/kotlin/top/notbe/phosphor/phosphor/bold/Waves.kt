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

public val BoldGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -8.49f)
                arcTo(61.26f, 61.26f, 0.0f, false, true, 46.63f, 53.27f)
                arcTo(92.82f, 92.82f, 0.0f, false, true, 88.0f, 44.0f)
                curveToRelative(19.63f, 0.0f, 34.0f, 9.57f, 46.66f, 18.0f)
                curveToRelative(11.25f, 7.5f, 21.0f, 14.0f, 33.34f, 14.0f)
                curveToRelative(26.1f, 0.0f, 39.08f, -12.07f, 39.62f, -12.58f)
                arcTo(11.61f, 11.61f, 0.0f, false, true, 216.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 20.49f)
                arcToRelative(61.26f, 61.26f, 0.0f, false, true, -15.12f, 10.24f)
                arcTo(92.82f, 92.82f, 0.0f, false, true, 168.0f, 100.0f)
                curveToRelative(-19.63f, 0.0f, -34.0f, -9.57f, -46.66f, -18.0f)
                curveToRelative(-11.25f, -7.5f, -21.0f, -14.0f, -33.34f, -14.0f)
                curveTo(61.9f, 68.0f, 49.0f, 80.0f, 48.49f, 80.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 72.0f)
                close()
                moveTo(216.0f, 172.0f)
                arcToRelative(11.61f, 11.61f, 0.0f, false, false, -8.38f, 3.42f)
                curveTo(207.08f, 175.93f, 194.1f, 188.0f, 168.0f, 188.0f)
                curveToRelative(-12.37f, 0.0f, -22.09f, -6.48f, -33.34f, -14.0f)
                curveToRelative(-12.67f, -8.45f, -27.0f, -18.0f, -46.66f, -18.0f)
                arcToRelative(92.82f, 92.82f, 0.0f, false, false, -41.37f, 9.27f)
                arcToRelative(61.26f, 61.26f, 0.0f, false, false, -15.12f, 10.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                curveTo(49.0f, 192.0f, 61.9f, 180.0f, 88.0f, 180.0f)
                curveToRelative(12.37f, 0.0f, 22.09f, 6.48f, 33.34f, 14.0f)
                curveToRelative(12.67f, 8.45f, 27.0f, 18.0f, 46.66f, 18.0f)
                arcToRelative(92.82f, 92.82f, 0.0f, false, false, 41.37f, -9.27f)
                arcToRelative(61.26f, 61.26f, 0.0f, false, false, 15.12f, -10.24f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 172.0f)
                close()
                moveTo(216.0f, 116.0f)
                arcToRelative(11.61f, 11.61f, 0.0f, false, false, -8.38f, 3.42f)
                curveTo(207.08f, 119.93f, 194.1f, 132.0f, 168.0f, 132.0f)
                curveToRelative(-12.37f, 0.0f, -22.09f, -6.48f, -33.34f, -14.0f)
                curveToRelative(-12.67f, -8.45f, -27.0f, -18.0f, -46.66f, -18.0f)
                arcToRelative(92.82f, 92.82f, 0.0f, false, false, -41.37f, 9.27f)
                arcToRelative(61.26f, 61.26f, 0.0f, false, false, -15.12f, 10.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                curveTo(49.0f, 136.0f, 61.9f, 124.0f, 88.0f, 124.0f)
                curveToRelative(12.37f, 0.0f, 22.09f, 6.48f, 33.34f, 14.0f)
                curveToRelative(12.67f, 8.45f, 27.0f, 18.0f, 46.66f, 18.0f)
                arcToRelative(92.82f, 92.82f, 0.0f, false, false, 41.37f, -9.27f)
                arcToRelative(61.26f, 61.26f, 0.0f, false, false, 15.12f, -10.24f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 116.0f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
