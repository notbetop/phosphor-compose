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

public val FillGroup.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) {
            return _arrowLineDownRight!!
        }
        _arrowLineDownRight = Builder(name = "ArrowLineDownRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 40.0f)
                close()
                moveTo(195.06f, 96.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(144.0f, 140.69f)
                lineTo(85.66f, 82.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 74.34f, 93.66f)
                lineTo(132.69f, 152.0f)
                lineTo(90.34f, 194.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 208.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 195.06f, 96.61f)
                close()
            }
        }
        .build()
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
