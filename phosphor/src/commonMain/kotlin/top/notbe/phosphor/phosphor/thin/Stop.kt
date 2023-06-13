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

public val ThinGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.73f, 44.0f)
                horizontalLineTo(55.27f)
                arcTo(11.29f, 11.29f, 0.0f, false, false, 44.0f, 55.27f)
                verticalLineTo(200.73f)
                arcTo(11.29f, 11.29f, 0.0f, false, false, 55.27f, 212.0f)
                horizontalLineTo(200.73f)
                arcTo(11.29f, 11.29f, 0.0f, false, false, 212.0f, 200.73f)
                verticalLineTo(55.27f)
                arcTo(11.29f, 11.29f, 0.0f, false, false, 200.73f, 44.0f)
                close()
                moveTo(204.0f, 200.73f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, true, -3.27f, 3.27f)
                horizontalLineTo(55.27f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 52.0f, 200.73f)
                verticalLineTo(55.27f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 55.27f, 52.0f)
                horizontalLineTo(200.73f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 204.0f, 55.27f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
