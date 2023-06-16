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

public val FillGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 136.0f, 52.0f)
                close()
                moveTo(255.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.95f, 4.0f)
                horizontalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.89f, -12.06f)
                lineTo(74.21f, 71.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.58f, 0.0f)
                lineTo(146.63f, 148.0f)
                lineToRelative(26.16f, -44.14f)
                arcTo(15.85f, 15.85f, 0.0f, false, true, 186.55f, 96.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.87f, 15.87f, 0.0f, false, true, 13.77f, 7.84f)
                lineToRelative(54.56f, 92.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 255.0f, 204.0f)
                close()
                moveTo(64.43f, 120.0f)
                horizontalLineToRelative(47.14f)
                lineTo(88.0f, 80.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
