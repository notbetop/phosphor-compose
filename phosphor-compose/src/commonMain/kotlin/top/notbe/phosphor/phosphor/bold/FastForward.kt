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

public val BoldGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.81f, 111.29f)
                lineTo(154.63f, 55.12f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 124.0f, 71.84f)
                verticalLineToRelative(30.0f)
                lineTo(50.63f, 55.12f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 20.0f, 71.84f)
                lineTo(20.0f, 184.16f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, 30.63f, 16.72f)
                lineTo(124.0f, 154.15f)
                verticalLineToRelative(30.0f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, 30.63f, 16.72f)
                lineToRelative(88.18f, -56.17f)
                arcToRelative(19.79f, 19.79f, 0.0f, false, false, 0.0f, -33.42f)
                close()
                moveTo(44.0f, 176.64f)
                lineTo(44.0f, 79.36f)
                lineTo(120.38f, 128.0f)
                close()
                moveTo(148.0f, 176.64f)
                lineTo(148.0f, 79.36f)
                lineTo(224.38f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
