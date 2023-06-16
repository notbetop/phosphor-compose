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

public val ThinGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.6f, 215.24f)
                lineToRelative(-8.09f, -28.32f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 166.76f, 76.31f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 28.49f, 138.92f)
                lineTo(20.4f, 167.24f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 30.0f, 180.0f)
                arcToRelative(10.08f, 10.08f, 0.0f, false, false, 2.8f, -0.4f)
                lineToRelative(28.32f, -8.09f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 28.13f, 8.18f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 105.71f, 39.82f)
                lineToRelative(28.32f, 8.09f)
                arcToRelative(10.08f, 10.08f, 0.0f, false, false, 2.8f, 0.4f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 9.56f, -12.76f)
                close()
                moveTo(61.53f, 163.24f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -1.1f, 0.16f)
                lineToRelative(-29.87f, 8.53f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.47f, -2.47f)
                lineToRelative(8.53f, -29.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 27.16f, 27.16f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 61.53f, 163.22f)
                close()
                moveTo(227.4f, 219.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 0.51f)
                lineToRelative(-29.87f, -8.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 0.33f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 98.0f, 180.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 71.5f, -95.28f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 50.21f, 99.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, 3.0f)
                lineToRelative(8.53f, 29.87f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 227.4f, 219.4f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
