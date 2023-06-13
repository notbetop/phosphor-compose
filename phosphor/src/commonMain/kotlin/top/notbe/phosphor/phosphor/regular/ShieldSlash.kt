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

public val RegularGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.26f, 42.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 89.62f, 75.82f, 119.34f, 91.0f, 124.38f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(147.19f, 147.19f, 0.0f, false, false, 54.59f, -33.76f)
                lineToRelative(14.51f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.77f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-13.53f, -4.5f, -80.0f, -30.68f, -80.0f, -109.18f)
                verticalLineTo(56.0f)
                horizontalLineToRelative(3.73f)
                lineTo(176.8f, 193.57f)
                arcTo(130.13f, 130.13f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 19.67f, -3.73f, 37.93f, -11.1f, 54.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.59f, -6.57f)
                curveToRelative(6.43f, -14.28f, 9.69f, -30.33f, 9.69f, -47.72f)
                verticalLineTo(56.0f)
                lineTo(98.52f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
