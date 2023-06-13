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

public val RegularGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 62.6f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(72.27f, 72.27f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.89f, 166.62f, 47.36f, 199.0f, 86.14f, 200.0f)
                arcTo(71.68f, 71.68f, 0.0f, false, false, 120.0f, 192.49f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.49f)
                arcTo(71.45f, 71.45f, 0.0f, false, false, 168.0f, 200.0f)
                lineToRelative(1.86f, 0.0f)
                curveToRelative(38.78f, -1.0f, 70.25f, -33.36f, 70.14f, -72.18f)
                arcTo(72.26f, 72.26f, 0.0f, false, false, 198.1f, 62.6f)
                close()
                moveTo(169.45f, 184.0f)
                arcToRelative(55.61f, 55.61f, 0.0f, false, true, -32.52f, -9.4f)
                quadToRelative(-0.47f, -0.3f, -0.93f, -0.57f)
                verticalLineTo(132.94f)
                lineToRelative(43.58f, -21.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.32f)
                lineTo(136.0f, 115.06f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(51.06f)
                lineTo(83.58f, 120.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.32f)
                lineTo(120.0f, 156.94f)
                verticalLineTo(174.0f)
                quadToRelative(-0.47f, 0.27f, -0.93f, 0.57f)
                arcTo(55.7f, 55.7f, 0.0f, false, true, 86.55f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -22.0f, -106.86f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 8.05f, -8.33f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 110.7f, 0.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 8.05f, 8.33f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -22.0f, 106.86f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
