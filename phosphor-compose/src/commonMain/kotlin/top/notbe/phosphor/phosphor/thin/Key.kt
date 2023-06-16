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

public val ThinGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 20.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 88.51f, 121.84f)
                lineTo(29.17f, 181.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(76.0f, 204.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineToRelative(11.33f, -11.34f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 160.0f, 20.0f)
                close()
                moveTo(160.0f, 164.0f)
                arcToRelative(67.52f, 67.52f, 0.0f, false, true, -25.21f, -4.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.45f, 0.83f)
                lineToRelative(-12.0f, 12.0f)
                lineTo(96.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(36.0f, 220.0f)
                lineTo(36.0f, 185.66f)
                lineToRelative(60.0f, -60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.83f, -4.45f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 160.0f, 164.0f)
                close()
                moveTo(188.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
