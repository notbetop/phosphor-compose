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

public val LightGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(237.88f, 97.85f)
                lineTo(224.0f, 201.85f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 210.13f, 214.0f)
                horizontalLineTo(45.87f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 201.85f)
                lineToRelative(-13.87f, -104.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 82.0f)
                horizontalLineTo(69.28f)
                lineToRelative(54.2f, -61.95f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.0f, 0.0f)
                lineToRelative(54.2f, 62.0f)
                horizontalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 13.87f, 15.85f)
                close()
                moveTo(85.22f, 82.0f)
                horizontalLineToRelative(85.56f)
                lineTo(128.0f, 33.11f)
                close()
                moveTo(225.5f, 94.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 224.0f, 94.0f)
                horizontalLineTo(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.51f, 0.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 30.0f, 96.26f)
                lineToRelative(13.86f, 104.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 1.73f)
                horizontalLineTo(210.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -1.73f)
                lineTo(226.0f, 96.26f)
                arcTo(1.93f, 1.93f, 0.0f, false, false, 225.5f, 94.68f)
                close()
                moveTo(181.4f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.57f, 5.37f)
                lineToRelative(-5.6f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.6f, 182.0f)
                lineToRelative(0.61f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.4f)
                lineToRelative(5.6f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 181.4f, 114.0f)
                close()
                moveTo(81.17f, 119.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.94f, 1.2f)
                lineToRelative(5.6f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 5.4f)
                lineToRelative(0.61f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.37f, -6.57f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
