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

public val ThinGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.8f, 114.42f)
                lineTo(204.0f, 109.15f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f)
                verticalLineToRelative(53.15f)
                lineToRelative(-15.8f, 5.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.2f, 11.4f)
                verticalLineToRelative(34.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.15f, 1.1f)
                curveToRelative(15.11f, 52.94f, 83.57f, 71.34f, 97.14f, 74.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.42f, 0.0f)
                curveToRelative(13.57f, -3.16f, 82.0f, -21.56f, 97.14f, -74.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.15f, -1.1f)
                verticalLineTo(125.82f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.8f, 114.42f)
                close()
                moveTo(60.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(50.48f)
                lineTo(129.27f, 84.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.54f, 0.0f)
                lineTo(60.0f, 106.48f)
                close()
                moveTo(220.0f, 159.53f)
                curveToRelative(-6.0f, 20.26f, -21.44f, 37.43f, -46.0f, 51.0f)
                arcToRelative(185.71f, 185.71f, 0.0f, false, true, -45.09f, 17.34f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.8f, 0.0f)
                arcTo(185.71f, 185.71f, 0.0f, false, true, 82.0f, 210.55f)
                curveTo(57.44f, 197.0f, 42.0f, 179.79f, 36.0f, 159.53f)
                verticalLineTo(125.82f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.74f, 122.0f)
                lineTo(124.0f, 93.55f)
                verticalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(93.55f)
                lineTo(217.26f, 122.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.74f, 3.81f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
