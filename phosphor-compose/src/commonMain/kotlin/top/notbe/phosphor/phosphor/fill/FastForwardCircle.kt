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

public val FillGroup.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(188.59f, 134.55f)
                lineTo(148.59f, 162.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 156.0f)
                lineTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.41f, 6.55f)
                lineToRelative(-40.0f, 28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 156.0f)
                lineTo(80.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.59f, -6.55f)
                lineToRelative(40.0f, 28.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 128.0f)
                lineTo(136.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.59f, -6.55f)
                lineToRelative(40.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.1f)
                close()
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
