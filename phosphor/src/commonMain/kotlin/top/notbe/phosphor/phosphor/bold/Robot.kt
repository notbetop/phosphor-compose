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

public val BoldGroup.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(140.0f, 44.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(236.0f, 80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(56.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(44.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 68.0f)
                lineTo(200.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(164.0f, 128.0f)
                lineTo(92.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(136.0f, 152.0f)
                verticalLineToRelative(16.0f)
                lineTo(120.0f, 168.0f)
                lineTo(120.0f, 152.0f)
                close()
                moveTo(84.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(16.0f)
                lineTo(92.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 160.0f)
                close()
                moveTo(164.0f, 168.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(160.0f, 152.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(68.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 100.0f)
                close()
                moveTo(156.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 156.0f, 100.0f)
                close()
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
