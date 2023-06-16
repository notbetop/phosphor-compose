package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.24f, 75.76f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(225.51f, 74.0f)
                horizontalLineTo(192.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -27.51f, 6.55f)
                curveToRelative(-13.18f, 6.08f, -29.84f, 19.08f, -34.41f, 46.46f)
                curveToRelative(-5.84f, 35.0f, -33.0f, 41.57f, -44.6f, 42.75f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.08f, 12.0f)
                arcToRelative(69.61f, 69.61f, 0.0f, false, false, 21.76f, -5.57f)
                curveToRelative(13.17f, -5.86f, 29.86f, -18.8f, 34.6f, -47.21f)
                curveToRelative(7.0f, -42.26f, 48.34f, -43.0f, 50.08f, -43.0f)
                horizontalLineToRelative(33.51f)
                lineToRelative(-21.75f, 21.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(32.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.24f, 75.76f)
                close()
                moveTo(48.0f, 202.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 48.0f, 202.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
