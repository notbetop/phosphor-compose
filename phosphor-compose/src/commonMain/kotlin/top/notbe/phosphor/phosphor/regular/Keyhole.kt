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

public val RegularGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -28.28f, 68.28f)
                lineTo(88.86f, 167.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 184.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.14f, -16.44f)
                lineToRelative(-10.86f, -27.28f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 72.0f)
                close()
                moveTo(139.31f, 140.9f)
                lineTo(150.1f, 168.0f)
                lineTo(105.9f, 168.0f)
                lineToRelative(10.79f, -27.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.74f, -9.44f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 28.1f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 139.31f, 140.9f)
                close()
                moveTo(152.31f, 173.48f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
