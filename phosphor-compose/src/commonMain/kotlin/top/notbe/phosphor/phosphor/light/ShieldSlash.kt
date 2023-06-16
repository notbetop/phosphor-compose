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

public val LightGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.63f, 7.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 88.25f, 74.68f, 117.52f, 89.65f, 122.49f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 8.7f, 0.0f)
                curveToRelative(7.76f, -2.58f, 33.48f, -12.37f, 55.29f, -34.76f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.44f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.44f, -10.0f)
                close()
                moveTo(128.56f, 225.93f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, -1.13f, 0.0f)
                curveTo(113.84f, 221.38f, 46.0f, 194.8f, 46.0f, 114.79f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.62f)
                lineTo(179.55f, 193.62f)
                curveTo(159.54f, 214.44f, 135.72f, 223.52f, 128.56f, 225.89f)
                close()
                moveTo(222.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 19.38f, -3.67f, 37.37f, -10.92f, 53.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.93f)
                curveToRelative(6.55f, -14.54f, 9.87f, -30.87f, 9.87f, -48.54f)
                lineTo(209.95f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(98.52f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                lineTo(208.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
