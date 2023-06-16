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

public val BoldGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.49f, 71.51f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(211.0f, 68.0f)
                horizontalLineTo(192.0f)
                arcToRelative(77.43f, 77.43f, 0.0f, false, false, -30.0f, 7.1f)
                curveToRelative(-14.49f, 6.69f, -32.81f, 21.0f, -37.81f, 50.92f)
                curveToRelative(-2.69f, 16.17f, -10.58f, 27.4f, -23.43f, 33.39f)
                arcTo(49.4f, 49.4f, 0.0f, false, true, 90.0f, 162.93f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.53f, 24.28f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, false, 19.2f, -5.54f)
                curveToRelative(14.52f, -6.45f, 32.91f, -20.66f, 38.09f, -51.7f)
                curveToRelative(2.58f, -15.48f, 10.48f, -26.49f, 23.49f, -32.75f)
                arcTo(55.13f, 55.13f, 0.0f, false, true, 192.0f, 92.0f)
                horizontalLineToRelative(19.0f)
                lineToRelative(-11.52f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.49f, 71.51f)
                close()
                moveTo(48.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 196.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
