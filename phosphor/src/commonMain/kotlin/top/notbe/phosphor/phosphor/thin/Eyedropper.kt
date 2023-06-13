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

public val ThinGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 67.37f)
                arcToRelative(31.82f, 31.82f, 0.0f, false, false, -10.0f, -22.82f)
                curveToRelative(-12.46f, -11.8f, -32.66f, -11.33f, -45.0f, 1.05f)
                lineTo(142.82f, 67.86f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(4.89f, 4.89f)
                lineTo(54.55f, 150.52f)
                arcTo(35.81f, 35.81f, 0.0f, false, false, 45.42f, 186.0f)
                lineToRelative(-8.6f, 19.7f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 2.0f, 10.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.15f, 219.0f)
                lineToRelative(18.72f, -8.18f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 34.59f, -9.37f)
                lineToRelative(53.86f, -53.87f)
                lineToRelative(4.88f, 4.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.3f)
                lineToRelative(-2.06f, -2.06f)
                lineToRelative(22.55f, -22.69f)
                arcTo(31.75f, 31.75f, 0.0f, false, false, 220.0f, 67.37f)
                close()
                moveTo(99.81f, 195.78f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.78f, 0.15f)
                lineToRelative(-20.0f, 8.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.43f, -0.84f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -0.36f, -1.93f)
                lineToRelative(9.19f, -21.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.12f, -2.88f)
                arcToRelative(27.87f, 27.87f, 0.0f, false, true, 6.74f, -28.77f)
                lineToRelative(53.85f, -53.87f)
                lineToRelative(39.6f, 39.61f)
                close()
                moveTo(179.59f, 110.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.65f)
                lineToRelative(4.89f, 4.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(109.18f, 86.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(140.0f, 76.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, 1.17f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.18f)
                lineToRelative(25.0f, -25.1f)
                curveToRelative(9.33f, -9.34f, 24.52f, -9.73f, 33.87f, -0.89f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 205.0f, 84.79f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
