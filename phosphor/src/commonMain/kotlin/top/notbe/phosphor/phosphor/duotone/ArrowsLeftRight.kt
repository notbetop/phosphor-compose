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

public val DuotoneGroup.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) {
            return _arrowsLeftRight!!
        }
        _arrowsLeftRight = Builder(name = "ArrowsLeftRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 176.0f)
                lineToRelative(-32.0f, 32.0f)
                verticalLineTo(144.0f)
                close()
                moveTo(80.0f, 112.0f)
                verticalLineTo(48.0f)
                lineTo(48.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 170.34f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 144.0f)
                verticalLineToRelative(24.0f)
                lineTo(48.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(168.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 170.34f)
                close()
                moveTo(184.0f, 188.69f)
                lineTo(184.0f, 163.31f)
                lineTo(196.69f, 176.0f)
                close()
                moveTo(74.34f, 117.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 112.0f)
                lineTo(88.0f, 88.0f)
                lineTo(208.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 72.0f)
                lineTo(88.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                close()
                moveTo(72.0f, 67.31f)
                lineTo(72.0f, 92.69f)
                lineTo(59.31f, 80.0f)
                close()
            }
        }
        .build()
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
