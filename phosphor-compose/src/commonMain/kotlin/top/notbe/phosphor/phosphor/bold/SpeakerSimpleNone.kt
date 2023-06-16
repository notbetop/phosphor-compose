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

public val BoldGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.27f, 21.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.64f, 1.31f)
                lineTo(75.88f, 76.0f)
                horizontalLineTo(32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(75.88f)
                lineToRelative(68.75f, 53.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 157.27f, 21.22f)
                close()
                moveTo(140.0f, 199.46f)
                lineTo(87.37f, 158.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 156.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.37f, -2.53f)
                lineTo(140.0f, 56.54f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
