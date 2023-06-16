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

public val LightGroup.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) {
            return _handsClapping!!
        }
        _handsClapping = Builder(name = "HandsClapping", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 24.0f)
                lineTo(170.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(182.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(204.87f, 39.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.25f, -2.0f)
                lineToRelative(8.0f, -13.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.24f, -6.25f)
                lineToRelative(-8.0f, 13.11f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 204.87f, 39.25f)
                close()
                moveTo(249.37f, 54.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.55f, -3.88f)
                lineToRelative(-15.0f, 4.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.84f, 11.72f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, 1.84f, -0.3f)
                lineToRelative(15.0f, -4.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 249.37f, 54.17f)
                close()
                moveTo(219.54f, 94.49f)
                arcToRelative(77.71f, 77.71f, 0.0f, false, true, -12.63f, 94.4f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 64.22f, 207.0f)
                lineToRelative(-35.0f, -60.63f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 20.79f, -36.0f)
                lineToRelative(-5.61f, -9.73f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 63.85f, 64.71f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 39.71f, -26.25f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.8f, -0.45f)
                lineTo(159.0f, 61.59f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.56f, 0.0f)
                close()
                moveTo(114.18f, 56.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.09f, 10.56f)
                arcToRelative(23.61f, 23.61f, 0.0f, false, true, 4.86f, 6.0f)
                lineToRelative(13.63f, 23.56f)
                arcToRelative(23.95f, 23.95f, 0.0f, false, true, 19.36f, -12.0f)
                lineTo(135.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.79f, 12.0f)
                close()
                moveTo(75.0f, 60.15f)
                lineTo(81.1f, 70.71f)
                arcTo(23.69f, 23.69f, 0.0f, false, true, 83.33f, 73.0f)
                arcTo(23.92f, 23.92f, 0.0f, false, true, 103.0f, 60.57f)
                lineTo(95.79f, 48.15f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 75.0f, 60.15f)
                close()
                moveTo(195.52f, 185.09f)
                arcTo(65.62f, 65.62f, 0.0f, false, false, 188.93f, 135.0f)
                lineToRelative(-19.0f, -32.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.19f, 11.22f)
                lineToRelative(11.4f, 19.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                lineToRelative(-35.0f, -60.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 93.9f, 90.4f)
                lineTo(118.53f, 133.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                lineTo(75.57f, 82.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.78f, 12.0f)
                lineToRelative(36.0f, 62.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.39f, 6.0f)
                lineToRelative(-20.0f, -34.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.79f, 12.0f)
                lineToRelative(35.0f, 60.63f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 120.91f, -15.92f)
                close()
                moveTo(209.15f, 100.49f)
                lineTo(190.15f, 67.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.79f, 12.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(6.1f, 10.57f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 4.86f, 5.94f)
                lineToRelative(19.0f, 32.91f)
                arcToRelative(77.68f, 77.68f, 0.0f, false, true, 10.44f, 36.51f)
                arcTo(65.8f, 65.8f, 0.0f, false, false, 209.15f, 100.49f)
                close()
            }
        }
        .build()
        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
