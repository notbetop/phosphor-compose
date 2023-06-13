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

public val RegularGroup.FolderNotchMinus: ImageVector
    get() {
        if (_folderNotchMinus != null) {
            return _folderNotchMinus!!
        }
        _folderNotchMinus = Builder(name = "FolderNotchMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                horizontalLineTo(130.67f)
                lineTo(102.93f, 51.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(40.0f, 64.0f)
                horizontalLineTo(93.33f)
                lineToRelative(21.34f, 16.0f)
                lineTo(93.33f, 96.0f)
                horizontalLineTo(40.0f)
                close()
                moveTo(216.0f, 200.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(112.0f)
                horizontalLineTo(93.33f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, 9.6f, -3.2f)
                lineTo(130.67f, 88.0f)
                horizontalLineTo(216.0f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _folderNotchMinus!!
    }

private var _folderNotchMinus: ImageVector? = null
