package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 113.58f)
                arcToRelative(15.76f, 15.76f, 0.0f, false, true, -11.29f, 15.0f)
                lineToRelative(-76.56f, 23.56f)
                lineToRelative(-23.56f, 76.56f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.0f, 11.29f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, -15.07f, -10.67f)
                lineTo(33.0f, 53.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.05f, -0.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 53.25f, 32.9f)
                lineToRelative(0.16f, 0.05f)
                lineTo(229.33f, 98.21f)
                arcTo(15.78f, 15.78f, 0.0f, false, true, 240.0f, 113.58f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
