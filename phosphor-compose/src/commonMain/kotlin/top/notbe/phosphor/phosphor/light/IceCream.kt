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

public val LightGroup.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 90.83f)
                lineTo(206.0f, 88.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 50.0f, 88.0f)
                verticalLineToRelative(2.83f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 56.0f, 134.0f)
                horizontalLineToRelative(4.52f)
                lineToRelative(62.27f, 109.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.42f, 0.0f)
                lineToRelative(62.27f, -109.0f)
                lineTo(200.0f, 134.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 6.0f, -43.17f)
                close()
                moveTo(128.0f, 227.91f)
                lineTo(74.34f, 134.0f)
                lineTo(98.23f, 134.0f)
                lineTo(140.0f, 207.0f)
                close()
                moveTo(136.0f, 134.0f)
                lineToRelative(22.85f, 40.0f)
                lineToRelative(-11.94f, 20.91f)
                lineTo(112.05f, 134.0f)
                close()
                moveTo(165.76f, 161.91f)
                lineTo(149.77f, 134.0f)
                horizontalLineToRelative(31.89f)
                close()
                moveTo(200.0f, 122.0f)
                lineTo(56.0f, 122.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(62.0f, 88.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 132.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
