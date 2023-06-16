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

public val LightGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.88f, 115.69f)
                lineToRelative(-168.0f, -95.88f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -20.0f, 16.85f)
                lineToRelative(31.0f, 90.48f)
                lineToRelative(0.0f, 0.07f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, 0.0f, 1.42f)
                lineToRelative(-31.0f, 90.64f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 238.0f)
                arcToRelative(14.11f, 14.11f, 0.0f, false, false, 6.92f, -1.83f)
                lineTo(222.84f, 140.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -24.41f)
                close()
                moveTo(216.93f, 129.69f)
                lineTo(49.0f, 225.73f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.27f, -0.22f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -0.56f, -2.28f)
                lineTo(76.7f, 134.0f)
                lineTo(136.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(76.78f, 122.0f)
                lineTo(46.14f, 32.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 49.0f, 30.25f)
                lineToRelative(168.0f, 95.89f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.0f, 1.74f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.93f, 129.66f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
