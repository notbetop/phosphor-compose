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

public val BoldGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.86f, 115.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.6f, -6.69f)
                lineTo(116.0f, 118.28f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(22.28f)
                lineToRelative(23.54f, -9.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, 22.28f)
                lineTo(147.0f, 141.33f)
                lineTo(161.6f, 160.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.2f, 14.4f)
                lineTo(128.0f, 156.0f)
                lineToRelative(-14.4f, 19.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.2f, -14.4f)
                lineTo(109.0f, 141.33f)
                lineTo(83.54f, 131.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.86f, 115.55f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 114.8f)
                curveToRelative(0.0f, 92.36f, -78.1f, 123.0f, -93.76f, 128.18f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, true, -12.49f, 0.0f)
                curveTo(106.1f, 237.78f, 28.0f, 207.16f, 28.0f, 114.8f)
                lineTo(28.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(204.0f, 60.0f)
                lineTo(52.0f, 60.0f)
                verticalLineToRelative(54.8f)
                curveToRelative(0.0f, 73.56f, 60.53f, 99.53f, 76.0f, 105.0f)
                curveToRelative(15.48f, -5.43f, 76.0f, -31.4f, 76.0f, -104.95f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
