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

public val FillGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 55.27f)
                verticalLineTo(200.73f)
                arcTo(15.29f, 15.29f, 0.0f, false, true, 200.73f, 216.0f)
                horizontalLineTo(55.27f)
                arcTo(15.29f, 15.29f, 0.0f, false, true, 40.0f, 200.73f)
                verticalLineTo(55.27f)
                arcTo(15.29f, 15.29f, 0.0f, false, true, 55.27f, 40.0f)
                horizontalLineTo(200.73f)
                arcTo(15.29f, 15.29f, 0.0f, false, true, 216.0f, 55.27f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
