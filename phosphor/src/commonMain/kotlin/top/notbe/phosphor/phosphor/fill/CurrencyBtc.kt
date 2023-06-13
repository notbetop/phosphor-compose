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

public val FillGroup.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) {
            return _currencyBtc!!
        }
        _currencyBtc = Builder(name = "CurrencyBtc", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(104.0f, 176.0f)
                lineTo(104.0f, 128.0f)
                horizontalLineToRelative(40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(184.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -17.63f, -33.15f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 152.0f, 65.0f)
                lineTo(152.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(120.0f, 64.0f)
                lineTo(120.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(88.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.81f)
                arcTo(40.05f, 40.05f, 0.0f, false, false, 184.0f, 152.0f)
                close()
                moveTo(160.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(104.0f, 80.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 96.0f)
                close()
            }
        }
        .build()
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
