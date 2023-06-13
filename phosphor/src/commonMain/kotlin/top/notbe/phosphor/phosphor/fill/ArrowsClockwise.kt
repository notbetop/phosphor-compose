package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.66f, 186.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                curveTo(196.58f, 198.73f, 170.82f, 224.0f, 128.0f, 224.0f)
                curveToRelative(-23.36f, 0.0f, -46.13f, -9.1f, -66.28f, -26.41f)
                lineTo(45.66f, 213.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 208.0f)
                lineTo(32.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(88.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f)
                lineTo(73.08f, 186.24f)
                curveTo(86.08f, 197.15f, 104.83f, 208.0f, 128.0f, 208.0f)
                curveToRelative(36.27f, 0.0f, 58.13f, -21.44f, 58.34f, -21.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 197.66f, 186.34f)
                close()
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
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
