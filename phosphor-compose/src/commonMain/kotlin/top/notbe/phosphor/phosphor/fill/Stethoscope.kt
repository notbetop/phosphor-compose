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

public val FillGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -39.93f, 31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.07f, 1.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(136.0f, 216.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(104.0f, 143.48f)
                curveToRelative(31.47f, -4.0f, 56.0f, -31.47f, 56.0f, -64.31f)
                lineTo(160.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(128.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(144.0f, 79.17f)
                curveToRelative(0.0f, 26.58f, -21.25f, 48.49f, -47.36f, 48.83f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 80.0f)
                lineTo(48.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(48.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 40.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 56.0f, 63.49f)
                lineTo(88.0f, 184.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.07f, -1.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 232.0f, 152.0f)
                close()
                moveTo(200.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 160.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
