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

public val FillGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.31f, 89.36f)
                lineTo(166.63f, 20.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(115.56f, 49.12f)
                lineToRelative(-58.0f, 21.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 47.36f, 83.23f)
                lineTo(26.59f, 207.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.77f, 3.49f)
                lineToRelative(57.0f, -57.0f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, -2.29f, -12.08f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 13.6f, 23.4f)
                lineToRelative(-57.0f, 57.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.49f, 6.77f)
                lineToRelative(124.61f, -20.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.16f)
                lineToRelative(21.77f, -58.07f)
                lineTo(235.31f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(200.0f, 124.68f)
                lineTo(131.32f, 56.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(224.0f, 100.68f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
