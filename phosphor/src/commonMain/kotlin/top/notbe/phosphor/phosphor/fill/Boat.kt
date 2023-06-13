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

public val FillGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.06f, 110.63f)
                lineTo(208.0f, 106.27f)
                lineTo(208.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(136.0f, 40.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(50.27f)
                lineToRelative(-13.06f, 4.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.82f)
                lineTo(24.0f, 160.1f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, false, 0.31f, 2.19f)
                curveToRelative(15.72f, 55.09f, 86.12f, 74.06f, 100.07f, 77.3f)
                arcToRelative(16.19f, 16.19f, 0.0f, false, false, 7.24f, 0.0f)
                curveToRelative(13.95f, -3.24f, 84.35f, -22.21f, 100.07f, -77.3f)
                arcToRelative(7.73f, 7.73f, 0.0f, false, false, 0.31f, -2.19f)
                lineTo(232.0f, 125.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 221.06f, 110.63f)
                close()
                moveTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 100.93f)
                lineTo(130.53f, 80.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.06f, 0.0f)
                lineTo(64.0f, 100.93f)
                lineTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
