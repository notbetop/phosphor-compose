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

public val FillGroup.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) {
            return _thermometerCold!!
        }
        _thermometerCold = Builder(name = "ThermometerCold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.91f, 77.72f)
                lineToRelative(-20.0f, 6.49f)
                lineToRelative(12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.94f, 9.4f)
                lineTo(216.0f, 93.61f)
                lineToRelative(-12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.94f, -9.4f)
                lineToRelative(12.34f, -17.0f)
                lineToRelative(-20.0f, -6.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 62.5f)
                lineTo(208.0f, 69.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(69.0f)
                lineToRelative(20.0f, -6.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.95f, 15.22f)
                close()
                moveTo(176.0f, 192.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -88.0f, -45.92f)
                verticalLineTo(40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineTo(146.08f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 176.0f, 192.0f)
                close()
                moveTo(136.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
