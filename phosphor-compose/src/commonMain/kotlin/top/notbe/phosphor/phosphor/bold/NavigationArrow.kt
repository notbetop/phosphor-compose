package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.7f, 94.46f)
                lineTo(54.81f, 29.21f)
                lineToRelative(-0.25f, -0.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 29.12f, 54.56f)
                lineToRelative(0.09f, 0.25f)
                lineTo(94.46f, 230.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 113.3f, 244.0f)
                horizontalLineToRelative(0.35f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.77f, -14.12f)
                lineToRelative(22.93f, -74.53f)
                lineToRelative(74.53f, -22.93f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.82f, -38.0f)
                close()
                moveTo(146.27f, 133.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 133.0f, 146.27f)
                lineTo(113.0f, 211.55f)
                lineTo(54.8f, 54.8f)
                lineTo(211.55f, 113.0f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
