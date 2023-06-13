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

public val FillGroup.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) {
            return _currencyInr!!
        }
        _currencyInr = Builder(name = "CurrencyInr", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(157.25f, 88.0f)
                lineTo(176.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(160.0f, 104.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(48.0f, 42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.54f, 12.0f)
                lineToRelative(-64.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 136.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(88.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(51.69f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 112.0f, 72.0f)
                lineTo(88.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(147.74f, 72.0f)
                arcTo(48.15f, 48.15f, 0.0f, false, true, 157.25f, 88.0f)
                close()
            }
        }
        .build()
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
