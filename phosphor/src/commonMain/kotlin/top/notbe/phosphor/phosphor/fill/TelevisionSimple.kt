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

public val FillGroup.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) {
            return _televisionSimple!!
        }
        _televisionSimple = Builder(name = "TelevisionSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f)
                horizontalLineToRelative(68.69f)
                lineTo(74.34f, 29.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.66f, 18.34f)
                lineTo(128.0f, 60.69f)
                lineToRelative(42.34f, -42.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineTo(147.31f, 64.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
