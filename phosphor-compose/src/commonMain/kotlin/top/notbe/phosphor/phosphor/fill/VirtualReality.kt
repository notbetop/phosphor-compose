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

public val FillGroup.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) {
            return _virtualReality!!
        }
        _virtualReality = Builder(name = "VirtualReality", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(152.0f, 128.0f)
                lineTo(152.0f, 104.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 116.0f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, -80.0f, 80.0f)
                lineTo(80.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 80.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 256.0f, 128.0f)
                close()
                moveTo(119.0f, 88.59f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 108.59f, 93.0f)
                lineTo(90.0f, 138.74f)
                lineTo(71.41f, 93.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.82f, 6.0f)
                lineToRelative(26.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.82f, 0.0f)
                lineToRelative(26.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 119.0f, 88.59f)
                close()
                moveTo(180.83f, 138.35f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 144.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.54f, 0.0f, 1.08f, 0.0f, 1.61f, -0.05f)
                lineToRelative(11.44f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 191.0f, 156.0f)
                close()
            }
        }
        .build()
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
