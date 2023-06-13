package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 16.0f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 83.91f, 120.78f)
                lineTo(26.34f, 178.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(72.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(80.0f, 208.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(104.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(9.56f, -9.57f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 160.0f, 16.0f)
                close()
                moveTo(160.0f, 160.0f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, true, -23.65f, -4.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.84f, 1.68f)
                lineTo(116.69f, 168.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 216.0f)
                lineTo(40.0f, 187.31f)
                lineToRelative(58.83f, -58.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.68f, -8.84f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 160.0f, 160.0f)
                close()
                moveTo(192.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
