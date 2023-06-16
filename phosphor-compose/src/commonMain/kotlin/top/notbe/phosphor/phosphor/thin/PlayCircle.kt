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

public val ThinGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(162.22f, 124.67f)
                lineTo(114.22f, 92.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.11f, 3.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.11f, -0.2f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.66f)
                close()
                moveTo(116.0f, 152.53f)
                lineTo(116.0f, 103.47f)
                lineTo(152.79f, 128.0f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
