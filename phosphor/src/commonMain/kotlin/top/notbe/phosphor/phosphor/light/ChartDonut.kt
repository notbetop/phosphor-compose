package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) {
            return _chartDonut!!
        }
        _chartDonut = Builder(name = "ChartDonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.21f, 26.05f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 122.0f, 40.0f)
                lineTo(122.0f, 80.67f)
                arcToRelative(13.86f, 13.86f, 0.0f, false, false, 11.58f, 13.78f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -39.53f, 35.33f)
                curveToRelative(-0.44f, -8.68f, 1.37f, -15.92f, 5.38f, -21.53f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, -1.5f, -17.91f)
                lineTo(70.28f, 62.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -20.69f, 1.0f)
                arcToRelative(101.62f, 101.62f, 0.0f, false, false, 6.79f, 137.57f)
                arcTo(101.29f, 101.29f, 0.0f, false, false, 128.0f, 230.0f)
                horizontalLineToRelative(1.46f)
                arcTo(102.31f, 102.31f, 0.0f, false, false, 230.0f, 129.45f)
                curveTo(230.73f, 76.2f, 190.0f, 30.78f, 137.21f, 26.05f)
                close()
                moveTo(58.81f, 70.74f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 60.29f, 70.0f)
                horizontalLineToRelative(0.09f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 1.37f, 0.54f)
                lineTo(89.4f, 98.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.27f, 2.49f)
                arcTo(41.83f, 41.83f, 0.0f, false, false, 82.23f, 122.0f)
                horizontalLineToRelative(-44.0f)
                arcTo(88.42f, 88.42f, 0.0f, false, true, 58.81f, 70.74f)
                close()
                moveTo(38.22f, 134.0f)
                lineTo(82.4f, 134.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 122.0f, 173.61f)
                verticalLineToRelative(44.17f)
                arcTo(89.93f, 89.93f, 0.0f, false, true, 38.22f, 134.0f)
                close()
                moveTo(191.56f, 191.56f)
                arcTo(89.48f, 89.48f, 0.0f, false, true, 134.0f, 217.79f)
                lineTo(134.0f, 173.62f)
                arcToRelative(45.53f, 45.53f, 0.0f, false, false, 25.36f, -12.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -23.83f, -79.0f)
                arcTo(1.93f, 1.93f, 0.0f, false, true, 134.0f, 80.67f)
                lineTo(134.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.66f, -1.5f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 1.48f, -0.5f)
                curveToRelative(46.55f, 4.17f, 82.51f, 44.26f, 81.85f, 91.27f)
                arcTo(89.44f, 89.44f, 0.0f, false, true, 191.56f, 191.56f)
                close()
            }
        }
        .build()
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
