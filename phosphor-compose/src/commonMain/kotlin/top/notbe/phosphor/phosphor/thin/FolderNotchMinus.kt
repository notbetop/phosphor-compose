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

public val ThinGroup.FolderNotchMinus: ImageVector
    get() {
        if (_folderNotchMinus != null) {
            return _folderNotchMinus!!
        }
        _folderNotchMinus = Builder(name = "FolderNotchMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                lineTo(129.33f, 76.0f)
                lineToRelative(-28.8f, -21.6f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(93.33f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f)
                lineTo(121.33f, 80.0f)
                lineTo(95.73f, 99.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, 0.8f)
                lineTo(36.0f, 100.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 108.0f)
                lineTo(93.33f, 108.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, 7.2f, -2.4f)
                lineTo(129.33f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(156.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(104.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 152.0f)
                close()
            }
        }
        .build()
        return _folderNotchMinus!!
    }

private var _folderNotchMinus: ImageVector? = null
