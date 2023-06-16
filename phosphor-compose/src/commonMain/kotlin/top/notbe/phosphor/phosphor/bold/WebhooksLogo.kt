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

public val BoldGroup.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) {
            return _webhooksLogo!!
        }
        _webhooksLogo = Builder(name = "WebhooksLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.59f, 188.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 12.0f, 176.0f)
                arcToRelative(51.54f, 51.54f, 0.0f, false, true, 10.41f, -31.21f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 41.59f, 159.2f)
                arcTo(27.74f, 27.74f, 0.0f, false, false, 36.0f, 176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(57.71f, 186.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.51f, -3.93f)
                lineToRelative(43.0f, -69.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.93f, -16.51f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 40.34f, -35.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 22.0f, -9.59f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -84.42f, 57.62f)
                lineToRelative(-37.47f, 60.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 57.71f, 186.22f)
                close()
                moveTo(192.0f, 124.0f)
                arcToRelative(51.89f, 51.89f, 0.0f, false, false, -16.3f, 2.62f)
                lineTo(138.22f, 65.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.44f, 12.58f)
                lineToRelative(43.0f, 69.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.52f, 3.93f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 192.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
            }
        }
        .build()
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
