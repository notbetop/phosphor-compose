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

public val BoldGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.21f, 56.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 52.0f)
                lineTo(58.0f, 52.0f)
                lineTo(53.73f, 28.42f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 34.05f, 12.0f)
                lineTo(16.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(30.71f, 36.0f)
                lineTo(55.62f, 173.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 4.07f, 10.21f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 115.0f, 196.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 31.0f, -24.0f)
                lineTo(83.17f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.93f, -3.28f)
                lineTo(76.92f, 156.0f)
                lineTo(188.1f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.55f, -23.0f)
                lineToRelative(12.16f, -66.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 225.21f, 56.31f)
                close()
                moveTo(92.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 204.0f)
                close()
                moveTo(180.0f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 212.0f)
                close()
                moveTo(192.0f, 128.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.1f, 132.0f)
                lineTo(72.56f, 132.0f)
                lineTo(62.38f, 76.0f)
                lineTo(201.62f, 76.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
