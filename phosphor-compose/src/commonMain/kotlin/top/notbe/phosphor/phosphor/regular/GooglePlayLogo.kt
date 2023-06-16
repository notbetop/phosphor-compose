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

public val RegularGroup.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) {
            return _googlePlayLogo!!
        }
        _googlePlayLogo = Builder(name = "GooglePlayLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.82f, 114.19f)
                lineTo(56.0f, 18.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.12f, 0.0f)
                arcTo(15.68f, 15.68f, 0.0f, false, false, 32.0f, 31.87f)
                lineTo(32.0f, 224.13f)
                arcToRelative(15.68f, 15.68f, 0.0f, false, false, 7.92f, 13.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.12f, 0.0f)
                lineToRelative(167.78f, -96.0f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, 0.0f, -27.62f)
                close()
                moveTo(48.0f, 212.67f)
                lineTo(48.0f, 43.33f)
                lineTo(132.69f, 128.0f)
                close()
                moveTo(144.0f, 139.31f)
                lineTo(162.92f, 158.23f)
                lineTo(74.42f, 208.89f)
                close()
                moveTo(74.4f, 47.1f)
                lineToRelative(88.53f, 50.67f)
                lineTo(144.0f, 116.69f)
                close()
                moveTo(177.31f, 150.0f)
                lineToRelative(-22.0f, -22.0f)
                lineToRelative(22.0f, -22.0f)
                lineToRelative(38.43f, 22.0f)
                close()
            }
        }
        .build()
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
