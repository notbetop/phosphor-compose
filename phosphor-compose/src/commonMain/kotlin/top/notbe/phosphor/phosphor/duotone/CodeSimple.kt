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

public val DuotoneGroup.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                lineToRelative(-72.0f, 64.0f)
                horizontalLineTo(88.0f)
                lineTo(16.0f, 128.0f)
                lineTo(88.0f, 64.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.31f, 70.0f)
                lineTo(28.0f, 128.0f)
                lineToRelative(65.27f, 58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.62f, 12.0f)
                lineToRelative(-72.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineToRelative(72.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 93.31f, 70.0f)
                close()
                moveTo(245.31f, 122.0f)
                lineTo(173.31f, 58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.62f, 12.0f)
                lineTo(228.0f, 128.0f)
                lineToRelative(-65.27f, 58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.62f, 12.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
