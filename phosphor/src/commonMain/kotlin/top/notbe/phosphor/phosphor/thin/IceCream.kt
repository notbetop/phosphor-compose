package top.notbe.phosphor.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.ThinGroup

public val ThinGroup.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 92.4f)
                lineTo(204.0f, 88.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 88.0f)
                verticalLineToRelative(4.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 132.0f)
                horizontalLineToRelative(5.68f)
                lineToRelative(62.85f, 110.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 0.0f)
                lineToRelative(62.85f, -110.0f)
                lineTo(200.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 4.0f, -39.6f)
                close()
                moveTo(128.0f, 231.94f)
                lineTo(70.89f, 132.0f)
                horizontalLineToRelative(28.5f)
                lineToRelative(42.86f, 75.0f)
                close()
                moveTo(137.11f, 132.0f)
                lineToRelative(24.0f, 42.0f)
                lineToRelative(-14.25f, 24.94f)
                lineTo(108.61f, 132.0f)
                close()
                moveTo(165.71f, 165.94f)
                lineTo(146.32f, 132.0f)
                horizontalLineToRelative(38.79f)
                close()
                moveTo(200.0f, 124.0f)
                lineTo(56.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(60.0f, 88.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
