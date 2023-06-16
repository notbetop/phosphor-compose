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

public val BoldGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.43f, 227.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 236.0f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, true, -3.64f, -0.57f)
                lineTo(128.0f, 208.59f)
                lineTo(43.64f, 235.43f)
                arcTo(11.86f, 11.86f, 0.0f, false, true, 40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.64f, -23.44f)
                lineTo(88.42f, 196.0f)
                lineTo(36.36f, 179.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.28f, -22.87f)
                lineTo(128.0f, 183.4f)
                lineToRelative(84.36f, -26.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.28f, 22.87f)
                lineTo(167.58f, 196.0f)
                lineToRelative(52.06f, 16.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.43f, 227.63f)
                close()
                moveTo(64.0f, 108.0f)
                curveToRelative(0.0f, -50.13f, 55.35f, -84.77f, 57.71f, -86.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.58f, 0.0f)
                curveTo(136.65f, 23.23f, 192.0f, 57.87f, 192.0f, 108.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                curveToRelative(0.0f, -10.26f, -6.64f, -19.0f, -12.0f, -24.32f)
                curveToRelative(-5.36f, 5.35f, -12.0f, 14.06f, -12.0f, 24.32f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(88.0f, 108.0f)
                arcToRelative(39.74f, 39.74f, 0.0f, false, false, 4.85f, 19.07f)
                curveToRelative(4.67f, -24.88f, 27.42f, -40.34f, 28.49f, -41.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.32f, 0.0f)
                curveToRelative(1.07f, 0.72f, 23.82f, 16.18f, 28.49f, 41.06f)
                arcTo(39.74f, 39.74f, 0.0f, false, false, 168.0f, 108.0f)
                curveToRelative(0.0f, -10.34f, -3.93f, -26.74f, -22.64f, -46.18f)
                arcTo(142.75f, 142.75f, 0.0f, false, false, 128.0f, 46.6f)
                curveTo(115.36f, 56.0f, 88.0f, 79.67f, 88.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
