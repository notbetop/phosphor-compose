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

public val LightGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.44f, 212.0f)
                lineTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(82.0f, 86.32f)
                verticalLineTo(128.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 72.24f, 37.78f)
                lineToRelative(13.53f, 14.89f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, false, 72.0f, 77.75f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(205.75f)
                arcToRelative(77.68f, 77.68f, 0.0f, false, false, 41.86f, -16.18f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f)
                verticalLineTo(99.52f)
                lineToRelative(52.07f, 57.28f)
                arcTo(33.92f, 33.92f, 0.0f, false, true, 128.0f, 162.0f)
                close()
                moveTo(88.86f, 39.83f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 174.0f, 64.0f)
                verticalLineToRelative(60.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(64.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 99.06f, 46.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.2f, -6.31f)
                close()
                moveTo(189.5f, 152.0f)
                arcToRelative(65.55f, 65.55f, 0.0f, false, false, 4.5f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(77.65f, 77.65f, 0.0f, false, true, -5.32f, 28.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.59f, 3.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 189.5f, 152.0f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
