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

public val BoldGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.5f, 156.53f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, -48.69f, 35.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f)
                curveTo(52.54f, 184.69f, 79.11f, 172.0f, 108.0f, 172.0f)
                curveToRelative(37.0f, 0.0f, 61.12f, 19.42f, 74.81f, 35.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f)
                arcTo(124.0f, 124.0f, 0.0f, false, false, 152.5f, 156.53f)
                close()
                moveTo(60.0f, 100.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 60.0f, 100.0f)
                close()
                moveTo(242.73f, 141.23f)
                lineTo(239.42f, 142.31f)
                lineTo(241.42f, 145.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, 14.1f)
                lineTo(220.0f, 156.41f)
                lineTo(218.0f, 159.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, -14.1f)
                lineToRelative(2.0f, -2.82f)
                lineToRelative(-3.31f, -1.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.42f, -22.82f)
                lineToRelative(3.31f, 1.07f)
                lineTo(208.01f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(3.48f)
                lineToRelative(3.31f, -1.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.42f, 22.82f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
