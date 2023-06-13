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

public val BoldGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 12.0f)
                arcTo(84.05f, 84.05f, 0.0f, false, false, 79.38f, 119.65f)
                lineTo(23.51f, 175.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(72.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(84.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(108.0f, 188.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineToRelative(7.86f, -7.87f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 160.0f, 12.0f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(59.58f, 59.58f, 0.0f, false, true, -22.1f, -4.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.22f, 2.55f)
                lineTo(115.0f, 164.0f)
                lineTo(96.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(72.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 189.0f)
                lineToRelative(57.65f, -57.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.55f, -13.21f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 160.0f, 156.0f)
                close()
                moveTo(196.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
