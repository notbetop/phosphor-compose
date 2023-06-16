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

public val FillGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 85.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(220.69f, 88.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-1.66f, 0.0f, -41.35f, 0.77f, -48.11f, 41.31f)
                curveTo(139.0f, 158.6f, 121.75f, 172.0f, 108.13f, 178.0f)
                arcToRelative(71.12f, 71.12f, 0.0f, false, true, -27.49f, 6.0f)
                horizontalLineTo(79.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineToRelative(1.33f)
                curveToRelative(1.62f, 0.0f, 40.77f, 0.81f, 47.79f, -41.32f)
                curveTo(132.82f, 98.44f, 150.0f, 85.0f, 163.65f, 78.73f)
                arcTo(74.49f, 74.49f, 0.0f, false, true, 192.0f, 72.0f)
                horizontalLineToRelative(28.69f)
                lineTo(202.34f, 53.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 245.66f, 85.66f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
