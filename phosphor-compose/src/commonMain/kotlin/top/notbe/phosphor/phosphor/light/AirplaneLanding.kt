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

public val LightGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(240.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 216.0f)
                close()
                moveTo(222.38f, 189.78f)
                lineTo(45.75f, 140.32f)
                arcTo(38.14f, 38.14f, 0.0f, false, true, 18.0f, 103.72f)
                lineTo(18.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 36.43f, 34.71f)
                lineToRelative(5.47f, 1.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.74f, 3.65f)
                lineToRelative(11.0f, 30.33f)
                lineTo(90.0f, 80.0f)
                lineTo(90.0f, 48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 18.43f, -13.29f)
                lineToRelative(5.47f, 1.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.63f, 3.37f)
                lineToRelative(22.88f, 54.53f)
                lineToRelative(61.77f, 17.27f)
                arcTo(38.09f, 38.09f, 0.0f, false, true, 230.0f, 148.32f)
                lineTo(230.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.62f, 5.78f)
                close()
                moveTo(218.0f, 148.32f)
                arcToRelative(26.07f, 26.07f, 0.0f, false, false, -19.0f, -25.0f)
                lineToRelative(-64.58f, -18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.91f, -3.46f)
                lineToRelative(-23.0f, -54.7f)
                lineToRelative(-2.89f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 102.0f, 48.0f)
                lineTo(102.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.64f, 5.77f)
                lineToRelative(-44.0f, -12.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, -3.73f)
                lineTo(35.34f, 47.0f)
                lineToRelative(-2.71f, -0.9f)
                arcTo(1.91f, 1.91f, 0.0f, false, false, 32.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.16f, 0.38f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 30.0f, 48.0f)
                verticalLineToRelative(55.72f)
                arcToRelative(26.09f, 26.09f, 0.0f, false, false, 19.0f, 25.0f)
                lineToRelative(169.0f, 47.33f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
