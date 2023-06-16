package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(147.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f)
                lineToRelative(-107.32f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(64.0f, -64.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.17f, 0.13f)
                lineToRelative(8.23f, 8.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.32f, 5.28f)
                curveToRelative(1.36f, 27.59f, 21.35f, 45.66f, 48.66f, 47.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.27f, 8.0f)
                verticalLineTo(120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 248.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(184.0f, 95.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.63f, -15.94f)
                curveToRelative(-24.35f, -2.0f, -40.18f, -17.39f, -41.31f, -40.27f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 123.4f, 29.0f)
                lineToRelative(-8.22f, -8.23f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -22.35f, -0.27f)
                lineToRelative(-0.15f, 0.14f)
                lineToRelative(-64.0f, 64.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineToRelative(0.09f, 0.09f)
                lineToRelative(107.27f, 104.0f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 147.31f, 216.0f)
                lineTo(240.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
                moveTo(240.0f, 200.0f)
                lineTo(147.31f, 200.0f)
                lineToRelative(-0.09f, -0.08f)
                lineTo(40.0f, 96.0f)
                lineToRelative(63.87f, -64.0f)
                lineToRelative(8.21f, 8.2f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.76f, 15.42f, 6.65f, 28.85f, 17.0f, 38.83f)
                curveToRelative(10.0f, 9.6f, 23.45f, 15.34f, 38.88f, 16.6f)
                lineTo(167.96f, 112.0f)
                lineTo(152.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.68f)
                arcToRelative(47.64f, 47.64f, 0.0f, false, false, 5.78f, 16.0f)
                lineTo(160.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(29.51f)
                arcTo(47.67f, 47.67f, 0.0f, false, false, 216.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                close()
                moveTo(64.0f, 184.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(104.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
