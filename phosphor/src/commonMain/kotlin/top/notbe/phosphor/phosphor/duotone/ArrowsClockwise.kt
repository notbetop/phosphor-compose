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

public val DuotoneGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(168.0f)
                close()
                moveTo(40.0f, 208.0f)
                lineToRelative(48.0f, -48.0f)
                horizontalLineTo(40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.06f, 40.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(194.28f, 58.41f)
                curveTo(174.13f, 41.1f, 151.36f, 32.0f, 128.0f, 32.0f)
                curveTo(85.18f, 32.0f, 59.42f, 57.27f, 58.34f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 69.66f, 69.66f)
                curveTo(69.87f, 69.44f, 91.73f, 48.0f, 128.0f, 48.0f)
                curveToRelative(23.17f, 0.0f, 41.92f, 10.85f, 54.92f, 21.76f)
                lineTo(162.34f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 104.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 219.06f, 40.61f)
                close()
                moveTo(208.0f, 88.0f)
                lineTo(187.31f, 88.0f)
                lineTo(208.0f, 67.31f)
                close()
                moveTo(186.34f, 186.34f)
                curveToRelative(-0.21f, 0.22f, -22.07f, 21.66f, -58.34f, 21.66f)
                curveToRelative(-23.17f, 0.0f, -41.92f, -10.85f, -54.92f, -21.76f)
                lineToRelative(20.58f, -20.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 152.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(16.06f, -16.07f)
                curveTo(81.87f, 214.9f, 104.64f, 224.0f, 128.0f, 224.0f)
                curveToRelative(42.82f, 0.0f, 68.58f, -25.27f, 69.66f, -26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                close()
                moveTo(48.0f, 168.0f)
                lineTo(68.69f, 168.0f)
                lineTo(48.0f, 188.69f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
