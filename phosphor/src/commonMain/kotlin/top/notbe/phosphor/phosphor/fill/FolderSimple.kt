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

public val FillGroup.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) {
            return _folderSimple!!
        }
        _folderSimple = Builder(name = "FolderSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                horizontalLineTo(130.67f)
                lineTo(102.92f, 51.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 93.34f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.89f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 232.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
            }
        }
        .build()
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
