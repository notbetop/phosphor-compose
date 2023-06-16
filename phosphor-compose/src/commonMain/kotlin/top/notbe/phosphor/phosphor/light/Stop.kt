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

public val LightGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.73f, 42.0f)
                horizontalLineTo(55.27f)
                arcTo(13.28f, 13.28f, 0.0f, false, false, 42.0f, 55.27f)
                verticalLineTo(200.73f)
                arcTo(13.28f, 13.28f, 0.0f, false, false, 55.27f, 214.0f)
                horizontalLineTo(200.73f)
                arcTo(13.28f, 13.28f, 0.0f, false, false, 214.0f, 200.73f)
                verticalLineTo(55.27f)
                arcTo(13.28f, 13.28f, 0.0f, false, false, 200.73f, 42.0f)
                close()
                moveTo(202.0f, 200.73f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, true, -1.27f, 1.27f)
                horizontalLineTo(55.27f)
                arcTo(1.27f, 1.27f, 0.0f, false, true, 54.0f, 200.73f)
                verticalLineTo(55.27f)
                arcTo(1.27f, 1.27f, 0.0f, false, true, 55.27f, 54.0f)
                horizontalLineTo(200.73f)
                arcTo(1.27f, 1.27f, 0.0f, false, true, 202.0f, 55.27f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
