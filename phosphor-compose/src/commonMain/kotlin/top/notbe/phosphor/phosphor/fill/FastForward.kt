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

public val FillGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(15.76f, 15.76f, 0.0f, false, true, -7.33f, 13.34f)
                lineTo(152.48f, 197.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 128.0f, 184.16f)
                verticalLineToRelative(-37.3f)
                lineTo(48.48f, 197.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 24.0f, 184.16f)
                verticalLineTo(71.84f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 48.48f, 58.5f)
                lineTo(128.0f, 109.14f)
                verticalLineTo(71.84f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 152.48f, 58.5f)
                lineToRelative(88.19f, 56.16f)
                arcTo(15.76f, 15.76f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
