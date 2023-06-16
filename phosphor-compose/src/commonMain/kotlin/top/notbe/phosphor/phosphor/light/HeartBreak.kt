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

public val LightGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 34.0f)
                arcToRelative(59.63f, 59.63f, 0.0f, false, false, -42.43f, 17.57f)
                lineTo(128.0f, 59.15f)
                lineToRelative(-7.57f, -7.58f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 18.0f, 94.0f)
                curveToRelative(0.0f, 29.2f, 18.2f, 59.59f, 54.1f, 90.31f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, 37.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, -37.0f)
                curveTo(219.8f, 153.59f, 238.0f, 123.2f, 238.0f, 94.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 178.0f, 34.0f)
                close()
                moveTo(128.0f, 209.11f)
                curveTo(111.59f, 199.64f, 30.0f, 149.72f, 30.0f, 94.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 81.94f, -33.94f)
                lineToRelative(7.57f, 7.57f)
                lineTo(107.76f, 79.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.49f)
                lineToRelative(25.94f, 25.94f)
                lineToRelative(-17.94f, 17.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.48f)
                lineToRelative(22.19f, -22.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.49f)
                lineTo(120.49f, 83.63f)
                lineToRelative(23.57f, -23.57f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 226.0f, 94.0f)
                curveTo(226.0f, 149.72f, 144.41f, 199.64f, 128.0f, 209.11f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
