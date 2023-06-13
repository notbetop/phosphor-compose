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

public val FillGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-26.45f, -29.1f)
                lineTo(124.8f, 230.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.91f, 0.46f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, -3.89f, -7.18f)
                verticalLineTo(144.0f)
                lineTo(60.8f, 182.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.16f, -1.55f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, 1.8f, -11.43f)
                lineToRelative(61.48f, -46.11f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(144.55f, 110.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.72f, 1.0f)
                lineToRelative(33.35f, -25.0f)
                arcToRelative(8.31f, 8.31f, 0.0f, false, false, 3.0f, -4.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.82f, -8.85f)
                lineToRelative(-64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, 0.3f)
                arcTo(8.24f, 8.24f, 0.0f, false, false, 112.0f, 32.24f)
                verticalLineTo(71.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 114.08f, 77.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
