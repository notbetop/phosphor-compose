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

public val ThinGroup.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) {
            return _chatTeardropText!!
        }
        _chatTeardropText = Builder(name = "ChatTeardropText", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f)
                close()
                moveTo(160.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 124.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, 96.0f)
                lineTo(47.67f, 220.0f)
                arcTo(11.68f, 11.68f, 0.0f, false, true, 36.0f, 208.33f)
                lineTo(36.0f, 124.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 192.0f, 0.0f)
                close()
                moveTo(220.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                verticalLineToRelative(84.33f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 47.67f, 212.0f)
                lineTo(132.0f, 212.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 220.0f, 124.0f)
                close()
            }
        }
        .build()
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
