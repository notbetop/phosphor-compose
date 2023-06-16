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

public val ThinGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 213.31f)
                lineTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(84.0f, 85.55f)
                verticalLineTo(128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 70.52f, 35.11f)
                lineToRelative(16.17f, 17.8f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 60.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, false, 72.0f, 75.89f)
                verticalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(203.89f)
                arcToRelative(75.76f, 75.76f, 0.0f, false, false, 44.09f, -17.0f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineTo(94.35f)
                lineToRelative(57.1f, 62.81f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(90.56f, 40.88f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 64.0f)
                verticalLineToRelative(60.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 97.36f, 45.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.8f, -4.21f)
                close()
                moveTo(191.37f, 152.73f)
                arcTo(67.81f, 67.81f, 0.0f, false, false, 196.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(75.64f, 75.64f, 0.0f, false, true, -5.18f, 27.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.73f, 2.54f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.45f, -0.27f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 191.37f, 152.73f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
