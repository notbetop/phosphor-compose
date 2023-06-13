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

public val LightGroup.HandSwipeRight: ImageVector
    get() {
        if (_handSwipeRight != null) {
            return _handSwipeRight!!
        }
        _handSwipeRight = Builder(name = "HandSwipeRight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 140.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 25.13f, -8.28f, 42.0f, -8.64f, 42.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 192.0f, 222.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.68f, -0.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.68f, -8.0f)
                curveToRelative(0.07f, -0.14f, 7.37f, -15.19f, 7.37f, -37.32f)
                lineTo(194.01f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(154.01f, 124.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(114.01f, 68.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                lineTo(86.01f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.09f, 3.17f)
                lineToRelative(-18.68f, -30.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, -0.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.25f, 14.0f)
                lineToRelative(29.29f, 50.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 50.81f, 219.0f)
                lineTo(21.49f, 169.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 45.0f, -26.13f)
                lineTo(74.0f, 155.0f)
                lineTo(74.0f, 68.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(34.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 39.42f, 16.39f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 206.0f, 140.0f)
                close()
                moveTo(244.24f, 51.76f)
                lineTo(212.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(225.51f, 50.0f)
                lineTo(168.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(57.51f)
                lineTo(203.76f, 83.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(32.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.24f, 51.76f)
                close()
            }
        }
        .build()
        return _handSwipeRight!!
    }

private var _handSwipeRight: ImageVector? = null
