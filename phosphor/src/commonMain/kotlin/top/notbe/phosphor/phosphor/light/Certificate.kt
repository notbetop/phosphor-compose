package top.notbe.phosphor.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.LightGroup

public val LightGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -92.0f, 38.32f)
                lineTo(154.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, 5.37f)
                lineTo(192.0f, 214.71f)
                lineToRelative(29.32f, 14.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 230.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.15f, -0.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 224.0f)
                lineTo(230.0f, 166.32f)
                arcTo(53.83f, 53.83f, 0.0f, false, false, 246.0f, 128.0f)
                close()
                moveTo(150.0f, 128.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 150.0f, 128.0f)
                close()
                moveTo(218.0f, 214.29f)
                lineTo(194.68f, 202.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(166.0f, 214.29f)
                verticalLineToRelative(-39.0f)
                arcToRelative(53.87f, 53.87f, 0.0f, false, false, 52.0f, 0.0f)
                close()
                moveTo(134.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 192.0f)
                close()
                moveTo(118.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 118.0f, 136.0f)
                close()
                moveTo(118.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 118.0f, 104.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
