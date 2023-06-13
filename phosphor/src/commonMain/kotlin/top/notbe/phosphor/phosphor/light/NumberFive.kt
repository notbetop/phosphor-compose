package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 160.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -90.0f, 40.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -8.94f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 92.8f, 128.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 83.0f, 122.25f)
                lineTo(98.12f, 46.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 104.0f, 42.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(108.92f)
                lineTo(97.54f, 110.89f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 174.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
