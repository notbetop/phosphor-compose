package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.FolderSimpleMinus: ImageVector
    get() {
        if (_folderSimpleMinus != null) {
            return _folderSimpleMinus!!
        }
        _folderSimpleMinus = Builder(name = "FolderSimpleMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                verticalLineTo(200.89f)
                arcToRelative(7.11f, 7.11f, 0.0f, false, true, -7.11f, 7.11f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(93.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.8f, 1.6f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(104.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 144.0f)
                close()
                moveTo(232.0f, 88.0f)
                lineTo(232.0f, 200.89f)
                arcTo(15.13f, 15.13f, 0.0f, false, true, 216.89f, 216.0f)
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
                moveTo(216.0f, 88.0f)
                lineTo(130.67f, 88.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, -9.6f, -3.2f)
                lineTo(93.33f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return _folderSimpleMinus!!
    }

private var _folderSimpleMinus: ImageVector? = null
