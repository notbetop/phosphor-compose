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

public val FillGroup.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) {
            return _speakerLow!!
        }
        _speakerLow = Builder(name = "SpeakerLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                arcToRelative(39.93f, 39.93f, 0.0f, false, true, -10.0f, 26.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.58f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -31.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, -10.58f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
                moveTo(160.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, 6.31f)
                lineTo(77.25f, 176.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 80.0f)
                horizontalLineTo(77.25f)
                lineToRelative(69.84f, -54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 32.0f)
                close()
                moveTo(72.0f, 96.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(72.0f)
                close()
            }
        }
        .build()
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
