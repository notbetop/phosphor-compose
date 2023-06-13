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

public val BoldGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -92.0f, 33.19f)
                lineTo(156.0f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 174.0f, 230.42f)
                lineTo(196.0f, 217.82f)
                lineToRelative(22.05f, 12.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 220.0f)
                lineTo(236.0f, 161.19f)
                arcTo(51.77f, 51.77f, 0.0f, false, false, 248.0f, 128.0f)
                close()
                moveTo(196.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 196.0f, 100.0f)
                close()
                moveTo(202.0f, 193.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.9f, 0.0f)
                lineTo(180.0f, 199.32f)
                lineTo(180.0f, 177.47f)
                arcToRelative(51.86f, 51.86f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineToRelative(21.85f)
                close()
                moveTo(140.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.32f, 4.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 180.0f)
                horizontalLineToRelative(84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 192.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(76.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 140.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(76.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 100.0f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
