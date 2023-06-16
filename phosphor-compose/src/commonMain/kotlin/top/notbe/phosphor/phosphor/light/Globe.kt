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

public val LightGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(209.57f, 90.0f)
                lineTo(169.39f, 90.0f)
                arcToRelative(139.15f, 139.15f, 0.0f, false, false, -23.45f, -50.2f)
                arcTo(90.32f, 90.32f, 0.0f, false, true, 209.57f, 90.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, -3.83f, 26.0f)
                lineTo(171.86f, 154.0f)
                arcToRelative(159.0f, 159.0f, 0.0f, false, false, 0.0f, -52.0f)
                horizontalLineToRelative(42.31f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.32f, -0.59f)
                curveTo(113.8f, 203.54f, 104.34f, 185.73f, 99.0f, 166.0f)
                horizontalLineToRelative(58.0f)
                curveToRelative(-5.34f, 19.73f, -14.8f, 37.54f, -27.68f, 51.41f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(96.31f, 154.0f)
                arcToRelative(147.48f, 147.48f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(63.38f)
                arcToRelative(147.48f, 147.48f, 0.0f, false, true, 0.0f, 52.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, 3.83f, -26.0f)
                lineTo(84.14f, 102.0f)
                arcToRelative(159.0f, 159.0f, 0.0f, false, false, 0.0f, 52.0f)
                lineTo(41.83f, 154.0f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.32f, 0.59f)
                curveTo(142.2f, 52.46f, 151.66f, 70.27f, 157.0f, 90.0f)
                lineTo(99.0f, 90.0f)
                curveToRelative(5.34f, -19.73f, 14.8f, -37.54f, 27.68f, -51.41f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(110.06f, 39.8f)
                arcTo(139.15f, 139.15f, 0.0f, false, false, 86.61f, 90.0f)
                lineTo(46.43f, 90.0f)
                arcTo(90.32f, 90.32f, 0.0f, false, true, 110.06f, 39.8f)
                close()
                moveTo(46.43f, 166.0f)
                lineTo(86.61f, 166.0f)
                arcToRelative(139.15f, 139.15f, 0.0f, false, false, 23.45f, 50.2f)
                arcTo(90.32f, 90.32f, 0.0f, false, true, 46.43f, 166.0f)
                close()
                moveTo(145.94f, 216.2f)
                arcTo(139.15f, 139.15f, 0.0f, false, false, 169.39f, 166.0f)
                horizontalLineToRelative(40.18f)
                arcTo(90.32f, 90.32f, 0.0f, false, true, 145.94f, 216.2f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
