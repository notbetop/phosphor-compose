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

public val BoldGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.5f, 162.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, 0.0f)
                curveTo(214.0f, 164.64f, 192.0f, 183.0f, 192.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                curveTo(256.0f, 183.0f, 234.0f, 164.64f, 231.5f, 162.63f)
                close()
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -6.8f, 3.91f, -13.64f, 8.0f, -18.83f)
                curveToRelative(4.07f, 5.17f, 8.0f, 12.0f, 8.0f, 18.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(232.49f, 115.0f)
                lineTo(125.0f, 7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(70.25f, 45.29f)
                lineTo(48.48f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(53.28f, 62.26f)
                lineTo(12.2f, 103.34f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineTo(97.06f, 227.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(232.49f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 115.0f)
                close()
                moveTo(119.69f, 210.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(29.17f, 126.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(70.25f, 79.23f)
                lineToRelative(21.27f, 21.26f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineTo(87.23f, 62.26f)
                lineTo(116.52f, 33.0f)
                lineTo(207.0f, 123.48f)
                close()
                moveTo(124.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 104.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
