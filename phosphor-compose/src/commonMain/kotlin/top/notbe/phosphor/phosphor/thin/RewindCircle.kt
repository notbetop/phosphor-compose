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

public val ThinGroup.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 256.0.dp, defaultHeight =
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
                moveTo(173.89f, 92.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.11f, 0.2f)
                lineToRelative(-48.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.66f)
                lineToRelative(48.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 160.0f)
                lineTo(176.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 173.89f, 92.47f)
                close()
                moveTo(168.0f, 152.53f)
                lineTo(131.21f, 128.0f)
                lineTo(168.0f, 103.47f)
                close()
                moveTo(117.89f, 92.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.11f, 0.2f)
                lineToRelative(-48.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.66f)
                lineToRelative(48.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 160.0f)
                lineTo(120.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 117.89f, 92.47f)
                close()
                moveTo(112.0f, 152.53f)
                lineTo(75.21f, 128.0f)
                lineTo(112.0f, 103.47f)
                close()
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
