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

public val ThinGroup.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) {
            return _fileHtml!!
        }
        _fileHtml = Builder(name = "FileHtml", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(108.0f, 156.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(100.0f, 156.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 124.0f, 152.0f)
                close()
                moveTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                lineTo(36.0f, 176.0f)
                lineTo(36.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(36.0f, 184.0f)
                lineTo(60.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 64.0f, 148.0f)
                close()
                moveTo(240.0f, 204.0f)
                lineTo(224.0f, 204.0f)
                lineTo(224.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(193.07f, 148.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.5f, 1.79f)
                lineTo(168.0f, 184.23f)
                lineToRelative(-20.57f, -34.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 140.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 166.44f)
                lineToRelative(16.57f, 27.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.86f, 0.0f)
                lineTo(188.0f, 166.44f)
                lineTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(196.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 193.07f, 148.15f)
                close()
                moveTo(210.83f, 85.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                close()
                moveTo(198.34f, 84.0f)
                lineTo(156.0f, 41.65f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
