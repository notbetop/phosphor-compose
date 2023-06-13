package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(80.0f, 87.09f)
                verticalLineTo(128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 73.91f, 40.4f)
                lineToRelative(10.88f, 12.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 64.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(80.11f, 80.11f, 0.0f, false, false, 72.0f, 79.6f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(207.59f)
                arcToRelative(79.74f, 79.74f, 0.0f, false, false, 39.62f, -15.31f)
                lineToRelative(26.46f, 29.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(104.69f)
                lineToRelative(46.92f, 51.62f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
                moveTo(87.16f, 38.78f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 64.0f)
                verticalLineToRelative(60.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -59.24f, -16.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.6f, -8.41f)
                close()
                moveTo(187.64f, 151.27f)
                arcTo(63.71f, 63.71f, 0.0f, false, false, 192.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(79.62f, 79.62f, 0.0f, false, true, -5.46f, 29.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.9f, -5.82f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
