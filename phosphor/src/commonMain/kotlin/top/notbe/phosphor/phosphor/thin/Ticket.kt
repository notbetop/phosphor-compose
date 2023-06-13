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

public val ThinGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.4f, 100.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 88.81f)
                lineTo(236.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 88.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.6f, 11.75f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 54.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 167.19f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 167.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.6f, -11.75f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -54.88f)
                close()
                moveTo(28.0f, 192.0f)
                lineTo(28.0f, 167.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, -3.91f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -70.56f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 88.81f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 192.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(36.09f, 36.09f, 0.0f, false, false, 28.8f, 35.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 3.91f)
                lineTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(100.0f, 196.0f)
                lineTo(100.0f, 60.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(228.0f, 88.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, 3.91f)
                arcTo(36.09f, 36.09f, 0.0f, false, false, 196.0f, 128.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
