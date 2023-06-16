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

public val BoldGroup.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) {
            return _smileyXEyes!!
        }
        _smileyXEyes = Builder(name = "SmileyXEyes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(188.49f, 119.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(164.0f, 129.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(147.0f, 112.0f)
                lineToRelative(-7.52f, -7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(164.0f, 95.0f)
                lineToRelative(7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(181.0f, 112.0f)
                close()
                moveTo(116.49f, 136.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(92.0f, 129.0f)
                lineToRelative(-7.51f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(75.0f, 112.0f)
                lineToRelative(-7.52f, -7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(92.0f, 95.0f)
                lineToRelative(7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(109.0f, 112.0f)
                lineToRelative(7.52f, 7.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.49f, 136.49f)
                close()
                moveTo(144.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 180.0f)
                close()
            }
        }
        .build()
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
