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

public val FillGroup.MusicNotesPlus: ImageVector
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
                moveTo(208.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(22.08f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 172.0f)
                lineTo(216.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 112.0f)
                close()
                moveTo(153.58f, 101.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -9.88f)
                arcToRelative(8.11f, 8.11f, 0.0f, false, false, -1.1f, -1.79f)
                arcToRelative(55.78f, 55.78f, 0.0f, false, true, -11.0f, -39.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 137.0f, 42.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.61f, 0.21f)
                lineTo(78.06f, 56.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 64.0f)
                lineTo(72.0f, 174.08f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 88.0f, 204.0f)
                lineTo(88.0f, 118.25f)
                lineToRelative(62.82f, -15.71f)
                arcTo(8.06f, 8.06f, 0.0f, false, false, 153.58f, 101.33f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
