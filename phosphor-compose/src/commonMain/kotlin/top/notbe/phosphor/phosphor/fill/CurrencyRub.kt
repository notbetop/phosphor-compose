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

public val FillGroup.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) {
            return _currencyRub!!
        }
        _currencyRub = Builder(name = "CurrencyRub", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 108.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(112.0f, 136.0f)
                lineTo(112.0f, 80.0f)
                horizontalLineToRelative(36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 108.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(192.0f, 108.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                lineTo(104.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                lineTo(80.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(96.0f, 152.0f)
                verticalLineToRelative(16.0f)
                lineTo(80.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(96.0f, 184.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 184.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(112.0f, 168.0f)
                lineTo(112.0f, 152.0f)
                horizontalLineToRelative(36.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 192.0f, 108.0f)
                close()
            }
        }
        .build()
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
