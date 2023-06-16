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

public val BoldGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(76.0f, 88.64f)
                verticalLineTo(120.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 72.11f, 48.0f)
                lineToRelative(11.26f, 12.39f)
                arcTo(67.34f, 67.34f, 0.0f, false, true, 128.0f, 188.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(92.14f, 92.14f, 0.0f, false, false, 80.0f, 91.22f)
                verticalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(211.23f)
                arcToRelative(90.39f, 90.39f, 0.0f, false, false, 35.92f, -12.68f)
                lineToRelative(23.2f, 25.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(29.9f, 32.89f)
                curveTo(129.27f, 148.0f, 128.64f, 148.0f, 128.0f, 148.0f)
                close()
                moveTo(90.67f, 45.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.48f, -17.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 180.0f, 64.0f)
                verticalLineToRelative(48.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.36f, -19.22f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 90.67f, 45.27f)
                close()
                moveTo(191.0f, 145.58f)
                arcTo(67.63f, 67.63f, 0.0f, false, false, 196.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(91.48f, 91.48f, 0.0f, false, true, -6.74f, 34.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.23f, -9.0f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
