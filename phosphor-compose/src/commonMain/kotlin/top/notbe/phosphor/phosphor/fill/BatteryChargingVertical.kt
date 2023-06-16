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

public val FillGroup.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) {
            return _batteryChargingVertical!!
        }
        _batteryChargingVertical = Builder(name = "BatteryChargingVertical", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 32.0f)
                horizontalLineTo(80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 56.0f, 56.0f)
                verticalLineTo(224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 32.0f)
                close()
                moveTo(151.16f, 139.58f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, -7.16f)
                lineTo(131.06f, 144.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -11.58f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.32f, 7.16f)
                lineTo(124.94f, 128.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 11.58f)
                close()
                moveTo(88.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 8.0f)
                close()
            }
        }
        .build()
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
