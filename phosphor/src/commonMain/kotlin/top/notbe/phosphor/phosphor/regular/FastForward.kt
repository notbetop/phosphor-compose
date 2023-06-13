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

public val RegularGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.67f, 114.66f)
                lineTo(152.48f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 128.0f, 71.84f)
                verticalLineToRelative(37.3f)
                lineTo(48.48f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 24.0f, 71.84f)
                lineTo(24.0f, 184.16f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 48.48f, 197.5f)
                lineTo(128.0f, 146.86f)
                verticalLineToRelative(37.3f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 24.48f, 13.34f)
                lineToRelative(88.19f, -56.16f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 0.0f, -26.68f)
                close()
                moveTo(40.0f, 183.94f)
                lineTo(40.0f, 72.07f)
                lineTo(127.82f, 128.0f)
                close()
                moveTo(144.0f, 183.94f)
                lineTo(144.0f, 72.07f)
                lineTo(231.82f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
