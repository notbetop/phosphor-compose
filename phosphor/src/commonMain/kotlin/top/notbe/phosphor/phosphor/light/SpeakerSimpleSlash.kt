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

public val LightGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 152.0f)
                lineTo(186.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(224.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 82.0f)
                close()
                moveTo(212.44f, 212.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.88f, 8.08f)
                lineTo(158.0f, 169.92f)
                lineTo(158.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.68f, 4.74f)
                lineTo(77.94f, 174.0f)
                lineTo(32.0f, 174.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 82.0f)
                lineTo(78.07f, 82.0f)
                lineTo(43.56f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 52.44f, 36.0f)
                close()
                moveTo(146.0f, 156.72f)
                lineTo(89.0f, 94.0f)
                lineTo(32.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(80.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.68f, 1.26f)
                lineTo(146.0f, 211.73f)
                close()
                moveTo(115.83f, 67.72f)
                lineTo(146.0f, 44.27f)
                verticalLineToRelative(62.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(158.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.68f, -4.74f)
                lineToRelative(-39.85f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.36f, 9.47f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
