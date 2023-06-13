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

public val ThinGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 36.0f)
                arcToRelative(57.59f, 57.59f, 0.0f, false, false, -41.0f, 17.0f)
                lineToRelative(-9.0f, 9.0f)
                lineToRelative(-9.0f, -9.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 20.0f, 94.0f)
                curveToRelative(0.0f, 28.59f, 18.0f, 58.47f, 53.4f, 88.79f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, 36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, -36.73f)
                curveTo(218.0f, 152.47f, 236.0f, 122.59f, 236.0f, 94.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 178.0f, 36.0f)
                close()
                moveTo(128.0f, 211.42f)
                curveTo(114.0f, 203.46f, 28.0f, 152.07f, 28.0f, 94.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 85.36f, -35.36f)
                lineToRelative(9.0f, 9.0f)
                lineTo(109.17f, 80.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(27.36f, 27.36f)
                lineToRelative(-19.36f, 19.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(145.0f, 116.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.65f)
                lineTo(117.66f, 83.63f)
                lineToRelative(13.16f, -13.16f)
                horizontalLineToRelative(0.0f)
                lineToRelative(11.8f, -11.81f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 228.0f, 94.0f)
                curveTo(228.0f, 152.0f, 142.0f, 203.46f, 128.0f, 211.42f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
