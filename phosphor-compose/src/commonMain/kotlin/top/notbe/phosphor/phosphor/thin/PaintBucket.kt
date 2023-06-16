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

public val ThinGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.5f, 164.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 0.0f)
                curveToRelative(-0.88f, 0.7f, -21.5f, 17.45f, -21.5f, 39.12f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                curveTo(252.0f, 182.33f, 231.38f, 165.58f, 230.5f, 164.88f)
                close()
                moveTo(228.0f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                curveToRelative(0.0f, -13.75f, 10.95f, -25.8f, 16.0f, -30.63f)
                curveToRelative(5.05f, 4.83f, 16.0f, 16.88f, 16.0f, 30.63f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 228.0f, 220.0f)
                close()
                moveTo(226.83f, 120.66f)
                lineTo(119.34f, 13.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.0f)
                lineTo(70.25f, 56.6f)
                lineTo(42.82f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.66f)
                lineTo(64.6f, 62.26f)
                lineTo(17.86f, 109.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(84.85f, 84.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(95.83f, -95.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.83f, 120.66f)
                close()
                moveTo(125.34f, 216.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(23.51f, 131.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(70.25f, 67.92f)
                lineToRelative(34.2f, 34.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 141.0f, 133.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.86f, -36.51f)
                lineToRelative(-34.2f, -34.2f)
                lineToRelative(40.61f, -40.6f)
                lineTo(218.34f, 123.48f)
                close()
                moveTo(135.34f, 127.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -22.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 135.31f, 127.31f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
