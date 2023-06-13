package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 216.0f)
                close()
                moveTo(184.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 200.0f)
                close()
                moveTo(231.65f, 74.35f)
                lineToRelative(-28.53f, 92.71f)
                arcTo(23.89f, 23.89f, 0.0f, false, true, 180.18f, 184.0f)
                lineTo(84.07f, 184.0f)
                arcTo(24.11f, 24.11f, 0.0f, false, true, 61.0f, 166.59f)
                lineTo(24.82f, 40.0f)
                lineTo(8.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 24.0f)
                lineTo(24.82f, 24.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, true, 40.21f, 35.6f)
                lineTo(48.32f, 64.0f)
                lineTo(224.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.65f, 10.35f)
                close()
                moveTo(213.17f, 80.0f)
                lineTo(52.89f, 80.0f)
                lineToRelative(23.49f, 82.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.69f, 5.8f)
                horizontalLineToRelative(96.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.65f, -5.65f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
