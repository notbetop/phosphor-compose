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

public val FillGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.51f, 98.13f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 0.61f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.72f, 0.43f)
                lineTo(200.05f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.72f, -0.43f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 0.61f, -11.1f)
                lineTo(188.74f, 80.0f)
                lineTo(170.63f, 61.89f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, -0.41f, -11.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, -0.18f)
                lineToRelative(18.34f, 18.35f)
                lineTo(218.4f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, 0.18f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, -0.41f, 11.37f)
                lineTo(211.37f, 80.0f)
                close()
                moveTo(212.0f, 124.71f)
                arcToRelative(23.89f, 23.89f, 0.0f, false, true, -4.86f, -3.74f)
                lineToRelative(-4.21f, -4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.0f)
                lineTo(193.0f, 121.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.21f, -0.26f)
                curveToRelative(-9.19f, -9.48f, -8.69f, -24.73f, 0.65f, -34.06f)
                lineToRelative(3.81f, -3.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineTo(159.06f, 73.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.06f, -34.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, false, -1.52f, -4.71f)
                arcTo(191.86f, 191.86f, 0.0f, false, false, 128.0f, 32.0f)
                arcTo(186.77f, 186.77f, 0.0f, false, false, 14.28f, 70.1f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 8.11f, 80.91f)
                arcTo(15.65f, 15.65f, 0.0f, false, false, 11.65f, 92.8f)
                lineTo(115.72f, 218.23f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.31f, -5.77f)
                lineToRelative(72.6f, -87.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 124.71f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
