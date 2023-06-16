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

public val BoldGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.49f, 176.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(160.0f, 169.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(128.0f, 169.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(96.0f, 169.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(112.0f, 151.0f)
                lineToRelative(7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(144.0f, 151.0f)
                lineToRelative(7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.49f, 176.49f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
                moveTo(92.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 124.0f)
                close()
                moveTo(164.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 124.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
