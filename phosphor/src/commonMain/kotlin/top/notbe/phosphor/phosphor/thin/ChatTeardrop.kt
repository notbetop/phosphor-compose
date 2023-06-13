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

public val ThinGroup.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) {
            return _chatTeardrop!!
        }
        _chatTeardrop = Builder(name = "ChatTeardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 28.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, 96.0f)
                verticalLineToRelative(84.33f)
                arcTo(11.68f, 11.68f, 0.0f, false, false, 47.67f, 220.0f)
                lineTo(132.0f, 220.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 0.0f, -192.0f)
                close()
                moveTo(132.0f, 212.0f)
                lineTo(47.67f, 212.0f)
                arcTo(3.67f, 3.67f, 0.0f, false, true, 44.0f, 208.33f)
                lineTo(44.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, 88.0f)
                close()
            }
        }
        .build()
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
