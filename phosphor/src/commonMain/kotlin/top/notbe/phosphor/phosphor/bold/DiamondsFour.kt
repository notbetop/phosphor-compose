package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 102.18f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 28.08f, 0.0f)
                lineTo(170.19f, 74.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 0.0f, -28.07f)
                lineTo(142.0f, 17.8f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -28.08f, 0.0f)
                lineTo(85.81f, 46.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 0.0f, 28.07f)
                close()
                moveTo(128.0f, 37.71f)
                lineTo(150.28f, 60.0f)
                lineTo(128.0f, 82.28f)
                lineTo(105.72f, 60.0f)
                close()
                moveTo(238.19f, 114.0f)
                lineTo(210.0f, 85.81f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, false, -28.08f, 0.0f)
                lineTo(153.81f, 114.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 0.0f, 28.08f)
                lineTo(182.0f, 170.19f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 28.08f, 0.0f)
                lineTo(238.19f, 142.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 0.0f, -28.08f)
                close()
                moveTo(196.0f, 150.28f)
                lineTo(173.72f, 128.0f)
                lineTo(196.0f, 105.72f)
                lineTo(218.28f, 128.0f)
                close()
                moveTo(108.0f, 128.0f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, false, -5.81f, -14.0f)
                lineTo(74.0f, 85.81f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, false, -28.08f, 0.0f)
                lineTo(17.81f, 114.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 0.0f, 28.08f)
                lineTo(46.0f, 170.19f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 28.08f, 0.0f)
                lineTo(102.19f, 142.0f)
                arcTo(19.73f, 19.73f, 0.0f, false, false, 108.0f, 128.0f)
                close()
                moveTo(60.0f, 150.28f)
                lineTo(37.72f, 128.0f)
                lineTo(60.0f, 105.72f)
                lineTo(82.28f, 128.0f)
                close()
                moveTo(142.0f, 153.81f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -28.08f, 0.0f)
                lineTo(85.81f, 182.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 0.0f, 28.07f)
                lineTo(114.0f, 238.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 28.08f, 0.0f)
                lineTo(170.19f, 210.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 0.0f, -28.07f)
                close()
                moveTo(128.0f, 218.29f)
                lineTo(105.72f, 196.0f)
                lineTo(128.0f, 173.72f)
                lineTo(150.28f, 196.0f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
