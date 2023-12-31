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

public val BoldGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.9f, 152.0f)
                curveToRelative(-1.33f, -1.47f, -23.75f, -25.85f, -60.21f, -40.69f)
                curveToRelative(-2.15f, -18.28f, -9.1f, -34.9f, -20.1f, -47.71f)
                curveTo(153.12f, 45.52f, 130.79f, 36.0f, 104.0f, 36.0f)
                curveTo(50.44f, 36.0f, 15.69f, 83.79f, 14.24f, 85.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.53f, 14.0f)
                curveTo(34.05f, 99.38f, 62.65f, 60.0f, 104.0f, 60.0f)
                curveToRelative(19.85f, 0.0f, 35.45f, 6.45f, 46.38f, 19.18f)
                arcToRelative(61.35f, 61.35f, 0.0f, false, true, 12.4f, 24.0f)
                arcTo(143.6f, 143.6f, 0.0f, false, false, 132.61f, 100.0f)
                curveToRelative(-27.0f, 0.0f, -49.79f, 7.13f, -65.85f, 20.63f)
                curveTo(52.3f, 132.79f, 44.0f, 149.78f, 44.0f, 167.25f)
                curveTo(44.0f, 193.46f, 63.44f, 220.0f, 100.61f, 220.0f)
                curveToRelative(51.93f, 0.0f, 82.34f, -40.28f, 87.87f, -82.43f)
                arcToRelative(156.46f, 156.46f, 0.0f, false, true, 42.62f, 30.48f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 248.9f, 152.0f)
                close()
                moveTo(148.37f, 173.74f)
                curveTo(140.09f, 183.9f, 125.09f, 196.0f, 100.61f, 196.0f)
                curveTo(78.08f, 196.0f, 68.0f, 181.56f, 68.0f, 167.25f)
                curveTo(68.0f, 146.42f, 88.22f, 124.0f, 132.61f, 124.0f)
                arcToRelative(119.85f, 119.85f, 0.0f, false, true, 32.64f, 4.62f)
                curveTo(164.24f, 145.44f, 158.21f, 161.66f, 148.37f, 173.74f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
