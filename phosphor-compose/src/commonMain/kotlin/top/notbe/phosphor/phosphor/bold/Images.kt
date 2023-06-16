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

public val BoldGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(80.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 56.0f)
                lineTo(60.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 88.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 180.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(84.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                verticalLineToRelative(45.09f)
                lineToRelative(-3.23f, -3.23f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(165.31f, 117.0f)
                lineTo(130.14f, 81.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(84.0f, 99.72f)
                close()
                moveTo(180.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 92.0f)
                lineTo(60.0f, 92.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(180.0f, 180.0f)
                close()
                moveTo(84.0f, 156.0f)
                lineTo(84.0f, 133.66f)
                lineToRelative(32.0f, -32.0f)
                lineToRelative(40.83f, 40.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(20.83f, -20.83f)
                lineTo(212.0f, 139.0f)
                verticalLineToRelative(17.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
