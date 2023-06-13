package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.FolderNotchOpen: ImageVector
    get() {
        if (_folderNotchOpen != null) {
            return _folderNotchOpen!!
        }
        _folderNotchOpen = Builder(name = "FolderNotchOpen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.36f, 111.81f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 106.0f)
                lineTo(214.0f, 106.0f)
                lineTo(214.0f, 88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(130.67f, 74.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.2f, -0.4f)
                lineTo(101.74f, 52.8f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, -8.4f, -2.8f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(211.1f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, -4.1f)
                lineToRelative(28.49f, -85.47f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 243.36f, 111.81f)
                close()
                moveTo(40.0f, 62.0f)
                lineTo(93.34f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.2f, 0.4f)
                lineToRelative(27.73f, 20.8f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, 8.4f, 2.8f)
                lineTo(200.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(146.43f, 106.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -7.77f, 2.35f)
                lineToRelative(-20.0f, 13.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.11f, 0.34f)
                lineTo(69.42f, 122.0f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, -13.0f, 8.8f)
                lineTo(38.0f, 176.84f)
                lineTo(38.0f, 64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 62.0f)
                close()
                moveTo(233.9f, 120.63f)
                lineTo(206.78f, 202.0f)
                lineTo(40.86f, 202.0f)
                lineToRelative(26.7f, -66.74f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 69.42f, 134.0f)
                horizontalLineToRelative(48.16f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 7.77f, -2.35f)
                lineToRelative(20.0f, -13.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.11f, -0.34f)
                lineTo(232.0f, 118.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 2.63f)
                close()
            }
        }
        .build()
        return _folderNotchOpen!!
    }

private var _folderNotchOpen: ImageVector? = null
