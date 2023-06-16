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

public val LightGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.17f, 201.09f)
                lineTo(140.1f, 33.16f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.41f, 0.0f)
                lineToRelative(-95.88f, 168.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.85f, 20.05f)
                lineToRelative(90.48f, -31.0f)
                lineToRelative(0.07f, 0.0f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, 1.42f, 0.0f)
                lineToRelative(90.64f, 31.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.9f, -20.07f)
                close()
                moveTo(225.51f, 209.26f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -2.28f, 0.57f)
                lineTo(134.0f, 179.3f)
                lineTo(134.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(59.21f)
                lineTo(32.7f, 209.86f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.2f, -0.6f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, true, -0.24f, -2.22f)
                lineTo(126.14f, 39.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.74f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.78f, 1.07f)
                lineTo(225.73f, 207.0f)
                arcTo(1.86f, 1.86f, 0.0f, false, true, 225.51f, 209.26f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
