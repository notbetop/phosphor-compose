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

public val BoldGroup.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) {
            return _floppyDiskBack!!
        }
        _floppyDiskBack = Builder(name = "FloppyDiskBack", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(91.31f, 28.0f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f)
                lineTo(33.86f, 77.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 91.31f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 93.0f)
                lineTo(93.0f, 52.0f)
                horizontalLineToRelative(71.0f)
                lineTo(164.0f, 76.0f)
                lineTo(100.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(188.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(128.0f, 116.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 116.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
