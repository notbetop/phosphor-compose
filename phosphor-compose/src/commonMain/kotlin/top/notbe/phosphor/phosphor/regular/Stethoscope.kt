package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 152.0f)
                close()
                moveTo(207.45f, 191.29f)
                arcTo(48.08f, 48.08f, 0.0f, false, true, 160.0f, 232.0f)
                lineTo(136.0f, 232.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(88.0f, 143.49f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 32.0f, 80.0f)
                lineTo(32.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 24.0f)
                lineTo(64.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(48.0f, 40.0f)
                lineTo(48.0f, 80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.64f, 48.0f)
                curveToRelative(26.11f, -0.34f, 47.36f, -22.25f, 47.36f, -48.83f)
                lineTo(144.0f, 40.0f)
                lineTo(128.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(160.0f, 79.17f)
                curveToRelative(0.0f, 32.84f, -24.53f, 60.29f, -56.0f, 64.31f)
                lineTo(104.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 31.22f, -25.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 16.23f, 0.27f)
                close()
                moveTo(224.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 224.0f, 152.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
