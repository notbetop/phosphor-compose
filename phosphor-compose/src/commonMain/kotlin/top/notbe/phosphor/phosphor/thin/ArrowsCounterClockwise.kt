package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 100.0f)
                lineTo(40.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(44.0f, 83.07f)
                arcToRelative(146.39f, 146.39f, 0.0f, false, true, 16.27f, -18.0f)
                curveTo(80.65f, 46.05f, 104.07f, 36.0f, 128.0f, 36.0f)
                curveToRelative(41.18f, 0.0f, 65.8f, 24.14f, 66.83f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, 5.66f)
                curveTo(188.75f, 66.41f, 165.58f, 44.0f, 128.0f, 44.0f)
                curveTo(85.8f, 44.0f, 57.38f, 77.94f, 47.41f, 92.0f)
                lineTo(88.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 156.0f)
                lineTo(168.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.59f)
                curveToRelative(-10.0f, 14.06f, -38.39f, 48.0f, -80.59f, 48.0f)
                curveToRelative(-37.58f, 0.0f, -60.75f, -22.41f, -61.17f, -22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                curveToRelative(1.0f, 1.0f, 25.65f, 25.17f, 66.83f, 25.17f)
                curveToRelative(23.93f, 0.0f, 47.35f, -10.05f, 67.73f, -29.08f)
                arcToRelative(146.39f, 146.39f, 0.0f, false, false, 16.27f, -18.0f)
                lineTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(220.0f, 160.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 156.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
