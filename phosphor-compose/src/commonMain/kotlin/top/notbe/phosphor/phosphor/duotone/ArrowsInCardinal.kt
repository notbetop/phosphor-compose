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

public val DuotoneGroup.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) {
            return _arrowsInCardinal!!
        }
        _arrowsInCardinal = Builder(name = "ArrowsInCardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 96.0f)
                lineTo(96.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(96.0f, 192.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(-32.0f, -32.0f)
                close()
                moveTo(160.0f, 128.0f)
                lineTo(192.0f, 160.0f)
                lineTo(192.0f, 96.0f)
                close()
                moveTo(64.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineToRelative(32.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.34f, 101.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 56.0f)
                lineTo(136.0f, 56.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                close()
                moveTo(140.69f, 72.0f)
                lineTo(128.0f, 84.69f)
                lineTo(115.31f, 72.0f)
                close()
                moveTo(133.69f, 154.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 200.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 200.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                close()
                moveTo(115.31f, 184.0f)
                lineTo(128.0f, 171.31f)
                lineTo(140.69f, 184.0f)
                close()
                moveTo(232.0f, 120.0f)
                lineTo(200.0f, 120.0f)
                lineTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 160.0f)
                lineTo(200.0f, 136.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(184.0f, 140.69f)
                lineTo(171.31f, 128.0f)
                lineTo(184.0f, 115.31f)
                close()
                moveTo(101.66f, 122.34f)
                lineTo(69.66f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 96.0f)
                verticalLineToRelative(24.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 101.66f, 122.34f)
                close()
                moveTo(72.0f, 140.69f)
                lineTo(72.0f, 115.31f)
                lineTo(84.69f, 128.0f)
                close()
            }
        }
        .build()
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
