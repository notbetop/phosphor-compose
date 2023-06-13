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

public val RegularGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                curveToRelative(0.0f, 1.77f, 0.0f, 3.5f, -0.11f, 5.21f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(48.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(64.0f)
                lineTo(48.11f, 120.0f)
                curveToRelative(-0.07f, -1.71f, -0.11f, -3.44f, -0.11f, -5.21f)
                close()
                moveTo(49.74f, 136.0f)
                lineTo(120.0f, 136.0f)
                verticalLineToRelative(84.92f)
                curveTo(100.32f, 212.56f, 58.73f, 188.92f, 49.74f, 136.0f)
                close()
                moveTo(136.0f, 220.91f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(70.26f)
                curveTo(197.27f, 188.89f, 155.72f, 212.54f, 136.0f, 220.91f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
