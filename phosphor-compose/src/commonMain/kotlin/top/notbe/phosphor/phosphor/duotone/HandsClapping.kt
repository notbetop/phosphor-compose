package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) {
            return _handsClapping!!
        }
        _handsClapping = Builder(name = "HandsClapping", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(201.55f, 185.73f)
                verticalLineToRelative(0.0f)
                arcTo(71.73f, 71.73f, 0.0f, false, false, 194.12f, 132.0f)
                lineToRelative(-19.0f, -32.91f)
                arcTo(17.46f, 17.46f, 0.0f, false, false, 174.0f, 97.34f)
                lineToRelative(-9.8f, -14.77f)
                lineTo(170.77f, 94.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -27.22f, 22.27f)
                lineTo(120.0f, 75.51f)
                lineTo(109.0f, 59.0f)
                lineToRelative(6.6f, 11.44f)
                horizontalLineToRelative(0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 88.0f, 92.07f)
                lineToRelative(-0.06f, 0.05f)
                lineToRelative(-7.2f, -12.47f)
                lineToRelative(-4.35f, -5.06f)
                lineTo(69.81f, 63.15f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 31.18f, -18.0f)
                lineToRelative(7.2f, 12.47f)
                lineTo(109.0f, 59.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 31.18f, -18.0f)
                lineToRelative(24.0f, 41.57f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 31.18f, -18.0f)
                lineToRelative(19.0f, 32.91f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 201.55f, 185.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 24.0f)
                lineTo(168.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(203.83f, 41.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 208.0f, 42.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.84f, -3.83f)
                lineToRelative(8.0f, -13.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.66f, -8.33f)
                lineToRelative(-8.0f, 13.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 203.83f, 41.0f)
                close()
                moveTo(221.27f, 93.53f)
                arcTo(79.71f, 79.71f, 0.0f, false, true, 208.68f, 190.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 62.49f, 208.0f)
                lineToRelative(-35.0f, -60.63f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 46.67f, 108.6f)
                lineToRelative(-4.0f, -6.94f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 61.0f, 63.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 72.4f, 31.63f)
                arcToRelative(26.05f, 26.05f, 0.0f, false, true, 30.81f, 3.58f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 147.09f, 37.0f)
                lineToRelative(12.0f, 20.79f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 43.18f, 2.78f)
                close()
                moveTo(115.92f, 55.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(5.93f, 10.27f)
                arcToRelative(25.87f, 25.87f, 0.0f, false, true, 5.0f, 6.24f)
                lineToRelative(12.0f, 20.75f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, true, 16.0f, -9.78f)
                lineTo(133.24f, 45.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -13.66f, -3.66f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 115.92f, 55.0f)
                close()
                moveTo(76.74f, 59.15f)
                lineToRelative(5.93f, 10.28f)
                lineToRelative(0.32f, 0.29f)
                arcTo(25.93f, 25.93f, 0.0f, false, true, 99.71f, 58.94f)
                lineToRelative(-5.65f, -9.79f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -18.32f, 2.41f)
                arcTo(9.92f, 9.92f, 0.0f, false, false, 76.74f, 59.15f)
                close()
                moveTo(187.19f, 136.0f)
                lineToRelative(-19.0f, -32.91f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.74f, 9.18f)
                lineTo(161.87f, 132.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 148.0f, 140.0f)
                lineTo(113.0f, 79.53f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 95.63f, 89.4f)
                lineTo(120.26f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.85f, 8.0f)
                lineTo(73.84f, 83.66f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.32f, 10.0f)
                lineToRelative(36.0f, 62.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.86f, 8.0f)
                lineToRelative(-20.0f, -34.64f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.32f, 10.0f)
                lineToRelative(35.0f, 60.63f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 110.85f, -64.0f)
                close()
                moveTo(207.41f, 101.49f)
                lineTo(188.41f, 68.58f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.32f, 10.0f)
                horizontalLineToRelative(0.0f)
                lineTo(177.0f, 88.83f)
                arcToRelative(26.06f, 26.06f, 0.0f, false, true, 5.0f, 6.26f)
                lineToRelative(19.0f, 32.91f)
                arcToRelative(80.13f, 80.13f, 0.0f, false, true, 10.13f, 30.0f)
                arcTo(63.82f, 63.82f, 0.0f, false, false, 207.41f, 101.49f)
                close()
                moveTo(251.27f, 53.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.07f, -5.16f)
                lineToRelative(-15.0f, 4.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.45f, 15.62f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, false, 2.46f, -0.39f)
                lineToRelative(15.0f, -4.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 251.27f, 53.55f)
                close()
            }
        }
        .build()
        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
