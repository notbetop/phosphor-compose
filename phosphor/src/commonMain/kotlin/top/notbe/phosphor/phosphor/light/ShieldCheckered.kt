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

public val LightGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 88.25f, 74.68f, 117.52f, 89.65f, 122.49f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 8.7f, 0.0f)
                curveToRelative(15.0f, -5.0f, 89.65f, -34.24f, 89.65f, -122.49f)
                lineTo(222.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(210.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 2.46f, -0.07f, 4.86f, -0.19f, 7.21f)
                lineTo(134.0f, 121.98f)
                lineTo(134.0f, 54.0f)
                horizontalLineToRelative(74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 56.0f)
                close()
                moveTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(74.0f)
                verticalLineToRelative(68.0f)
                lineTo(46.19f, 122.0f)
                curveToRelative(-0.12f, -2.35f, -0.19f, -4.75f, -0.19f, -7.21f)
                close()
                moveTo(47.4f, 134.0f)
                lineTo(122.0f, 134.0f)
                verticalLineToRelative(89.9f)
                curveTo(103.17f, 216.44f, 56.08f, 192.18f, 47.4f, 134.0f)
                close()
                moveTo(134.0f, 223.9f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(74.6f)
                curveTo(199.92f, 192.17f, 152.83f, 216.44f, 134.0f, 223.9f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
