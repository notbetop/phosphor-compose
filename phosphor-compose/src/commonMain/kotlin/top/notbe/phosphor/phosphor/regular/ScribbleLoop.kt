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

public val RegularGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.93f, 154.63f)
                curveToRelative(-1.32f, -1.46f, -24.09f, -26.22f, -61.0f, -40.56f)
                curveToRelative(-1.72f, -18.42f, -8.46f, -35.17f, -19.41f, -47.92f)
                curveTo(150.87f, 49.0f, 129.58f, 40.0f, 104.0f, 40.0f)
                curveTo(52.48f, 40.0f, 18.89f, 86.18f, 17.49f, 88.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 9.31f)
                curveTo(30.8f, 97.05f, 60.81f, 56.0f, 104.0f, 56.0f)
                curveToRelative(20.77f, 0.0f, 37.86f, 7.11f, 49.41f, 20.57f)
                curveToRelative(7.42f, 8.64f, 12.44f, 19.69f, 14.67f, 32.0f)
                arcTo(140.87f, 140.87f, 0.0f, false, false, 132.6f, 104.0f)
                curveToRelative(-26.06f, 0.0f, -47.93f, 6.81f, -63.26f, 19.69f)
                curveTo(55.78f, 135.09f, 48.0f, 151.0f, 48.0f, 167.25f)
                arcTo(47.59f, 47.59f, 0.0f, false, false, 61.87f, 201.3f)
                curveToRelative(9.66f, 9.62f, 23.06f, 14.7f, 38.73f, 14.7f)
                curveToRelative(51.81f, 0.0f, 81.18f, -42.13f, 84.49f, -84.42f)
                arcToRelative(161.43f, 161.43f, 0.0f, false, true, 49.0f, 33.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.86f, -10.74f)
                close()
                moveTo(151.47f, 176.27f)
                curveTo(142.64f, 187.09f, 126.66f, 200.0f, 100.6f, 200.0f)
                curveTo(75.32f, 200.0f, 64.0f, 183.55f, 64.0f, 167.25f)
                curveTo(64.0f, 144.49f, 85.47f, 120.0f, 132.6f, 120.0f)
                arcToRelative(124.34f, 124.34f, 0.0f, false, true, 36.78f, 5.68f)
                curveTo(168.93f, 144.44f, 162.46f, 162.78f, 151.47f, 176.27f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
