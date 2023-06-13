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

public val LightGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.75f, 163.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.5f, 0.0f)
                curveTo(223.34f, 164.0f, 202.0f, 181.38f, 202.0f, 204.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 52.0f, 0.0f)
                curveTo(254.0f, 181.38f, 232.66f, 164.0f, 231.75f, 163.32f)
                close()
                moveTo(228.0f, 218.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                curveToRelative(0.0f, -11.88f, 8.79f, -22.55f, 14.0f, -27.83f)
                curveToRelative(5.21f, 5.28f, 14.0f, 16.0f, 14.0f, 27.83f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 228.0f, 218.0f)
                close()
                moveTo(228.24f, 119.24f)
                lineTo(120.76f, 11.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 0.0f)
                lineToRelative(-42.0f, 42.0f)
                lineToRelative(-26.0f, -26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 8.48f)
                lineToRelative(26.0f, 26.0f)
                lineTo(16.44f, 107.59f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f)
                lineToRelative(84.86f, 84.86f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.11f, 0.0f)
                lineToRelative(95.83f, -95.83f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 228.24f, 119.24f)
                close()
                moveTo(123.93f, 215.07f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -14.14f, 0.0f)
                lineTo(24.93f, 130.21f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
                lineTo(70.25f, 70.75f)
                lineToRelative(31.62f, 31.61f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 3.75f, 32.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 36.76f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -32.0f, -40.51f)
                lineTo(78.74f, 62.26f)
                lineToRelative(37.78f, -37.77f)
                lineToRelative(99.0f, 99.0f)
                close()
                moveTo(124.0f, 102.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -9.9f, 4.1f)
                arcTo(13.92f, 13.92f, 0.0f, false, true, 124.0f, 102.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
