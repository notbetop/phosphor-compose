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

public val FillGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.79f, 187.33f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.57f, 72.59f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 24.21f, 139.33f)
                lineToRelative(-7.66f, 26.82f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.3f, 17.3f)
                lineToRelative(26.82f, -7.66f)
                arcToRelative(80.15f, 80.15f, 0.0f, false, false, 25.75f, 7.63f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.91f, 40.37f)
                lineToRelative(26.82f, 7.66f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.3f, -17.3f)
                close()
                moveTo(215.53f, 188.67f)
                lineTo(223.08f, 215.08f)
                lineTo(196.67f, 207.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 0.68f)
                arcToRelative(64.06f, 64.06f, 0.0f, false, true, -86.32f, -24.64f)
                arcTo(79.93f, 79.93f, 0.0f, false, false, 174.7f, 89.71f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 41.51f, 92.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.53f, 188.67f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
