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

public val ThinGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineToRelative(1.31f, 1.44f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.88f, 73.54f, 115.7f, 88.28f, 120.59f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, false, 7.44f, 0.0f)
                curveToRelative(7.82f, -2.59f, 34.16f, -12.64f, 55.95f, -35.8f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(129.23f, 227.79f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -2.39f, 0.0f)
                curveTo(113.0f, 223.2f, 44.0f, 196.17f, 44.0f, 114.79f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(5.5f)
                lineTo(182.27f, 193.65f)
                curveTo(161.69f, 215.77f, 136.61f, 225.33f, 129.19f, 227.79f)
                close()
                moveTo(220.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 19.1f, -3.62f, 36.81f, -10.75f, 52.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.29f, -3.29f)
                curveToRelative(6.66f, -14.79f, 10.0f, -31.4f, 10.0f, -49.36f)
                lineTo(211.96f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(98.52f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                lineTo(208.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
