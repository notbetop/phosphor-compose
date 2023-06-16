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

public val FillGroup.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) {
            return _handsClapping!!
        }
        _handsClapping = Builder(name = "HandsClapping", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, -2.66f)
                lineToRelative(8.0f, -13.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.66f, -8.33f)
                lineToRelative(-8.0f, 13.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 203.82f, 41.0f)
                close()
                moveTo(251.27f, 53.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.06f, -5.16f)
                lineToRelative(-15.0f, 4.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.45f, 15.62f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.46f, -0.39f)
                lineToRelative(15.0f, -4.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 251.26f, 53.55f)
                close()
                moveTo(221.27f, 93.53f)
                arcTo(79.71f, 79.71f, 0.0f, false, true, 208.67f, 190.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 62.48f, 208.0f)
                lineToRelative(-35.0f, -60.63f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 46.66f, 108.6f)
                lineToRelative(-4.0f, -6.94f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 61.0f, 63.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 72.39f, 31.63f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 30.81f, 3.58f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 147.08f, 37.0f)
                lineToRelative(12.0f, 20.79f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 43.17f, 2.78f)
                close()
                moveTo(193.59f, 184.61f)
                arcTo(63.65f, 63.65f, 0.0f, false, false, 187.19f, 136.0f)
                lineToRelative(-19.0f, -32.91f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.75f, 9.18f)
                lineTo(161.86f, 132.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 148.0f, 140.0f)
                lineTo(113.0f, 79.53f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 95.63f, 89.4f)
                lineTo(120.25f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.85f, 8.0f)
                lineTo(73.83f, 83.66f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.32f, 10.0f)
                lineToRelative(16.0f, 27.72f)
                lineToRelative(20.0f, 34.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.86f, 8.0f)
                lineToRelative(-20.0f, -34.64f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.32f, 10.0f)
                lineToRelative(35.0f, 60.63f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 117.25f, -15.44f)
                close()
            }
        }
        .build()
        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
