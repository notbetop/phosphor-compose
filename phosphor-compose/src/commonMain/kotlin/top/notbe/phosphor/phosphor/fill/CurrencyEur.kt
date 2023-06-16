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

public val FillGroup.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) {
            return _currencyEur!!
        }
        _currencyEur = Builder(name = "CurrencyEur", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(88.0f, 120.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(89.89f, 152.0f)
                arcToRelative(44.25f, 44.25f, 0.0f, false, false, 72.6f, 18.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.0f, 11.6f)
                arcTo(60.22f, 60.22f, 0.0f, false, true, 73.36f, 152.0f)
                lineTo(64.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(72.0f, 120.0f)
                lineTo(64.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(9.12f)
                arcTo(60.21f, 60.21f, 0.0f, false, true, 173.51f, 72.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.0f, 11.6f)
                arcTo(44.24f, 44.24f, 0.0f, false, false, 89.56f, 104.0f)
                close()
            }
        }
        .build()
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
