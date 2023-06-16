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

public val LightGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 187.13f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, -61.5f, -112.71f)
                arcTo(78.0f, 78.0f, 0.0f, true, false, 26.34f, 139.13f)
                lineTo(18.47f, 166.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 33.3f, 181.53f)
                lineToRelative(27.57f, -7.87f)
                arcToRelative(78.25f, 78.25f, 0.0f, false, false, 26.94f, 7.9f)
                arcToRelative(78.05f, 78.05f, 0.0f, false, false, 107.32f, 40.1f)
                lineToRelative(27.57f, 7.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.83f, -14.83f)
                close()
                moveTo(61.53f, 161.23f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, false, -1.65f, 0.23f)
                lineTo(30.0f, 170.0f)
                lineToRelative(8.53f, -29.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.53f)
                arcTo(66.0f, 66.0f, 0.0f, true, true, 64.41f, 162.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 61.53f, 161.23f)
                close()
                moveTo(217.46f, 188.12f)
                lineTo(226.0f, 218.0f)
                lineToRelative(-29.87f, -8.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.53f, 0.5f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -90.48f, -28.15f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, false, 71.0f, -94.68f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 218.0f, 183.59f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 217.46f, 188.12f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
