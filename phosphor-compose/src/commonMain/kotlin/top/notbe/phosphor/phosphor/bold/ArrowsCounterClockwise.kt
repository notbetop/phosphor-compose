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

public val BoldGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 108.0f)
                lineTo(40.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 96.0f)
                lineTo(28.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(52.0f, 61.86f)
                curveTo(68.65f, 45.46f, 94.29f, 28.0f, 128.0f, 28.0f)
                curveToRelative(44.46f, 0.0f, 71.36f, 26.39f, 72.49f, 27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.94f, 17.0f)
                curveTo(183.11f, 72.09f, 162.0f, 52.0f, 128.0f, 52.0f)
                curveTo(99.0f, 52.0f, 77.06f, 69.68f, 64.0f, 84.0f)
                lineTo(88.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 148.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(-13.0f, 14.32f, -35.0f, 32.0f, -64.0f, 32.0f)
                curveToRelative(-34.0f, 0.0f, -55.11f, -20.09f, -55.55f, -20.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.94f, 17.0f)
                curveTo(56.64f, 201.61f, 83.54f, 228.0f, 128.0f, 228.0f)
                curveToRelative(33.71f, 0.0f, 59.35f, -17.46f, 76.0f, -33.86f)
                lineTo(204.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(228.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 148.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
