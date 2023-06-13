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

public val ThinGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(180.0f, 36.0f)
                lineTo(180.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(172.0f, 36.0f)
                lineTo(84.0f, 36.0f)
                lineTo(84.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(76.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(48.0f, 44.0f)
                lineTo(76.0f, 44.0f)
                lineTo(76.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                lineTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(180.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(212.0f, 84.0f)
                lineTo(44.0f, 84.0f)
                lineTo(44.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                lineTo(212.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(108.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(100.0f, 126.47f)
                lineToRelative(-10.21f, 5.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -7.16f)
                lineToRelative(16.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 120.0f)
                close()
                moveTo(168.0f, 148.0f)
                lineTo(144.0f, 180.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(136.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineToRelative(28.78f, -38.37f)
                arcTo(11.88f, 11.88f, 0.0f, false, false, 164.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.4f, -6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.92f, -4.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 172.0f, 136.0f)
                arcTo(19.79f, 19.79f, 0.0f, false, true, 168.0f, 148.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
