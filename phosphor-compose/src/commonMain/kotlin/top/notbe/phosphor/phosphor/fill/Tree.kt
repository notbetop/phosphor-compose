package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 187.88f)
                reflectiveCurveToRelative(0.0f, 0.0f, -0.06f, 0.0f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, true, -8.0f, 4.61f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(192.49f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, true, -8.0f, -4.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.1f, 62.6f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(72.29f, 72.29f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.89f, 166.62f, 47.36f, 199.0f, 86.14f, 200.0f)
                arcTo(71.68f, 71.68f, 0.0f, false, false, 120.0f, 192.49f)
                verticalLineTo(156.94f)
                lineTo(76.42f, 135.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, -14.32f)
                lineTo(120.0f, 139.06f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(27.06f)
                lineToRelative(36.42f, -18.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f)
                lineTo(136.0f, 132.94f)
                verticalLineToRelative(59.55f)
                arcTo(71.45f, 71.45f, 0.0f, false, false, 168.0f, 200.0f)
                lineToRelative(1.86f, 0.0f)
                curveToRelative(38.78f, -1.0f, 70.25f, -33.36f, 70.14f, -72.18f)
                arcTo(72.26f, 72.26f, 0.0f, false, false, 198.1f, 62.6f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
