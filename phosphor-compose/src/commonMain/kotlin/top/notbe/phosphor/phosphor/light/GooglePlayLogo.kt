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

public val LightGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.84f, 115.93f)
                lineTo(55.0f, 19.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.12f, 0.0f)
                arcTo(13.68f, 13.68f, 0.0f, false, false, 34.0f, 31.87f)
                lineTo(34.0f, 224.13f)
                arcToRelative(13.68f, 13.68f, 0.0f, false, false, 6.92f, 11.94f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.12f, 0.0f)
                lineToRelative(167.8f, -96.0f)
                arcToRelative(13.75f, 13.75f, 0.0f, false, false, 0.0f, -24.14f)
                close()
                moveTo(46.0f, 217.5f)
                lineTo(46.0f, 38.5f)
                lineTo(135.51f, 128.0f)
                close()
                moveTo(144.0f, 136.5f)
                lineTo(166.19f, 158.69f)
                lineTo(62.4f, 218.07f)
                close()
                moveTo(62.4f, 37.93f)
                lineToRelative(103.79f, 59.4f)
                lineTo(144.0f, 119.52f)
                close()
                moveTo(217.0f, 129.58f)
                lineToRelative(-0.1f, 0.06f)
                lineTo(177.0f, 152.49f)
                lineTo(152.49f, 128.0f)
                lineTo(177.0f, 103.51f)
                lineToRelative(39.94f, 22.85f)
                lineToRelative(0.1f, 0.06f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 0.0f, 3.16f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
