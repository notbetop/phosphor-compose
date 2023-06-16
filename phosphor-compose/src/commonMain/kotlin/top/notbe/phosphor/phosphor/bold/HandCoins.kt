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

public val BoldGroup.HandCoins: ImageVector
    get() {
        if (_handCoins != null) {
            return _handCoins!!
        }
        _handCoins = Builder(name = "HandCoins", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.76f, 137.88f)
                arcTo(28.39f, 28.39f, 0.0f, false, false, 208.13f, 133.0f)
                lineTo(172.0f, 141.26f)
                curveToRelative(0.0f, -0.42f, 0.0f, -0.84f, 0.0f, -1.26f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(89.94f, 108.0f)
                arcToRelative(35.76f, 35.76f, 0.0f, false, false, -25.45f, 10.54f)
                lineTo(43.0f, 140.0f)
                lineTo(20.0f, 140.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 0.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(120.0f, 220.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 2.91f, -0.36f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 1.79f, -0.6f)
                lineToRelative(38.82f, -16.54f)
                curveToRelative(0.23f, -0.09f, 0.45f, -0.19f, 0.67f, -0.3f)
                arcToRelative(28.61f, 28.61f, 0.0f, false, false, 4.57f, -48.32f)
                close()
                moveTo(24.0f, 164.0f)
                lineTo(36.0f, 164.0f)
                verticalLineToRelative(32.0f)
                lineTo(24.0f, 196.0f)
                close()
                moveTo(217.68f, 164.61f)
                lineTo(180.17f, 180.61f)
                lineTo(118.52f, 196.0f)
                lineTo(60.0f, 196.0f)
                lineTo(60.0f, 157.0f)
                lineToRelative(21.46f, -21.46f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 89.94f, 132.0f)
                lineTo(140.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(112.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, 2.69f, -0.3f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.47f, -0.12f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, true, 5.82f, 4.44f)
                arcTo(4.58f, 4.58f, 0.0f, false, true, 217.68f, 164.61f)
                close()
                moveTo(164.0f, 100.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, -0.06f, 3.28f, -0.15f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 204.0f, 44.0f)
                curveToRelative(-1.1f, 0.0f, -2.18f, 0.06f, -3.26f, 0.14f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 164.0f, 100.0f)
                close()
                moveTo(220.0f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 220.0f, 84.0f)
                close()
                moveTo(164.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 14.5f, 9.21f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 164.81f, 76.0f)
                curveToRelative(-0.27f, 0.0f, -0.54f, 0.0f, -0.81f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
