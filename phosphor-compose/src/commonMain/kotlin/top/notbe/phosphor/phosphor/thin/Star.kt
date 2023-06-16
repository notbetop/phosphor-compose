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

public val ThinGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.38f, 98.53f)
                arcTo(11.82f, 11.82f, 0.0f, false, false, 225.0f, 90.29f)
                lineToRelative(-59.45f, -5.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.32f, -2.44f)
                lineTo(139.0f, 27.36f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -22.06f, 0.0f)
                lineTo(93.74f, 82.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.32f, 2.44f)
                lineTo(31.0f, 90.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.83f, 21.07f)
                lineToRelative(45.1f, 39.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.28f, 4.0f)
                lineTo(57.0f, 213.22f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 4.67f, 12.48f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, false, 13.19f, 0.53f)
                lineToRelative(51.1f, -31.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, 4.08f, 0.0f)
                lineToRelative(51.1f, 31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.86f, -13.0f)
                lineToRelative(-13.52f, -58.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.28f, -4.0f)
                lineToRelative(45.1f, -39.35f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 235.38f, 98.53f)
                close()
                moveTo(226.6f, 105.33f)
                lineTo(181.5f, 144.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.82f, 11.8f)
                lineTo(191.2f, 215.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.56f, 4.2f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -4.35f, 0.17f)
                lineToRelative(-51.1f, -31.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -12.38f, 0.0f)
                lineToRelative(-51.1f, 31.0f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -4.35f, -0.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.8f, 215.0f)
                lineToRelative(13.52f, -58.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.82f, -11.8f)
                lineTo(29.4f, 105.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.22f, 101.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.44f, -2.75f)
                lineToRelative(59.45f, -5.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -7.31f)
                lineToRelative(23.22f, -55.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.32f, 0.0f)
                lineToRelative(23.22f, 55.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, 7.31f)
                lineToRelative(59.45f, 5.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.44f, 2.75f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.6f, 105.33f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
