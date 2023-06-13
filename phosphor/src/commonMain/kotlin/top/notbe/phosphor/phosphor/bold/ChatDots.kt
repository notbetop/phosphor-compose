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

public val BoldGroup.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 224.0f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 31.56f, 242.1f)
                arcToRelative(20.14f, 20.14f, 0.0f, false, false, 8.49f, 1.9f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 12.82f, -4.72f)
                lineToRelative(0.19f, -0.16f)
                lineTo(84.0f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(212.0f, 188.0f)
                lineTo(82.5f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -12.87f, 4.69f)
                lineToRelative(-0.19f, 0.16f)
                lineTo(44.0f, 215.14f)
                lineTo(44.0f, 68.0f)
                lineTo(212.0f, 68.0f)
                close()
                moveTo(88.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 128.0f)
                close()
                moveTo(136.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 136.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
