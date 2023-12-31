package top.notbe.phosphor.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.FillGroup

public val FillGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.22f, 217.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.31f, 6.26f)
                lineTo(98.1f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.31f, -6.26f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 66.43f, 0.0f)
                close()
                moveTo(230.15f, 221.11f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, -6.43f, 2.89f)
                lineTo(184.56f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -2.65f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -105.59f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 71.45f, 224.0f)
                lineTo(32.23f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.42f, -2.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 25.75f, 211.0f)
                curveToRelative(0.06f, -0.07f, 7.64f, -9.78f, 15.12f, -28.72f)
                curveTo(47.77f, 164.8f, 56.0f, 135.64f, 56.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveToRelative(0.0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f)
                curveToRelative(7.48f, 18.94f, 15.06f, 28.65f, 15.13f, 28.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.15f, 221.11f)
                close()
                moveTo(88.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 108.0f)
                close()
                moveTo(167.16f, 140.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.73f, -3.58f)
                lineTo(128.0f, 151.06f)
                lineTo(99.58f, 136.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.15f, 14.32f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 167.16f, 140.42f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
