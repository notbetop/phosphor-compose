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

public val RegularGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.81f, 32.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.67f, 0.07f)
                lineTo(18.27f, 210.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 22.2f, 224.0f)
                arcToRelative(154.93f, 154.93f, 0.0f, false, false, 35.0f, 4.0f)
                curveToRelative(33.42f, 0.0f, 66.88f, -10.88f, 98.33f, -32.21f)
                curveToRelative(31.75f, -21.53f, 50.15f, -45.85f, 50.92f, -46.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.74f, -10.46f)
                lineToRelative(-18.74f, -18.76f)
                lineToRelative(45.0f, -48.0f)
                arcTo(28.08f, 28.08f, 0.0f, false, false, 231.81f, 32.19f)
                close()
                moveTo(189.22f, 144.63f)
                arcToRelative(225.51f, 225.51f, 0.0f, false, true, -43.11f, 38.18f)
                curveToRelative(-34.47f, 23.25f, -70.0f, 32.7f, -105.84f, 28.16f)
                lineToRelative(106.3f, -109.0f)
                close()
                moveTo(220.5f, 60.5f)
                lineToRelative(-0.18f, 0.19f)
                lineToRelative(-44.71f, 47.67f)
                lineTo(157.74f, 90.47f)
                lineToRelative(45.78f, -47.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
