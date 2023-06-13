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

public val RegularGroup.FolderNotchPlus: ImageVector
    get() {
        if (_folderNotchPlus != null) {
            return _folderNotchPlus!!
        }
        _folderNotchPlus = Builder(name = "FolderNotchPlus", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(136.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 160.0f)
                lineTo(104.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(120.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 120.0f)
                close()
                moveTo(232.0f, 88.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.33f, 48.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.67f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
                moveTo(40.0f, 96.0f)
                lineTo(93.33f, 96.0f)
                lineToRelative(21.34f, -16.0f)
                lineTo(93.33f, 64.0f)
                lineTo(40.0f, 64.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(130.67f, 88.0f)
                lineToRelative(-27.74f, 20.8f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, -9.6f, 3.2f)
                lineTo(40.0f, 112.0f)
                verticalLineToRelative(88.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return _folderNotchPlus!!
    }

private var _folderNotchPlus: ImageVector? = null
