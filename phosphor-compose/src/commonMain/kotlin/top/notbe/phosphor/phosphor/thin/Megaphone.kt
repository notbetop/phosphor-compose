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

public val ThinGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 76.0f)
                lineTo(152.1f, 76.0f)
                curveToRelative(-2.19f, -0.11f, -54.55f, -3.38f, -104.38f, -45.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 6.92f, 10.87f)
                arcTo(12.18f, 12.18f, 0.0f, false, false, 40.0f, 212.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.69f, -2.83f)
                curveToRelative(42.46f, -35.62f, 86.76f, -43.25f, 100.28f, -44.8f)
                verticalLineToRelative(36.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.34f, 10.0f)
                lineToRelative(11.0f, 7.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.28f, -7.0f)
                lineToRelative(12.49f, -47.09f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 192.0f, 76.0f)
                close()
                moveTo(148.0f, 156.3f)
                curveToRelative(-13.53f, 1.35f, -60.0f, 8.62f, -105.42f, 46.75f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 200.0f)
                lineTo(36.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.3f, -3.62f)
                arcTo(4.32f, 4.32f, 0.0f, false, true, 40.05f, 36.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 2.53f, 1.0f)
                curveTo(88.0f, 75.09f, 134.47f, 82.36f, 148.0f, 83.71f)
                close()
                moveTo(174.87f, 209.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.1f, 2.36f)
                lineToRelative(-11.0f, -7.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, -3.33f)
                lineTo(155.99f, 164.0f)
                horizontalLineToRelative(30.8f)
                close()
                moveTo(192.0f, 156.0f)
                lineTo(156.0f, 156.0f)
                lineTo(156.0f, 84.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
