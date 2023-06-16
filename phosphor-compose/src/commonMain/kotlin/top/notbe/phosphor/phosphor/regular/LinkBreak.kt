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

public val RegularGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.63f, 65.37f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.19f, -0.06f)
                lineTo(133.79f, 77.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.58f, -11.0f)
                lineToRelative(11.72f, -12.29f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.13f, -0.13f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.88f, 67.88f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.13f, 0.13f)
                lineToRelative(-12.29f, 11.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, -11.58f)
                lineToRelative(12.21f, -11.65f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 190.63f, 65.37f)
                close()
                moveTo(122.21f, 178.48f)
                lineToRelative(-11.65f, 12.21f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -45.25f, -45.25f)
                lineToRelative(12.21f, -11.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -11.58f)
                lineTo(54.19f, 133.93f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -0.13f, 0.13f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 67.88f, 67.88f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.13f, -0.13f)
                lineToRelative(11.72f, -12.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.58f, -11.0f)
                close()
                moveTo(208.0f, 152.0f)
                lineTo(184.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 104.0f)
                lineTo(72.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 176.0f)
                close()
                moveTo(96.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(88.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 80.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
