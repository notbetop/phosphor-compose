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

public val ThinGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 100.68f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.51f, -8.48f)
                lineTo(163.8f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(117.78f, 52.56f)
                lineTo(58.92f, 74.63f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -7.63f, 9.26f)
                lineTo(28.05f, 223.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 228.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.66f, -0.05f)
                lineTo(172.1f, 204.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.27f, -7.62f)
                lineToRelative(22.07f, -58.86f)
                lineToRelative(29.0f, -29.0f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 236.0f, 100.68f)
                close()
                moveTo(173.88f, 194.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.09f, 2.54f)
                lineTo(43.66f, 218.0f)
                lineToRelative(58.45f, -58.45f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(38.0f, 212.35f)
                lineTo(59.19f, 85.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.54f, -3.09f)
                lineTo(119.0f, 60.64f)
                lineTo(195.35f, 137.0f)
                close()
                moveTo(100.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(226.83f, 103.51f)
                lineTo(200.0f, 130.34f)
                lineTo(125.66f, 56.0f)
                lineToRelative(26.82f, -26.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(68.69f, 68.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
