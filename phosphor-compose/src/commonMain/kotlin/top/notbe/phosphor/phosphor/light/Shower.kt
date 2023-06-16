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

public val LightGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.0f, 236.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 62.0f, 236.0f)
                close()
                moveTo(84.0f, 194.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 84.0f, 194.0f)
                close()
                moveTo(20.0f, 194.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 20.0f, 194.0f)
                close()
                moveTo(52.0f, 162.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 52.0f, 162.0f)
                close()
                moveTo(254.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(219.31f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.41f, 0.59f)
                lineToRelative(-28.31f, 28.3f)
                lineTo(167.83f, 202.32f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -23.71f, 7.57f)
                lineToRelative(-98.0f, -98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 7.6f, -23.71f)
                lineToRelative(127.4f, -21.76f)
                lineToRelative(28.3f, -28.31f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, 9.9f, -4.1f)
                lineTo(248.0f, 34.01f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 40.0f)
                close()
                moveTo(176.66f, 79.34f)
                lineTo(55.7f, 100.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.11f, 3.39f)
                lineToRelative(98.0f, 98.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.39f, -1.09f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
