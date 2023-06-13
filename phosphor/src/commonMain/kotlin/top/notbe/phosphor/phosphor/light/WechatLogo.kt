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

public val LightGroup.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) {
            return _wechatLogo!!
        }
        _wechatLogo = Builder(name = "WechatLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 187.13f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, -61.47f, -112.7f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -141.85f, 64.7f)
                lineTo(18.47f, 166.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 33.3f, 181.53f)
                lineToRelative(27.56f, -7.87f)
                arcToRelative(77.06f, 77.06f, 0.0f, false, false, 27.0f, 7.92f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 107.29f, 40.08f)
                lineToRelative(27.57f, 7.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.83f, -14.83f)
                close()
                moveTo(64.41f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.53f, -0.5f)
                lineTo(30.0f, 170.0f)
                lineToRelative(8.53f, -29.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.53f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 116.85f, -61.4f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, false, -71.0f, 94.68f)
                arcTo(64.87f, 64.87f, 0.0f, false, true, 64.41f, 162.0f)
                close()
                moveTo(217.46f, 188.16f)
                lineTo(226.0f, 218.0f)
                lineToRelative(-29.87f, -8.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.53f, 0.5f)
                arcTo(66.0f, 66.0f, 0.0f, true, true, 218.0f, 183.59f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 217.46f, 188.12f)
                close()
                moveTo(142.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 140.0f)
                close()
                moveTo(198.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 140.0f)
                close()
            }
        }
        .build()
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
