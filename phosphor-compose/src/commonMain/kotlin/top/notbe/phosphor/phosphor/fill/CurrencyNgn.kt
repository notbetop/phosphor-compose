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

public val FillGroup.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) {
            return _currencyNgn!!
        }
        _currencyNgn = Builder(name = "CurrencyNgn", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 93.63f)
                lineTo(110.61f, 120.0f)
                lineTo(88.0f, 120.0f)
                close()
                moveTo(168.0f, 162.37f)
                lineTo(168.0f, 136.0f)
                lineTo(145.39f, 136.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(184.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                lineTo(131.68f, 120.0f)
                lineTo(86.07f, 66.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 72.0f)
                verticalLineToRelative(48.0f)
                lineTo(64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 136.0f)
                horizontalLineToRelative(36.32f)
                lineToRelative(45.61f, 53.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(184.0f, 136.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 128.0f)
                close()
            }
        }
        .build()
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
