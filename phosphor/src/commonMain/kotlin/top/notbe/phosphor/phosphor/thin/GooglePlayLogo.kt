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

public val ThinGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.89f, 117.69f)
                lineTo(54.05f, 21.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.13f, 0.0f)
                arcTo(11.69f, 11.69f, 0.0f, false, false, 36.0f, 31.87f)
                lineTo(36.0f, 224.13f)
                arcToRelative(11.69f, 11.69f, 0.0f, false, false, 5.92f, 10.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.13f, 0.0f)
                lineToRelative(167.77f, -96.0f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, false, 0.07f, -20.66f)
                close()
                moveTo(169.45f, 96.89f)
                lineTo(144.0f, 122.34f)
                lineTo(50.4f, 28.75f)
                close()
                moveTo(44.0f, 222.33f)
                lineTo(44.0f, 33.67f)
                lineTo(138.34f, 128.0f)
                close()
                moveTo(50.4f, 227.25f)
                lineTo(144.0f, 133.66f)
                lineToRelative(25.45f, 25.45f)
                close()
                moveTo(217.91f, 131.37f)
                lineTo(176.65f, 155.0f)
                lineToRelative(-27.0f, -27.0f)
                lineToRelative(27.0f, -27.0f)
                lineTo(218.0f, 124.66f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -0.07f, 6.71f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
