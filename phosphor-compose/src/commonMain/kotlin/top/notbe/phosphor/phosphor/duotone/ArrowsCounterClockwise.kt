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

public val DuotoneGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 48.0f)
                lineTo(88.0f, 96.0f)
                horizontalLineTo(40.0f)
                close()
                moveTo(168.0f, 160.0f)
                lineToRelative(48.0f, 48.0f)
                verticalLineTo(160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.39f, 99.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.73f, -8.72f)
                lineTo(73.08f, 69.76f)
                curveTo(86.08f, 58.85f, 104.83f, 48.0f, 128.0f, 48.0f)
                curveToRelative(35.95f, 0.0f, 58.13f, 21.44f, 58.36f, 21.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, -11.34f)
                curveTo(196.58f, 57.27f, 170.82f, 32.0f, 128.0f, 32.0f)
                curveToRelative(-23.36f, 0.0f, -46.13f, 9.1f, -66.28f, 26.41f)
                lineTo(45.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(88.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 95.39f, 99.06f)
                close()
                moveTo(48.0f, 88.0f)
                lineTo(48.0f, 67.31f)
                lineTo(68.69f, 88.0f)
                close()
                moveTo(216.0f, 152.0f)
                lineTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(20.58f, 20.58f)
                curveTo(169.92f, 197.15f, 151.17f, 208.0f, 128.0f, 208.0f)
                curveToRelative(-35.84f, 0.0f, -58.0f, -21.32f, -58.36f, -21.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 11.33f)
                curveTo(59.42f, 198.73f, 85.18f, 224.0f, 128.0f, 224.0f)
                curveToRelative(23.36f, 0.0f, 46.13f, -9.1f, 66.28f, -26.41f)
                lineToRelative(16.06f, 16.07f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 208.0f)
                lineTo(224.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
                moveTo(208.0f, 188.69f)
                lineTo(187.31f, 168.0f)
                lineTo(208.0f, 168.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
