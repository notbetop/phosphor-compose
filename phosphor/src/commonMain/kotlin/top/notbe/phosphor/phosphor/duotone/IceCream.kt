package top.notbe.phosphor.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import top.notbe.phosphor.phosphor.DuotoneGroup

public val DuotoneGroup.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                verticalLineTo(88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 89.37f)
                lineTo(208.0f, 88.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 48.0f, 88.0f)
                verticalLineToRelative(1.37f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 56.0f, 136.0f)
                horizontalLineToRelative(3.36f)
                lineToRelative(61.69f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.9f, 0.0f)
                lineToRelative(61.69f, -108.0f)
                lineTo(200.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 8.0f, -46.63f)
                close()
                moveTo(128.0f, 223.88f)
                lineTo(77.79f, 136.0f)
                lineTo(97.07f, 136.0f)
                lineToRelative(40.57f, 71.0f)
                close()
                moveTo(134.79f, 136.0f)
                lineToRelative(21.71f, 38.0f)
                lineToRelative(-9.64f, 16.88f)
                lineTo(115.5f, 136.0f)
                close()
                moveTo(165.71f, 157.88f)
                lineTo(153.21f, 136.0f)
                horizontalLineToRelative(25.0f)
                close()
                moveTo(200.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(64.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
