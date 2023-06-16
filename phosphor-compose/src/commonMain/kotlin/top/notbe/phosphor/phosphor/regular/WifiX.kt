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

public val RegularGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(200.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(188.69f, 80.0f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(200.0f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(211.31f, 80.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 192.0f)
                close()
                moveTo(172.71f, 158.53f)
                arcToRelative(76.05f, 76.05f, 0.0f, false, false, -89.42f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.42f, 12.94f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 70.58f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.42f, -12.94f)
                close()
                moveTo(143.23f, 64.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 1.54f, -15.92f)
                curveTo(139.24f, 48.27f, 133.59f, 48.0f, 128.0f, 48.0f)
                arcTo(172.35f, 172.35f, 0.0f, false, false, 18.92f, 87.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 29.08f, 99.37f)
                arcTo(156.25f, 156.25f, 0.0f, false, true, 128.0f, 64.0f)
                curveTo(133.08f, 64.0f, 138.2f, 64.25f, 143.23f, 64.73f)
                close()
                moveTo(142.91f, 113.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.18f, -15.85f)
                arcTo(124.75f, 124.75f, 0.0f, false, false, 128.0f, 96.0f)
                arcToRelative(122.74f, 122.74f, 0.0f, false, false, -77.0f, 26.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 137.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 5.0f, -1.73f)
                arcTo(106.87f, 106.87f, 0.0f, false, true, 128.0f, 112.0f)
                arcTo(109.0f, 109.0f, 0.0f, false, true, 142.91f, 113.0f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
