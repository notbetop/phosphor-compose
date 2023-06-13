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

public val LightGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.45f, 156.0f)
                curveToRelative(-1.32f, -1.46f, -24.27f, -26.42f, -61.37f, -40.5f)
                curveToRelative(-1.5f, -18.49f, -8.13f, -35.31f, -19.0f, -48.0f)
                curveTo(149.74f, 50.8f, 129.0f, 42.0f, 104.0f, 42.0f)
                curveTo(53.49f, 42.0f, 20.5f, 87.38f, 19.12f, 89.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.76f, 7.0f)
                curveTo(29.18f, 95.87f, 59.75f, 54.0f, 104.0f, 54.0f)
                curveToRelative(21.37f, 0.0f, 39.0f, 7.35f, 50.93f, 21.27f)
                curveToRelative(8.26f, 9.62f, 13.64f, 22.14f, 15.62f, 36.06f)
                arcToRelative(139.0f, 139.0f, 0.0f, false, false, -38.0f, -5.33f)
                curveToRelative(-25.58f, 0.0f, -47.0f, 6.65f, -62.0f, 19.22f)
                curveToRelative(-13.1f, 11.0f, -20.62f, 26.34f, -20.62f, 42.0f)
                arcToRelative(45.65f, 45.65f, 0.0f, false, false, 13.28f, 32.64f)
                curveTo(72.56f, 209.12f, 85.47f, 214.0f, 100.6f, 214.0f)
                curveToRelative(51.73f, 0.0f, 80.55f, -43.09f, 82.68f, -85.38f)
                curveToRelative(32.05f, 13.49f, 52.0f, 35.09f, 52.27f, 35.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.9f, -8.0f)
                close()
                moveTo(153.0f, 177.53f)
                curveTo(143.92f, 188.69f, 127.44f, 202.0f, 100.6f, 202.0f)
                curveTo(82.0f, 202.0f, 62.0f, 191.12f, 62.0f, 167.25f)
                curveTo(62.0f, 143.53f, 84.09f, 118.0f, 132.6f, 118.0f)
                arcToRelative(126.74f, 126.74f, 0.0f, false, true, 38.8f, 6.22f)
                curveTo(171.26f, 143.94f, 164.58f, 163.34f, 153.0f, 177.53f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
