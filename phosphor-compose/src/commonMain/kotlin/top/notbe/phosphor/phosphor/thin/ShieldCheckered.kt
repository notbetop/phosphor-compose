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

public val ThinGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.87f, 73.54f, 115.7f, 88.28f, 120.59f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, 3.7f, 0.62f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, 3.7f, -0.62f)
                curveTo(146.46f, 230.49f, 220.0f, 201.66f, 220.0f, 114.79f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 3.16f, -0.12f, 6.22f, -0.31f, 9.21f)
                lineTo(132.0f, 123.98f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 56.0f)
                close()
                moveTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(72.0f)
                lineTo(44.31f, 124.0f)
                curveToRelative(-0.19f, -3.0f, -0.31f, -6.0f, -0.31f, -9.21f)
                close()
                moveTo(45.09f, 132.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(94.81f)
                curveTo(107.0f, 220.55f, 53.4f, 196.0f, 45.09f, 132.0f)
                close()
                moveTo(132.0f, 226.81f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(78.91f)
                curveTo(202.6f, 196.0f, 149.0f, 220.55f, 132.0f, 226.81f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
