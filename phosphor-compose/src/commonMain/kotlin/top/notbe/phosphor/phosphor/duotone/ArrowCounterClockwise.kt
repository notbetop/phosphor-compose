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

public val DuotoneGroup.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) {
            return _arrowCounterClockwise!!
        }
        _arrowCounterClockwise = Builder(name = "ArrowCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 104.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.88f, 60.08f)
                arcTo(96.08f, 96.08f, 0.0f, false, false, 60.25f, 60.0f)
                lineTo(49.31f, 70.0f)
                lineTo(29.66f, 50.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -13.66f)
                lineToRelative(-17.0f, -17.0f)
                lineToRelative(10.54f, -9.65f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, 0.26f, -0.25f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 1.65f, 114.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, 11.63f)
                arcTo(95.38f, 95.38f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(1.32f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 195.88f, 60.08f)
                close()
                moveTo(32.0f, 96.0f)
                verticalLineTo(75.28f)
                lineTo(52.69f, 96.0f)
                close()
            }
        }
        .build()
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
