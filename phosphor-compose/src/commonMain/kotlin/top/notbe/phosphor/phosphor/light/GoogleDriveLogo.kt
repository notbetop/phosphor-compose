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

public val LightGroup.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) {
            return _googleDriveLogo!!
        }
        _googleDriveLogo = Builder(name = "GoogleDriveLogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.9f, 152.82f)
                lineTo(167.43f, 40.58f)
                arcTo(13.91f, 13.91f, 0.0f, false, false, 155.56f, 34.0f)
                lineTo(100.43f, 34.0f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -11.87f, 6.58f)
                lineToRelative(0.0f, 0.05f)
                lineTo(20.13f, 152.76f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.28f, 14.37f)
                lineTo(47.17f, 215.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 59.32f, 222.0f)
                lineTo(196.67f, 222.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.83f, 215.0f)
                lineToRelative(27.32f, -47.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 235.9f, 152.82f)
                close()
                moveTo(222.56f, 154.0f)
                lineTo(171.39f, 154.0f)
                lineTo(135.0f, 93.33f)
                lineToRelative(25.08f, -41.79f)
                close()
                moveTo(98.56f, 154.0f)
                lineTo(128.0f, 105.0f)
                lineToRelative(29.4f, 49.0f)
                close()
                moveTo(164.56f, 166.0f)
                lineTo(191.0f, 210.0f)
                lineTo(65.0f, 210.0f)
                lineToRelative(26.4f, -44.0f)
                close()
                moveTo(128.0f, 81.67f)
                lineTo(106.6f, 46.0f)
                horizontalLineToRelative(42.8f)
                close()
                moveTo(95.93f, 51.54f)
                lineTo(121.0f, 93.33f)
                lineTo(84.6f, 154.0f)
                lineTo(33.43f, 154.0f)
                close()
                moveTo(33.0f, 166.0f)
                lineTo(77.4f, 166.0f)
                lineTo(54.67f, 203.89f)
                close()
                moveTo(201.3f, 203.89f)
                lineTo(178.59f, 166.0f)
                lineTo(223.0f, 166.0f)
                close()
            }
        }
        .build()
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
