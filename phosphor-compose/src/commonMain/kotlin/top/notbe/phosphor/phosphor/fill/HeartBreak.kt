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

public val FillGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.81f, 99.5f)
                curveToRelative(-5.19f, 67.42f, -103.7f, 121.23f, -108.0f, 123.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.58f, 0.0f)
                curveTo(119.8f, 220.67f, 16.0f, 164.0f, 16.0f, 94.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 96.47f, -51.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.61f, 6.17f)
                lineTo(99.72f, 62.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineToRelative(32.53f, 32.53f)
                lineTo(111.0f, 127.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.31f, 11.31f)
                lineToRelative(26.88f, -26.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f)
                lineTo(116.7f, 67.63f)
                lineToRelative(17.47f, -17.47f)
                horizontalLineToRelative(0.0f)
                arcTo(61.63f, 61.63f, 0.0f, false, true, 178.41f, 32.0f)
                curveTo(214.73f, 32.23f, 242.59f, 63.29f, 239.81f, 99.5f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
