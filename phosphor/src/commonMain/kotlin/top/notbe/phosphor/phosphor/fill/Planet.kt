package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.22f, 115.75f)
                arcTo(97.08f, 97.08f, 0.0f, false, true, 224.0f, 128.0f)
                arcTo(95.93f, 95.93f, 0.0f, false, true, 69.43f, 204.0f)
                curveToRelative(25.19f, -6.16f, 54.82f, -18.93f, 82.44f, -34.8f)
                curveTo(181.31f, 152.29f, 206.16f, 133.46f, 223.22f, 115.75f)
                close()
                moveTo(245.11f, 60.68f)
                curveToRelative(-7.65f, -13.19f, -27.84f, -16.16f, -58.5f, -8.66f)
                horizontalLineToRelative(0.0f)
                arcTo(95.93f, 95.93f, 0.0f, false, false, 32.0f, 128.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.78f, 12.31f)
                horizontalLineToRelative(0.0f)
                curveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f)
                curveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f)
                arcToRelative(124.11f, 124.11f, 0.0f, false, false, 28.79f, -4.0f)
                arcToRelative(97.22f, 97.22f, 0.0f, false, true, -14.16f, -13.42f)
                curveToRelative(-17.29f, 2.88f, -28.0f, 1.0f, -30.53f, -3.29f)
                curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13.0f)
                arcToRelative(79.42f, 79.42f, 0.0f, false, true, 10.28f, -15.05f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.0f, -0.09f)
                lineToRelative(0.0f, 0.08f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.21f, 96.21f, 0.0f, false, false, 18.0f, 31.32f)
                curveToRelative(20.94f, -3.49f, 51.49f, -13.91f, 88.63f, -35.25f)
                curveTo(172.0f, 139.19f, 202.0f, 116.67f, 218.79f, 96.82f)
                arcToRelative(95.69f, 95.69f, 0.0f, false, false, -18.0f, -31.35f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.13f, -0.15f)
                curveToRelative(0.0f, 0.05f, 0.09f, 0.09f, 0.13f, 0.15f)
                curveToRelative(14.21f, -2.35f, 27.37f, -2.17f, 30.5f, 3.24f)
                curveToRelative(0.92f, 1.57f, 1.0f, 3.92f, 0.15f, 7.0f)
                curveToRelative(-1.69f, 6.31f, -6.19f, 13.53f, -12.63f, 21.13f)
                arcToRelative(95.39f, 95.39f, 0.0f, false, true, 4.43f, 18.93f)
                curveToRelative(12.5f, -13.0f, 20.82f, -25.35f, 23.65f, -35.92f)
                curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
