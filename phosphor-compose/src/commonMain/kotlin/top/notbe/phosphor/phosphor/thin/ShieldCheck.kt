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

public val ThinGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.87f, 73.54f, 115.7f, 88.28f, 120.6f)
                arcToRelative(11.65f, 11.65f, 0.0f, false, false, 7.44f, 0.0f)
                curveToRelative(14.74f, -4.9f, 88.28f, -33.73f, 88.28f, -120.6f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 114.79f)
                curveToRelative(0.0f, 81.38f, -69.0f, 108.41f, -82.8f, 113.0f)
                arcToRelative(3.53f, 3.53f, 0.0f, false, true, -2.4f, 0.0f)
                curveTo(113.0f, 223.2f, 44.0f, 196.17f, 44.0f, 114.79f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(170.83f, 101.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-56.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(112.0f, 154.34f)
                lineToRelative(53.17f, -53.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 170.83f, 101.17f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
