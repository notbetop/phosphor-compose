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

public val LightGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.61f, 60.16f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 58.0f)
                lineTo(53.0f, 58.0f)
                lineTo(47.83f, 29.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.05f, 18.0f)
                lineTo(16.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.64f)
                lineToRelative(25.51f, 140.3f)
                arcToRelative(21.93f, 21.93f, 0.0f, false, false, 6.24f, 11.77f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 105.89f, 190.0f)
                horizontalLineToRelative(52.22f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 180.0f, 178.0f)
                lineTo(83.17f, 178.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.84f, -8.21f)
                lineTo(69.73f, 150.0f)
                lineTo(188.1f, 150.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.65f, -18.06f)
                lineTo(221.9f, 65.07f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 220.61f, 60.16f)
                close()
                moveTo(98.0f, 204.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 98.0f, 204.0f)
                close()
                moveTo(194.0f, 204.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 194.0f, 204.0f)
                close()
                moveTo(197.94f, 129.79f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 188.1f, 138.0f)
                lineTo(67.55f, 138.0f)
                lineTo(55.19f, 70.0f)
                lineTo(208.81f, 70.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
