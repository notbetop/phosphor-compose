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

public val BoldGroup.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) {
            return _shirtFolded!!
        }
        _shirtFolded = Builder(name = "ShirtFolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(177.0f, 44.0f)
                lineTo(164.49f, 31.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.27f, 28.0f)
                lineTo(156.0f, 28.0f)
                lineTo(100.0f, 28.0f)
                curveToRelative(-0.29f, 0.0f, -0.56f, 0.0f, -0.83f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.66f, 3.47f)
                lineTo(79.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 64.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(96.0f, 61.0f)
                lineToRelative(1.48f, -1.48f)
                lineTo(112.92f, 86.0f)
                lineTo(96.0f, 102.48f)
                close()
                moveTo(128.0f, 64.21f)
                lineTo(120.89f, 52.0f)
                horizontalLineToRelative(14.22f)
                close()
                moveTo(160.0f, 61.0f)
                verticalLineToRelative(41.51f)
                lineTo(143.08f, 86.0f)
                lineToRelative(15.44f, -26.47f)
                close()
                moveTo(60.0f, 68.0f)
                lineTo(72.0f, 68.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.08f, 14.21f)
                lineTo(116.0f, 116.5f)
                lineTo(116.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(140.0f, 212.0f)
                lineTo(140.0f, 116.5f)
                lineToRelative(9.92f, 9.69f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 112.0f)
                lineTo(184.0f, 68.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
