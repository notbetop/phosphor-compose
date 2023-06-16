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

public val ThinGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 102.0f)
                lineTo(51.93f, 36.67f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.69f, 52.0f)
                lineTo(102.0f, 228.0f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, 11.31f, 8.0f)
                horizontalLineToRelative(0.22f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, false, 11.26f, -8.47f)
                lineTo(148.32f, 151.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.65f, -2.65f)
                lineToRelative(76.56f, -23.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 102.0f)
                close()
                moveTo(225.17f, 117.13f)
                lineTo(148.6f, 140.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.94f, 7.94f)
                lineToRelative(-23.55f, 76.56f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, -3.76f, 2.82f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -3.85f, -2.69f)
                lineToRelative(0.0f, -0.08f)
                lineTo(44.22f, 49.32f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 1.0f, -4.14f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 1.25f, 0.21f)
                lineToRelative(176.08f, 65.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.13f, 7.6f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
