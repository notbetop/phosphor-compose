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

public val ThinGroup.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) {
            return _speakerSimpleX!!
        }
        _speakerSimpleX = Builder(name = "SpeakerSimpleX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.76f, 28.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.22f, 0.43f)
                lineTo(78.63f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(78.63f, 172.0f)
                lineToRelative(70.91f, 55.16f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 156.0f, 224.0f)
                lineTo(156.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 153.76f, 28.41f)
                close()
                moveTo(148.0f, 215.82f)
                lineToRelative(-65.54f, -51.0f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 80.0f, 164.0f)
                lineTo(32.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 92.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 2.46f, -0.84f)
                lineToRelative(65.54f, -51.0f)
                close()
                moveTo(242.83f, 149.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(216.0f, 133.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(210.34f, 128.0f)
                lineToRelative(-21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(216.0f, 122.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(221.66f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
