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

public val LightGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 224.0f)
                arcToRelative(13.88f, 13.88f, 0.0f, false, false, 8.09f, 12.69f)
                arcTo(14.11f, 14.11f, 0.0f, false, false, 40.0f, 238.0f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, 9.0f, -3.31f)
                lineToRelative(0.09f, -0.08f)
                lineToRelative(32.14f, -28.17f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 82.5f, 206.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 50.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(82.5f, 194.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.0f, 3.29f)
                lineToRelative(-0.09f, 0.08f)
                lineTo(41.25f, 225.54f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 224.0f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
