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

public val ThinGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.13f, 116.77f)
                lineTo(164.67f, 93.69f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.36f, -2.36f)
                lineTo(139.23f, 27.87f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -22.46f, 0.0f)
                lineTo(93.69f, 91.33f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.36f, 2.36f)
                lineTo(27.87f, 116.77f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, 22.46f)
                lineToRelative(63.46f, 23.08f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.36f, 2.36f)
                lineToRelative(23.08f, 63.46f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 22.46f, 0.0f)
                lineToRelative(23.08f, -63.46f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.36f, -2.36f)
                lineToRelative(63.46f, -23.08f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, -22.46f)
                close()
                moveTo(225.4f, 131.77f)
                lineTo(161.94f, 154.84f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.15f, 7.15f)
                lineTo(131.72f, 225.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.44f, 0.0f)
                lineToRelative(-23.07f, -63.46f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.15f, -7.15f)
                lineTo(30.6f, 131.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -7.44f)
                lineToRelative(63.46f, -23.07f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.15f, -7.15f)
                lineTo(124.28f, 30.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.44f, 0.0f)
                lineToRelative(23.07f, 63.46f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.15f, 7.15f)
                lineToRelative(63.46f, 23.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.44f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
