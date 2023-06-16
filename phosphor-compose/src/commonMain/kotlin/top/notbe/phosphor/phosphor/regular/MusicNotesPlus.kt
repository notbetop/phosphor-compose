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

public val RegularGroup.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) {
            return _musicNotesPlus!!
        }
        _musicNotesPlus = Builder(name = "MusicNotesPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(208.0f, 64.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(88.0f, 118.25f)
                lineTo(88.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(72.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.06f, -7.76f)
                lineToRelative(56.0f, -14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                lineTo(88.0f, 70.25f)
                verticalLineToRelative(31.5f)
                lineToRelative(70.06f, -17.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                close()
                moveTo(72.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 204.0f)
                close()
                moveTo(216.0f, 120.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(200.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 172.0f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
