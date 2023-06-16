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

public val LightGroup.Van: ImageVector
    get() {
        if (_van != null) {
            return _van!!
        }
        _van = Builder(name = "Van", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.55f, 116.09f)
                lineTo(207.0f, 63.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -10.74f, -5.0f)
                lineTo(32.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 72.0f)
                lineTo(18.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(50.6f, 198.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                horizontalLineToRelative(53.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                lineTo(240.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(254.0f, 120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 252.55f, 116.09f)
                close()
                moveTo(197.85f, 70.77f)
                lineTo(234.94f, 114.0f)
                lineTo(174.0f, 114.0f)
                lineTo(174.0f, 70.0f)
                horizontalLineToRelative(22.26f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 197.85f, 70.77f)
                close()
                moveTo(102.0f, 114.0f)
                lineTo(102.0f, 70.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(44.0f)
                close()
                moveTo(32.0f, 70.0f)
                lineTo(90.0f, 70.0f)
                verticalLineToRelative(44.0f)
                lineTo(30.0f, 114.0f)
                lineTo(30.0f, 72.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 70.0f)
                close()
                moveTo(80.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 80.0f, 210.0f)
                close()
                moveTo(192.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 210.0f)
                close()
                moveTo(240.0f, 186.0f)
                lineTo(221.4f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(109.4f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(32.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 126.0f)
                lineTo(242.0f, 126.0f)
                verticalLineToRelative(58.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 240.0f, 186.0f)
                close()
            }
        }
        .build()
        return _van!!
    }

private var _van: ImageVector? = null
