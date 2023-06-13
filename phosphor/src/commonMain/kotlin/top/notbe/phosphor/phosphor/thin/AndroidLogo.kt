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

public val ThinGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 156.0f)
                close()
                moveTo(92.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 148.0f)
                close()
                moveTo(236.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 169.13f)
                arcTo(109.43f, 109.43f, 0.0f, false, true, 57.18f, 86.84f)
                lineToRelative(-28.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(63.41f, 81.75f)
                arcTo(106.63f, 106.63f, 0.0f, false, true, 127.62f, 60.0f)
                lineTo(128.0f, 60.0f)
                arcToRelative(107.16f, 107.16f, 0.0f, false, true, 64.78f, 21.57f)
                lineToRelative(28.39f, -28.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(199.0f, 86.64f)
                curveToRelative(1.78f, 1.56f, 3.52f, 3.17f, 5.21f, 4.86f)
                arcTo(107.25f, 107.25f, 0.0f, false, true, 236.0f, 168.0f)
                close()
                moveTo(228.0f, 168.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 68.0f)
                horizontalLineToRelative(-0.35f)
                curveTo(72.7f, 68.19f, 28.0f, 113.56f, 28.0f, 169.13f)
                lineTo(28.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
