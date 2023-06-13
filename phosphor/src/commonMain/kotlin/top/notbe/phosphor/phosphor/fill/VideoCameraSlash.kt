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

public val FillGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(182.64f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f)
                lineTo(51.73f, 56.0f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(251.77f, 73.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.21f, 0.39f)
                lineToRelative(-32.0f, 21.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.56f, 6.65f)
                verticalLineToRelative(53.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.56f, 6.65f)
                lineToRelative(32.0f, 21.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(256.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 251.77f, 73.0f)
                close()
                moveTo(178.08f, 147.46f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 142.0f)
                lineTo(192.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(113.06f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.92f, 13.38f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
