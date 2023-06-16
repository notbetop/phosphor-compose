package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(152.0f, 32.0f)
                verticalLineTo(224.0f)
                lineTo(80.0f, 168.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.51f, 24.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.42f, 0.88f)
                lineTo(77.25f, 80.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(77.25f)
                lineToRelative(69.84f, 54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 155.51f, 24.81f)
                close()
                moveTo(144.0f, 207.64f)
                lineTo(84.91f, 161.69f)
                arcTo(7.94f, 7.94f, 0.0f, false, false, 80.0f, 160.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(80.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 4.91f, -1.69f)
                lineTo(144.0f, 48.36f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
