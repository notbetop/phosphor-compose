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

public val ThinGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(215.64f, 156.0f)
                lineTo(169.49f, 156.0f)
                arcToRelative(157.43f, 157.43f, 0.0f, false, false, 0.0f, -56.0f)
                horizontalLineToRelative(46.15f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.78f, -1.23f)
                curveToRelative(-13.65f, -14.7f, -23.52f, -33.72f, -28.81f, -54.77f)
                horizontalLineToRelative(63.18f)
                curveToRelative(-5.29f, 21.05f, -15.16f, 40.07f, -28.81f, 54.77f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(94.65f, 156.0f)
                arcToRelative(149.25f, 149.25f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(66.7f)
                arcToRelative(149.25f, 149.25f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 2.78f, 1.23f)
                curveTo(144.43f, 51.93f, 154.3f, 71.0f, 159.59f, 92.0f)
                lineTo(96.41f, 92.0f)
                curveToRelative(5.29f, -21.0f, 15.16f, -40.07f, 28.81f, -54.77f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(212.66f, 92.0f)
                lineTo(167.81f, 92.0f)
                curveToRelative(-4.91f, -20.73f, -14.0f, -39.72f, -26.66f, -55.06f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 212.66f, 92.0f)
                close()
                moveTo(114.85f, 36.94f)
                curveTo(102.22f, 52.28f, 93.1f, 71.27f, 88.19f, 92.0f)
                lineTo(43.34f, 92.0f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 114.85f, 36.94f)
                close()
                moveTo(40.36f, 100.0f)
                lineTo(86.51f, 100.0f)
                arcToRelative(157.43f, 157.43f, 0.0f, false, false, 0.0f, 56.0f)
                lineTo(40.36f, 156.0f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 0.0f, -56.0f)
                close()
                moveTo(43.36f, 164.0f)
                lineTo(88.19f, 164.0f)
                curveToRelative(4.91f, 20.73f, 14.0f, 39.72f, 26.66f, 55.06f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 43.34f, 164.0f)
                close()
                moveTo(141.17f, 219.06f)
                curveToRelative(12.63f, -15.34f, 21.75f, -34.33f, 26.66f, -55.06f)
                horizontalLineToRelative(44.85f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 141.15f, 219.06f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
