package top.notbe.phosphor.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.RegularGroup

public val RegularGroup.WechatLogo: ImageVector
    get() {
        if (_wechatLogo != null) {
            return _wechatLogo!!
        }
        _wechatLogo = Builder(name = "WechatLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.79f, 187.33f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.58f, 72.59f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 24.21f, 139.33f)
                lineToRelative(-7.66f, 26.82f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 30.0f, 184.0f)
                arcToRelative(13.65f, 13.65f, 0.0f, false, false, 3.84f, -0.54f)
                lineToRelative(26.82f, -7.66f)
                arcToRelative(78.86f, 78.86f, 0.0f, false, false, 25.77f, 7.63f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.89f, 40.37f)
                lineToRelative(26.82f, 7.66f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.3f, -17.3f)
                close()
                moveTo(65.36f, 160.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -0.68f)
                lineToRelative(-26.41f, 7.55f)
                lineToRelative(7.55f, -26.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.68f, -6.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 151.68f, 72.43f)
                arcTo(80.12f, 80.12f, 0.0f, false, false, 80.0f, 152.0f)
                arcToRelative(79.31f, 79.31f, 0.0f, false, false, 1.31f, 14.3f)
                arcTo(63.34f, 63.34f, 0.0f, false, true, 65.36f, 160.21f)
                close()
                moveTo(215.53f, 188.67f)
                lineTo(223.08f, 215.08f)
                lineTo(196.67f, 207.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 0.68f)
                arcToRelative(63.95f, 63.95f, 0.0f, true, true, 25.57f, -25.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.53f, 188.67f)
                close()
                moveTo(144.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 140.0f)
                close()
                moveTo(200.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 140.0f)
                close()
            }
        }
        .build()
        return _wechatLogo!!
    }

private var _wechatLogo: ImageVector? = null
