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

public val ThinGroup.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) {
            return _figmaLogo!!
        }
        _figmaLogo = Builder(name = "FigmaLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.46f, 96.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 28.0f)
                lineTo(88.0f, 28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 71.54f, 96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 1.56f, 64.76f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 132.0f, 196.0f)
                lineTo(132.0f, 150.59f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 176.46f, 96.0f)
                close()
                moveTo(188.0f, 64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(132.0f, 92.0f)
                lineTo(132.0f, 36.0f)
                horizontalLineToRelative(28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 188.0f, 64.0f)
                close()
                moveTo(132.0f, 100.0f)
                horizontalLineToRelative(5.41f)
                arcToRelative(36.41f, 36.41f, 0.0f, false, false, -5.41f, 5.41f)
                close()
                moveTo(60.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 88.0f, 36.0f)
                horizontalLineToRelative(36.0f)
                lineTo(124.0f, 92.0f)
                lineTo(88.0f, 92.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 60.0f, 64.0f)
                close()
                moveTo(124.0f, 196.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(124.0f, 156.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 160.0f, 156.0f)
                close()
            }
        }
        .build()
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
