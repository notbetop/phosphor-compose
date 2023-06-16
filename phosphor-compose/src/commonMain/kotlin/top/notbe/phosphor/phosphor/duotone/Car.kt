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

public val DuotoneGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(194.11f, 52.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 186.8f, 48.0f)
                horizontalLineTo(69.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.31f, 4.75f)
                lineTo(32.0f, 120.0f)
                horizontalLineTo(224.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 112.0f)
                lineTo(229.2f, 112.0f)
                lineTo(201.42f, 49.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 186.8f, 40.0f)
                lineTo(69.2f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.62f, 9.5f)
                lineTo(26.8f, 112.0f)
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
                moveTo(69.2f, 56.0f)
                lineTo(186.8f, 56.0f)
                lineToRelative(24.89f, 56.0f)
                lineTo(44.31f, 112.0f)
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
        return _car!!
    }

private var _car: ImageVector? = null
