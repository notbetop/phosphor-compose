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

public val FillGroup.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.75f, 115.54f)
                arcTo(102.31f, 102.31f, 0.0f, false, true, 48.06f, 61.78f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.63f, -1.1f)
                lineTo(99.36f, 88.94f)
                arcToRelative(15.87f, 15.87f, 0.0f, false, true, 1.69f, 20.48f)
                horizontalLineToRelative(0.0f)
                arcToRelative(25.59f, 25.59f, 0.0f, false, false, -3.7f, 7.75f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 93.53f, 120.0f)
                lineTo(28.73f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.75f, 115.54f)
                close()
                moveTo(137.39f, 24.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 40.0f)
                lineTo(120.0f, 80.67f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, 13.25f, 15.76f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 5.41f, 61.76f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 136.0f, 162.0f)
                verticalLineToRelative(65.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.46f, 4.0f)
                arcTo(104.34f, 104.34f, 0.0f, false, false, 232.0f, 129.48f)
                curveTo(232.75f, 75.19f, 191.19f, 28.88f, 137.39f, 24.06f)
                close()
                moveTo(117.25f, 158.16f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -19.4f, -19.42f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, -3.8f, -2.74f)
                lineTo(28.72f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.45f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, false, 90.82f, 90.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, -4.0f)
                lineTo(119.99f, 162.0f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 117.25f, 158.16f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
