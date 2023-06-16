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

public val BoldGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 100.0f, 216.0f)
                close()
                moveTo(184.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 196.0f)
                close()
                moveTo(235.47f, 75.53f)
                lineToRelative(-27.29f, 88.7f)
                arcTo(27.87f, 27.87f, 0.0f, false, true, 181.41f, 184.0f)
                lineTo(82.93f, 184.0f)
                arcTo(28.13f, 28.13f, 0.0f, false, true, 56.0f, 163.69f)
                lineTo(21.81f, 44.0f)
                lineTo(12.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(24.82f, 20.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, true, 44.05f, 34.51f)
                lineTo(51.34f, 60.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.47f, 15.53f)
                close()
                moveTo(207.75f, 84.0f)
                lineTo(58.19f, 84.0f)
                lineToRelative(20.89f, 73.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.85f, 2.9f)
                horizontalLineToRelative(98.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.83f, -2.82f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
