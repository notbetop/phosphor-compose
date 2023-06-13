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

public val LightGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 94.0f, 216.0f)
                close()
                moveTo(184.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 202.0f)
                close()
                moveTo(229.73f, 73.76f)
                lineToRelative(-28.52f, 92.71f)
                arcToRelative(21.89f, 21.89f, 0.0f, false, true, -21.0f, 15.53f)
                lineTo(84.07f, 182.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -21.16f, -16.0f)
                lineTo(26.75f, 39.45f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.82f, 38.0f)
                lineTo(8.0f, 38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 26.0f)
                lineTo(24.82f, 26.0f)
                arcTo(14.05f, 14.05f, 0.0f, false, true, 38.28f, 36.15f)
                lineTo(46.81f, 66.0f)
                lineTo(224.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.73f, 7.76f)
                close()
                moveTo(215.88f, 78.0f)
                lineTo(50.24f, 78.0f)
                lineToRelative(24.21f, 84.75f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 84.07f, 170.0f)
                horizontalLineToRelative(96.11f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 9.56f, -7.06f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
