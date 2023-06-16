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

public val LightGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.49f, 42.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.42f, 0.92f)
                curveToRelative(-29.0f, 25.11f, -53.28f, 13.08f, -81.41f, -0.84f)
                curveToRelative(-27.92f, -13.82f, -59.57f, -29.49f, -94.59f, 0.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(46.0f, 170.78f)
                curveToRelative(28.08f, -22.79f, 51.88f, -11.0f, 79.34f, 2.59f)
                curveToRelative(27.92f, 13.82f, 59.58f, 29.48f, 94.59f, -0.85f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 168.0f)
                lineTo(222.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 218.49f, 42.5f)
                close()
                moveTo(210.0f, 60.0f)
                verticalLineToRelative(49.2f)
                curveToRelative(-15.53f, 12.6f, -29.75f, 14.65f, -44.0f, 11.65f)
                lineTo(166.0f, 68.88f)
                curveTo(180.0f, 71.33f, 194.64f, 69.78f, 210.0f, 60.0f)
                close()
                moveTo(154.0f, 65.87f)
                verticalLineToRelative(51.4f)
                curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.64f)
                curveTo(121.5f, 102.06f, 112.0f, 97.33f, 102.0f, 94.09f)
                lineTo(102.0f, 42.71f)
                arcToRelative(255.17f, 255.17f, 0.0f, false, true, 23.34f, 10.63f)
                curveTo(134.5f, 57.87f, 144.05f, 62.59f, 154.0f, 65.83f)
                close()
                moveTo(90.0f, 39.13f)
                lineTo(90.0f, 91.0f)
                curveToRelative(-14.0f, -2.45f, -28.64f, -0.89f, -44.0f, 8.93f)
                lineTo(46.0f, 50.75f)
                curveTo(61.53f, 38.15f, 75.75f, 36.13f, 90.0f, 39.13f)
                close()
                moveTo(78.63f, 146.0f)
                curveTo(68.13f, 146.0f, 57.24f, 148.79f, 46.0f, 156.0f)
                lineTo(46.0f, 114.79f)
                curveToRelative(15.53f, -12.61f, 29.75f, -14.65f, 44.0f, -11.65f)
                verticalLineToRelative(43.93f)
                arcTo(66.32f, 66.32f, 0.0f, false, false, 78.63f, 146.0f)
                close()
                moveTo(102.0f, 150.11f)
                lineTo(102.0f, 106.72f)
                curveToRelative(7.6f, 2.84f, 15.31f, 6.66f, 23.34f, 10.63f)
                curveToRelative(9.16f, 4.53f, 18.71f, 9.26f, 28.66f, 12.5f)
                verticalLineToRelative(43.39f)
                curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.63f)
                curveTo(121.5f, 158.07f, 112.0f, 153.35f, 102.0f, 150.11f)
                close()
                moveTo(166.0f, 176.81f)
                lineTo(166.0f, 132.89f)
                arcToRelative(66.32f, 66.32f, 0.0f, false, false, 11.37f, 1.0f)
                curveToRelative(10.5f, 0.0f, 21.39f, -2.78f, 32.63f, -10.0f)
                verticalLineToRelative(41.23f)
                curveTo(194.47f, 177.79f, 180.25f, 179.81f, 166.0f, 176.81f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
