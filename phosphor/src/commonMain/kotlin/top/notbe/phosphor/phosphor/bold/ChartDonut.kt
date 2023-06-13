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

public val BoldGroup.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.75f, 20.08f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 116.0f, 40.0f)
                verticalLineTo(80.67f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, 16.6f, 19.7f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 126.0f, 155.93f)
                arcTo(28.3f, 28.3f, 0.0f, false, true, 100.0f, 129.47f)
                curveToRelative(-0.37f, -7.28f, 1.06f, -13.25f, 4.27f, -17.73f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, false, -2.13f, -25.64f)
                lineTo(74.61f, 57.94f)
                lineToRelative(-0.09f, -0.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 45.0f, 59.22f)
                arcTo(107.62f, 107.62f, 0.0f, false, false, 52.17f, 204.9f)
                arcTo(107.21f, 107.21f, 0.0f, false, false, 128.0f, 236.0f)
                horizontalLineToRelative(1.55f)
                arcTo(108.32f, 108.32f, 0.0f, false, false, 236.0f, 129.53f)
                curveTo(236.77f, 73.16f, 193.62f, 25.08f, 137.75f, 20.08f)
                close()
                moveTo(60.69f, 78.0f)
                lineToRelative(22.19f, 22.66f)
                arcTo(47.76f, 47.76f, 0.0f, false, false, 77.08f, 116.0f)
                horizontalLineTo(44.87f)
                arcTo(82.31f, 82.31f, 0.0f, false, true, 60.69f, 78.0f)
                close()
                moveTo(44.86f, 140.0f)
                horizontalLineTo(77.39f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 116.0f, 178.6f)
                verticalLineToRelative(32.55f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.86f, 140.0f)
                close()
                moveTo(140.0f, 211.11f)
                verticalLineTo(178.62f)
                arcTo(51.53f, 51.53f, 0.0f, false, false, 163.46f, 166.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 140.0f, 77.39f)
                verticalLineTo(44.5f)
                curveToRelative(41.29f, 5.93f, 72.58f, 42.3f, 72.0f, 84.7f)
                curveTo(211.42f, 170.56f, 180.0f, 205.25f, 140.0f, 211.11f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
