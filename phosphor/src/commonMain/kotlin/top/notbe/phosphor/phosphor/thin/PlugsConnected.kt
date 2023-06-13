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

public val ThinGroup.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) {
            return _plugsConnected!!
        }
        _plugsConnected = Builder(name = "PlugsConnected", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(173.94f, 76.4f)
                lineToRelative(-8.2f, -8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(100.0f, 94.34f)
                lineToRelative(-9.17f, -9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(94.34f, 100.0f)
                lineTo(68.2f, 126.14f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(8.2f, 8.2f)
                lineTo(21.17f, 229.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(82.06f, 179.6f)
                lineToRelative(8.2f, 8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(156.0f, 161.66f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(161.66f, 156.0f)
                lineToRelative(26.14f, -26.14f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineToRelative(-8.2f, -8.2f)
                lineToRelative(55.23f, -55.23f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 21.17f)
                close()
                moveTo(124.2f, 182.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                lineTo(73.86f, 160.08f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.28f)
                lineTo(100.0f, 105.66f)
                lineTo(150.34f, 156.0f)
                close()
                moveTo(182.14f, 124.23f)
                lineTo(156.0f, 150.34f)
                lineTo(105.66f, 100.0f)
                lineTo(131.8f, 73.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 182.14f, 124.2f)
                close()
                moveTo(92.21f, 33.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.58f, -2.53f)
                lineToRelative(8.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.53f, 5.06f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 104.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.74f)
                close()
                moveTo(28.21f, 94.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -2.53f)
                lineToRelative(24.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 108.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.26f, -0.21f)
                lineToRelative(-24.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.21f, 94.73f)
                close()
                moveTo(227.79f, 161.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 164.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.26f, -0.21f)
                lineToRelative(-24.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.52f, -7.59f)
                lineToRelative(24.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 227.79f, 161.27f)
                close()
                moveTo(163.79f, 222.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.53f, 5.06f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 160.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.73f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.58f, -2.54f)
                close()
            }
        }
        .build()
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
