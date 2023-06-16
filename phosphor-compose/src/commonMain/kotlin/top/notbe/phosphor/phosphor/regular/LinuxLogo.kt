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

public val RegularGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 222.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 217.76f, 221.0f)
                curveTo(216.39f, 219.27f, 184.0f, 177.86f, 184.0f, 96.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 72.0f, 96.0f)
                curveToRelative(0.0f, 81.86f, -32.37f, 123.27f, -33.75f, 125.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.51f, -10.0f)
                curveToRelative(0.15f, -0.2f, 7.69f, -9.9f, 15.13f, -28.74f)
                curveTo(47.77f, 164.8f, 56.0f, 135.64f, 56.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveToRelative(0.0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f)
                curveToRelative(7.48f, 18.94f, 15.06f, 28.64f, 15.14f, 28.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.0f, 222.25f)
                close()
                moveTo(100.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 96.0f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
                moveTo(99.58f, 136.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.15f, 14.31f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 7.15f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, -14.31f)
                lineTo(128.0f, 151.05f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(54.07f, 54.07f, 0.0f, false, false, -47.0f, 28.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.78f)
                arcToRelative(37.35f, 37.35f, 0.0f, false, true, 66.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.0f, -7.78f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
