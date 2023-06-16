package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 216.0f)
                close()
                moveTo(184.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 204.0f)
                close()
                moveTo(227.82f, 73.18f)
                lineToRelative(-28.52f, 92.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 180.18f, 180.0f)
                lineTo(84.07f, 180.0f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, true, -19.23f, -14.51f)
                lineTo(28.67f, 38.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.82f, 36.0f)
                lineTo(8.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(24.82f, 28.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, 11.54f, 8.7f)
                lineTo(45.3f, 68.0f)
                lineTo(224.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.82f, 5.18f)
                close()
                moveTo(218.58f, 76.0f)
                horizontalLineToRelative(-171.0f)
                lineToRelative(24.94f, 87.3f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 84.07f, 172.0f)
                horizontalLineToRelative(96.11f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 11.47f, -8.47f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
