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

public val BoldGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(91.18f, 91.18f, 0.0f, false, true, -18.41f, 55.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.18f, -14.42f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 92.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, 2.19f, -20.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 72.0f, 196.0f)
                lineTo(96.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 220.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 79.0f, 84.37f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(160.49f, 119.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineTo(140.0f, 157.0f)
                verticalLineToRelative(51.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 157.0f)
                lineToRelative(11.51f, 11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
