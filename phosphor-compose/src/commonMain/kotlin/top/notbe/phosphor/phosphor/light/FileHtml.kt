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

public val LightGroup.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) {
            return _fileHtml!!
        }
        _fileHtml = Builder(name = "FileHtml", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(110.0f, 158.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(98.0f, 158.0f)
                lineTo(88.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 126.0f, 152.0f)
                close()
                moveTo(64.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(22.0f)
                lineTo(38.0f, 174.0f)
                lineTo(38.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(38.0f, 186.0f)
                lineTo(58.0f, 186.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(70.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 64.0f, 146.0f)
                close()
                moveTo(240.0f, 202.0f)
                lineTo(226.0f, 202.0f)
                lineTo(226.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(193.6f, 146.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.75f, 2.69f)
                lineTo(168.0f, 180.34f)
                lineToRelative(-18.85f, -31.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 138.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 173.66f)
                lineToRelative(12.85f, 21.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.3f, 0.0f)
                lineTo(186.0f, 173.66f)
                lineTo(186.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(198.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 193.6f, 146.22f)
                close()
                moveTo(214.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f)
                lineToRelative(56.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                close()
                moveTo(193.52f, 82.0f)
                lineTo(158.0f, 46.48f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
