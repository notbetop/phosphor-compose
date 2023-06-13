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

public val BoldGroup.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) {
            return _telegramLogo!!
        }
        _telegramLogo = Builder(name = "TelegramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.49f, 23.16f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -13.23f, -2.26f)
                lineTo(23.6f, 100.21f)
                arcToRelative(18.22f, 18.22f, 0.0f, false, false, 3.12f, 34.86f)
                lineTo(76.0f, 144.74f)
                lineTo(76.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.4f, 13.88f)
                lineToRelative(22.67f, -23.51f)
                lineTo(170.35f, 223.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 32.7f, -10.54f)
                lineTo(243.67f, 35.91f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 239.49f, 23.16f)
                close()
                moveTo(147.41f, 77.52f)
                lineTo(85.22f, 122.09f)
                lineToRelative(-34.43f, -6.75f)
                close()
                moveTo(100.0f, 190.06f)
                lineTo(100.0f, 161.35f)
                lineToRelative(15.0f, 13.15f)
                close()
                moveTo(181.16f, 200.58f)
                lineTo(107.28f, 135.81f)
                lineTo(213.59f, 59.63f)
                close()
            }
        }
        .build()
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
