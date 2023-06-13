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

public val FillGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(192.12f, 157.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 13.72f)
                lineTo(136.0f, 142.13f)
                lineTo(136.0f, 194.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 142.13f)
                lineTo(72.12f, 170.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, -13.72f)
                lineTo(112.45f, 128.0f)
                lineTo(63.88f, 98.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.24f, -13.72f)
                lineTo(120.0f, 113.87f)
                lineTo(120.0f, 62.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(51.87f)
                lineToRelative(47.88f, -28.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.24f, 13.72f)
                lineTo(143.55f, 128.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
