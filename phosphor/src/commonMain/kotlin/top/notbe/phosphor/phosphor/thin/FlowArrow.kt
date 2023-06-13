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

public val ThinGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.83f, 77.17f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(230.34f, 76.0f)
                horizontalLineTo(192.0f)
                arcToRelative(69.84f, 69.84f, 0.0f, false, false, -26.68f, 6.37f)
                curveToRelative(-12.73f, 5.88f, -28.85f, 18.45f, -33.27f, 45.0f)
                curveToRelative(-6.41f, 38.49f, -37.53f, 43.87f, -48.29f, 44.57f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(67.53f, 67.53f, 0.0f, false, false, 22.71f, -5.54f)
                curveToRelative(12.73f, -5.65f, 28.86f, -18.17f, 33.45f, -45.71f)
                curveTo(147.28f, 84.67f, 190.18f, 84.0f, 192.0f, 84.0f)
                horizontalLineToRelative(38.34f)
                lineToRelative(-25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 242.83f, 77.17f)
                close()
                moveTo(48.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 204.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
