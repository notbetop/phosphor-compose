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

public val FillGroup.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) {
            return _currencyKrw!!
        }
        _currencyKrw = Builder(name = "CurrencyKrw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 110.78f)
                lineTo(134.46f, 128.0f)
                lineTo(121.54f, 128.0f)
                close()
                moveTo(92.0f, 161.22f)
                lineTo(98.46f, 144.0f)
                lineTo(85.54f, 144.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(193.54f, 128.0f)
                lineToRelative(14.0f, -37.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.0f, -5.62f)
                lineToRelative(-16.0f, 42.81f)
                lineTo(151.54f, 128.0f)
                lineToRelative(-16.0f, -42.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.0f, 0.0f)
                lineTo(104.46f, 128.0f)
                lineTo(79.54f, 128.0f)
                lineTo(63.49f, 85.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.0f, 5.62f)
                lineToRelative(14.0f, 37.19f)
                lineTo(48.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(68.46f, 144.0f)
                lineToRelative(16.05f, 42.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, 0.0f)
                lineTo(115.54f, 144.0f)
                horizontalLineToRelative(24.92f)
                lineToRelative(16.0f, 42.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, 0.0f)
                lineToRelative(16.0f, -42.81f)
                lineTo(208.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 136.0f)
                close()
                moveTo(164.0f, 161.22f)
                lineTo(170.46f, 144.0f)
                lineTo(157.54f, 144.0f)
                close()
            }
        }
        .build()
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
