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

public val BoldGroup.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) {
            return _chartPieSlice!!
        }
        _chartPieSlice = Builder(name = "ChartPieSlice", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.82f, 116.64f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 106.15f)
                lineTo(100.0f, 40.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 83.0f, 29.83f)
                arcTo(108.26f, 108.26f, 0.0f, false, false, 20.0f, 128.0f)
                curveToRelative(0.0f, 3.37f, 0.16f, 6.76f, 0.47f, 10.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, 9.38f)
                close()
                moveTo(76.0f, 62.06f)
                verticalLineToRelative(37.0f)
                lineTo(44.81f, 116.36f)
                arcTo(84.39f, 84.39f, 0.0f, false, true, 76.0f, 62.06f)
                close()
                moveTo(221.88f, 74.66f)
                curveToRelative(-0.11f, -0.24f, -0.24f, -0.47f, -0.37f, -0.7f)
                reflectiveCurveToRelative(-0.26f, -0.43f, -0.4f, -0.63f)
                arcTo(108.05f, 108.05f, 0.0f, false, false, 128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(89.53f)
                lineTo(39.18f, 166.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.3f, 16.46f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 236.0f, 128.0f)
                arcTo(107.22f, 107.22f, 0.0f, false, false, 221.88f, 74.66f)
                close()
                moveTo(140.0f, 44.85f)
                arcToRelative(84.08f, 84.08f, 0.0f, false, true, 54.0f, 31.24f)
                lineToRelative(-54.0f, 31.46f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.47f, 84.47f, 0.0f, false, true, -65.57f, -31.5f)
                lineToRelative(71.42f, -41.6f)
                lineToRelative(0.36f, -0.2f)
                lineTo(206.0f, 96.87f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
