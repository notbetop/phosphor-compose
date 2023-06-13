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

public val ThinGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 35.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -34.0f, 0.0f)
                lineTo(21.14f, 213.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 6.7f)
                arcToRelative(150.65f, 150.65f, 0.0f, false, false, 34.0f, 3.9f)
                curveToRelative(32.64f, 0.0f, 65.34f, -10.65f, 96.12f, -31.52f)
                curveToRelative(31.2f, -21.15f, 49.21f, -45.0f, 50.0f, -46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.37f, -5.24f)
                lineToRelative(-21.48f, -21.5f)
                lineTo(229.0f, 69.0f)
                arcTo(24.09f, 24.09f, 0.0f, false, false, 229.0f, 35.0f)
                close()
                moveTo(194.65f, 144.41f)
                arcToRelative(226.48f, 226.48f, 0.0f, false, true, -45.89f, 41.44f)
                curveTo(110.83f, 211.57f, 71.58f, 220.94f, 32.0f, 213.75f)
                lineTo(146.53f, 96.24f)
                close()
                moveTo(223.33f, 63.34f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.09f, 0.09f)
                lineTo(175.7f, 114.11f)
                lineToRelative(-23.58f, -23.6f)
                lineToRelative(48.57f, -49.83f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.64f, 22.66f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
