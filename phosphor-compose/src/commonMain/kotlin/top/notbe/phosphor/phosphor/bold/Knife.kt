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

public val BoldGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.64f, 29.37f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                lineToRelative(-0.1f, 0.1f)
                lineTo(15.41f, 207.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.89f, 20.1f)
                arcTo(159.13f, 159.13f, 0.0f, false, false, 57.19f, 232.0f)
                curveToRelative(34.21f, 0.0f, 68.42f, -11.11f, 100.55f, -32.9f)
                curveToRelative(32.29f, -21.9f, 51.09f, -46.74f, 51.87f, -47.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.11f, -15.7f)
                lineToRelative(-16.0f, -16.0f)
                lineToRelative(42.29f, -45.08f)
                arcTo(32.09f, 32.09f, 0.0f, false, false, 234.64f, 29.37f)
                close()
                moveTo(143.64f, 179.62f)
                curveTo(112.74f, 200.43f, 81.0f, 209.85f, 49.0f, 207.77f)
                lineTo(146.6f, 107.64f)
                lineToRelative(37.13f, 37.16f)
                arcTo(222.39f, 222.39f, 0.0f, false, true, 143.67f, 179.62f)
                close()
                moveTo(217.64f, 57.68f)
                lineTo(217.38f, 57.95f)
                lineTo(175.49f, 102.61f)
                lineTo(163.37f, 90.44f)
                lineToRelative(43.0f, -44.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.28f, 11.36f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
