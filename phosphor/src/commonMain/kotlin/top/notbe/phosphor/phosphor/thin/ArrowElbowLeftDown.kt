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

public val ThinGroup.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) {
            return _arrowElbowLeftDown!!
        }
        _arrowElbowLeftDown = Builder(name = "ArrowElbowLeftDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(198.34f)
                lineToRelative(41.17f, -41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(76.0f, 198.34f)
                verticalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(224.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 64.0f)
                close()
            }
        }
        .build()
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
