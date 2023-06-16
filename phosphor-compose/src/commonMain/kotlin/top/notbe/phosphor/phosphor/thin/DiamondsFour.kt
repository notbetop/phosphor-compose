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

public val ThinGroup.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) {
            return _diamondsFour!!
        }
        _diamondsFour = Builder(name = "DiamondsFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.0f, 104.27f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, 18.0f, 0.0f)
                lineTo(168.27f, 73.0f)
                arcToRelative(12.71f, 12.71f, 0.0f, false, false, 0.0f, -18.0f)
                lineTo(137.0f, 23.72f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, -18.0f, 0.0f)
                lineTo(87.73f, 55.0f)
                arcToRelative(12.71f, 12.71f, 0.0f, false, false, 0.0f, 18.0f)
                close()
                moveTo(93.38f, 60.66f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 6.68f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, 6.68f)
                lineTo(131.34f, 98.61f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, -6.68f, 0.0f)
                lineTo(93.38f, 67.34f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, -6.68f)
                close()
                moveTo(232.27f, 119.0f)
                lineTo(201.0f, 87.72f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, -18.0f, 0.0f)
                lineTo(151.73f, 119.0f)
                arcToRelative(12.72f, 12.72f, 0.0f, false, false, 0.0f, 18.0f)
                lineTo(183.0f, 168.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, 18.0f, 0.0f)
                lineTo(232.27f, 137.0f)
                arcToRelative(12.72f, 12.72f, 0.0f, false, false, 0.0f, -18.0f)
                close()
                moveTo(226.62f, 131.34f)
                lineTo(195.34f, 162.62f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, -6.68f, 0.0f)
                lineToRelative(-31.28f, -31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, -6.68f)
                lineToRelative(31.28f, -31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 6.68f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, 6.68f)
                close()
                moveTo(108.0f, 128.0f)
                arcToRelative(12.63f, 12.63f, 0.0f, false, false, -3.73f, -9.0f)
                lineTo(73.0f, 87.72f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, -18.0f, 0.0f)
                lineTo(23.73f, 119.0f)
                arcToRelative(12.72f, 12.72f, 0.0f, false, false, 0.0f, 18.0f)
                lineTo(55.0f, 168.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, 18.0f, 0.0f)
                lineTo(104.27f, 137.0f)
                arcTo(12.63f, 12.63f, 0.0f, false, false, 108.0f, 128.0f)
                close()
                moveTo(98.62f, 131.34f)
                lineTo(67.34f, 162.62f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, -6.68f, 0.0f)
                lineTo(29.38f, 131.34f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, -6.68f)
                lineTo(60.66f, 93.38f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 6.68f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, 6.68f)
                close()
                moveTo(137.0f, 151.73f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, -18.0f, 0.0f)
                lineTo(87.73f, 183.0f)
                arcToRelative(12.71f, 12.71f, 0.0f, false, false, 0.0f, 18.0f)
                lineTo(119.0f, 232.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, 18.0f, 0.0f)
                lineTo(168.27f, 201.0f)
                arcToRelative(12.71f, 12.71f, 0.0f, false, false, 0.0f, -18.0f)
                close()
                moveTo(162.62f, 195.34f)
                lineTo(131.34f, 226.62f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, -6.68f, 0.0f)
                lineTo(93.38f, 195.34f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, -6.68f)
                lineToRelative(31.28f, -31.27f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, true, 6.68f, 0.0f)
                lineToRelative(31.28f, 31.28f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.0f, 6.68f)
                close()
            }
        }
        .build()
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
