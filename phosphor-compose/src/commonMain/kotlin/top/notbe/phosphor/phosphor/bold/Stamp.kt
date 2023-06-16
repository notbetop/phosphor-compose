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

public val BoldGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 212.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 224.0f)
                close()
                moveTo(228.0f, 144.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                lineTo(99.48f, 124.0f)
                lineTo(84.81f, 55.54f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 120.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 35.2f, 43.54f)
                lineTo(156.52f, 124.0f)
                lineTo(208.0f, 124.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 144.0f)
                close()
                moveTo(124.0f, 124.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(15.74f, -73.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 136.0f, 36.0f)
                lineTo(120.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.73f, 14.51f)
                close()
                moveTo(204.0f, 148.0f)
                lineTo(52.0f, 148.0f)
                verticalLineToRelative(24.0f)
                lineTo(204.0f, 172.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
