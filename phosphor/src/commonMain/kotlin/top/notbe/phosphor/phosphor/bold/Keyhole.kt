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

public val BoldGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(128.0f, 68.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -32.94f, 73.16f)
                lineToRelative(-9.92f, 24.92f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 188.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.86f, -21.92f)
                lineToRelative(-9.92f, -24.92f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 68.0f)
                close()
                moveTo(135.59f, 142.38f)
                lineTo(144.2f, 164.0f)
                lineTo(111.8f, 164.0f)
                lineToRelative(8.61f, -21.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.11f, -14.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 23.4f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 135.59f, 142.38f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
