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

public val LightGroup.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) {
            return _arrowCircleLeft!!
        }
        _arrowCircleLeft = Builder(name = "ArrowCircleLeft", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(174.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(102.49f, 134.0f)
                lineToRelative(21.75f, 21.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(102.49f, 122.0f)
                lineTo(168.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 128.0f)
                close()
            }
        }
        .build()
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
