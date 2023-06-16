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

public val BoldGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 92.37f, 78.1f, 123.0f, 93.75f, 128.18f)
                arcToRelative(19.82f, 19.82f, 0.0f, false, false, 5.66f, 1.0f)
                curveToRelative(0.2f, 0.0f, 0.39f, 0.0f, 0.59f, 0.0f)
                reflectiveCurveToRelative(0.39f, 0.0f, 0.58f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 5.66f, -1.0f)
                curveTo(149.9f, 237.78f, 228.0f, 207.16f, 228.0f, 114.79f)
                lineTo(228.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(204.0f, 114.79f)
                curveToRelative(0.0f, 0.41f, 0.0f, 0.81f, 0.0f, 1.21f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(52.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(56.0f)
                lineTo(52.0f, 116.0f)
                curveToRelative(0.0f, -0.4f, 0.0f, -0.8f, 0.0f, -1.21f)
                close()
                moveTo(54.59f, 140.0f)
                lineTo(116.0f, 140.0f)
                verticalLineToRelative(74.72f)
                curveTo(96.33f, 205.21f, 63.92f, 183.37f, 54.59f, 140.0f)
                close()
                moveTo(140.0f, 214.72f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(61.41f)
                curveTo(192.08f, 183.37f, 159.67f, 205.21f, 140.0f, 214.72f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
