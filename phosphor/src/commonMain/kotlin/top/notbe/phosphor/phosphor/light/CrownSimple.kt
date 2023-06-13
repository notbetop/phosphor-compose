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

public val LightGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.52f, 77.7f)
                arcToRelative(10.07f, 10.07f, 0.0f, false, false, -11.12f, -1.42f)
                lineToRelative(-51.87f, 25.86f)
                lineTo(136.66f, 30.89f)
                arcToRelative(10.11f, 10.11f, 0.0f, false, false, -17.32f, 0.0f)
                lineTo(76.47f, 102.14f)
                lineTo(24.62f, 76.29f)
                arcTo(10.1f, 10.1f, 0.0f, false, false, 10.52f, 88.5f)
                lineToRelative(37.0f, 113.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.77f, 3.3f)
                curveToRelative(0.07f, 0.0f, 6.56f, -3.84f, 18.6f, -7.58f)
                curveTo(86.0f, 194.12f, 104.21f, 190.0f, 128.0f, 190.0f)
                reflectiveCurveToRelative(42.0f, 4.12f, 53.12f, 7.58f)
                curveToRelative(12.0f, 3.74f, 18.53f, 7.54f, 18.58f, 7.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.78f, -3.29f)
                lineToRelative(37.0f, -113.34f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 242.52f, 77.7f)
                close()
                moveTo(199.23f, 191.53f)
                curveToRelative(-11.0f, -4.92f, -35.4f, -13.53f, -71.23f, -13.53f)
                reflectiveCurveToRelative(-60.23f, 8.61f, -71.23f, 13.53f)
                lineTo(23.32f, 89.05f)
                lineToRelative(49.35f, 24.6f)
                arcToRelative(10.17f, 10.17f, 0.0f, false, false, 13.18f, -3.83f)
                lineToRelative(42.15f, -70.0f)
                lineToRelative(42.15f, 70.05f)
                arcToRelative(10.17f, 10.17f, 0.0f, false, false, 13.17f, 3.83f)
                lineToRelative(49.36f, -24.61f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
