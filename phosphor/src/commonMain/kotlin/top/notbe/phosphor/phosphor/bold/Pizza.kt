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

public val BoldGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.43f, 62.05f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, -9.06f, -12.38f)
                arcToRelative(205.51f, 205.51f, 0.0f, false, false, -212.74f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.7f, 27.48f)
                lineToRelative(96.0f, 157.26f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.2f, 0.0f)
                lineToRelative(96.0f, -157.26f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 243.43f, 62.05f)
                close()
                moveTo(87.0f, 149.18f)
                lineTo(67.13f, 116.62f)
                arcTo(19.82f, 19.82f, 0.0f, false, true, 72.0f, 116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.0f, 33.18f)
                close()
                moveTo(151.0f, 178.63f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 148.0f)
                curveToRelative(0.56f, 0.0f, 1.12f, 0.0f, 1.67f, 0.07f)
                close()
                moveTo(182.78f, 126.55f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.9f, 73.57f)
                lineTo(128.0f, 216.36f)
                lineTo(99.77f, 170.1f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 79.49f, 92.65f)
                arcToRelative(140.2f, 140.2f, 0.0f, false, true, 118.0f, 9.81f)
                close()
                moveTo(210.0f, 82.0f)
                arcTo(164.15f, 164.15f, 0.0f, false, false, 46.0f, 82.0f)
                lineTo(37.55f, 68.14f)
                arcToRelative(181.52f, 181.52f, 0.0f, false, true, 180.9f, 0.0f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
