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

public val DuotoneGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.39f, 75.35f)
                lineTo(128.0f, 128.0f)
                lineTo(90.39f, 180.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 83.88f, 184.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(83.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 90.39f, 75.35f)
                close()
                moveTo(172.12f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.51f, 3.35f)
                lineTo(128.0f, 128.0f)
                lineToRelative(37.61f, 52.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.51f, 3.35f)
                horizontalLineTo(232.0f)
                verticalLineTo(72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 178.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(212.69f, 192.0f)
                lineTo(172.12f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.0f, -6.7f)
                lineTo(83.88f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(83.88f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.0f, 6.7f)
                lineTo(172.12f, 176.0f)
                horizontalLineToRelative(40.57f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.16f, -1.86f)
                lineToRelative(18.0f, -25.12f)
                horizontalLineToRelative(40.57f)
                lineTo(202.34f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(212.69f, 64.0f)
                lineTo(172.12f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.0f, 6.7f)
                lineTo(141.15f, 95.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(113.0f, 149.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f)
                lineTo(83.88f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(83.88f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.0f, -6.7f)
                lineToRelative(17.95f, -25.12f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
