package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.FileHtml: ImageVector
    get() {
        if (_fileHtml != null) {
            return _fileHtml!!
        }
        _fileHtml = Builder(name = "FileHtml", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(90.0f, 164.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(56.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                lineTo(36.0f, 168.0f)
                lineTo(36.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(36.0f, 192.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 140.0f)
                close()
                moveTo(244.0f, 196.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(240.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(199.2f, 140.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.49f, 5.39f)
                lineTo(172.0f, 168.68f)
                lineToRelative(-13.71f, -22.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 136.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(160.0f, 195.32f)
                lineToRelative(1.71f, 2.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.58f, 0.0f)
                lineToRelative(1.71f, -2.85f)
                lineTo(184.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(208.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 199.2f, 140.44f)
                close()
                moveTo(208.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-4.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(36.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 88.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 120.0f)
                close()
                moveTo(183.0f, 80.0f)
                lineTo(160.0f, 57.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileHtml!!
    }

private var _fileHtml: ImageVector? = null
