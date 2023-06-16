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

public val BoldGroup.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) {
            return _musicNotesPlus!!
        }
        _musicNotesPlus = Builder(name = "MusicNotesPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(212.0f, 68.0f)
                lineTo(212.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(188.0f, 68.0f)
                lineTo(176.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(188.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(212.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(220.0f, 124.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -24.0f, -36.65f)
                lineTo(196.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(196.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 172.0f)
                close()
                moveTo(92.0f, 121.37f)
                lineTo(92.0f, 204.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -24.0f, -36.65f)
                lineTo(68.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.09f, -11.64f)
                lineToRelative(52.0f, -13.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.82f, 23.28f)
                lineTo(92.0f, 73.37f)
                lineTo(92.0f, 96.63f)
                lineToRelative(53.09f, -13.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.82f, 23.28f)
                close()
                moveTo(68.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 68.0f, 204.0f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
