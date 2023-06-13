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

public val ThinGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(235.89f, 97.59f)
                lineTo(222.0f, 201.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 210.13f, 212.0f)
                horizontalLineTo(45.87f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 34.0f, 201.59f)
                lineToRelative(-13.86f, -104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 84.0f)
                horizontalLineTo(70.18f)
                lineTo(125.0f, 21.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(185.82f, 84.0f)
                horizontalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.89f, 13.59f)
                close()
                moveTo(80.81f, 84.0f)
                horizontalLineToRelative(94.38f)
                lineTo(128.0f, 30.07f)
                close()
                moveTo(227.0f, 93.36f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 224.0f, 92.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.52f)
                lineToRelative(13.86f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.47f)
                horizontalLineTo(210.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.47f)
                lineTo(228.0f, 96.53f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 227.0f, 93.36f)
                close()
                moveTo(181.2f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.38f, 3.58f)
                lineToRelative(-5.6f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 174.8f, 180.0f)
                lineToRelative(0.41f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.6f)
                lineToRelative(5.6f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 181.2f, 116.0f)
                close()
                moveTo(74.8f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 4.38f)
                lineToRelative(5.6f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.6f)
                lineToRelative(0.41f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, -4.38f)
                lineToRelative(-5.6f, -56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 74.8f, 116.0f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
