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

public val ThinGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 109.5f)
                verticalLineToRelative(-72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.33f, -3.77f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -65.0f, 112.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 35.6f, 149.0f)
                lineTo(98.0f, 113.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 109.5f)
                close()
                moveTo(92.0f, 107.19f)
                lineTo(36.67f, 139.11f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 92.0f, 43.34f)
                close()
                moveTo(214.79f, 78.36f)
                curveToRelative(-0.06f, -0.13f, -0.12f, -0.25f, -0.19f, -0.37f)
                reflectiveCurveToRelative(-0.15f, -0.23f, -0.22f, -0.34f)
                arcTo(100.07f, 100.07f, 0.0f, false, false, 128.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(94.12f)
                lineTo(43.2f, 173.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.43f, 5.49f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 228.0f, 128.0f)
                arcTo(99.42f, 99.42f, 0.0f, false, false, 214.79f, 78.36f)
                close()
                moveTo(132.0f, 36.09f)
                arcTo(92.05f, 92.05f, 0.0f, false, true, 205.59f, 78.6f)
                lineTo(132.0f, 121.46f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.47f, 92.47f, 0.0f, false, true, -77.22f, -42.0f)
                lineTo(130.0f, 131.91f)
                lineToRelative(0.1f, -0.06f)
                lineTo(209.6f, 85.53f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
