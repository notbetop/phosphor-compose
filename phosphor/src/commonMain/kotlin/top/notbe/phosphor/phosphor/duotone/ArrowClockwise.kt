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

public val DuotoneGroup.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) {
            return _arrowClockwise!!
        }
        _arrowClockwise = Builder(name = "ArrowClockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.06f, 48.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(206.68f, 70.0f)
                lineTo(195.75f, 60.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -69.07f, 164.0f)
                horizontalLineTo(128.0f)
                arcToRelative(95.44f, 95.44f, 0.0f, false, false, 65.88f, -26.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -11.63f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 184.56f, 71.4f)
                lineToRelative(0.25f, 0.24f)
                lineToRelative(10.55f, 9.65f)
                lineToRelative(-17.0f, 17.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.06f, 48.57f)
                close()
                moveTo(224.0f, 96.0f)
                horizontalLineTo(203.31f)
                lineTo(224.0f, 75.28f)
                close()
            }
        }
        .build()
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
