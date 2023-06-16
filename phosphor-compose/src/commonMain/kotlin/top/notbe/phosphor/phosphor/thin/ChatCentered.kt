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

public val ThinGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(99.47f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.43f, 1.94f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(14.79f, 24.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.56f, 0.0f)
                lineToRelative(14.83f, -24.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.43f, -1.94f)
                lineTo(216.0f, 195.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(156.53f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.27f, 5.8f)
                lineToRelative(-14.83f, 24.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.88f, 0.0f)
                lineToRelative(-14.8f, -24.22f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 99.47f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null