package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) {
            return _shieldWarning!!
        }
        _shieldWarning = Builder(name = "ShieldWarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.62f, 75.82f, 119.34f, 91.0f, 124.38f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.05f, 91.0f, -34.77f, 91.0f, -124.39f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 114.79f)
                curveToRelative(0.0f, 78.42f, -66.34f, 104.62f, -80.0f, 109.18f)
                curveToRelative(-13.53f, -4.5f, -80.0f, -30.68f, -80.0f, -109.18f)
                lineTo(48.0f, 56.0f)
                lineToRelative(160.0f, 0.0f)
                close()
                moveTo(120.0f, 136.0f)
                lineTo(120.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(116.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 172.0f)
                close()
            }
        }
        .build()
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
