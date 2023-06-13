package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.5f, 114.38f)
                lineTo(229.27f, 119.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.52f, -12.0f)
                lineToRelative(5.23f, -4.57f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.07f)
                lineToRelative(-8.67f, -0.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 1.37f, -16.0f)
                lineToRelative(8.7f, 0.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.11f, 28.07f)
                close()
                moveTo(173.8f, 157.38f)
                lineTo(176.66f, 169.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.59f, -3.6f)
                lineToRelative(-2.85f, -12.47f)
                lineToRelative(7.86f, -6.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.52f, -12.06f)
                lineToRelative(-7.86f, 6.87f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 173.8f, 157.4f)
                close()
                moveTo(136.0f, 51.15f)
                lineTo(136.0f, 184.81f)
                lineToRelative(0.27f, 0.15f)
                lineToRelative(11.88f, 7.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.3f, 13.68f)
                lineTo(128.0f, 198.64f)
                lineToRelative(-51.0f, 31.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -23.84f, -17.34f)
                lineTo(66.61f, 153.8f)
                lineTo(21.5f, 114.38f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.11f, -28.07f)
                lineToRelative(59.46f, -5.14f)
                lineToRelative(23.21f, -55.36f)
                arcToRelative(15.95f, 15.95f, 0.0f, false, true, 29.44f, 0.0f)
                lineTo(166.0f, 81.17f)
                lineToRelative(10.74f, 0.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.38f, 16.0f)
                lineToRelative(-10.76f, -0.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.35f, -9.75f)
                close()
                moveTo(119.73f, 185.0f)
                lineToRelative(0.27f, -0.15f)
                lineTo(120.0f, 51.15f)
                lineTo(104.8f, 87.37f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.35f, 9.75f)
                lineTo(32.0f, 102.25f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.0f, 0.1f)
                lineToRelative(45.13f, 39.34f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 82.2f, 157.4f)
                lineTo(68.68f, 215.94f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(199.64f, 198.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.59f, 3.61f)
                lineToRelative(3.3f, 14.14f)
                verticalLineToRelative(0.0f)
                lineToRelative(-11.19f, -6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.31f, 13.68f)
                lineToRelative(11.23f, 6.82f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.84f, -17.34f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
