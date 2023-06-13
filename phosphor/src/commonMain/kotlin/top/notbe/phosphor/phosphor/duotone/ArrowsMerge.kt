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

public val DuotoneGroup.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) {
            return _arrowsMerge!!
        }
        _arrowsMerge = Builder(name = "ArrowsMerge", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 200.0f)
                lineToRelative(-32.0f, 32.0f)
                lineTo(96.0f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(60.69f)
                lineToRelative(-48.0f, 48.0f)
                lineToRelative(-48.0f, -48.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f)
                lineTo(120.0f, 163.31f)
                verticalLineTo(192.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 192.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(163.31f)
                lineToRelative(53.66f, -53.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 104.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 32.0f)
                close()
                moveTo(128.0f, 220.69f)
                lineTo(115.31f, 208.0f)
                horizontalLineToRelative(25.38f)
                close()
            }
        }
        .build()
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
