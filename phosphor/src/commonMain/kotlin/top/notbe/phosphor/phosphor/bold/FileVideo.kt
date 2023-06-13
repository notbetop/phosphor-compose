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

public val BoldGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.35f, 149.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.63f, -0.6f)
                lineTo(118.0f, 159.37f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 148.0f)
                lineTo(48.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.3f, -12.0f)
                lineToRelative(20.12f, 10.58f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 216.0f)
                lineTo(156.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 150.35f, 149.82f)
                close()
                moveTo(96.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 172.0f)
                lineTo(96.0f, 172.0f)
                close()
                moveTo(132.0f, 196.13f)
                lineTo(120.0f, 189.83f)
                verticalLineToRelative(-4.72f)
                lineToRelative(12.0f, -5.87f)
                close()
                moveTo(216.49f, 79.51f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
