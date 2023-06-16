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

public val FillGroup.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) {
            return _arrowBendRightUp!!
        }
        _arrowBendRightUp = Builder(name = "ArrowBendRightUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.39f, 83.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 88.0f)
                horizontalLineTo(160.0f)
                verticalLineToRelative(40.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 56.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 207.39f, 83.06f)
                close()
            }
        }
        .build()
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
