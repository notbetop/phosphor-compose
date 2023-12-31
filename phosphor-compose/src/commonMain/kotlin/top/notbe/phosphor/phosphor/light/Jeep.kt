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

public val LightGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 98.0f)
                lineTo(228.85f, 98.0f)
                lineToRelative(-9.63f, -44.93f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 205.53f, 42.0f)
                lineTo(50.47f, 42.0f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 36.78f, 53.07f)
                lineTo(27.15f, 98.0f)
                lineTo(16.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(26.0f, 110.0f)
                verticalLineToRelative(98.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(64.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(78.0f, 182.0f)
                lineTo(178.0f, 182.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 110.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(48.51f, 55.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.58f)
                lineTo(205.53f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.58f)
                lineTo(216.58f, 98.0f)
                lineTo(39.42f, 98.0f)
                close()
                moveTo(66.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 182.0f)
                lineTo(66.0f, 182.0f)
                close()
                moveTo(216.0f, 210.0f)
                lineTo(192.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(190.0f, 182.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 210.0f)
                close()
                moveTo(218.0f, 170.0f)
                lineTo(150.0f, 170.0f)
                lineTo(150.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(34.0f)
                lineTo(118.0f, 170.0f)
                lineTo(118.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(34.0f)
                lineTo(38.0f, 170.0f)
                lineTo(38.0f, 110.0f)
                lineTo(218.0f, 110.0f)
                close()
                moveTo(58.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 58.0f, 140.0f)
                close()
                moveTo(178.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 178.0f, 140.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
