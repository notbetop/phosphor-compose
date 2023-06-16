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

public val FillGroup.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) {
            return _currencyDollar!!
        }
        _currencyDollar = Builder(name = "CurrencyDollar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 80.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                close()
                moveTo(148.0f, 136.0f)
                lineTo(136.0f, 136.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(184.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 80.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 156.0f)
                close()
            }
        }
        .build()
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
