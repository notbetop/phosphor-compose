package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) {
            return _arrowElbowLeftDown!!
        }
        _arrowElbowLeftDown = Builder(name = "ArrowElbowLeftDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(179.0f)
                lineToRelative(27.51f, -27.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(68.0f, 179.0f)
                verticalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 52.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 64.0f)
                close()
            }
        }
        .build()
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
