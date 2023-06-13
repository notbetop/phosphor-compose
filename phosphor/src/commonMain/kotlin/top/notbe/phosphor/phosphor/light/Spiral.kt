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

public val LightGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(98.11f, 98.11f, 0.0f, false, false, -98.0f, -98.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, -90.0f, 90.0f)
                arcToRelative(82.1f, 82.1f, 0.0f, false, false, 82.0f, 82.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, false, 74.0f, -74.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, -66.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, false, 50.0f, 50.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 42.0f, -42.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -34.0f, -34.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, -30.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 38.0f, -38.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, true, -62.0f, -62.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, -70.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, true, 78.0f, 78.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, true, -86.0f, 86.0f)
                arcToRelative(94.11f, 94.11f, 0.0f, false, true, -94.0f, -94.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 136.0f, 34.0f)
                arcTo(110.13f, 110.13f, 0.0f, false, true, 246.0f, 144.0f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
