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

public val LightGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 18.0f)
                arcTo(78.05f, 78.05f, 0.0f, false, false, 86.2f, 121.31f)
                lineTo(27.76f, 179.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 184.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(72.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(78.0f, 206.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(102.0f, 182.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineToRelative(10.45f, -10.44f)
                arcTo(78.0f, 78.0f, 0.0f, true, false, 160.0f, 18.0f)
                close()
                moveTo(160.0f, 162.0f)
                arcToRelative(65.63f, 65.63f, 0.0f, false, true, -24.43f, -4.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.64f, 1.26f)
                lineTo(117.51f, 170.0f)
                lineTo(96.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(72.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(38.0f, 218.0f)
                lineTo(38.0f, 186.49f)
                lineToRelative(59.41f, -59.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.26f, -6.64f)
                arcTo(66.0f, 66.0f, 0.0f, true, true, 160.0f, 162.0f)
                close()
                moveTo(190.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
