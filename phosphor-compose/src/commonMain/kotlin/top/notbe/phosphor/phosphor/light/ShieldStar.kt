package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) {
            return _shieldStar!!
        }
        _shieldStar = Builder(name = "ShieldStar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.57f, 117.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.34f, 7.8f)
                lineTo(137.5f, 138.66f)
                lineToRelative(19.3f, 25.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.6f, 7.2f)
                lineTo(128.0f, 146.0f)
                lineToRelative(-19.2f, 25.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                lineToRelative(19.3f, -25.74f)
                lineTo(85.77f, 125.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.46f, -11.14f)
                lineTo(122.0f, 127.14f)
                lineTo(122.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(31.14f)
                lineToRelative(31.77f, -12.71f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 173.57f, 117.77f)
                close()
                moveTo(222.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 88.25f, -74.68f, 117.52f, -89.65f, 122.49f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, true, -8.7f, 0.0f)
                curveTo(108.68f, 232.31f, 34.0f, 203.0f, 34.0f, 114.79f)
                lineTo(34.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 42.0f)
                lineTo(208.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f)
                close()
                moveTo(210.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 80.0f, 67.84f, 106.59f, 81.43f, 111.1f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, false, 1.13f, 0.0f)
                curveToRelative(13.6f, -4.51f, 81.44f, -31.09f, 81.44f, -111.1f)
                close()
            }
        }
        .build()
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
