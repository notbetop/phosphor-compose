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

public val LightGroup.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) {
            return _shuffleAngular!!
        }
        _shuffleAngular = Builder(name = "ShuffleAngular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 179.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(217.52f, 190.0f)
                horizontalLineToRelative(-45.4f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, true, -11.4f, -5.86f)
                lineTo(85.51f, 78.84f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 83.88f, 78.0f)
                lineTo(32.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(83.88f, 66.0f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, true, 11.4f, 5.86f)
                lineToRelative(75.21f, 105.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.63f, 0.84f)
                horizontalLineToRelative(45.4f)
                lineToRelative(-13.76f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(144.17f, 105.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.37f, -1.4f)
                lineToRelative(18.0f, -25.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.63f, -0.84f)
                horizontalLineToRelative(45.4f)
                lineTo(203.76f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(217.52f, 66.0f)
                horizontalLineToRelative(-45.4f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, false, -11.4f, 5.86f)
                lineTo(142.78f, 97.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.17f, 105.36f)
                close()
                moveTo(111.83f, 150.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.37f, 1.4f)
                lineTo(85.51f, 177.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.63f, 0.84f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(83.88f, 190.0f)
                arcToRelative(14.05f, 14.05f, 0.0f, false, false, 11.4f, -5.86f)
                lineTo(113.22f, 159.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 111.83f, 150.64f)
                close()
            }
        }
        .build()
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
