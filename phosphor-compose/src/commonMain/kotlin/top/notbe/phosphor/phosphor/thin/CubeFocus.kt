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

public val ThinGroup.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) {
            return _cubeFocus!!
        }
        _cubeFocus = Builder(name = "CubeFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 157.43f)
                lineTo(188.0f, 98.57f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.42f, -7.78f)
                lineTo(132.24f, 61.14f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(72.43f, 90.79f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 68.0f, 98.57f)
                verticalLineToRelative(58.86f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 4.42f, 7.78f)
                lineToRelative(51.34f, 29.65f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(51.33f, -29.65f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 188.0f, 157.43f)
                close()
                moveTo(127.76f, 68.07f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, true, 0.48f, 0.0f)
                lineTo(176.59f, 96.0f)
                lineTo(128.0f, 124.05f)
                lineTo(79.41f, 96.0f)
                close()
                moveTo(76.43f, 158.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.43f, -0.85f)
                lineTo(76.0f, 103.26f)
                lineTo(124.0f, 131.0f)
                verticalLineToRelative(54.78f)
                close()
                moveTo(179.57f, 158.28f)
                lineTo(132.0f, 185.76f)
                lineTo(132.0f, 131.0f)
                lineToRelative(48.0f, -27.72f)
                verticalLineToRelative(54.17f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 179.57f, 158.28f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(76.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(72.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 76.0f, 208.0f)
                close()
                moveTo(228.0f, 168.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(184.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(36.0f)
                lineTo(220.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(28.0f, 88.0f)
                lineTo(28.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(72.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(36.0f, 52.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
