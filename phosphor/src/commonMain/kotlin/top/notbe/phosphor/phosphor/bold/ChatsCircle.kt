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

public val BoldGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.06f, 187.69f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 172.29f, 68.9f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 19.94f, 139.69f)
                lineTo(12.7f, 165.05f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 35.0f, 187.3f)
                lineToRelative(25.36f, -7.24f)
                arcToRelative(84.27f, 84.27f, 0.0f, false, false, 23.36f, 7.0f)
                arcToRelative(84.05f, 84.05f, 0.0f, false, false, 112.0f, 41.0f)
                lineToRelative(25.36f, 7.24f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 22.25f, -22.25f)
                close()
                moveTo(28.36f, 164.22f)
                close()
                moveTo(61.53f, 155.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.3f, 0.46f)
                lineToRelative(-19.49f, 5.57f)
                lineToRelative(5.57f, -19.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -9.05f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 61.53f, 155.23f)
                close()
                moveTo(211.69f, 189.76f)
                lineTo(217.26f, 209.25f)
                lineTo(197.77f, 203.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.05f, 1.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, true, 111.0f, 186.63f)
                arcToRelative(83.93f, 83.93f, 0.0f, false, false, 68.55f, -91.37f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 33.16f, 85.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 211.69f, 189.77f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
