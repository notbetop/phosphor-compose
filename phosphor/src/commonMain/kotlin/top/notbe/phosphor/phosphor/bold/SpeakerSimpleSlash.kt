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

public val BoldGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(216.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f)
                lineTo(164.0f, 185.44f)
                lineTo(164.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.37f, 9.47f)
                lineTo(75.88f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 76.0f)
                lineTo(64.51f, 76.0f)
                lineTo(39.12f, 48.07f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f)
                close()
                moveTo(140.0f, 159.0f)
                lineTo(86.33f, 100.0f)
                lineTo(36.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(80.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.37f, 2.53f)
                lineTo(140.0f, 199.46f)
                close()
                moveTo(125.85f, 67.5f)
                lineTo(140.0f, 56.5f)
                verticalLineToRelative(38.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.37f, -9.47f)
                lineTo(111.12f, 48.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.73f, 18.94f)
                close()
                moveTo(192.0f, 150.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(34.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 150.94f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
