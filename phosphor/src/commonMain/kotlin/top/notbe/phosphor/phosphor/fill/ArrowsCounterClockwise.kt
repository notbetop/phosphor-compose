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

public val FillGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.66f, 5.66f)
                lineToRelative(-16.06f, -16.07f)
                curveTo(174.13f, 214.9f, 151.36f, 224.0f, 128.0f, 224.0f)
                curveToRelative(-42.82f, 0.0f, -68.58f, -25.27f, -69.66f, -26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.33f)
                curveTo(70.0f, 186.68f, 92.16f, 208.0f, 128.0f, 208.0f)
                curveToRelative(23.17f, 0.0f, 41.92f, -10.85f, 54.92f, -21.76f)
                lineToRelative(-20.58f, -20.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 152.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 160.0f)
                close()
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
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 95.39f, 99.06f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
