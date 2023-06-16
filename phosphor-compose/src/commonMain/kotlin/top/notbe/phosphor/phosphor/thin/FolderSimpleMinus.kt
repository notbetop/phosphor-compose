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

public val ThinGroup.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) {
            return _folderSimpleMinus!!
        }
        _folderSimpleMinus = Builder(name = "FolderSimpleMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(104.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 144.0f)
                close()
                moveTo(228.0f, 88.0f)
                lineTo(228.0f, 200.89f)
                arcTo(11.12f, 11.12f, 0.0f, false, true, 216.89f, 212.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(93.33f, 52.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, 7.2f, 2.4f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                lineTo(216.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 88.0f)
                close()
                moveTo(220.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(130.67f, 84.0f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -7.2f, -2.4f)
                lineTo(95.73f, 60.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, -0.8f)
                lineTo(40.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(216.89f, 204.0f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 3.11f, -3.11f)
                close()
            }
        }
        .build()
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
