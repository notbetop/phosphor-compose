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

public val LightGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 157.43f)
                lineTo(190.0f, 98.57f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -5.42f, -9.51f)
                lineTo(133.24f, 59.41f)
                arcToRelative(10.49f, 10.49f, 0.0f, false, false, -10.48f, 0.0f)
                lineTo(71.43f, 89.06f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 66.0f, 98.57f)
                verticalLineToRelative(58.86f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 5.42f, 9.51f)
                lineToRelative(51.34f, 29.65f)
                arcToRelative(10.51f, 10.51f, 0.0f, false, false, 10.48f, 0.0f)
                lineToRelative(51.33f, -29.65f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 190.0f, 157.43f)
                close()
                moveTo(128.0f, 70.24f)
                lineTo(172.59f, 96.0f)
                lineTo(128.0f, 121.74f)
                lineTo(83.41f, 96.0f)
                close()
                moveTo(78.0f, 106.73f)
                lineToRelative(44.0f, 25.4f)
                lineTo(122.0f, 182.3f)
                lineTo(78.0f, 156.88f)
                close()
                moveTo(134.0f, 182.3f)
                lineTo(134.0f, 132.13f)
                lineToRelative(44.0f, -25.4f)
                verticalLineToRelative(50.15f)
                close()
                moveTo(230.0f, 48.0f)
                lineTo(230.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 54.0f)
                lineTo(184.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 48.0f)
                close()
                moveTo(78.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(26.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(34.0f)
                lineTo(72.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 78.0f, 208.0f)
                close()
                moveTo(230.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(184.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(34.0f)
                lineTo(218.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(26.0f, 88.0f)
                lineTo(26.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(72.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(38.0f, 54.0f)
                lineTo(38.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
