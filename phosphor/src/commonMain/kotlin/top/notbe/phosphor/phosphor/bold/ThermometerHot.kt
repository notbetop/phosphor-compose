package top.notbe.phosphor.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.BoldGroup

public val BoldGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.12f, 82.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.07f, -16.69f)
                curveToRelative(11.86f, -8.18f, 29.76f, -8.18f, 41.62f, 0.0f)
                curveToRelative(3.63f, 2.5f, 10.75f, 2.5f, 14.38f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.62f, 19.76f)
                arcToRelative(38.34f, 38.34f, 0.0f, false, true, -41.62f, 0.0f)
                curveToRelative(-3.63f, -2.5f, -10.75f, -2.5f, -14.38f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 174.12f, 82.81f)
                close()
                moveTo(233.19f, 106.12f)
                curveToRelative(-3.63f, 2.5f, -10.75f, 2.5f, -14.38f, 0.0f)
                curveToRelative(-11.86f, -8.18f, -29.76f, -8.18f, -41.62f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 13.62f, 19.76f)
                curveToRelative(3.63f, -2.5f, 10.75f, -2.5f, 14.38f, 0.0f)
                arcToRelative(38.34f, 38.34f, 0.0f, false, false, 41.62f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.62f, -19.76f)
                close()
                moveTo(160.0f, 150.69f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -104.0f, 0.0f)
                lineTo(56.0f, 56.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                close()
                moveTo(148.0f, 188.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -9.23f, -25.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.77f, -7.68f)
                lineTo(136.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(98.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.91f, 7.83f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 148.0f, 188.0f)
                close()
                moveTo(120.0f, 167.22f)
                lineTo(120.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(96.0f, 167.22f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
