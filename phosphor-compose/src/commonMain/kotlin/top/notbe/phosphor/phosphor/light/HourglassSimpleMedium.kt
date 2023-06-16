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

public val LightGroup.HourglassSimpleMedium: ImageVector
    get() {
        if (_hourglassSimpleMedium != null) {
            return _hourglassSimpleMedium!!
        }
        _hourglassSimpleMedium = Builder(name = "HourglassSimpleMedium", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.8f, 198.0f)
                lineToRelative(-73.12f, -70.0f)
                lineTo(209.8f, 58.0f)
                lineToRelative(0.09f, -0.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 34.0f)
                horizontalLineTo(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.9f, 23.9f)
                lineToRelative(0.09f, 0.09f)
                lineToRelative(73.12f, 70.0f)
                lineTo(46.2f, 198.0f)
                lineToRelative(-0.09f, 0.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 222.0f)
                horizontalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, -23.9f)
                close()
                moveTo(92.81f, 86.0f)
                horizontalLineToRelative(70.38f)
                lineTo(128.0f, 119.69f)
                close()
                moveTo(54.16f, 47.23f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 56.0f, 46.0f)
                horizontalLineTo(200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, 3.38f)
                lineTo(175.72f, 74.0f)
                horizontalLineTo(80.28f)
                lineTo(54.56f, 49.38f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 54.16f, 47.23f)
                close()
                moveTo(201.84f, 208.77f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 200.0f, 210.0f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, -3.38f)
                lineTo(122.0f, 142.05f)
                verticalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(142.05f)
                lineToRelative(67.44f, 64.57f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 201.84f, 208.77f)
                close()
            }
        }
        .build()
        return _hourglassSimpleMedium!!
    }

private var _hourglassSimpleMedium: ImageVector? = null
