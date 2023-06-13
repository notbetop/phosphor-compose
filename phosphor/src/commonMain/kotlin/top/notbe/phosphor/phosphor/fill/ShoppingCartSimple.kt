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

public val FillGroup.ShoppingCartSimple: ImageVector
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
                moveTo(230.44f, 67.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 64.0f)
                lineTo(48.32f, 64.0f)
                lineTo(40.21f, 35.6f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 24.82f, 24.0f)
                lineTo(8.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 40.0f)
                lineTo(24.82f, 40.0f)
                lineTo(61.0f, 166.59f)
                arcTo(24.11f, 24.11f, 0.0f, false, false, 84.07f, 184.0f)
                horizontalLineToRelative(96.11f)
                arcToRelative(23.89f, 23.89f, 0.0f, false, false, 22.94f, -16.94f)
                lineToRelative(28.53f, -92.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 230.44f, 67.25f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
