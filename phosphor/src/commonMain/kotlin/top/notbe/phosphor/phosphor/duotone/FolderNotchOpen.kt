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

public val DuotoneGroup.FolderNotchOpen: ImageVector
    get() {
        if (_folderNotchOpen != null) {
            return _folderNotchOpen!!
        }
        _folderNotchOpen = Builder(name = "FolderNotchOpen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(146.42f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, -4.44f, 1.34f)
                lineToRelative(-20.0f, 13.32f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, true, -4.44f, 1.34f)
                horizontalLineTo(69.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 62.0f, 133.0f)
                lineTo(32.0f, 208.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(93.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.8f, 1.6f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.0f, 110.64f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f)
                lineTo(216.0f, 104.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(130.67f, 72.0f)
                lineTo(102.94f, 51.2f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(211.1f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f)
                lineToRelative(28.49f, -85.47f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 245.0f, 110.64f)
                close()
                moveTo(93.34f, 64.0f)
                lineToRelative(27.73f, 20.8f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, 9.6f, 3.2f)
                lineTo(200.0f, 88.0f)
                verticalLineToRelative(16.0f)
                lineTo(146.43f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.88f, 2.69f)
                lineToRelative(-20.0f, 13.31f)
                lineTo(69.42f, 120.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -14.86f, 10.06f)
                lineTo(40.0f, 166.46f)
                lineTo(40.0f, 64.0f)
                close()
                moveTo(205.34f, 200.0f)
                lineTo(43.82f, 200.0f)
                lineToRelative(25.6f, -64.0f)
                horizontalLineToRelative(48.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.88f, -2.69f)
                lineToRelative(20.0f, -13.31f)
                lineTo(232.0f, 120.0f)
                close()
            }
        }
        .build()
        return _folderNotchOpen!!
    }

private var _folderNotchOpen: ImageVector? = null
