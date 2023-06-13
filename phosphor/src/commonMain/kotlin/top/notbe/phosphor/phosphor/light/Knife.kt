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

public val LightGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.4f, 33.6f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -36.83f, 0.06f)
                lineTo(19.71f, 212.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.94f, 10.05f)
                arcTo(153.08f, 153.08f, 0.0f, false, false, 57.15f, 226.0f)
                curveToRelative(33.0f, 0.0f, 66.11f, -10.76f, 97.22f, -31.86f)
                curveToRelative(31.47f, -21.35f, 49.68f, -45.41f, 50.44f, -46.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.56f, -7.85f)
                lineToRelative(-20.11f, -20.14f)
                lineToRelative(46.33f, -49.39f)
                arcTo(26.09f, 26.09f, 0.0f, false, false, 230.4f, 33.6f)
                close()
                moveTo(191.94f, 144.53f)
                arcToRelative(226.59f, 226.59f, 0.0f, false, true, -44.61f, 39.87f)
                curveToRelative(-36.18f, 24.45f, -73.55f, 33.84f, -111.26f, 28.0f)
                lineTo(146.55f, 99.09f)
                close()
                moveTo(221.94f, 61.92f)
                lineTo(221.81f, 62.06f)
                lineTo(175.68f, 111.24f)
                lineTo(154.93f, 90.49f)
                lineTo(202.11f, 42.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.8f, 19.82f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
