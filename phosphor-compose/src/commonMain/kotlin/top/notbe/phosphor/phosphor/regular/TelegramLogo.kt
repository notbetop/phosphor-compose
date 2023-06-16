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

public val RegularGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.88f, 26.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.16f, -1.57f)
                lineTo(25.06f, 103.93f)
                arcToRelative(14.22f, 14.22f, 0.0f, false, false, 2.43f, 27.21f)
                lineTo(80.0f, 141.45f)
                lineTo(80.0f, 200.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 10.0f, 14.83f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 17.51f, -3.73f)
                lineToRelative(25.32f, -26.26f)
                lineTo(173.0f, 220.0f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 10.51f, 4.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 5.0f, -0.79f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 10.67f, -11.63f)
                lineTo(239.77f, 35.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 236.88f, 26.19f)
                close()
                moveTo(175.74f, 62.19f)
                lineTo(86.15f, 126.35f)
                lineToRelative(-49.6f, -9.73f)
                close()
                moveTo(96.0f, 200.0f)
                lineTo(96.0f, 152.52f)
                lineToRelative(24.79f, 21.74f)
                close()
                moveTo(183.53f, 208.0f)
                lineTo(100.85f, 135.5f)
                lineToRelative(119.0f, -85.29f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
