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

public val FillGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.14f, 58.87f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 56.0f)
                lineTo(54.68f, 56.0f)
                lineTo(49.79f, 29.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 34.05f, 16.0f)
                lineTo(16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(18.0f)
                lineTo(59.56f, 172.29f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 5.33f, 11.27f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 44.4f, 8.44f)
                horizontalLineToRelative(45.42f)
                arcTo(27.75f, 27.75f, 0.0f, false, false, 152.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, -28.0f)
                lineTo(83.17f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.87f, -6.57f)
                lineTo(72.13f, 152.0f)
                horizontalLineToRelative(116.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.61f, -19.71f)
                lineToRelative(12.16f, -66.86f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 222.14f, 58.87f)
                close()
                moveTo(180.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 192.0f)
                close()
                moveTo(84.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 192.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
