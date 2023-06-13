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

public val ThinGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.33f, 125.78f)
                lineTo(179.0f, 41.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.34f)
                lineTo(87.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.34f)
                lineTo(20.67f, 125.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.53f, 3.27f)
                lineToRelative(22.39f, 82.11f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 54.11f, 220.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(92.0f, 188.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(25.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.58f, -8.84f)
                lineToRelative(22.39f, -82.11f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.33f, 125.78f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 62.89f)
                lineToRelative(32.0f, 18.29f)
                lineTo(108.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(116.0f, 85.75f)
                lineToRelative(10.0f, 5.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(10.0f, -5.72f)
                lineTo(140.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 81.18f)
                lineToRelative(32.0f, -18.29f)
                lineTo(180.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                close()
                moveTo(83.62f, 45.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 87.0f, 44.0f)
                horizontalLineToRelative(82.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineToRelative(5.91f, 8.87f)
                lineTo(128.0f, 83.39f)
                lineTo(77.71f, 54.65f)
                close()
                moveTo(84.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(54.11f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, -2.95f)
                lineTo(28.34f, 128.7f)
                lineTo(68.0f, 69.21f)
                lineTo(68.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(205.75f, 209.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 2.95f)
                lineTo(176.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(172.0f, 188.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 69.21f)
                lineToRelative(39.66f, 59.49f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
