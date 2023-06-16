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

public val BoldGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 100.68f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -5.86f, -14.14f)
                lineTo(169.46f, 17.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(113.35f, 45.67f)
                lineTo(56.11f, 67.14f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 43.4f, 82.58f)
                lineTo(20.16f, 222.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 236.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 2.0f, -0.16f)
                lineToRelative(139.45f, -23.25f)
                arcToRelative(20.07f, 20.07f, 0.0f, false, false, 15.44f, -12.7f)
                lineToRelative(21.46f, -57.25f)
                lineToRelative(27.82f, -27.82f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 244.0f, 100.68f)
                close()
                moveTo(167.2f, 189.3f)
                lineTo(67.0f, 206.0f)
                lineToRelative(33.0f, -33.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(50.0f, 189.0f)
                lineTo(66.7f, 88.8f)
                lineTo(117.0f, 69.94f)
                lineTo(186.05f, 139.0f)
                close()
                moveTo(104.0f, 142.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 104.0f, 142.0f)
                close()
                moveTo(200.0f, 119.0f)
                lineTo(137.0f, 56.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(63.0f, 63.0f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
