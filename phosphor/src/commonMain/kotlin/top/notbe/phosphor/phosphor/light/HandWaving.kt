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

public val LightGroup.HandWaving: ImageVector
    get() {
        if (_handWaving != null) {
            return _handWaving!!
        }
        _handWaving = Builder(name = "HandWaving", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.2f, 30.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.35f, -4.24f)
                curveToRelative(15.39f, 4.12f, 28.0f, 13.64f, 35.65f, 26.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.4f, 6.0f)
                curveToRelative(-6.0f, -10.38f, -16.06f, -17.91f, -28.35f, -21.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 186.2f, 30.45f)
                close()
                moveTo(78.34f, 227.29f)
                curveTo(68.75f, 219.73f, 60.76f, 210.11f, 53.2f, 197.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.4f, 6.0f)
                curveToRelative(8.36f, 14.47f, 17.29f, 25.18f, 28.11f, 33.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.43f, -9.42f)
                close()
                moveTo(227.06f, 166.29f)
                arcTo(86.12f, 86.12f, 0.0f, false, true, 144.13f, 230.0f)
                arcToRelative(86.71f, 86.71f, 0.0f, false, true, -22.4f, -3.0f)
                arcTo(85.45f, 85.45f, 0.0f, false, true, 69.51f, 187.0f)
                lineToRelative(-38.0f, -65.82f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 23.68f, -39.0f)
                lineToRelative(-5.0f, -8.73f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 91.92f, 43.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 45.9f, -1.67f)
                lineToRelative(17.05f, 29.52f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 45.59f, -1.0f)
                lineToRelative(18.0f, 31.18f)
                arcTo(85.45f, 85.45f, 0.0f, false, true, 227.06f, 166.25f)
                close()
                moveTo(208.06f, 107.03f)
                lineTo(190.06f, 75.85f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, -24.25f, 14.0f)
                lineToRelative(10.0f, 17.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.19f, 8.2f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -12.45f, 46.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                arcToRelative(46.08f, 46.08f, 0.0f, false, true, 11.84f, -59.5f)
                lineToRelative(-35.2f, -61.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.25f, 14.0f)
                lineToRelative(26.0f, 45.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                lineToRelative(-34.0f, -58.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, -24.25f, 14.0f)
                lineToRelative(38.0f, 65.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                lineToRelative(-22.0f, -38.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, -24.25f, 14.0f)
                lineTo(79.9f, 181.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 128.17f, -74.0f)
                close()
            }
        }
        .build()
        return _handWaving!!
    }

private var _handWaving: ImageVector? = null
