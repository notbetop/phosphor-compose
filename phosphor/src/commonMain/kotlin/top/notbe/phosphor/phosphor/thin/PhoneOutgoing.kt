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

public val ThinGroup.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) {
            return _phoneOutgoing!!
        }
        _phoneOutgoing = Builder(name = "PhoneOutgoing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.17f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(198.34f, 52.0f)
                lineTo(168.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 57.66f)
                lineTo(162.83f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                close()
                moveTo(227.91f, 174.58f)
                arcTo(52.25f, 52.25f, 0.0f, false, true, 176.0f, 220.0f)
                curveTo(98.8f, 220.0f, 36.0f, 157.2f, 36.0f, 80.0f)
                arcTo(52.25f, 52.25f, 0.0f, false, true, 81.42f, 28.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 93.9f, 35.28f)
                lineTo(115.0f, 82.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.0f, 11.36f)
                curveToRelative(-0.09f, 0.13f, -0.18f, 0.26f, -0.28f, 0.38f)
                lineToRelative(-21.2f, 25.21f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.18f, 3.69f)
                curveToRelative(7.84f, 16.05f, 24.65f, 32.73f, 40.89f, 40.57f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, -0.21f)
                lineTo(161.8f, 142.3f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, true, 0.38f, -0.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 173.56f, 141.0f)
                lineToRelative(47.22f, 21.16f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.91f, 174.58f)
                close()
                moveTo(217.56f, 169.46f)
                lineTo(170.35f, 148.3f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.57f, 0.27f)
                lineTo(142.0f, 169.69f)
                lineToRelative(-0.37f, 0.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.79f, 0.87f)
                curveToRelative(-18.0f, -8.69f, -35.91f, -26.48f, -44.6f, -44.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 86.0f, 114.82f)
                curveToRelative(0.09f, -0.14f, 0.19f, -0.26f, 0.29f, -0.39f)
                lineToRelative(21.19f, -25.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.23f, -3.6f)
                lineTo(86.57f, 38.49f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 82.9f, 36.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -0.48f, 0.0f)
                arcTo(44.23f, 44.23f, 0.0f, false, false, 44.0f, 80.0f)
                curveToRelative(0.0f, 72.78f, 59.22f, 132.0f, 132.0f, 132.0f)
                arcToRelative(44.23f, 44.23f, 0.0f, false, false, 44.0f, -38.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 217.56f, 169.46f)
                close()
            }
        }
        .build()
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
