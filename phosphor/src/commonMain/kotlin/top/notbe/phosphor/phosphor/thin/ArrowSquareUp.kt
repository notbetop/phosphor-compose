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

public val ThinGroup.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) {
            return _arrowSquareUp!!
        }
        _arrowSquareUp = Builder(name = "ArrowSquareUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(162.83f, 117.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(132.0f, 97.66f)
                lineTo(132.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 97.66f)
                lineTo(98.83f, 122.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
