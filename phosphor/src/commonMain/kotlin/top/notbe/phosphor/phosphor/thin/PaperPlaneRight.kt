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

public val ThinGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.89f, 117.43f)
                lineToRelative(-168.0f, -95.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.7f, 36.0f)
                lineToRelative(31.05f, 90.48f)
                verticalLineToRelative(0.05f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, 0.0f, 2.74f)
                lineTo(36.72f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 236.0f)
                arcToRelative(12.13f, 12.13f, 0.0f, false, false, 5.93f, -1.57f)
                lineToRelative(167.94f, -96.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.92f)
                close()
                moveTo(217.89f, 131.43f)
                lineTo(50.0f, 227.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -4.88f)
                lineToRelative(31.0f, -90.59f)
                lineTo(136.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(75.35f, 124.0f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.0f, -0.13f)
                lineTo(44.25f, 33.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 50.0f, 28.52f)
                lineToRelative(168.0f, 95.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
