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

public val BoldGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 144.0f)
                close()
                moveTo(72.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 200.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, -20.49f)
                lineTo(43.0f, 96.0f)
                lineTo(31.51f, 84.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(60.0f, 79.0f)
                lineTo(71.51f, 67.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(77.0f, 96.0f)
                lineToRelative(11.52f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(60.0f, 113.0f)
                lineTo(48.49f, 124.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(224.49f, 203.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(196.0f, 209.0f)
                lineToRelative(-11.51f, 11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(179.0f, 192.0f)
                lineToRelative(-11.52f, -11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(196.0f, 175.0f)
                lineToRelative(11.51f, -11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(213.0f, 192.0f)
                close()
                moveTo(181.09f, 110.89f)
                curveToRelative(-5.21f, 23.0f, -23.33f, 43.53f, -45.09f, 51.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -8.0f, -22.63f)
                curveToRelative(14.07f, -5.0f, 26.27f, -18.91f, 29.67f, -33.9f)
                curveToRelative(2.37f, -10.46f, 0.4f, -20.84f, -5.68f, -30.54f)
                verticalLineToRelative(9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(127.99f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(168.0f, 56.0f)
                curveTo(180.77f, 72.61f, 185.42f, 91.76f, 181.09f, 110.89f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
