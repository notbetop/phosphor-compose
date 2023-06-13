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

public val FillGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 200.41f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 240.0f, 216.0f)
                lineTo(147.31f, 216.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -11.26f, -4.63f)
                lineTo(28.78f, 107.42f)
                lineToRelative(-0.09f, -0.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.62f)
                lineToRelative(64.0f, -64.12f)
                lineToRelative(0.15f, -0.14f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, true, 22.35f, 0.27f)
                lineTo(123.4f, 29.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 4.66f, 10.54f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.13f, 22.83f, 16.91f, 38.26f, 41.19f, 40.26f)
                arcTo(16.13f, 16.13f, 0.0f, false, true, 184.0f, 95.7f)
                lineTo(184.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(152.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.53f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 8.25f, 7.47f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.55f)
                arcToRelative(31.31f, 31.31f, 0.0f, false, false, 1.64f, 7.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.77f, 5.3f)
                lineTo(160.0f, 143.99f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.53f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 8.25f, 7.47f)
                lineTo(216.0f, 159.99f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 256.0f, 200.41f)
                close()
                moveTo(72.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 176.0f)
                close()
                moveTo(96.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
