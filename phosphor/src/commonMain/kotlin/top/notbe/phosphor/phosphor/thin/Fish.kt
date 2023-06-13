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

public val ThinGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.05f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.05f, 76.0f)
                close()
                moveTo(204.77f, 154.54f)
                curveToRelative(-20.38f, 25.9f, -53.33f, 39.8f, -97.94f, 41.34f)
                lineToRelative(-23.0f, 53.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.12f, 252.0f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.59f, -2.89f)
                lineToRelative(-15.42f, -54.0f)
                lineTo(6.9f, 179.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -7.52f)
                lineToRelative(53.74f, -23.0f)
                curveToRelative(1.55f, -44.62f, 15.46f, -77.56f, 41.36f, -97.94f)
                curveToRelative(41.8f, -32.9f, 101.9f, -22.0f, 113.52f, -19.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.2f, 9.19f)
                curveTo(226.77f, 52.57f, 237.67f, 112.7f, 204.77f, 154.49f)
                close()
                moveTo(172.77f, 171.54f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 132.0f, 124.0f)
                horizontalLineToRelative(0.0f)
                arcTo(48.07f, 48.07f, 0.0f, false, true, 84.55f, 83.2f)
                curveToRelative(-10.27f, 18.0f, -15.79f, 41.0f, -16.46f, 68.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.42f, 3.58f)
                lineTo(19.92f, 175.1f)
                lineToRelative(45.27f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.75f, 2.75f)
                lineToRelative(12.93f, 45.27f)
                lineToRelative(19.61f, -45.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, -2.42f)
                curveTo(131.82f, 187.25f, 154.81f, 181.73f, 172.81f, 171.45f)
                close()
                moveTo(216.43f, 42.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.07f, -3.07f)
                arcToRelative(172.71f, 172.71f, 0.0f, false, false, -45.72f, -3.31f)
                curveTo(143.0f, 37.85f, 122.39f, 45.0f, 106.48f, 57.52f)
                arcTo(85.0f, 85.0f, 0.0f, false, false, 92.26f, 71.73f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 43.6f, 44.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.36f, 4.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 44.08f, 43.59f)
                arcToRelative(85.0f, 85.0f, 0.0f, false, false, 14.18f, -14.19f)
                curveToRelative(12.52f, -15.9f, 19.67f, -36.48f, 21.26f, -61.17f)
                arcTo(172.84f, 172.84f, 0.0f, false, false, 216.43f, 42.64f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
