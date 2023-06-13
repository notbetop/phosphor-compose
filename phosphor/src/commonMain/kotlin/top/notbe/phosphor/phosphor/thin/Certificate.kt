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

public val ThinGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -88.0f, 37.47f)
                lineTo(156.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.79f, 3.58f)
                lineTo(192.0f, 212.47f)
                lineToRelative(30.21f, 15.11f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 224.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 165.47f)
                arcTo(51.85f, 51.85f, 0.0f, false, false, 244.0f, 128.0f)
                close()
                moveTo(148.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 148.0f, 128.0f)
                close()
                moveTo(220.0f, 217.53f)
                lineTo(193.79f, 204.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(164.0f, 217.53f)
                lineTo(164.0f, 171.78f)
                arcToRelative(51.8f, 51.8f, 0.0f, false, false, 56.0f, 0.0f)
                close()
                moveTo(132.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 132.0f, 192.0f)
                close()
                moveTo(116.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 136.0f)
                close()
                moveTo(116.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 104.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
