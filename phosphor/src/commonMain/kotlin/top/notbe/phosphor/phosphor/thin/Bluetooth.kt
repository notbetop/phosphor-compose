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

public val ThinGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.4f, 172.8f)
                lineTo(126.67f, 128.0f)
                lineTo(186.4f, 83.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 32.0f)
                verticalLineToRelative(88.0f)
                lineTo(58.4f, 76.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 6.4f)
                lineTo(113.33f, 128.0f)
                lineTo(53.6f, 172.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, 6.4f)
                lineTo(116.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, 3.2f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(124.0f, 40.0f)
                lineToRelative(53.33f, 40.0f)
                lineTo(124.0f, 120.0f)
                close()
                moveTo(124.0f, 216.0f)
                lineTo(124.0f, 136.0f)
                lineToRelative(53.33f, 40.0f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
