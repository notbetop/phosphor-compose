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

public val ThinGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -59.55f, 27.22f)
                lineTo(92.57f, 169.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 180.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.43f, -11.0f)
                lineToRelative(-11.88f, -29.82f)
                arcTo(36.11f, 36.11f, 0.0f, false, false, 164.0f, 112.0f)
                close()
                moveTo(143.0f, 139.42f)
                lineTo(156.0f, 172.0f)
                lineTo(100.0f, 172.0f)
                lineToRelative(13.0f, -32.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.37f, -4.72f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 32.78f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 143.0f, 139.42f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
