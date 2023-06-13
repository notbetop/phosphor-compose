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

public val ThinGroup.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.88f, 217.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 3.0f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.0f, -0.12f)
                lineToRelative(-32.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.25f, -0.55f)
                lineToRelative(-24.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, -6.66f)
                lineToRelative(23.42f, 15.62f)
                lineTo(113.0f, 212.12f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 115.88f, 217.0f)
                close()
                moveTo(248.65f, 120.25f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, -6.0f, 6.93f)
                lineToRelative(-24.26f, 12.14f)
                lineToRelative(-55.54f, 55.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 1.0f)
                lineToRelative(-64.0f, -16.0f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, -1.36f, -0.63f)
                lineTo(37.93f, 139.44f)
                lineTo(13.37f, 127.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 8.0f, 111.05f)
                lineTo(32.84f, 61.37f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.94f, 56.0f)
                lineTo(72.4f, 67.73f)
                lineToRelative(54.5f, -15.58f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, true, 2.2f, 0.0f)
                lineToRelative(54.5f, 15.58f)
                lineTo(207.06f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.1f, 5.37f)
                lineTo(248.0f, 111.06f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 248.65f, 120.22f)
                close()
                moveTo(16.94f, 120.0f)
                lineToRelative(21.27f, 10.63f)
                lineTo(66.63f, 73.79f)
                lineTo(45.37f, 63.16f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 64.94f)
                lineTo(15.16f, 114.63f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.94f, 120.0f)
                close()
                moveTo(194.0f, 152.33f)
                lineToRelative(-33.78f, -27.06f)
                curveToRelative(-18.53f, 16.76f, -42.78f, 19.51f, -62.66f, 6.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.06f, -18.62f)
                lineToRelative(45.7f, -44.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 144.0f, 68.0f)
                horizontalLineToRelative(11.44f)
                lineTo(128.0f, 60.16f)
                lineTo(74.79f, 75.36f)
                lineTo(45.11f, 134.73f)
                lineToRelative(52.6f, 37.57f)
                lineToRelative(61.06f, 15.27f)
                close()
                moveTo(211.12f, 135.21f)
                lineTo(181.53f, 76.0f)
                lineTo(145.62f, 76.0f)
                lineToRelative(-44.49f, 43.16f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -1.11f, 3.2f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 1.85f, 3.0f)
                curveToRelative(13.95f, 8.91f, 35.8f, 11.44f, 55.29f, -8.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.34f, -0.3f)
                lineToRelative(37.21f, 29.8f)
                close()
                moveTo(240.83f, 114.63f)
                lineTo(216.0f, 64.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.37f, -1.78f)
                lineTo(189.37f, 73.79f)
                lineToRelative(28.42f, 56.84f)
                lineTo(239.06f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.78f, -5.37f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
