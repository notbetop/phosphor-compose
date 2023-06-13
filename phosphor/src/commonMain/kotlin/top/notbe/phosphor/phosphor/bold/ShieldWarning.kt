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

public val BoldGroup.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) {
            return _shieldWarning!!
        }
        _shieldWarning = Builder(name = "ShieldWarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 114.8f)
                curveToRelative(0.0f, 92.36f, 78.1f, 123.0f, 93.75f, 128.18f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, false, 12.49f, 0.0f)
                curveTo(149.9f, 237.78f, 228.0f, 207.16f, 228.0f, 114.8f)
                lineTo(228.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(204.0f, 114.8f)
                curveToRelative(0.0f, 73.55f, -60.52f, 99.52f, -76.0f, 105.0f)
                curveToRelative(-15.47f, -5.42f, -76.0f, -31.39f, -76.0f, -104.95f)
                lineTo(52.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                close()
                moveTo(116.0f, 132.0f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(112.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 172.0f)
                close()
            }
        }
        .build()
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
