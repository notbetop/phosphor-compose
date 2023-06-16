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

public val LightGroup.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) {
            return _plugsConnected!!
        }
        _plugsConnected = Builder(name = "PlugsConnected", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(173.94f, 73.57f)
                lineToRelative(-6.79f, -6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f)
                lineTo(100.0f, 91.51f)
                lineToRelative(-7.76f, -7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(91.51f, 100.0f)
                lineTo(66.79f, 124.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.42f)
                lineToRelative(6.78f, 6.79f)
                lineTo(19.76f, 227.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(53.82f, -53.81f)
                lineToRelative(6.79f, 6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.42f, 0.0f)
                lineTo(156.0f, 164.49f)
                lineToRelative(7.76f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(164.49f, 156.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.42f)
                lineToRelative(-6.78f, -6.79f)
                lineToRelative(53.81f, -53.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 19.76f)
                close()
                moveTo(122.79f, 180.76f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.46f, 0.0f)
                lineTo(75.27f, 158.67f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.46f)
                lineTo(100.0f, 108.49f)
                lineTo(147.51f, 156.0f)
                close()
                moveTo(180.73f, 122.82f)
                lineTo(156.0f, 147.51f)
                lineTo(108.49f, 100.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.46f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 25.46f)
                close()
                moveTo(90.31f, 33.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.38f, -3.8f)
                lineToRelative(8.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.38f, 3.8f)
                close()
                moveTo(26.31f, 94.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.59f, -3.79f)
                lineToRelative(24.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.8f, 11.38f)
                lineToRelative(-24.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.31f, 94.1f)
                close()
                moveTo(229.69f, 161.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.59f, 3.79f)
                lineToRelative(-24.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.8f, -11.38f)
                lineToRelative(24.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 229.69f, 161.9f)
                close()
                moveTo(165.69f, 222.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.38f, 3.8f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.38f, -3.8f)
                close()
            }
        }
        .build()
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
