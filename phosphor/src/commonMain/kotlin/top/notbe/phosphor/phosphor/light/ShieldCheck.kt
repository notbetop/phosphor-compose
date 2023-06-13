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

public val LightGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 88.24f, 74.68f, 117.52f, 89.65f, 122.49f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 8.7f, 0.0f)
                curveToRelative(15.0f, -5.0f, 89.65f, -34.25f, 89.65f, -122.49f)
                lineTo(222.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(210.0f, 114.79f)
                curveToRelative(0.0f, 80.0f, -67.84f, 106.59f, -81.44f, 111.1f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -1.12f, 0.0f)
                curveTo(113.84f, 221.38f, 46.0f, 194.79f, 46.0f, 114.79f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(172.24f, 99.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(112.0f, 151.51f)
                lineToRelative(51.76f, -51.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 172.24f, 99.76f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
