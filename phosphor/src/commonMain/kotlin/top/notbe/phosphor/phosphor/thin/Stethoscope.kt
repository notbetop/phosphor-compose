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

public val ThinGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 152.0f)
                close()
                moveTo(203.83f, 187.79f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 160.0f, 228.0f)
                lineTo(136.0f, 228.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(92.0f, 139.85f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 36.0f, 80.0f)
                lineTo(36.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.69f, 52.0f)
                curveTo(125.0f, 131.63f, 148.0f, 107.93f, 148.0f, 79.17f)
                lineTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(128.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(156.0f, 79.17f)
                curveToRelative(0.0f, 32.0f, -24.84f, 58.59f, -56.0f, 60.69f)
                lineTo(100.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, 35.8f, -32.25f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(228.0f, 152.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 228.0f, 152.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
