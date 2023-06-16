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

public val ThinGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.71f, 78.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, -5.56f)
                curveToRelative(9.12f, -6.3f, 23.42f, -6.3f, 32.54f, 0.0f)
                curveToRelative(6.36f, 4.38f, 17.1f, 4.38f, 23.46f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.54f, 6.58f)
                arcToRelative(30.4f, 30.4f, 0.0f, false, true, -32.54f, 0.0f)
                curveToRelative(-6.36f, -4.38f, -17.1f, -4.38f, -23.46f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.71f, 78.27f)
                close()
                moveTo(237.71f, 104.71f)
                curveToRelative(-6.36f, 4.38f, -17.1f, 4.38f, -23.46f, 0.0f)
                curveToRelative(-9.12f, -6.3f, -23.42f, -6.3f, -32.54f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.54f, 6.58f)
                curveToRelative(6.36f, -4.38f, 17.1f, -4.38f, 23.46f, 0.0f)
                arcToRelative(30.4f, 30.4f, 0.0f, false, false, 32.54f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.54f, -6.58f)
                close()
                moveTo(148.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -32.0f, -27.71f)
                lineTo(116.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(124.0f, 156.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 148.0f, 184.0f)
                close()
                moveTo(140.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 140.0f, 184.0f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -96.0f, -48.0f)
                lineTo(84.0f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, true, 180.0f, 184.0f)
                close()
                moveTo(172.0f, 184.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -22.29f, -42.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 138.0f)
                lineTo(148.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.71f, 3.28f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 172.0f, 184.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
