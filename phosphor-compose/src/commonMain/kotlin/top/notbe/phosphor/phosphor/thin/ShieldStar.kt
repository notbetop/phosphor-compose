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

public val ThinGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.71f, 118.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.22f, 5.19f)
                lineToRelative(-35.16f, 14.07f)
                lineTo(155.2f, 165.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.4f, 4.8f)
                lineTo(128.0f, 142.67f)
                lineTo(107.2f, 170.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.4f, -4.8f)
                lineToRelative(20.87f, -27.82f)
                lineTo(86.51f, 123.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -7.42f)
                lineTo(124.0f, 130.09f)
                lineTo(124.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(34.09f)
                lineToRelative(34.51f, -13.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 171.71f, 118.52f)
                close()
                moveTo(220.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.88f, -73.54f, 115.7f, -88.28f, 120.59f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, true, -7.44f, 0.0f)
                curveTo(109.54f, 230.49f, 36.0f, 201.67f, 36.0f, 114.79f)
                lineTo(36.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 44.0f)
                lineTo(208.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
                moveTo(212.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 81.38f, 69.0f, 108.41f, 82.8f, 113.0f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 2.39f, 0.0f)
                curveTo(143.0f, 223.2f, 212.0f, 196.17f, 212.0f, 114.79f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
