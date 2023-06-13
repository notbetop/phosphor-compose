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

public val BoldGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(75.9f, 88.52f)
                lineTo(39.23f, 127.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.56f, 19.43f)
                lineToRelative(54.44f, 20.41f)
                lineToRelative(-14.0f, 70.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.54f, 10.54f)
                lineToRelative(58.9f, -63.11f)
                lineToRelative(35.45f, 39.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(116.05f, 200.93f)
                lineTo(123.77f, 162.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.56f, -13.59f)
                lineTo(69.0f, 131.07f)
                lineToRelative(23.07f, -24.73f)
                lineToRelative(55.38f, 60.92f)
                close()
                moveTo(111.41f, 68.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.59f, -17.0f)
                lineTo(151.23f, 7.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.54f, 10.54f)
                lineToRelative(-14.0f, 70.0f)
                lineToRelative(54.44f, 20.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.56f, 19.43f)
                lineToRelative(-16.82f, 18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.55f, -16.37f)
                lineToRelative(4.58f, -4.91f)
                lineToRelative(-47.19f, -17.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.56f, -13.59f)
                lineTo(140.0f, 55.07f)
                lineTo(128.37f, 67.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.41f, 68.06f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
