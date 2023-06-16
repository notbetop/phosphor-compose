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

public val RegularGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.61f, 75.82f, 119.34f, 91.0f, 124.39f)
                arcToRelative(15.53f, 15.53f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(15.2f, -5.05f, 91.0f, -34.78f, 91.0f, -124.39f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 114.79f)
                curveToRelative(0.0f, 78.42f, -66.35f, 104.62f, -80.0f, 109.18f)
                curveToRelative(-13.53f, -4.51f, -80.0f, -30.69f, -80.0f, -109.18f)
                lineTo(48.0f, 56.0f)
                lineToRelative(160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
