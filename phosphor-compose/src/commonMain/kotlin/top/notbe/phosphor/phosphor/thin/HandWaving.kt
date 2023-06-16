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

public val ThinGroup.HandWaving: ImageVector
    get() {
        if (_handWaving != null) {
            return _handWaving!!
        }
        _handWaving = Builder(name = "HandWaving", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.14f, 31.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.9f, -2.83f)
                curveToRelative(14.87f, 4.0f, 27.1f, 13.17f, 34.42f, 25.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.92f, 4.0f)
                curveTo(214.28f, 47.16f, 203.77f, 39.3f, 191.0f, 35.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.14f, 31.0f)
                close()
                moveTo(77.1f, 228.86f)
                curveToRelative(-9.79f, -7.72f, -17.94f, -17.53f, -25.64f, -30.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.92f, 4.0f)
                curveToRelative(8.22f, 14.24f, 17.0f, 24.77f, 27.61f, 33.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.47f, 0.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.48f, -7.14f)
                close()
                moveTo(225.1f, 165.73f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, -81.0f, 62.29f)
                arcToRelative(84.37f, 84.37f, 0.0f, false, true, -21.87f, -2.9f)
                arcToRelative(83.41f, 83.41f, 0.0f, false, true, -51.0f, -39.13f)
                lineToRelative(-38.0f, -65.82f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 25.7f, -35.49f)
                lineTo(51.88f, 72.46f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 92.48f, 47.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 43.61f, -4.64f)
                lineToRelative(19.08f, 33.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 43.56f, -4.54f)
                lineToRelative(18.0f, 31.18f)
                arcTo(83.43f, 83.43f, 0.0f, false, true, 225.12f, 165.73f)
                close()
                moveTo(209.8f, 106.0f)
                lineToRelative(-18.0f, -31.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.71f, 16.0f)
                lineToRelative(10.0f, 17.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.47f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -13.18f, 49.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.93f, 4.0f)
                arcToRelative(44.07f, 44.07f, 0.0f, false, true, 12.73f, -58.0f)
                lineTo(129.16f, 46.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.71f, 16.0f)
                lineToRelative(26.0f, 45.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.93f, 4.0f)
                lineToRelative(-34.0f, -58.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.71f, 16.0f)
                lineToRelative(38.0f, 65.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.93f, 4.0f)
                lineToRelative(-22.0f, -38.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.71f, 16.0f)
                lineToRelative(38.0f, 65.82f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 209.8f, 106.0f)
                close()
            }
        }
        .build()
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
