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

public val ThinGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.52f, 118.0f)
                lineTo(150.33f, 61.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, -0.39f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 132.0f, 71.84f)
                verticalLineToRelative(44.59f)
                lineTo(46.33f, 61.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, -0.39f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 28.0f, 71.84f)
                lineTo(28.0f, 184.16f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, 6.15f, 10.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, -0.39f)
                lineTo(132.0f, 139.57f)
                verticalLineToRelative(44.59f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, 6.15f, 10.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, -0.39f)
                lineTo(238.52f, 138.0f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, 0.0f, -19.94f)
                close()
                moveTo(130.22f, 131.19f)
                lineTo(42.0f, 187.38f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -4.0f, 0.13f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.0f, -3.35f)
                lineTo(36.0f, 71.84f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 2.0f, -3.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.91f, -0.5f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.13f, 0.63f)
                lineToRelative(88.18f, 56.16f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, 6.44f)
                close()
                moveTo(234.22f, 131.19f)
                lineTo(146.0f, 187.38f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -4.0f, 0.13f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.0f, -3.35f)
                lineTo(140.0f, 71.84f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 2.0f, -3.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.91f, -0.5f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.13f, 0.63f)
                lineToRelative(88.18f, 56.16f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, 6.44f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
