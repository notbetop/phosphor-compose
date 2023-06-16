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

public val LightGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 100.68f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(165.21f, 22.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(116.68f, 50.83f)
                lineTo(58.22f, 72.76f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.9f, 10.8f)
                lineTo(26.08f, 223.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 230.0f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, 1.0f, -0.08f)
                lineToRelative(139.44f, -23.24f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.81f, -8.9f)
                lineToRelative(21.92f, -58.46f)
                lineToRelative(28.74f, -28.74f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 238.0f, 100.68f)
                close()
                moveTo(172.0f, 193.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.54f, 1.27f)
                lineTo(49.49f, 215.0f)
                lineToRelative(52.87f, -52.88f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -8.48f, -8.48f)
                lineTo(41.0f, 206.53f)
                lineToRelative(20.17f, -121.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 62.43f, 84.0f)
                lineToRelative(56.06f, -21.0f)
                lineTo(193.0f, 137.51f)
                close()
                moveTo(102.0f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 102.0f, 140.0f)
                close()
                moveTo(225.41f, 102.1f)
                lineTo(200.0f, 127.51f)
                lineTo(128.48f, 56.0f)
                lineTo(153.9f, 30.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(68.68f, 68.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
