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

public val DuotoneGroup.DiceFour: ImageVector
    get() {
        if (_diceFour != null) {
            return _diceFour!!
        }
        _diceFour = Builder(name = "DiceFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 64.0f, 40.0f)
                horizontalLineTo(192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 216.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(224.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 192.0f, 32.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 48.0f)
                lineTo(192.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(112.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 100.0f)
                close()
                moveTo(168.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 100.0f)
                close()
                moveTo(112.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 156.0f)
                close()
                moveTo(168.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 156.0f)
                close()
            }
        }
        .build()
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
