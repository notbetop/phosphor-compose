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

public val LightGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.26f, 64.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -136.52f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcTo(70.25f, 70.25f, 0.0f, false, false, 18.0f, 127.8f)
                curveTo(17.9f, 165.54f, 48.49f, 197.0f, 86.2f, 198.0f)
                arcToRelative(69.4f, 69.4f, 0.0f, false, false, 35.8f, -8.8f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(189.18f)
                arcTo(69.54f, 69.54f, 0.0f, false, false, 168.0f, 198.0f)
                lineToRelative(1.81f, 0.0f)
                curveToRelative(37.7f, -1.0f, 68.29f, -32.44f, 68.19f, -70.18f)
                arcTo(70.27f, 70.27f, 0.0f, false, false, 197.26f, 64.41f)
                close()
                moveTo(169.5f, 186.0f)
                arcToRelative(57.58f, 57.58f, 0.0f, false, true, -33.69f, -9.74f)
                arcToRelative(14.77f, 14.77f, 0.0f, false, false, -1.81f, -1.0f)
                verticalLineToRelative(-43.5f)
                lineToRelative(44.68f, -22.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f)
                lineTo(134.0f, 118.29f)
                verticalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(54.29f)
                lineTo(82.68f, 122.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 10.74f)
                lineTo(122.0f, 155.71f)
                verticalLineToRelative(19.5f)
                arcToRelative(14.77f, 14.77f, 0.0f, false, false, -1.81f, 1.0f)
                arcTo(57.51f, 57.51f, 0.0f, false, true, 86.5f, 186.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 63.76f, 75.31f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 70.81f, 68.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 114.38f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.05f, 7.29f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 169.5f, 186.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
