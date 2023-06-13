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

public val FillGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-26.46f, -29.1f)
                arcTo(79.74f, 79.74f, 0.0f, false, true, 136.0f, 207.59f)
                lineTo(136.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 207.6f)
                arcTo(80.11f, 80.11f, 0.0f, false, true, 48.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 100.79f, 52.36f)
                lineToRelative(-10.88f, -12.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 128.0f)
                lineTo(80.0f, 87.09f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(162.08f, 129.81f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 124.43f)
                lineTo(176.0f, 64.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 87.16f, 38.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 48.37f)
                close()
                moveTo(192.18f, 161.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.36f, -4.55f)
                arcTo(79.62f, 79.62f, 0.0f, false, false, 208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(63.71f, 63.71f, 0.0f, false, true, -4.36f, 23.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.18f, 161.64f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
