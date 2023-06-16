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

public val BoldGroup.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) {
            return _wechatLogo!!
        }
        _wechatLogo = Builder(name = "WechatLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.06f, 187.69f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 172.33f, 68.91f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 19.94f, 139.69f)
                lineTo(12.7f, 165.05f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 30.0f, 188.0f)
                arcTo(17.8f, 17.8f, 0.0f, false, false, 35.0f, 187.3f)
                lineToRelative(25.35f, -7.24f)
                arcToRelative(82.4f, 82.4f, 0.0f, false, false, 23.42f, 7.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 112.0f, 41.0f)
                lineToRelative(25.36f, 7.24f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 22.25f, -22.25f)
                close()
                moveTo(67.28f, 156.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.05f, -1.0f)
                lineToRelative(-19.49f, 5.57f)
                lineToRelative(5.57f, -19.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -9.05f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 145.0f, 69.37f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -68.55f, 91.39f)
                arcTo(60.34f, 60.34f, 0.0f, false, true, 67.28f, 156.7f)
                close()
                moveTo(211.69f, 189.76f)
                lineTo(217.26f, 209.25f)
                lineTo(197.77f, 203.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.05f, 1.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 211.69f, 189.77f)
                close()
                moveTo(152.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 144.0f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 144.0f)
                close()
            }
        }
        .build()
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
