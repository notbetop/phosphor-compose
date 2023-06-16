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

public val BoldGroup.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) {
            return _virtualReality!!
        }
        _virtualReality = Builder(name = "VirtualReality", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.12f, 100.52f)
                lineToRelative(-26.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.24f, 0.0f)
                lineToRelative(-26.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.24f, -9.0f)
                lineTo(86.0f, 128.12f)
                lineToRelative(14.88f, -36.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.24f, 9.0f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, -84.0f, 84.0f)
                lineTo(84.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 84.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                lineTo(84.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f)
                horizontalLineToRelative(88.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(190.0f, 139.24f)
                lineTo(198.46f, 154.05f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 177.58f, 166.0f)
                lineTo(167.32f, 148.0f)
                lineTo(160.0f, 148.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 22.0f, 55.24f)
                close()
                moveTo(160.0f, 124.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
