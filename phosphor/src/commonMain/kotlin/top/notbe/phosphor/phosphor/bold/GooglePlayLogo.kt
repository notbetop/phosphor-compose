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

public val BoldGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.79f, 110.7f)
                lineTo(58.0f, 14.65f)
                arcToRelative(20.24f, 20.24f, 0.0f, false, false, -20.12f, 0.06f)
                arcTo(19.62f, 19.62f, 0.0f, false, false, 28.0f, 31.84f)
                verticalLineTo(224.16f)
                arcToRelative(19.62f, 19.62f, 0.0f, false, false, 9.91f, 17.13f)
                arcToRelative(20.22f, 20.22f, 0.0f, false, false, 20.12f, 0.06f)
                lineToRelative(167.76f, -96.0f)
                arcToRelative(19.76f, 19.76f, 0.0f, false, false, 0.0f, -34.6f)
                close()
                moveTo(52.0f, 203.0f)
                verticalLineTo(53.0f)
                lineToRelative(75.0f, 75.0f)
                close()
                moveTo(144.0f, 145.0f)
                lineToRelative(12.4f, 12.4f)
                lineToRelative(-58.0f, 33.2f)
                close()
                moveTo(98.41f, 65.43f)
                lineToRelative(58.0f, 33.2f)
                lineTo(144.0f, 111.0f)
                close()
                moveTo(178.0f, 145.0f)
                lineToRelative(-17.0f, -17.0f)
                lineToRelative(17.0f, -17.0f)
                lineToRelative(29.72f, 17.0f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
