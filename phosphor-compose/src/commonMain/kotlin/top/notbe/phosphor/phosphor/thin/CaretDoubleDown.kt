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

public val ThinGroup.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) {
            return _caretDoubleDown!!
        }
        _caretDoubleDown = Builder(name = "CaretDoubleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.83f, 125.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineTo(128.0f, 202.34f)
                lineToRelative(77.17f, -77.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.83f, 125.17f)
                close()
                moveTo(125.17f, 130.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(128.0f, 122.34f)
                lineTo(50.83f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
