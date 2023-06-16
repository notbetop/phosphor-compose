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

public val BoldGroup.Plant: ImageVector
    get() {
        if (_plant != null) {
            return _plant!!
        }
        _plant = Builder(name = "Plant", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.62f, 39.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.27f, -11.27f)
                curveToRelative(-53.28f, -3.14f, -96.2f, 13.37f, -114.84f, 44.14f)
                curveToRelative(-12.14f, 20.0f, -12.56f, 44.17f, -1.46f, 67.3f)
                arcToRelative(75.21f, 75.21f, 0.0f, false, false, -11.24f, 20.0f)
                lineToRelative(-9.7f, -9.7f)
                curveToRelative(7.19f, -16.77f, 6.43f, -34.11f, -2.4f, -48.69f)
                curveTo(86.73f, 78.36f, 54.89f, 66.0f, 15.55f, 68.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.28f, 79.55f)
                curveTo(2.0f, 118.89f, 14.36f, 150.73f, 37.45f, 164.71f)
                arcToRelative(49.76f, 49.76f, 0.0f, false, false, 26.0f, 7.27f)
                arcToRelative(57.54f, 57.54f, 0.0f, false, false, 22.7f, -4.87f)
                lineTo(108.0f, 189.0f)
                verticalLineToRelative(27.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(186.51f)
                arcToRelative(51.63f, 51.63f, 0.0f, false, true, 9.49f, -29.95f)
                arcTo(76.81f, 76.81f, 0.0f, false, false, 173.58f, 164.0f)
                arcToRelative(64.92f, 64.92f, 0.0f, false, false, 33.9f, -9.46f)
                curveTo(238.25f, 135.85f, 254.76f, 92.92f, 251.62f, 39.65f)
                close()
                moveTo(49.88f, 144.18f)
                curveToRelative(-13.19f, -8.0f, -21.18f, -27.46f, -21.83f, -52.13f)
                curveToRelative(24.67f, 0.65f, 44.14f, 8.65f, 52.13f, 21.83f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 3.63f, 17.0f)
                lineTo(72.48f, 119.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(11.34f, 11.34f)
                arcTo(26.27f, 26.27f, 0.0f, false, true, 49.88f, 144.18f)
                close()
                moveTo(195.05f, 134.0f)
                curveToRelative(-10.66f, 6.45f, -23.0f, 7.67f, -35.81f, 3.76f)
                lineToRelative(37.25f, -37.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-37.25f, 37.24f)
                curveTo(138.37f, 108.0f, 139.59f, 95.61f, 146.0f, 85.0f)
                curveToRelative(12.77f, -21.09f, 43.0f, -33.07f, 82.0f, -33.0f)
                curveTo(228.14f, 91.0f, 216.14f, 121.18f, 195.05f, 134.0f)
                close()
            }
        }
        .build()
        return _plant!!
    }

private var _plant: ImageVector? = null
