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

public val LightGroup.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) {
            return _chatTeardropDots!!
        }
        _chatTeardropDots = Builder(name = "ChatTeardropDots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 26.0f)
                arcToRelative(98.11f, 98.11f, 0.0f, false, false, -98.0f, 98.0f)
                verticalLineToRelative(84.33f)
                arcTo(13.68f, 13.68f, 0.0f, false, false, 47.67f, 222.0f)
                lineTo(132.0f, 222.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.0f, -196.0f)
                close()
                moveTo(132.0f, 210.0f)
                lineTo(47.67f, 210.0f)
                arcTo(1.67f, 1.67f, 0.0f, false, true, 46.0f, 208.33f)
                lineTo(46.0f, 124.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, true, 86.0f, 86.0f)
                close()
                moveTo(142.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 128.0f)
                close()
                moveTo(98.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 98.0f, 128.0f)
                close()
                moveTo(186.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 186.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
