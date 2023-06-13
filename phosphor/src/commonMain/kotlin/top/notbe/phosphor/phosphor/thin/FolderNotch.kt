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

public val ThinGroup.FolderNotch: ImageVector
    get() {
        if (_folderNotch != null) {
            return _folderNotch!!
        }
        _folderNotch = Builder(name = "FolderNotch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                horizontalLineTo(129.33f)
                lineToRelative(-28.8f, -21.6f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(93.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f)
                lineTo(121.33f, 80.0f)
                lineTo(95.73f, 99.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, 0.8f)
                horizontalLineTo(36.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(108.0f)
                horizontalLineTo(93.33f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, 7.2f, -2.4f)
                lineTo(129.33f, 84.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _folderNotch!!
    }

private var _folderNotch: ImageVector? = null
