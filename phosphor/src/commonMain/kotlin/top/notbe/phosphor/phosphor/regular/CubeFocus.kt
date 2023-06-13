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

public val RegularGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 157.43f)
                lineTo(192.0f, 98.57f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -6.42f, -11.24f)
                lineTo(134.24f, 57.68f)
                arcToRelative(12.48f, 12.48f, 0.0f, false, false, -12.48f, 0.0f)
                lineTo(70.43f, 87.33f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 64.0f, 98.57f)
                verticalLineToRelative(58.86f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 6.42f, 11.24f)
                lineToRelative(51.34f, 29.65f)
                arcToRelative(12.49f, 12.49f, 0.0f, false, false, 12.48f, 0.0f)
                lineToRelative(51.33f, -29.65f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 192.0f, 157.43f)
                close()
                moveTo(128.0f, 72.55f)
                lineTo(168.59f, 96.0f)
                lineTo(128.0f, 119.43f)
                lineTo(87.41f, 96.0f)
                close()
                moveTo(80.0f, 110.19f)
                lineToRelative(40.0f, 23.1f)
                verticalLineToRelative(45.54f)
                lineToRelative(-40.0f, -23.1f)
                close()
                moveTo(136.0f, 178.83f)
                lineTo(136.0f, 133.29f)
                lineToRelative(40.0f, -23.1f)
                verticalLineToRelative(45.54f)
                close()
                moveTo(232.0f, 48.0f)
                lineTo(232.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 56.0f)
                lineTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(80.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(24.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                lineTo(72.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 208.0f)
                close()
                moveTo(232.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(184.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(216.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(24.0f, 88.0f)
                lineTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
