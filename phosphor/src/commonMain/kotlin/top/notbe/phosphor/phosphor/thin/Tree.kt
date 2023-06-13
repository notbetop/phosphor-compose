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

public val ThinGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.42f, 66.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -2.09f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -132.82f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, 2.09f)
                arcTo(68.23f, 68.23f, 0.0f, false, false, 20.0f, 127.81f)
                curveToRelative(-0.1f, 36.66f, 29.62f, 67.24f, 66.25f, 68.17f)
                arcTo(67.74f, 67.74f, 0.0f, false, false, 124.0f, 185.67f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(185.67f)
                arcTo(67.47f, 67.47f, 0.0f, false, false, 168.0f, 196.0f)
                lineToRelative(1.76f, 0.0f)
                curveToRelative(36.62f, -0.93f, 66.34f, -31.51f, 66.24f, -68.17f)
                arcTo(68.23f, 68.23f, 0.0f, false, false, 196.42f, 66.23f)
                close()
                moveTo(169.55f, 188.0f)
                arcTo(59.43f, 59.43f, 0.0f, false, true, 134.7f, 177.9f)
                arcToRelative(12.39f, 12.39f, 0.0f, false, false, -2.7f, -1.35f)
                verticalLineTo(130.47f)
                lineToRelative(45.79f, -22.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f)
                lineTo(132.0f, 121.53f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(57.53f)
                lineTo(81.79f, 124.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, 7.16f)
                lineTo(124.0f, 154.47f)
                verticalLineToRelative(22.08f)
                arcToRelative(12.39f, 12.39f, 0.0f, false, false, -2.7f, 1.35f)
                arcTo(59.36f, 59.36f, 0.0f, false, true, 86.45f, 188.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 62.93f, 73.49f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, 6.0f, -6.25f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 118.08f, 0.0f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, 6.0f, 6.25f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 169.55f, 188.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
