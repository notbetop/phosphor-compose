package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 74.34f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(220.69f, 72.0f)
                horizontalLineTo(192.0f)
                arcToRelative(74.49f, 74.49f, 0.0f, false, false, -28.35f, 6.73f)
                curveToRelative(-13.62f, 6.29f, -30.83f, 19.71f, -35.54f, 48.0f)
                curveToRelative(-5.32f, 31.94f, -29.1f, 39.22f, -41.0f, 40.86f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.18f, 16.06f)
                arcTo(71.65f, 71.65f, 0.0f, false, false, 108.13f, 178.0f)
                curveTo(121.75f, 172.0f, 139.0f, 158.6f, 143.89f, 129.31f)
                curveTo(150.65f, 88.77f, 190.34f, 88.0f, 192.0f, 88.0f)
                horizontalLineToRelative(28.69f)
                lineToRelative(-18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 245.66f, 74.34f)
                close()
                moveTo(48.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 200.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
