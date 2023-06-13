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

public val RegularGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.41f, 80.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.05f, -11.12f)
                curveToRelative(10.4f, -7.18f, 26.68f, -7.18f, 37.08f, 0.0f)
                curveToRelative(5.0f, 3.47f, 13.88f, 3.47f, 18.92f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.08f, 13.16f)
                arcToRelative(34.64f, 34.64f, 0.0f, false, true, -37.08f, 0.0f)
                curveToRelative(-5.0f, -3.47f, -13.88f, -3.47f, -18.92f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 177.41f, 80.54f)
                close()
                moveTo(235.46f, 101.42f)
                curveToRelative(-5.0f, 3.47f, -13.88f, 3.47f, -18.92f, 0.0f)
                curveToRelative(-10.4f, -7.18f, -26.68f, -7.18f, -37.08f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.08f, 13.16f)
                curveToRelative(5.0f, -3.47f, 13.88f, -3.47f, 18.92f, 0.0f)
                arcToRelative(34.64f, 34.64f, 0.0f, false, false, 37.08f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.08f, -13.16f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -40.0f, -31.0f)
                lineTo(112.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(128.0f, 153.0f)
                arcTo(32.06f, 32.06f, 0.0f, false, true, 152.0f, 184.0f)
                close()
                moveTo(136.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 184.0f)
                close()
                moveTo(184.0f, 184.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 80.0f, 134.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(86.0f)
                arcTo(64.08f, 64.08f, 0.0f, false, true, 184.0f, 184.0f)
                close()
                moveTo(168.0f, 184.0f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, false, -20.58f, -39.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 138.0f)
                lineTo(144.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.42f, 6.56f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 168.0f, 184.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
