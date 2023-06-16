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

public val FillGroup.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                lineTo(158.0f, 149.12f)
                lineTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(58.82f, 63.8f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 120.0f, 183.6f)
                lineTo(120.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(197.19f, 216.0f)
                lineToRelative(4.89f, 5.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(80.0f, 104.0f)
                arcToRelative(48.19f, 48.19f, 0.0f, false, true, 2.24f, -14.44f)
                lineTo(96.0f, 104.71f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 28.23f, 31.06f)
                lineTo(138.0f, 150.94f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 80.0f, 104.0f)
                close()
                moveTo(136.0f, 200.0f)
                lineTo(136.0f, 183.59f)
                arcToRelative(79.91f, 79.91f, 0.0f, false, false, 25.44f, -6.91f)
                lineTo(182.64f, 200.0f)
                close()
                moveTo(86.56f, 46.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.0f, -12.34f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 105.0f, 115.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.05f, 3.39f)
                lineToRelative(-0.5f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.92f, -2.62f)
                lineTo(170.0f, 138.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.92f, -9.54f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -61.95f, -68.14f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 97.67f, 59.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(35.18f, 35.18f, 0.0f, false, true, -0.19f, 3.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.88f, 4.5f)
                lineTo(121.69f, 85.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 127.49f, 72.0f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
