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

public val LightGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.08f, 43.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 34.0f, 47.9f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(170.78f)
                curveToRelative(28.08f, -22.79f, 51.88f, -11.0f, 79.34f, 2.57f)
                curveToRelative(16.12f, 8.0f, 33.49f, 16.58f, 52.0f, 16.58f)
                curveToRelative(13.57f, 0.0f, 27.76f, -4.6f, 42.56f, -17.42f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 168.0f)
                verticalLineTo(47.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.93f, -4.54f)
                curveToRelative(-29.0f, 25.12f, -53.28f, 13.09f, -81.41f, -0.84f)
                curveTo(102.77f, 28.71f, 71.0f, 13.16f, 36.08f, 43.37f)
                close()
                moveTo(210.0f, 165.17f)
                curveToRelative(-28.08f, 22.8f, -51.88f, 11.0f, -79.34f, -2.58f)
                curveTo(105.4f, 150.08f, 77.09f, 136.07f, 46.0f, 156.0f)
                verticalLineTo(50.72f)
                curveToRelative(28.08f, -22.8f, 51.88f, -11.0f, 79.34f, 2.56f)
                curveTo(150.6f, 65.79f, 178.91f, 79.8f, 210.0f, 59.91f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
