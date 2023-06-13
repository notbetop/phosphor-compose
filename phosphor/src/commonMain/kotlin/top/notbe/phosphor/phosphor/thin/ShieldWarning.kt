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

public val ThinGroup.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) {
            return _shieldWarning!!
        }
        _shieldWarning = Builder(name = "ShieldWarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.88f, 73.54f, 115.7f, 88.28f, 120.59f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, false, 7.44f, 0.0f)
                curveTo(146.46f, 230.49f, 220.0f, 201.67f, 220.0f, 114.79f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 114.79f)
                curveToRelative(0.0f, 81.38f, -69.0f, 108.41f, -82.81f, 113.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -2.39f, 0.0f)
                curveTo(113.0f, 223.2f, 44.0f, 196.17f, 44.0f, 114.79f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(124.0f, 136.0f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(136.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 172.0f)
                close()
            }
        }
        .build()
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
