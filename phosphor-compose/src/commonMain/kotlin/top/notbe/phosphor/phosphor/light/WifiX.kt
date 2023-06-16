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

public val LightGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 204.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 204.0f)
                close()
                moveTo(208.48f, 80.0f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(200.0f, 71.52f)
                lineTo(180.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(191.52f, 80.0f)
                lineTo(171.76f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(200.0f, 88.48f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(171.53f, 160.15f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -87.06f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.06f, 9.7f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 72.94f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.38f, -1.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 171.53f, 160.15f)
                close()
                moveTo(143.42f, 62.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 1.16f, -11.94f)
                curveToRelative(-5.47f, -0.53f, -11.05f, -0.8f, -16.58f, -0.8f)
                arcTo(170.32f, 170.32f, 0.0f, false, false, 20.19f, 88.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, 9.27f)
                arcTo(158.26f, 158.26f, 0.0f, false, true, 128.0f, 62.0f)
                curveTo(133.14f, 62.0f, 138.33f, 62.25f, 143.42f, 62.74f)
                close()
                moveTo(143.18f, 111.04f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.64f, -11.89f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 128.0f, 98.0f)
                arcToRelative(120.75f, 120.75f, 0.0f, false, false, -75.73f, 26.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 9.41f)
                arcTo(108.78f, 108.78f, 0.0f, false, true, 128.0f, 110.0f)
                arcTo(111.24f, 111.24f, 0.0f, false, true, 143.18f, 111.0f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
