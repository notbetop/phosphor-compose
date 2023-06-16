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

public val DuotoneGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 184.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                close()
                moveTo(32.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(194.3f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.94f, -4.0f)
                horizontalLineTo(68.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.94f, 4.0f)
                lineTo(32.0f, 120.0f)
                horizontalLineTo(224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 112.0f)
                lineTo(228.64f, 112.0f)
                lineTo(201.25f, 64.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 187.36f, 56.0f)
                lineTo(165.42f, 56.0f)
                lineToRelative(-12.0f, -29.94f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 138.58f, 16.0f)
                lineTo(117.42f, 16.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -14.86f, 10.06f)
                lineTo(90.58f, 56.0f)
                lineTo(68.64f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.89f, 8.06f)
                lineTo(27.36f, 112.0f)
                lineTo(16.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 192.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 128.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(117.42f, 32.0f)
                horizontalLineToRelative(21.16f)
                lineToRelative(9.6f, 24.0f)
                lineTo(107.82f, 56.0f)
                close()
                moveTo(68.64f, 72.0f)
                lineTo(187.36f, 72.0f)
                lineToRelative(22.85f, 40.0f)
                lineTo(45.79f, 112.0f)
                close()
                moveTo(64.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                lineTo(40.0f, 192.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(192.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(40.0f, 176.0f)
                lineTo(40.0f, 128.0f)
                lineTo(216.0f, 128.0f)
                close()
                moveTo(56.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(80.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 152.0f)
                close()
                moveTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(176.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
