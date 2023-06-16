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

public val BoldGroup.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 86.7f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 56.0f, 140.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(60.54f, 106.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.84f, 0.0f)
                lineTo(199.0f, 140.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 12.0f, -53.3f)
                close()
                moveTo(128.0f, 215.81f)
                lineTo(84.68f, 140.0f)
                horizontalLineToRelative(26.07f)
                lineTo(141.0f, 193.0f)
                close()
                moveTo(154.86f, 168.81f)
                lineTo(138.39f, 140.0f)
                horizontalLineToRelative(32.93f)
                close()
                moveTo(200.0f, 116.0f)
                lineTo(56.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 96.0f)
                lineTo(68.0f, 88.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
