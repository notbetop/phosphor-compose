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

public val BoldGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(243.82f, 98.64f)
                lineTo(230.0f, 202.64f)
                arcTo(20.06f, 20.06f, 0.0f, false, true, 210.13f, 220.0f)
                lineTo(45.87f, 220.0f)
                arcTo(20.07f, 20.07f, 0.0f, false, true, 26.0f, 202.65f)
                lineToRelative(-13.86f, -104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 76.0f)
                lineTo(66.55f, 76.0f)
                lineTo(119.0f, 16.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.06f, 0.0f)
                lineTo(189.45f, 76.0f)
                lineTo(224.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 19.81f, 22.64f)
                close()
                moveTo(98.45f, 76.0f)
                horizontalLineToRelative(59.11f)
                lineTo(128.0f, 42.22f)
                close()
                moveTo(219.45f, 100.0f)
                lineTo(36.57f, 100.0f)
                lineToRelative(12.8f, 96.0f)
                lineTo(206.63f, 196.0f)
                close()
                moveTo(168.08f, 126.81f)
                lineTo(164.08f, 166.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, 13.13f)
                curveToRelative(0.4f, 0.0f, 0.81f, 0.06f, 1.21f, 0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.92f, -10.81f)
                lineToRelative(4.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.88f, -2.38f)
                close()
                moveTo(87.96f, 126.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.88f, 2.38f)
                lineToRelative(4.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 180.0f)
                curveToRelative(0.39f, 0.0f, 0.8f, 0.0f, 1.2f, -0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, -13.13f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
