package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.49f, 183.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                curveToRelative(-1.13f, 1.12f, -28.0f, 27.51f, -72.49f, 27.51f)
                curveToRelative(-33.71f, 0.0f, -59.35f, -17.46f, -76.0f, -33.86f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(64.12f)
                curveToRelative(13.1f, 14.32f, 35.08f, 32.0f, 63.88f, 32.0f)
                curveToRelative(34.63f, 0.0f, 55.31f, -20.28f, 55.51f, -20.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.49f, 183.51f)
                close()
                moveTo(216.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(61.86f)
                curveTo(187.35f, 45.46f, 161.71f, 28.0f, 128.0f, 28.0f)
                curveTo(83.54f, 28.0f, 56.64f, 54.39f, 55.51f, 55.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                curveTo(72.69f, 72.28f, 93.37f, 52.0f, 128.0f, 52.0f)
                curveToRelative(28.8f, 0.0f, 50.78f, 17.68f, 63.88f, 32.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
