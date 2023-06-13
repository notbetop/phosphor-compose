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

public val DuotoneGroup.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) {
            return _arrowsSplit!!
        }
        _arrowsSplit = Builder(name = "ArrowsSplit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 184.0f)
                lineTo(96.0f, 184.0f)
                lineTo(64.0f, 216.0f)
                close()
                moveTo(160.0f, 184.0f)
                lineTo(192.0f, 216.0f)
                lineTo(224.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.39f, 180.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 176.0f)
                lineTo(200.0f, 176.0f)
                lineTo(200.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineTo(136.0f, 68.69f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 68.69f)
                lineTo(58.34f, 130.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 136.0f)
                verticalLineToRelative(40.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 176.0f)
                lineTo(72.0f, 176.0f)
                lineTo(72.0f, 139.31f)
                lineToRelative(56.0f, -56.0f)
                lineToRelative(56.0f, 56.0f)
                lineTo(184.0f, 176.0f)
                lineTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.39f, 180.94f)
                close()
                moveTo(64.0f, 204.69f)
                lineTo(51.31f, 192.0f)
                lineTo(76.69f, 192.0f)
                close()
                moveTo(192.0f, 204.69f)
                lineTo(179.31f, 192.0f)
                horizontalLineToRelative(25.38f)
                close()
            }
        }
        .build()
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
