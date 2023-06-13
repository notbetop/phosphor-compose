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

public val LightGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.43f, 112.53f)
                lineTo(206.0f, 107.71f)
                verticalLineTo(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(42.0f)
                horizontalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 56.0f)
                verticalLineToRelative(51.71f)
                lineToRelative(-14.43f, 4.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 125.82f)
                verticalLineTo(160.1f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, 0.23f, 1.64f)
                curveToRelative(15.41f, 54.0f, 84.84f, 72.7f, 98.6f, 75.9f)
                arcToRelative(14.14f, 14.14f, 0.0f, false, false, 6.34f, 0.0f)
                curveToRelative(13.76f, -3.2f, 83.19f, -21.88f, 98.6f, -75.9f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, 0.23f, -1.64f)
                verticalLineTo(125.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 220.43f, 112.53f)
                close()
                moveTo(62.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(47.7f)
                lineTo(129.9f, 82.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.8f, 0.0f)
                lineTo(62.0f, 103.7f)
                close()
                moveTo(218.0f, 159.24f)
                curveToRelative(-5.87f, 19.62f, -21.0f, 36.3f, -45.0f, 49.56f)
                arcTo(183.74f, 183.74f, 0.0f, false, true, 128.45f, 226.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, 0.0f)
                arcTo(183.74f, 183.74f, 0.0f, false, true, 83.0f, 208.8f)
                curveToRelative(-24.0f, -13.26f, -39.11f, -29.94f, -45.0f, -49.56f)
                verticalLineTo(125.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, -1.91f)
                lineTo(122.0f, 96.33f)
                verticalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(96.33f)
                lineToRelative(82.63f, 27.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, 1.91f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
