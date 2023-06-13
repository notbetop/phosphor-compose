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

public val FillGroup.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
                moveTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
                moveTo(224.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(192.0f, 160.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(192.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(176.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 152.0f)
                close()
                moveTo(64.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(64.0f, 184.0f)
                lineTo(56.0f, 184.0f)
                lineTo(56.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(128.0f, 144.0f)
                lineTo(112.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(128.0f, 200.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(120.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
