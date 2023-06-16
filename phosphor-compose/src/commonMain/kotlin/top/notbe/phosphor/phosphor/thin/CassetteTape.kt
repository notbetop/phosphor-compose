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

public val ThinGroup.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) {
            return _cassetteTape!!
        }
        _cassetteTape = Builder(name = "CassetteTape", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(72.0f, 196.0f)
                lineToRelative(16.8f, -22.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 172.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, 1.6f)
                lineTo(184.0f, 196.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(194.0f, 196.0f)
                lineToRelative(-20.4f, -27.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 164.0f)
                lineTo(92.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.6f, 4.8f)
                lineTo(62.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(176.0f, 84.0f)
                lineTo(80.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(60.0f, 112.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 112.0f)
                close()
                moveTo(99.57f, 132.0f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, 0.0f, -40.0f)
                horizontalLineToRelative(56.86f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, 0.0f, 40.0f)
                close()
                moveTo(176.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 132.0f)
                close()
            }
        }
        .build()
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
