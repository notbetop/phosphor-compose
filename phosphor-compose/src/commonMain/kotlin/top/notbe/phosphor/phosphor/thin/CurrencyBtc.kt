package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) {
            return _currencyBtc!!
        }
        _currencyBtc = Builder(name = "CurrencyBtc", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.27f, 117.21f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 140.0f, 44.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(132.0f, 44.0f)
                lineTo(108.0f, 44.0f)
                lineTo(108.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(100.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 196.0f)
                lineTo(64.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(108.0f, 204.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(140.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 10.27f, -86.79f)
                close()
                moveTo(84.0f, 52.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                lineTo(84.0f, 116.0f)
                close()
                moveTo(152.0f, 196.0f)
                lineTo(84.0f, 196.0f)
                lineTo(84.0f, 124.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
