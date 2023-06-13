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

public val ThinGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.07f, 61.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 60.0f)
                lineTo(51.34f, 60.0f)
                lineTo(45.86f, 29.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 34.05f, 20.0f)
                lineTo(16.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.0f, 31.28f)
                lineToRelative(25.5f, 140.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 71.0f, 183.85f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 101.87f, 188.0f)
                horizontalLineToRelative(60.26f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 180.0f, 180.0f)
                lineTo(83.17f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.8f, -9.85f)
                lineToRelative(-4.0f, -22.15f)
                lineTo(188.1f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.68f, -16.42f)
                lineToRelative(12.16f, -66.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 219.07f, 61.44f)
                close()
                moveTo(100.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 204.0f)
                close()
                moveTo(196.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 204.0f)
                close()
                moveTo(199.91f, 130.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.1f, 140.0f)
                lineTo(65.88f, 140.0f)
                lineTo(52.79f, 68.0f)
                lineTo(211.21f, 68.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
