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

public val FillGroup.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) {
            return _webhooksLogo!!
        }
        _webhooksLogo = Builder(name = "WebhooksLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.15f, 168.0f)
                lineToRelative(38.92f, -67.43f)
                lineToRelative(-2.24f, -3.88f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 85.05f, -44.17f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -3.19f, 10.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.35f, -3.72f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -56.77f, 29.3f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.08f, 0.13f)
                lineToRelative(13.83f, 23.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(77.86f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -27.71f, -16.0f)
                close()
                moveTo(191.15f, 128.0f)
                lineTo(178.81f, 128.0f)
                lineTo(141.86f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.71f, 16.0f)
                lineToRelative(34.64f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.92f, 4.0f)
                horizontalLineToRelative(35.63f)
                curveToRelative(17.89f, 0.0f, 32.95f, 14.64f, 32.66f, 32.53f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.31f, 208.0f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -8.28f, 7.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.67f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.93f)
                curveTo(239.49f, 148.79f, 217.48f, 128.0f, 191.19f, 128.0f)
                close()
                moveTo(208.0f, 175.23f)
                curveToRelative(-0.4f, -8.61f, -7.82f, -15.23f, -16.43f, -15.23f)
                lineTo(114.81f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.93f, 4.0f)
                lineTo(91.72f, 192.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -53.47f, -35.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.92f, -11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.72f, 1.17f)
                arcTo(47.63f, 47.63f, 0.0f, false, false, 16.0f, 175.54f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 105.55f, 200.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(4.62f, -8.0f)
                lineTo(192.0f, 192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 175.23f)
                close()
            }
        }
        .build()
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
