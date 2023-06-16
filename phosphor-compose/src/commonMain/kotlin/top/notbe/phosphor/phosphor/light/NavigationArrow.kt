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

public val LightGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.65f, 100.1f)
                lineTo(52.72f, 34.83f)
                lineToRelative(-0.13f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.78f, 52.59f)
                reflectiveCurveToRelative(0.0f, 0.09f, 0.0f, 0.13f)
                lineTo(100.1f, 228.65f)
                arcTo(13.77f, 13.77f, 0.0f, false, false, 113.28f, 238.0f)
                horizontalLineToRelative(0.26f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 13.14f, -9.88f)
                lineToRelative(23.56f, -76.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.32f, -1.32f)
                lineToRelative(76.56f, -23.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.53f, -26.58f)
                close()
                moveTo(224.59f, 115.21f)
                lineTo(148.0f, 138.77f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.26f, 9.26f)
                lineToRelative(-23.56f, 76.56f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -1.88f, 1.41f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.92f, -1.35f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, -0.12f)
                lineTo(46.11f, 48.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.51f, -2.51f)
                lineToRelative(175.91f, 65.26f)
                lineToRelative(0.12f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.06f, 3.8f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
