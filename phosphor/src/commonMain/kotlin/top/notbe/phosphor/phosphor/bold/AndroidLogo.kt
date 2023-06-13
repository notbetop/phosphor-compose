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

public val BoldGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 156.0f)
                close()
                moveTo(92.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 140.0f)
                close()
                moveTo(244.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 169.13f)
                arcTo(117.35f, 117.35f, 0.0f, false, true, 45.72f, 86.69f)
                lineTo(23.51f, 64.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(64.3f, 71.33f)
                arcTo(114.35f, 114.35f, 0.0f, false, true, 127.59f, 52.0f)
                lineTo(128.0f, 52.0f)
                arcToRelative(115.15f, 115.15f, 0.0f, false, true, 63.89f, 19.14f)
                lineToRelative(23.62f, -23.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-22.0f, 22.0f)
                arcTo(115.18f, 115.18f, 0.0f, false, true, 244.0f, 168.0f)
                close()
                moveTo(220.0f, 168.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -92.33f, -92.0f)
                curveTo(77.12f, 76.18f, 36.0f, 118.0f, 36.0f, 169.13f)
                lineTo(36.0f, 188.0f)
                lineTo(220.0f, 188.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
