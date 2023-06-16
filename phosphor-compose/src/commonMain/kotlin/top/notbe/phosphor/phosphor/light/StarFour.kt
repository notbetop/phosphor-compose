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

public val LightGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.81f, 114.89f)
                lineTo(165.36f, 91.81f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -1.17f, -1.17f)
                lineTo(141.11f, 27.19f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, -26.22f, 0.0f)
                lineTo(91.81f, 90.64f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -1.17f, 1.17f)
                lineTo(27.19f, 114.89f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, 26.22f)
                lineToRelative(63.45f, 23.08f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 1.17f, 1.17f)
                lineToRelative(23.08f, 63.45f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 26.22f, 0.0f)
                lineToRelative(23.08f, -63.45f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 1.17f, -1.17f)
                lineToRelative(63.45f, -23.08f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, -26.22f)
                close()
                moveTo(224.71f, 129.89f)
                lineTo(161.26f, 152.96f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.35f, 8.35f)
                lineToRelative(-23.07f, 63.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.68f, 0.0f)
                lineToRelative(-23.07f, -63.45f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.35f, -8.35f)
                lineTo(31.29f, 129.84f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.68f)
                lineToRelative(63.45f, -23.07f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.35f, -8.35f)
                lineToRelative(23.07f, -63.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.68f, 0.0f)
                lineToRelative(23.07f, 63.45f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.35f, 8.35f)
                lineToRelative(63.45f, 23.07f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.68f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
