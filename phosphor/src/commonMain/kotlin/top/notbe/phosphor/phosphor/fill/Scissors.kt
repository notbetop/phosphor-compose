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

public val FillGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.73f, 113.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 159.82f, 102.0f)
                lineToRelative(67.66f, -46.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.0f, 13.21f)
                lineToRelative(-67.67f, 46.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.12f, -2.09f)
                close()
                moveTo(238.6f, 198.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.12f, 2.09f)
                lineTo(136.0f, 137.69f)
                lineTo(93.48f, 166.78f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -9.0f, -13.2f)
                lineTo(121.83f, 128.0f)
                lineTo(84.45f, 102.42f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 9.0f, -13.2f)
                lineToRelative(143.0f, 97.86f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 238.6f, 198.2f)
                close()
                moveTo(72.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 180.0f)
                close()
                moveTo(72.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 60.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 76.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
