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

public val RegularGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 156.0f)
                close()
                moveTo(92.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 144.0f)
                close()
                moveTo(240.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 169.13f)
                arcTo(113.38f, 113.38f, 0.0f, false, true, 51.4f, 86.72f)
                lineTo(26.34f, 61.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 37.66f, 50.34f)
                lineTo(63.82f, 76.5f)
                arcToRelative(111.43f, 111.43f, 0.0f, false, true, 128.55f, -0.19f)
                lineToRelative(26.0f, -26.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(204.82f, 86.5f)
                curveToRelative(0.75f, 0.71f, 1.5f, 1.43f, 2.24f, 2.17f)
                arcTo(111.25f, 111.25f, 0.0f, false, true, 240.0f, 168.0f)
                close()
                moveTo(224.0f, 168.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, -96.0f, -96.0f)
                horizontalLineToRelative(-0.34f)
                curveTo(74.91f, 72.18f, 32.0f, 115.75f, 32.0f, 169.13f)
                lineTo(32.0f, 192.0f)
                lineTo(224.0f, 192.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
