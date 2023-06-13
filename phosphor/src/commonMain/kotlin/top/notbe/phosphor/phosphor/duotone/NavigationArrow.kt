package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(226.35f, 121.0f)
                lineTo(149.8f, 144.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.3f, 5.3f)
                lineTo(121.0f, 226.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.21f, 0.27f)
                lineToRelative(-65.28f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 50.63f, 40.46f)
                lineToRelative(176.0f, 65.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 226.35f, 121.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.33f, 98.21f)
                lineTo(53.41f, 33.0f)
                lineToRelative(-0.16f, -0.05f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.9f, 53.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.05f, 0.16f)
                lineTo(98.21f, 229.33f)
                arcTo(15.77f, 15.77f, 0.0f, false, false, 113.28f, 240.0f)
                horizontalLineToRelative(0.3f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, 15.0f, -11.29f)
                lineToRelative(23.56f, -76.56f)
                lineToRelative(76.56f, -23.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.62f, -30.38f)
                close()
                moveTo(224.0f, 113.3f)
                lineToRelative(-76.56f, 23.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.58f, 10.58f)
                lineTo(113.3f, 224.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.06f, -0.17f)
                lineTo(48.0f, 48.0f)
                lineToRelative(175.82f, 65.22f)
                lineToRelative(0.16f, 0.06f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
