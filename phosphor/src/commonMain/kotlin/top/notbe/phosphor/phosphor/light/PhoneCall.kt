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

public val LightGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.2f, 38.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.35f, -4.25f)
                arcTo(84.24f, 84.24f, 0.0f, false, true, 221.8f, 94.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.25f, 7.35f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, true, -1.55f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.45f)
                arcTo(72.34f, 72.34f, 0.0f, false, false, 158.45f, 45.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.2f, 38.45f)
                close()
                moveTo(150.45f, 77.8f)
                curveTo(165.0f, 81.68f, 174.32f, 91.0f, 178.2f, 105.55f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 110.0f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, false, 1.55f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.25f, -7.35f)
                curveToRelative(-5.0f, -18.71f, -17.54f, -31.25f, -36.25f, -36.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.1f, 11.6f)
                close()
                moveTo(229.89f, 174.8f)
                arcTo(54.25f, 54.25f, 0.0f, false, true, 176.0f, 222.0f)
                curveTo(97.7f, 222.0f, 34.0f, 158.3f, 34.0f, 80.0f)
                arcTo(54.25f, 54.25f, 0.0f, false, true, 81.17f, 26.11f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 95.73f, 34.5f)
                lineToRelative(21.1f, 47.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -1.12f, 13.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.42f, 0.57f)
                lineTo(94.22f, 120.51f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 0.0f, 1.67f)
                curveToRelative(7.66f, 15.68f, 24.1f, 32.0f, 40.0f, 39.65f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, false, 1.68f, -0.06f)
                lineToRelative(24.69f, -21.0f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, true, 0.56f, -0.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 13.28f, -1.22f)
                lineToRelative(47.24f, 21.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 229.89f, 174.83f)
                close()
                moveTo(218.0f, 173.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.21f, -2.0f)
                lineToRelative(-47.25f, -21.17f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, -1.6f, 0.1f)
                lineToRelative(-24.68f, 21.0f)
                curveToRelative(-0.18f, 0.15f, -0.37f, 0.29f, -0.56f, 0.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.77f, 1.0f)
                curveToRelative(-18.36f, -8.87f, -36.66f, -27.0f, -45.53f, -45.19f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.91f, -13.73f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.43f, -0.57f)
                lineToRelative(21.06f, -25.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -1.67f)
                lineTo(84.74f, 39.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 82.9f, 38.0f)
                horizontalLineToRelative(-0.23f)
                arcTo(42.24f, 42.24f, 0.0f, false, false, 46.0f, 80.0f)
                curveToRelative(0.0f, 71.68f, 58.32f, 130.0f, 130.0f, 130.0f)
                arcTo(42.24f, 42.24f, 0.0f, false, false, 218.0f, 173.32f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
