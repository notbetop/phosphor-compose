package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 208.0f)
                close()
                moveTo(72.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 176.0f)
                close()
                moveTo(256.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
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
                curveToRelative(1.13f, 22.88f, 17.0f, 38.31f, 41.31f, 40.27f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 95.7f)
                lineTo(184.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 256.0f, 192.0f)
                close()
                moveTo(240.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                arcToRelative(47.67f, 47.67f, 0.0f, false, true, -26.49f, -8.0f)
                lineTo(160.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(14.46f)
                arcToRelative(47.64f, 47.64f, 0.0f, false, true, -5.78f, -16.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(168.0f, 95.7f)
                curveToRelative(-15.43f, -1.26f, -28.88f, -7.0f, -38.88f, -16.6f)
                curveToRelative(-10.39f, -10.0f, -16.28f, -23.41f, -17.0f, -38.83f)
                verticalLineToRelative(0.0f)
                lineTo(103.87f, 32.0f)
                lineTo(40.0f, 96.0f)
                lineToRelative(107.22f, 103.9f)
                lineToRelative(0.09f, 0.08f)
                lineTo(240.0f, 199.98f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
