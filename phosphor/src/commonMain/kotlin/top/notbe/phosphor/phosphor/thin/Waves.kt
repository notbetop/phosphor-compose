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

public val ThinGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.16f, 74.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.64f)
                curveTo(37.87f, 68.47f, 54.72f, 52.0f, 88.0f, 52.0f)
                curveToRelative(17.21f, 0.0f, 29.92f, 8.48f, 42.22f, 16.67f)
                curveTo(142.0f, 76.55f, 153.21f, 84.0f, 168.0f, 84.0f)
                curveToRelative(29.77f, 0.0f, 45.0f, -14.69f, 45.18f, -14.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.65f, 5.67f)
                curveTo(218.13f, 75.53f, 201.28f, 92.0f, 168.0f, 92.0f)
                curveToRelative(-17.21f, 0.0f, -29.92f, -8.48f, -42.22f, -16.67f)
                curveTo(114.0f, 67.45f, 102.79f, 60.0f, 88.0f, 60.0f)
                curveTo(58.23f, 60.0f, 43.0f, 74.69f, 42.82f, 74.84f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 37.16f, 74.81f)
                close()
                moveTo(213.16f, 125.16f)
                curveTo(213.0f, 125.31f, 197.77f, 140.0f, 168.0f, 140.0f)
                curveToRelative(-14.79f, 0.0f, -26.0f, -7.45f, -37.78f, -15.33f)
                curveTo(117.92f, 116.48f, 105.21f, 108.0f, 88.0f, 108.0f)
                curveToRelative(-33.28f, 0.0f, -50.13f, 16.47f, -50.83f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 5.67f)
                curveTo(43.0f, 130.69f, 58.23f, 116.0f, 88.0f, 116.0f)
                curveToRelative(14.79f, 0.0f, 26.0f, 7.45f, 37.78f, 15.33f)
                curveToRelative(12.3f, 8.19f, 25.0f, 16.67f, 42.22f, 16.67f)
                curveToRelative(33.28f, 0.0f, 50.13f, -16.47f, 50.83f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.67f)
                close()
                moveTo(213.16f, 181.16f)
                curveTo(213.0f, 181.31f, 197.77f, 196.0f, 168.0f, 196.0f)
                curveToRelative(-14.79f, 0.0f, -26.0f, -7.45f, -37.78f, -15.33f)
                curveTo(117.92f, 172.48f, 105.21f, 164.0f, 88.0f, 164.0f)
                curveToRelative(-33.28f, 0.0f, -50.13f, 16.47f, -50.83f, 17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 5.67f)
                curveTo(43.0f, 186.69f, 58.23f, 172.0f, 88.0f, 172.0f)
                curveToRelative(14.79f, 0.0f, 26.0f, 7.45f, 37.78f, 15.33f)
                curveToRelative(12.3f, 8.19f, 25.0f, 16.67f, 42.22f, 16.67f)
                curveToRelative(33.28f, 0.0f, 50.13f, -16.47f, 50.83f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, -5.67f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
