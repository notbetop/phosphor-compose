package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) {
            return _hourglassSimpleHigh!!
        }
        _hourglassSimpleHigh = Builder(name = "HourglassSimpleHigh", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 193.68f)
                lineTo(145.35f, 128.0f)
                lineTo(214.0f, 62.32f)
                lineToRelative(0.18f, -0.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 41.87f, 62.14f)
                lineToRelative(0.18f, 0.18f)
                lineTo(110.65f, 128.0f)
                lineToRelative(-68.6f, 65.68f)
                lineToRelative(-0.18f, 0.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 228.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.14f, -34.14f)
                close()
                moveTo(107.75f, 92.0f)
                horizontalLineToRelative(40.5f)
                lineTo(128.0f, 111.39f)
                close()
                moveTo(190.0f, 52.0f)
                lineTo(173.31f, 68.0f)
                horizontalLineTo(82.69f)
                lineTo(66.0f, 52.0f)
                close()
                moveTo(66.0f, 204.0f)
                lineToRelative(62.0f, -59.39f)
                lineTo(190.0f, 204.0f)
                close()
            }
        }
        .build()
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null