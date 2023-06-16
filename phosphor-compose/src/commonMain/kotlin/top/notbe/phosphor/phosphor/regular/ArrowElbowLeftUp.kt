package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) {
            return _arrowElbowLeftUp!!
        }
        _arrowElbowLeftUp = Builder(name = "ArrowElbowLeftUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(67.31f)
                lineTo(37.66f, 101.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 26.34f, 90.34f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(88.0f, 67.31f)
                verticalLineTo(184.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 192.0f)
                close()
            }
        }
        .build()
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
