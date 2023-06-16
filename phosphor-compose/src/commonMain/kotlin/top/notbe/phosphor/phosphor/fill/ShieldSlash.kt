package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.77f)
                lineToRelative(-14.51f, -16.0f)
                arcTo(147.19f, 147.19f, 0.0f, false, true, 133.0f, 239.18f)
                arcToRelative(15.44f, 15.44f, 0.0f, false, true, -10.0f, 0.0f)
                curveToRelative(-15.2f, -5.0f, -91.0f, -34.76f, -91.0f, -124.38f)
                verticalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.26f, -14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -7.39f)
                close()
                moveTo(208.0f, 40.0f)
                horizontalLineTo(98.52f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.6f, 53.38f)
                lineTo(199.69f, 171.17f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 5.91f, 2.62f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, false, 1.26f, -0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -4.61f)
                curveToRelative(7.37f, -16.36f, 11.1f, -34.62f, 11.1f, -54.29f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
