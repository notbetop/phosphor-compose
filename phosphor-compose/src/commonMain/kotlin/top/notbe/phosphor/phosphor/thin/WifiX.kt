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

public val ThinGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 204.0f)
                close()
                moveTo(205.66f, 80.0f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(200.0f, 74.34f)
                lineTo(178.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(194.34f, 80.0f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(200.0f, 85.66f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
                moveTo(170.35f, 161.77f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -84.71f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.71f, 6.46f)
                arcToRelative(64.05f, 64.05f, 0.0f, false, true, 75.29f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.71f, -6.46f)
                close()
                moveTo(143.61f, 60.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.78f, -8.0f)
                curveTo(139.0f, 52.27f, 133.46f, 52.0f, 128.0f, 52.0f)
                arcTo(168.33f, 168.33f, 0.0f, false, false, 21.46f, 90.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.08f, 6.19f)
                arcTo(160.22f, 160.22f, 0.0f, false, true, 128.0f, 60.0f)
                curveTo(133.21f, 60.0f, 138.46f, 60.25f, 143.61f, 60.75f)
                close()
                moveTo(143.45f, 109.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.1f, -7.93f)
                arcTo(121.84f, 121.84f, 0.0f, false, false, 128.0f, 100.0f)
                arcToRelative(118.72f, 118.72f, 0.0f, false, false, -74.48f, 25.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 6.27f)
                arcTo(110.84f, 110.84f, 0.0f, false, true, 128.0f, 108.0f)
                arcTo(113.6f, 113.6f, 0.0f, false, true, 143.45f, 109.06f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
