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

public val BoldGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -52.64f, 37.94f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 160.0f, 212.0f)
                lineTo(136.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(108.0f, 146.9f)
                curveToRelative(31.73f, -5.78f, 56.0f, -34.09f, 56.0f, -67.73f)
                lineTo(164.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(140.0f, 79.17f)
                curveToRelative(0.0f, 24.4f, -19.47f, 44.52f, -43.41f, 44.83f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 52.0f, 80.0f)
                lineTo(52.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(48.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 80.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 56.0f, 66.93f)
                lineTo(84.0f, 184.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 51.61f, -45.72f)
                arcTo(40.08f, 40.08f, 0.0f, false, false, 240.0f, 152.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 168.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
