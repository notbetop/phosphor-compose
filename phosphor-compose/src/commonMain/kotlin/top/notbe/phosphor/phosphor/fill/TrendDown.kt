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

public val FillGroup.TrendDown: ImageVector
    get() {
        if (_trendDown != null) {
            return _trendDown!!
        }
        _trendDown = Builder(name = "TrendDown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(188.69f, 168.0f)
                lineTo(136.0f, 115.31f)
                lineToRelative(-34.34f, 34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-72.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 29.66f, 66.34f)
                lineTo(96.0f, 132.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(200.0f, 156.69f)
                lineToRelative(26.34f, -26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 136.0f)
                close()
            }
        }
        .build()
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
