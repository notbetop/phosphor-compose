package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) {
            return _plugsConnected!!
        }
        _plugsConnected = Builder(name = "PlugsConnected", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(185.0f, 127.0f)
                lineTo(127.0f, 185.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -33.94f, 0.0f)
                lineTo(71.0f, 162.91f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 71.0f, 129.0f)
                lineTo(129.0f, 71.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 33.94f, 0.0f)
                lineTo(185.0f, 93.09f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 185.0f, 127.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-52.4f, 52.41f)
                lineToRelative(-5.37f, -5.38f)
                arcToRelative(32.05f, 32.05f, 0.0f, false, false, -45.26f, 0.0f)
                lineTo(100.0f, 88.69f)
                lineToRelative(-6.34f, -6.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 82.34f, 93.66f)
                lineTo(88.69f, 100.0f)
                lineTo(65.37f, 123.31f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 45.26f)
                lineToRelative(5.38f, 5.37f)
                lineToRelative(-52.41f, 52.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(52.4f, -52.41f)
                lineToRelative(5.37f, 5.38f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 45.26f, 0.0f)
                lineTo(156.0f, 167.31f)
                lineToRelative(6.34f, 6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(167.31f, 156.0f)
                lineToRelative(23.32f, -23.31f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -45.26f)
                lineToRelative(-5.38f, -5.37f)
                lineToRelative(52.41f, -52.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 18.34f)
                close()
                moveTo(121.37f, 179.34f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineTo(76.69f, 157.25f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.62f)
                lineTo(100.0f, 111.31f)
                lineTo(144.69f, 156.0f)
                close()
                moveTo(179.31f, 121.4f)
                horizontalLineToRelative(0.0f)
                lineTo(156.0f, 144.69f)
                lineTo(111.31f, 100.0f)
                lineToRelative(23.32f, -23.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 0.0f)
                lineToRelative(22.06f, 22.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.63f)
                close()
                moveTo(88.41f, 34.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, -5.06f)
                lineToRelative(8.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.06f)
                close()
                moveTo(24.41f, 93.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.12f, -5.06f)
                lineToRelative(24.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.06f, 15.18f)
                lineToRelative(-24.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.41f, 93.47f)
                close()
                moveTo(231.59f, 162.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.12f, 5.06f)
                lineToRelative(-24.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.06f, -15.18f)
                lineToRelative(24.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 231.59f, 162.53f)
                close()
                moveTo(167.59f, 221.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.06f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, -5.06f)
                close()
            }
        }
        .build()
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
