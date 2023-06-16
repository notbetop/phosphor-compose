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

public val BoldGroup.Pants: ImageVector
    get() {
        if (_pants != null) {
            return _pants!!
        }
        _pants = Builder(name = "Pants", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.85f, 213.52f)
                lineToRelative(-22.0f, -176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.0f, 20.0f)
                lineTo(70.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.15f, 37.52f)
                lineToRelative(-22.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 236.0f)
                lineTo(88.69f, 236.0f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 108.07f, 221.0f)
                lineToRelative(19.93f, -77.0f)
                lineToRelative(19.91f, 76.94f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 167.31f, 236.0f)
                lineTo(208.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -22.48f)
                close()
                moveTo(190.0f, 104.23f)
                arcTo(28.05f, 28.05f, 0.0f, false, true, 176.29f, 84.0f)
                horizontalLineToRelative(11.18f)
                close()
                moveTo(182.47f, 44.0f)
                lineToRelative(2.0f, 16.0f)
                lineTo(71.53f, 60.0f)
                lineToRelative(2.0f, -16.0f)
                close()
                moveTo(68.53f, 84.0f)
                lineTo(79.71f, 84.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 66.0f, 104.22f)
                close()
                moveTo(85.6f, 212.0f)
                lineTo(52.53f, 212.0f)
                lineToRelative(10.14f, -81.11f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 103.83f, 84.0f)
                lineTo(116.0f, 84.0f)
                lineTo(116.0f, 94.47f)
                close()
                moveTo(170.41f, 212.0f)
                lineTo(140.0f, 94.47f)
                lineTo(140.0f, 84.0f)
                horizontalLineToRelative(12.17f)
                arcToRelative(52.09f, 52.09f, 0.0f, false, false, 41.16f, 46.88f)
                lineTo(203.47f, 212.0f)
                close()
            }
        }
        .build()
        return _pants!!
    }

private var _pants: ImageVector? = null
