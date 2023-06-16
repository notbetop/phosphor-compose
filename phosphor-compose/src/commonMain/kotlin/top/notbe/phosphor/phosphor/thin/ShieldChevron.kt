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

public val ThinGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.77f)
                curveToRelative(0.0f, 86.87f, 73.54f, 115.7f, 88.28f, 120.6f)
                arcToRelative(11.65f, 11.65f, 0.0f, false, false, 7.44f, 0.0f)
                curveToRelative(14.74f, -4.9f, 88.28f, -33.73f, 88.28f, -120.6f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(129.2f, 227.79f)
                arcToRelative(3.53f, 3.53f, 0.0f, false, true, -2.4f, 0.0f)
                curveToRelative(-9.75f, -3.24f, -47.0f, -17.66f, -68.0f, -54.45f)
                lineTo(128.0f, 124.88f)
                lineToRelative(69.23f, 48.46f)
                curveTo(176.16f, 210.13f, 139.0f, 224.55f, 129.2f, 227.79f)
                close()
                moveTo(212.0f, 114.79f)
                curveToRelative(0.0f, 20.38f, -4.33f, 37.35f, -11.0f, 51.41f)
                lineToRelative(-70.68f, -49.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f)
                lineTo(55.0f, 166.2f)
                curveToRelative(-6.7f, -14.06f, -11.0f, -31.0f, -11.0f, -51.41f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
